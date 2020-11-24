package typings.typeorm.anon

import typings.typeorm.columnMetadataArgsMod.ColumnMetadataArgs
import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.typeormStrings.ancestor
import typings.typeorm.typeormStrings.descendant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClosureType extends js.Object {
  
  var args: ColumnMetadataArgs = js.native
  
  var closureType: js.UndefOr[ancestor | descendant] = js.native
  
  var connection: typings.typeorm.connectionMod.Connection = js.native
  
  var embeddedMetadata: js.UndefOr[typings.typeorm.embeddedMetadataMod.EmbeddedMetadata] = js.native
  
  var entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata = js.native
  
  var materializedPath: js.UndefOr[Boolean] = js.native
  
  var nestedSetLeft: js.UndefOr[Boolean] = js.native
  
  var nestedSetRight: js.UndefOr[Boolean] = js.native
  
  var referencedColumn: js.UndefOr[ColumnMetadata] = js.native
}
object ClosureType {
  
  @scala.inline
  def apply(
    args: ColumnMetadataArgs,
    connection: typings.typeorm.connectionMod.Connection,
    entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata
  ): ClosureType = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosureType]
  }
  
  @scala.inline
  implicit class ClosureTypeOps[Self <: ClosureType] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: ColumnMetadataArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: typings.typeorm.connectionMod.Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = this.set("entityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosureType(value: ancestor | descendant): Self = this.set("closureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosureType: Self = this.set("closureType", js.undefined)
    
    @scala.inline
    def setEmbeddedMetadata(value: typings.typeorm.embeddedMetadataMod.EmbeddedMetadata): Self = this.set("embeddedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedMetadata: Self = this.set("embeddedMetadata", js.undefined)
    
    @scala.inline
    def setMaterializedPath(value: Boolean): Self = this.set("materializedPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterializedPath: Self = this.set("materializedPath", js.undefined)
    
    @scala.inline
    def setNestedSetLeft(value: Boolean): Self = this.set("nestedSetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestedSetLeft: Self = this.set("nestedSetLeft", js.undefined)
    
    @scala.inline
    def setNestedSetRight(value: Boolean): Self = this.set("nestedSetRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestedSetRight: Self = this.set("nestedSetRight", js.undefined)
    
    @scala.inline
    def setReferencedColumn(value: ColumnMetadata): Self = this.set("referencedColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferencedColumn: Self = this.set("referencedColumn", js.undefined)
  }
}
