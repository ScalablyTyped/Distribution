package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The query expansion definitions for the specified collection. */
trait Expansions extends StObject {
  
  /** An array of query expansion definitions. Each object in the **expansions** array represents a term or set of terms that will be expanded into other terms. Each expansion object can be configured as bidirectional or unidirectional. Bidirectional means that all terms are expanded to all other terms in the object. Unidirectional means that a set list of terms can be expanded into a second list of terms. To create a bi-directional expansion specify an **expanded_terms** array. When found in a query, all items in the **expanded_terms** array are then expanded to the other items in the same array. To create a uni-directional expansion, specify both an array of **input_terms** and an array of **expanded_terms**. When items in the **input_terms** array are present in a query, they are expanded using the items listed in the **expanded_terms** array. */
  var expansions: js.Array[Expansion]
}
object Expansions {
  
  inline def apply(expansions: js.Array[Expansion]): Expansions = {
    val __obj = js.Dynamic.literal(expansions = expansions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expansions]
  }
  
  extension [Self <: Expansions](x: Self) {
    
    inline def setExpansions(value: js.Array[Expansion]): Self = StObject.set(x, "expansions", value.asInstanceOf[js.Any])
    
    inline def setExpansionsVarargs(value: Expansion*): Self = StObject.set(x, "expansions", js.Array(value :_*))
  }
}
