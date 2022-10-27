package typings.vite.mod.Terser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightedIdentifierMangler
  extends StObject
     with SimpleIdentifierMangler {
  
  /**
    * Modifies the internal weighting of the input characters by the specified delta.
    * Will be invoked on the entire printed AST, and then deduct mangleable identifiers.
    * @param chars - The characters to modify the weighting of.
    * @param delta - The numeric weight to add to the characters.
    */
  def consider(chars: String, delta: Double): Double
  
  /**
    * Resets character weights.
    */
  def reset(): Unit
  
  /**
    * Sorts identifiers by character frequency, in preparation for calls to get(n).
    */
  def sort(): Unit
}
object WeightedIdentifierMangler {
  
  inline def apply(consider: (String, Double) => Double, get: Double => String, reset: () => Unit, sort: () => Unit): WeightedIdentifierMangler = {
    val __obj = js.Dynamic.literal(consider = js.Any.fromFunction2(consider), get = js.Any.fromFunction1(get), reset = js.Any.fromFunction0(reset), sort = js.Any.fromFunction0(sort))
    __obj.asInstanceOf[WeightedIdentifierMangler]
  }
  
  extension [Self <: WeightedIdentifierMangler](x: Self) {
    
    inline def setConsider(value: (String, Double) => Double): Self = StObject.set(x, "consider", js.Any.fromFunction2(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSort(value: () => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
  }
}
