package typings.typeorm.anon

import typings.typeorm.typeormStrings.from
import typings.typeorm.typeormStrings.join
import typings.typeorm.typeormStrings.other
import typings.typeorm.typeormStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends js.Object {
  
  var metadata: js.UndefOr[typings.typeorm.entityMetadataMod.EntityMetadata] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var subQuery: js.UndefOr[String] = js.native
  
  var tablePath: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[js.Function | String] = js.native
  
  var `type`: from | select | join | other = js.native
}
object Metadata {
  
  @scala.inline
  def apply(`type`: from | select | join | other): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    
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
    def setType(value: from | select | join | other): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSubQuery(value: String): Self = this.set("subQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubQuery: Self = this.set("subQuery", js.undefined)
    
    @scala.inline
    def setTablePath(value: String): Self = this.set("tablePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTablePath: Self = this.set("tablePath", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Function | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
