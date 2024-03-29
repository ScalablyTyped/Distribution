package typings.typeorm.anon

import typings.typeorm.metadataArgsColumnMetadataArgsMod.ColumnMetadataArgs
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import typings.typeorm.typeormStrings.ancestor
import typings.typeorm.typeormStrings.descendant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterializedPath extends StObject {
  
  var args: ColumnMetadataArgs
  
  var closureType: js.UndefOr[ancestor | descendant] = js.undefined
  
  var connection: typings.typeorm.connectionConnectionMod.Connection
  
  var embeddedMetadata: js.UndefOr[typings.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata] = js.undefined
  
  var entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  
  var materializedPath: js.UndefOr[Boolean] = js.undefined
  
  var nestedSetLeft: js.UndefOr[Boolean] = js.undefined
  
  var nestedSetRight: js.UndefOr[Boolean] = js.undefined
  
  var referencedColumn: js.UndefOr[ColumnMetadata] = js.undefined
}
object MaterializedPath {
  
  inline def apply(
    args: ColumnMetadataArgs,
    connection: typings.typeorm.connectionConnectionMod.Connection,
    entityMetadata: typings.typeorm.metadataEntityMetadataMod.EntityMetadata
  ): MaterializedPath = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterializedPath]
  }
  
  extension [Self <: MaterializedPath](x: Self) {
    
    inline def setArgs(value: ColumnMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setClosureType(value: ancestor | descendant): Self = StObject.set(x, "closureType", value.asInstanceOf[js.Any])
    
    inline def setClosureTypeUndefined: Self = StObject.set(x, "closureType", js.undefined)
    
    inline def setConnection(value: typings.typeorm.connectionConnectionMod.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedMetadata(value: typings.typeorm.metadataEmbeddedMetadataMod.EmbeddedMetadata): Self = StObject.set(x, "embeddedMetadata", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedMetadataUndefined: Self = StObject.set(x, "embeddedMetadata", js.undefined)
    
    inline def setEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
    
    inline def setMaterializedPath(value: Boolean): Self = StObject.set(x, "materializedPath", value.asInstanceOf[js.Any])
    
    inline def setMaterializedPathUndefined: Self = StObject.set(x, "materializedPath", js.undefined)
    
    inline def setNestedSetLeft(value: Boolean): Self = StObject.set(x, "nestedSetLeft", value.asInstanceOf[js.Any])
    
    inline def setNestedSetLeftUndefined: Self = StObject.set(x, "nestedSetLeft", js.undefined)
    
    inline def setNestedSetRight(value: Boolean): Self = StObject.set(x, "nestedSetRight", value.asInstanceOf[js.Any])
    
    inline def setNestedSetRightUndefined: Self = StObject.set(x, "nestedSetRight", js.undefined)
    
    inline def setReferencedColumn(value: ColumnMetadata): Self = StObject.set(x, "referencedColumn", value.asInstanceOf[js.Any])
    
    inline def setReferencedColumnUndefined: Self = StObject.set(x, "referencedColumn", js.undefined)
  }
}
