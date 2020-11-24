package typings.typeorm.anon

import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.deferrableTypeMod.DeferrableType
import typings.typeorm.namingStrategyInterfaceMod.NamingStrategyInterface
import typings.typeorm.onDeleteTypeMod.OnDeleteType
import typings.typeorm.onUpdateTypeMod.OnUpdateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Columns extends js.Object {
  
  var columns: js.Array[ColumnMetadata] = js.native
  
  var deferrable: js.UndefOr[DeferrableType] = js.native
  
  var entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata = js.native
  
  var namingStrategy: js.UndefOr[NamingStrategyInterface] = js.native
  
  var onDelete: js.UndefOr[OnDeleteType] = js.native
  
  var onUpdate: js.UndefOr[OnUpdateType] = js.native
  
  var referencedColumns: js.Array[ColumnMetadata] = js.native
  
  var referencedEntityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata = js.native
}
object Columns {
  
  @scala.inline
  def apply(
    columns: js.Array[ColumnMetadata],
    entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata,
    referencedColumns: js.Array[ColumnMetadata],
    referencedEntityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata
  ): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any], referencedColumns = referencedColumns.asInstanceOf[js.Any], referencedEntityMetadata = referencedEntityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  @scala.inline
  implicit class ColumnsOps[Self <: Columns] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: ColumnMetadata*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[ColumnMetadata]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = this.set("entityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedColumnsVarargs(value: ColumnMetadata*): Self = this.set("referencedColumns", js.Array(value :_*))
    
    @scala.inline
    def setReferencedColumns(value: js.Array[ColumnMetadata]): Self = this.set("referencedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = this.set("referencedEntityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferrable(value: DeferrableType): Self = this.set("deferrable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferrable: Self = this.set("deferrable", js.undefined)
    
    @scala.inline
    def setNamingStrategy(value: NamingStrategyInterface): Self = this.set("namingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamingStrategy: Self = this.set("namingStrategy", js.undefined)
    
    @scala.inline
    def setOnDelete(value: OnDeleteType): Self = this.set("onDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDelete: Self = this.set("onDelete", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: OnUpdateType): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
  }
}
