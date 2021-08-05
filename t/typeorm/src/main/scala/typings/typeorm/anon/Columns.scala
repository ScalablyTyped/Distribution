package typings.typeorm.anon

import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.deferrableTypeMod.DeferrableType
import typings.typeorm.namingStrategyInterfaceMod.NamingStrategyInterface
import typings.typeorm.onDeleteTypeMod.OnDeleteType
import typings.typeorm.onUpdateTypeMod.OnUpdateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var columns: js.Array[ColumnMetadata]
  
  var deferrable: js.UndefOr[DeferrableType] = js.undefined
  
  var entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata
  
  var namingStrategy: js.UndefOr[NamingStrategyInterface] = js.undefined
  
  var onDelete: js.UndefOr[OnDeleteType] = js.undefined
  
  var onUpdate: js.UndefOr[OnUpdateType] = js.undefined
  
  var referencedColumns: js.Array[ColumnMetadata]
  
  var referencedEntityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata
}
object Columns {
  
  inline def apply(
    columns: js.Array[ColumnMetadata],
    entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata,
    referencedColumns: js.Array[ColumnMetadata],
    referencedEntityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata
  ): Columns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any], referencedColumns = referencedColumns.asInstanceOf[js.Any], referencedEntityMetadata = referencedEntityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
  
  extension [Self <: Columns](x: Self) {
    
    inline def setColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setDeferrable(value: DeferrableType): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
    
    inline def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
    
    inline def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
    
    inline def setNamingStrategy(value: NamingStrategyInterface): Self = StObject.set(x, "namingStrategy", value.asInstanceOf[js.Any])
    
    inline def setNamingStrategyUndefined: Self = StObject.set(x, "namingStrategy", js.undefined)
    
    inline def setOnDelete(value: OnDeleteType): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
    
    inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
    
    inline def setOnUpdate(value: OnUpdateType): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    inline def setReferencedColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "referencedColumns", value.asInstanceOf[js.Any])
    
    inline def setReferencedColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "referencedColumns", js.Array(value :_*))
    
    inline def setReferencedEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "referencedEntityMetadata", value.asInstanceOf[js.Any])
  }
}
