package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** RegisterStatus. */
@js.native
trait RegisterStatus extends StObject {
  
  /** The current status of the job: * `created`: The service successfully white-listed the callback URL as a result of the call. * `already created`: The URL was already white-listed. */
  var status: String = js.native
  
  /** The callback URL that is successfully registered. */
  var url: String = js.native
}
object RegisterStatus {
  
  @scala.inline
  def apply(status: String, url: String): RegisterStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterStatus]
  }
  
  @scala.inline
  implicit class RegisterStatusMutableBuilder[Self <: RegisterStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
