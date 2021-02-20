package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.vsoNodeApi.galleryInterfacesMod.ExtensionIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstalledExtensionQuery extends StObject {
  
  var assetTypes: js.Array[String] = js.native
  
  var monikers: js.Array[ExtensionIdentifier] = js.native
}
object InstalledExtensionQuery {
  
  @scala.inline
  def apply(assetTypes: js.Array[String], monikers: js.Array[ExtensionIdentifier]): InstalledExtensionQuery = {
    val __obj = js.Dynamic.literal(assetTypes = assetTypes.asInstanceOf[js.Any], monikers = monikers.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtensionQuery]
  }
  
  @scala.inline
  implicit class InstalledExtensionQueryMutableBuilder[Self <: InstalledExtensionQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetTypes(value: js.Array[String]): Self = StObject.set(x, "assetTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetTypesVarargs(value: String*): Self = StObject.set(x, "assetTypes", js.Array(value :_*))
    
    @scala.inline
    def setMonikers(value: js.Array[ExtensionIdentifier]): Self = StObject.set(x, "monikers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonikersVarargs(value: ExtensionIdentifier*): Self = StObject.set(x, "monikers", js.Array(value :_*))
  }
}
