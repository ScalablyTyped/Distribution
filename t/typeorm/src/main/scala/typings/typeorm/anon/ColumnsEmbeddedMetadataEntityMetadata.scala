package typings.typeorm.anon

import typings.typeorm.metadataArgsUniqueMetadataArgsMod.UniqueMetadataArgs
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnsEmbeddedMetadataEntityMetadata extends StObject {
  
  var args: js.UndefOr[UniqueMetadataArgs] = js.undefined
  
  var columns: js.UndefOr[js.Array[ColumnMetadata]] = js.undefined
  
  var embeddedMetadata: js.UndefOr[typings.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata] = js.undefined
  
  var entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
}
object ColumnsEmbeddedMetadataEntityMetadata {
  
  inline def apply(entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): ColumnsEmbeddedMetadataEntityMetadata = {
    val __obj = js.Dynamic.literal(entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsEmbeddedMetadataEntityMetadata]
  }
  
  extension [Self <: ColumnsEmbeddedMetadataEntityMetadata](x: Self) {
    
    inline def setArgs(value: UniqueMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setColumns(value: js.Array[ColumnMetadata]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ColumnMetadata*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    inline def setEmbeddedMetadata(value: typings.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata): Self = StObject.set(x, "embeddedMetadata", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedMetadataUndefined: Self = StObject.set(x, "embeddedMetadata", js.undefined)
    
    inline def setEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
  }
}
