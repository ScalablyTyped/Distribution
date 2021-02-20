package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument passed to the [getCurrentHeading](Titanium.Geolocation.getCurrentHeading) callback.
  */
@js.native
trait HeadingResponse extends ErrorResponse {
  
  /**
    * If `success` is true, the actual heading data.
    */
  var heading: js.UndefOr[HeadingData] = js.native
}
object HeadingResponse {
  
  @scala.inline
  def apply(): HeadingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadingResponse]
  }
  
  @scala.inline
  implicit class HeadingResponseMutableBuilder[Self <: HeadingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeading(value: HeadingData): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
  }
}
