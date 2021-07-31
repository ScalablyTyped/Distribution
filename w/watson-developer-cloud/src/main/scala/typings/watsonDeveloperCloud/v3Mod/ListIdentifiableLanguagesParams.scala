package typings.watsonDeveloperCloud.v3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `listIdentifiableLanguages` operation. */
trait ListIdentifiableLanguagesParams extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object ListIdentifiableLanguagesParams {
  
  @scala.inline
  def apply(): ListIdentifiableLanguagesParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentifiableLanguagesParams]
  }
  
  @scala.inline
  implicit class ListIdentifiableLanguagesParamsMutableBuilder[Self <: ListIdentifiableLanguagesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
