package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoBuild
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Represents the build version information of the device.
    *
    * @since 2.2
    */
  val buildVersion: String
  
  /**
    * Represents the manufacturer of the device.
    *
    * @since 2.1
    */
  val manufacturer: String
  
  /**
    * Represents the model name of the current device.
    */
  val model: String
}
object SystemInfoBuild {
  
  inline def apply(buildVersion: String, manufacturer: String, model: String): SystemInfoBuild = {
    val __obj = js.Dynamic.literal(buildVersion = buildVersion.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoBuild]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SystemInfoBuild] (val x: Self) extends AnyVal {
    
    inline def setBuildVersion(value: String): Self = StObject.set(x, "buildVersion", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
