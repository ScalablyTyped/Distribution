package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManifestParams extends StObject {
  
  var appUrl: String = js.native
  
  var email: String = js.native
}
object ManifestParams {
  
  @scala.inline
  def apply(appUrl: String, email: String): ManifestParams = {
    val __obj = js.Dynamic.literal(appUrl = appUrl.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestParams]
  }
  
  @scala.inline
  implicit class ManifestParamsMutableBuilder[Self <: ManifestParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppUrl(value: String): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
