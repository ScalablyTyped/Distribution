package typings.typeorm.anon

import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.uniqueMetadataArgsMod.UniqueMetadataArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnsEmbeddedMetadata extends js.Object {
  
  var args: js.UndefOr[UniqueMetadataArgs] = js.native
  
  var columns: js.UndefOr[js.Array[ColumnMetadata]] = js.native
  
  var embeddedMetadata: js.UndefOr[typings.typeorm.embeddedMetadataMod.EmbeddedMetadata] = js.native
  
  var entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata = js.native
}
object ColumnsEmbeddedMetadata {
  
  @scala.inline
  def apply(entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata): ColumnsEmbeddedMetadata = {
    val __obj = js.Dynamic.literal(entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsEmbeddedMetadata]
  }
  
  @scala.inline
  implicit class ColumnsEmbeddedMetadataOps[Self <: ColumnsEmbeddedMetadata] (val x: Self) extends AnyVal {
    
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
    def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = this.set("entityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: UniqueMetadataArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: ColumnMetadata*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ColumnMetadata]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setEmbeddedMetadata(value: typings.typeorm.embeddedMetadataMod.EmbeddedMetadata): Self = this.set("embeddedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedMetadata: Self = this.set("embeddedMetadata", js.undefined)
  }
}
