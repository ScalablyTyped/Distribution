package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISlidingWindowSource extends StObject {
  
  def fetchMoreItems(
    argument: Any,
    sourceIndex: Double,
    window: js.Array[Any],
    destinationIndex: Double,
    spaceAvailable: Double
  ): Double
}
object ISlidingWindowSource {
  
  inline def apply(fetchMoreItems: (Any, Double, js.Array[Any], Double, Double) => Double): ISlidingWindowSource = {
    val __obj = js.Dynamic.literal(fetchMoreItems = js.Any.fromFunction5(fetchMoreItems))
    __obj.asInstanceOf[ISlidingWindowSource]
  }
  
  extension [Self <: ISlidingWindowSource](x: Self) {
    
    inline def setFetchMoreItems(value: (Any, Double, js.Array[Any], Double, Double) => Double): Self = StObject.set(x, "fetchMoreItems", js.Any.fromFunction5(value))
  }
}
