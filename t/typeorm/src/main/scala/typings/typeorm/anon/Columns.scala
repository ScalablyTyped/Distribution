package typings.typeorm.anon

import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.deferrableTypeMod.DeferrableType
import typings.typeorm.namingStrategyInterfaceMod.NamingStrategyInterface
import typings.typeorm.onDeleteTypeMod.OnDeleteType
import typings.typeorm.onUpdateTypeMod.OnUpdateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Columns extends StObject {
  
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
  implicit class ColumnsMutableBuilder[Self <: Columns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDeferrable(value: DeferrableType): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
    
    @scala.inline
    def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamingStrategy(value: NamingStrategyInterface): Self = StObject.set(x, "namingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamingStrategyUndefined: Self = StObject.set(x, "namingStrategy", js.undefined)
    
    @scala.inline
    def setOnDelete(value: OnDeleteType): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: OnUpdateType): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    @scala.inline
    def setReferencedColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "referencedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencedColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "referencedColumns", js.Array(value :_*))
    
    @scala.inline
    def setReferencedEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "referencedEntityMetadata", value.asInstanceOf[js.Any])
  }
}
