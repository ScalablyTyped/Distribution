package typings.vsoNodeApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportedExtension extends StObject {
  
  /**
    * Unique Identifier for this extension
    */
  var `extension`: String
  
  /**
    * Unique Identifier for this publisher
    */
  var publisher: String
  
  /**
    * Supported version for this extension
    */
  var version: String
}
object SupportedExtension {
  
  inline def apply(`extension`: String, publisher: String, version: String): SupportedExtension = {
    val __obj = js.Dynamic.literal(publisher = publisher.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedExtension]
  }
  
  extension [Self <: SupportedExtension](x: Self) {
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
