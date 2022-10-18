package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryRelationsArgument. */
trait QueryRelationsArgument extends StObject {
  
  /** Array of query entities. */
  var entities: js.UndefOr[js.Array[QueryEntitiesEntity]] = js.undefined
}
object QueryRelationsArgument {
  
  inline def apply(): QueryRelationsArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsArgument]
  }
  
  extension [Self <: QueryRelationsArgument](x: Self) {
    
    inline def setEntities(value: js.Array[QueryEntitiesEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntitiesVarargs(value: QueryEntitiesEntity*): Self = StObject.set(x, "entities", js.Array(value*))
  }
}
