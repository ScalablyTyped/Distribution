package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** RegisterStatus. */
trait RegisterStatus extends StObject {
  
  /** The current status of the job: * `created`: The service successfully white-listed the callback URL as a result of the call. * `already created`: The URL was already white-listed. */
  var status: String
  
  /** The callback URL that is successfully registered. */
  var url: String
}
object RegisterStatus {
  
  inline def apply(status: String, url: String): RegisterStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterStatus]
  }
  
  extension [Self <: RegisterStatus](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
