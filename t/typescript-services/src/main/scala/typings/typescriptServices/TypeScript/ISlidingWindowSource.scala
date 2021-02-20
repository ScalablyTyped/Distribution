package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISlidingWindowSource extends StObject {
  
  def fetchMoreItems(
    argument: js.Any,
    sourceIndex: Double,
    window: js.Array[_],
    destinationIndex: Double,
    spaceAvailable: Double
  ): Double = js.native
}
object ISlidingWindowSource {
  
  @scala.inline
  def apply(fetchMoreItems: (js.Any, Double, js.Array[_], Double, Double) => Double): ISlidingWindowSource = {
    val __obj = js.Dynamic.literal(fetchMoreItems = js.Any.fromFunction5(fetchMoreItems))
    __obj.asInstanceOf[ISlidingWindowSource]
  }
  
  @scala.inline
  implicit class ISlidingWindowSourceMutableBuilder[Self <: ISlidingWindowSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchMoreItems(value: (js.Any, Double, js.Array[_], Double, Double) => Double): Self = StObject.set(x, "fetchMoreItems", js.Any.fromFunction5(value))
  }
}
