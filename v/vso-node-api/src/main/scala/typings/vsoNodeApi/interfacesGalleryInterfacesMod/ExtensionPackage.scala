package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionPackage extends StObject {
  
  /**
    * Base 64 encoded extension package
    */
  var extensionManifest: String
}
object ExtensionPackage {
  
  inline def apply(extensionManifest: String): ExtensionPackage = {
    val __obj = js.Dynamic.literal(extensionManifest = extensionManifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionPackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionPackage] (val x: Self) extends AnyVal {
    
    inline def setExtensionManifest(value: String): Self = StObject.set(x, "extensionManifest", value.asInstanceOf[js.Any])
  }
}
