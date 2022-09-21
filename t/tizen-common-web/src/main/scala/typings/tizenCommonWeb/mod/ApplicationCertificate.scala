package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationCertificate extends StObject {
  
  /**
    * An attribute to store the type of the application certificate
    */
  val `type`: String
  
  /**
    * An attribute to store the value of the application certificate
    */
  val value: String
}
object ApplicationCertificate {
  
  inline def apply(`type`: String, value: String): ApplicationCertificate = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCertificate]
  }
  
  extension [Self <: ApplicationCertificate](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
