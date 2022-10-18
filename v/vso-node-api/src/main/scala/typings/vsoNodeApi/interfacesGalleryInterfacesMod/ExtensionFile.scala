package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionFile extends StObject {
  
  var assetType: String
  
  var language: String
  
  var source: String
}
object ExtensionFile {
  
  inline def apply(assetType: String, language: String, source: String): ExtensionFile = {
    val __obj = js.Dynamic.literal(assetType = assetType.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFile]
  }
  
  extension [Self <: ExtensionFile](x: Self) {
    
    inline def setAssetType(value: String): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
