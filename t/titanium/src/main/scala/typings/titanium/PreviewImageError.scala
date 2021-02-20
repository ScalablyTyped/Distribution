package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The parameter passed to the `error` callback of <PreviewImageOptions>.
  */
@js.native
trait PreviewImageError extends FailureResponse {
  
  /**
    * Description of the error.
    * @deprecated
    */
  var message: js.UndefOr[String] = js.native
}
object PreviewImageError {
  
  @scala.inline
  def apply(): PreviewImageError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewImageError]
  }
  
  @scala.inline
  implicit class PreviewImageErrorMutableBuilder[Self <: PreviewImageError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
