package typings.typeorm.anon

import typings.typeorm.columnMetadataArgsMod.ColumnMetadataArgs
import typings.typeorm.columnMetadataMod.ColumnMetadata
import typings.typeorm.typeormStrings.ancestor
import typings.typeorm.typeormStrings.descendant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosureType extends StObject {
  
  var args: ColumnMetadataArgs
  
  var closureType: js.UndefOr[ancestor | descendant] = js.undefined
  
  var connection: typings.typeorm.connectionMod.Connection
  
  var embeddedMetadata: js.UndefOr[typings.typeorm.embeddedMetadataMod.EmbeddedMetadata] = js.undefined
  
  var entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata
  
  var materializedPath: js.UndefOr[Boolean] = js.undefined
  
  var nestedSetLeft: js.UndefOr[Boolean] = js.undefined
  
  var nestedSetRight: js.UndefOr[Boolean] = js.undefined
  
  var referencedColumn: js.UndefOr[ColumnMetadata] = js.undefined
}
object ClosureType {
  
  inline def apply(
    args: ColumnMetadataArgs,
    connection: typings.typeorm.connectionMod.Connection,
    entityMetadata: typings.typeorm.entityMetadataMod.EntityMetadata
  ): ClosureType = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], entityMetadata = entityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClosureType]
  }
  
  extension [Self <: ClosureType](x: Self) {
    
    inline def setArgs(value: ColumnMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setClosureType(value: ancestor | descendant): Self = StObject.set(x, "closureType", value.asInstanceOf[js.Any])
    
    inline def setClosureTypeUndefined: Self = StObject.set(x, "closureType", js.undefined)
    
    inline def setConnection(value: typings.typeorm.connectionMod.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedMetadata(value: typings.typeorm.embeddedMetadataMod.EmbeddedMetadata): Self = StObject.set(x, "embeddedMetadata", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedMetadataUndefined: Self = StObject.set(x, "embeddedMetadata", js.undefined)
    
    inline def setEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "entityMetadata", value.asInstanceOf[js.Any])
    
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
