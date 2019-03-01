package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlidingWindowSource extends js.Object {
  def fetchMoreItems(
    argument: js.Any,
    sourceIndex: scala.Double,
    window: js.Array[_],
    destinationIndex: scala.Double,
    spaceAvailable: scala.Double
  ): scala.Double
}

object ISlidingWindowSource {
  @scala.inline
  def apply(
    fetchMoreItems: js.Function5[js.Any, scala.Double, js.Array[_], scala.Double, scala.Double, scala.Double]
  ): ISlidingWindowSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fetchMoreItems")(fetchMoreItems)
    __obj.asInstanceOf[ISlidingWindowSource]
  }
}

