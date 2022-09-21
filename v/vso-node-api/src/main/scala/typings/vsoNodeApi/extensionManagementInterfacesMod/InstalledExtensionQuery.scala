package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.vsoNodeApi.galleryInterfacesMod.ExtensionIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstalledExtensionQuery extends StObject {
  
  var assetTypes: js.Array[String]
  
  var monikers: js.Array[ExtensionIdentifier]
}
object InstalledExtensionQuery {
  
  inline def apply(assetTypes: js.Array[String], monikers: js.Array[ExtensionIdentifier]): InstalledExtensionQuery = {
    val __obj = js.Dynamic.literal(assetTypes = assetTypes.asInstanceOf[js.Any], monikers = monikers.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtensionQuery]
  }
  
  extension [Self <: InstalledExtensionQuery](x: Self) {
    
    inline def setAssetTypes(value: js.Array[String]): Self = StObject.set(x, "assetTypes", value.asInstanceOf[js.Any])
    
    inline def setAssetTypesVarargs(value: String*): Self = StObject.set(x, "assetTypes", js.Array(value*))
    
    inline def setMonikers(value: js.Array[ExtensionIdentifier]): Self = StObject.set(x, "monikers", value.asInstanceOf[js.Any])
    
    inline def setMonikersVarargs(value: ExtensionIdentifier*): Self = StObject.set(x, "monikers", js.Array(value*))
  }
}
