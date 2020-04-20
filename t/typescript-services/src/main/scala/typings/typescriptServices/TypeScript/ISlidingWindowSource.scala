package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlidingWindowSource extends js.Object {
  def fetchMoreItems(
    argument: js.Any,
    sourceIndex: Double,
    window: js.Array[_],
    destinationIndex: Double,
    spaceAvailable: Double
  ): Double
}

object ISlidingWindowSource {
  @scala.inline
  def apply(fetchMoreItems: (js.Any, Double, js.Array[_], Double, Double) => Double): ISlidingWindowSource = {
    val __obj = js.Dynamic.literal(fetchMoreItems = js.Any.fromFunction5(fetchMoreItems))
    __obj.asInstanceOf[ISlidingWindowSource]
  }
}

