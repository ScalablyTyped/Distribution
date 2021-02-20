package typings.titanium

import typings.titanium.Titanium.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The parameter passed to the <Titanium.UI.WebView.createPDF> or <Titanium.UI.WebView.createWebArchive>callback.
  */
@js.native
trait DataCreationResult extends StObject {
  
  /**
    * The created data.
    */
  var data: js.UndefOr[Blob] = js.native
  
  /**
    * Error message, if any returned.
    */
  var error: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the data creation successful or not.
    */
  var success: js.UndefOr[Boolean] = js.native
}
object DataCreationResult {
  
  @scala.inline
  def apply(): DataCreationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCreationResult]
  }
  
  @scala.inline
  implicit class DataCreationResultMutableBuilder[Self <: DataCreationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
