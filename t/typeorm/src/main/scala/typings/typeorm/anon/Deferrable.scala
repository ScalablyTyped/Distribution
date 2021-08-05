package typings.typeorm.anon

import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.namingStrategyNamingStrategyInterfaceMod.NamingStrategyInterface
import typings.typeorm.typesDeferrableTypeMod.DeferrableType
import typings.typeorm.typesOnDeleteTypeMod.OnDeleteType
import typings.typeorm.typesOnUpdateTypeMod.OnUpdateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deferrable extends StObject {
  
  var columns: js.Array[ColumnMetadata]
  
  var deferrable: js.UndefOr[DeferrableType] = js.undefined
  
  var entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  
  var namingStrategy: js.UndefOr[NamingStrategyInterface] = js.undefined
  
  var onDelete: js.UndefOr[OnDeleteType] = js.undefined
  
  var onUpdate: js.UndefOr[OnUpdateType] = js.undefined
  
  var referencedColumns: js.Array[ColumnMetadata]
  
  var referencedEntityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
}
object Deferrable {
  
  inline def apply(
    columns: js.Array[ColumnMetadata],
    entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata,
    referencedColumns: js.Array[ColumnMetadata],
    referencedEntityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): Deferrable = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any], referencedColumns = referencedColumns.asInstanceOf[js.Any], referencedEntityMetadata = referencedEntityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deferrable]
  }
  
  extension [Self <: Deferrable](x: Self) {
    
    inline def setColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setDeferrable(value: DeferrableType): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
    
    inline def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
    
    inline def setEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
    
    inline def setNamingStrategy(value: NamingStrategyInterface): Self = StObject.set(x, "namingStrategy", value.asInstanceOf[js.Any])
    
    inline def setNamingStrategyUndefined: Self = StObject.set(x, "namingStrategy", js.undefined)
    
    inline def setOnDelete(value: OnDeleteType): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
    
    inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
    
    inline def setOnUpdate(value: OnUpdateType): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    inline def setReferencedColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "referencedColumns", value.asInstanceOf[js.Any])
    
    inline def setReferencedColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "referencedColumns", js.Array(value :_*))
    
    inline def setReferencedEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "referencedEntityMetadata", value.asInstanceOf[js.Any])
  }
}
