package typings.typeorm.anon

import typings.typeorm.tableMetadataArgsMod.TableMetadataArgs
import typings.typeorm.treeMetadataArgsMod.TreeMetadataArgs
import typings.typeorm.typeormStrings.STI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args extends StObject {
  
  var args: TableMetadataArgs
  
  var connection: typings.typeorm.connectionMod.Connection
  
  var inheritancePattern: js.UndefOr[STI] = js.undefined
  
  var inheritanceTree: js.UndefOr[js.Array[js.Function]] = js.undefined
  
  var parentClosureEntityMetadata: js.UndefOr[typings.typeorm.entityMetadataMod.EntityMetadata] = js.undefined
  
  var tableTree: js.UndefOr[TreeMetadataArgs] = js.undefined
}
object Args {
  
  inline def apply(args: TableMetadataArgs, connection: typings.typeorm.connectionMod.Connection): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  extension [Self <: Args](x: Self) {
    
    inline def setArgs(value: TableMetadataArgs): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setConnection(value: typings.typeorm.connectionMod.Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setInheritancePattern(value: STI): Self = StObject.set(x, "inheritancePattern", value.asInstanceOf[js.Any])
    
    inline def setInheritancePatternUndefined: Self = StObject.set(x, "inheritancePattern", js.undefined)
    
    inline def setInheritanceTree(value: js.Array[js.Function]): Self = StObject.set(x, "inheritanceTree", value.asInstanceOf[js.Any])
    
    inline def setInheritanceTreeUndefined: Self = StObject.set(x, "inheritanceTree", js.undefined)
    
    inline def setInheritanceTreeVarargs(value: js.Function*): Self = StObject.set(x, "inheritanceTree", js.Array(value :_*))
    
    inline def setParentClosureEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = StObject.set(x, "parentClosureEntityMetadata", value.asInstanceOf[js.Any])
    
    inline def setParentClosureEntityMetadataUndefined: Self = StObject.set(x, "parentClosureEntityMetadata", js.undefined)
    
    inline def setTableTree(value: TreeMetadataArgs): Self = StObject.set(x, "tableTree", value.asInstanceOf[js.Any])
    
    inline def setTableTreeUndefined: Self = StObject.set(x, "tableTree", js.undefined)
  }
}
