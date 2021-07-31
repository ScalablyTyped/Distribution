package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryRelationsArgument. */
trait QueryRelationsArgument extends StObject {
  
  /** Array of query entities. */
  var entities: js.UndefOr[js.Array[QueryEntitiesEntity]] = js.undefined
}
object QueryRelationsArgument {
  
  @scala.inline
  def apply(): QueryRelationsArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRelationsArgument]
  }
  
  @scala.inline
  implicit class QueryRelationsArgumentMutableBuilder[Self <: QueryRelationsArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntities(value: js.Array[QueryEntitiesEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: QueryEntitiesEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
  }
}
