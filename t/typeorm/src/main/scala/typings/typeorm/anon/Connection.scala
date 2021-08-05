package typings.typeorm.anon

import typings.typeorm.metadataArgsTableMetadataArgsMod.TableMetadataArgs
import typings.typeorm.metadataArgsTreeMetadataArgsMod.TreeMetadataArgs
import typings.typeorm.typeormStrings.STI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  var args: TableMetadataArgs
  
  var connection: typings.typeorm.connectionConnectionMod.Connection
  
  var inheritancePattern: js.UndefOr[STI] = js.undefined
  
  var inheritanceTree: js.UndefOr[js.Array[js.Function]] = js.undefined
  
  var parentClosureEntityMetadata: js.UndefOr[typings.typeorm.metadataEntityMetadataMod.EntityMetadata] = js.undefined
  
  var tableTree: js.UndefOr[TreeMetadataArgs] = js.undefined
}
object Connection {
  
  inline def apply(args: TableMetadataArgs, connection: typings.typeorm.connectionConnectionMod.Connection): Connection = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setArgs(value: TableMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setConnection(value: typings.typeorm.connectionConnectionMod.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setInheritancePattern(value: STI): Self = StObject.set(x, "inheritancePattern", value.asInstanceOf[js.Any])
    
    inline def setInheritancePatternUndefined: Self = StObject.set(x, "inheritancePattern", js.undefined)
    
    inline def setInheritanceTree(value: js.Array[js.Function]): Self = StObject.set(x, "inheritanceTree", value.asInstanceOf[js.Any])
    
    inline def setInheritanceTreeUndefined: Self = StObject.set(x, "inheritanceTree", js.undefined)
    
    inline def setInheritanceTreeVarargs(value: js.Function*): Self = StObject.set(x, "inheritanceTree", js.Array(value :_*))
    
    inline def setParentClosureEntityMetadata(value: typings.typeorm.metadataEntityMetadataMod.EntityMetadata): Self = StObject.set(x, "parentClosureEntityMetadata", value.asInstanceOf[js.Any])
    
    inline def setParentClosureEntityMetadataUndefined: Self = StObject.set(x, "parentClosureEntityMetadata", js.undefined)
    
    inline def setTableTree(value: TreeMetadataArgs): Self = StObject.set(x, "tableTree", value.asInstanceOf[js.Any])
    
    inline def setTableTreeUndefined: Self = StObject.set(x, "tableTree", js.undefined)
  }
}
