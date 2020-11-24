package typings.tablesorter.storageConfigurationMod

import typings.tablesorter.storageTypeMod.StorageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageConfiguration extends js.Object {
  
  /**
    * The `data-attribute`-name to automatically get the id of the table from.
    */
  var group: js.UndefOr[String] = js.native
  
  /**
    * The id of the storage to save to.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The `data-attribute`-name to automatically get the url of the table from.
    */
  var page: js.UndefOr[String] = js.native
  
  /**
    * The medium to save the storage to.
    */
  var storageType: js.UndefOr[StorageType] = js.native
  
  /**
    * The url to save the storage to.
    */
  var url: js.UndefOr[String] = js.native
}
object StorageConfiguration {
  
  @scala.inline
  def apply(): StorageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageConfiguration]
  }
  
  @scala.inline
  implicit class StorageConfigurationOps[Self <: StorageConfiguration] (val x: Self) extends AnyVal {
    
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
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setStorageType(value: StorageType): Self = this.set("storageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageType: Self = this.set("storageType", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
