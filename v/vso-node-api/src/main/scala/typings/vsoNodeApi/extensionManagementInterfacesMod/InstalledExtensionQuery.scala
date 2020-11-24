package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.vsoNodeApi.galleryInterfacesMod.ExtensionIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstalledExtensionQuery extends js.Object {
  
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
  implicit class InstalledExtensionQueryOps[Self <: InstalledExtensionQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssetTypesVarargs(value: String*): Self = this.set("assetTypes", js.Array(value :_*))
    
    @scala.inline
    def setAssetTypes(value: js.Array[String]): Self = this.set("assetTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonikersVarargs(value: ExtensionIdentifier*): Self = this.set("monikers", js.Array(value :_*))
    
    @scala.inline
    def setMonikers(value: js.Array[ExtensionIdentifier]): Self = this.set("monikers", value.asInstanceOf[js.Any])
  }
}
