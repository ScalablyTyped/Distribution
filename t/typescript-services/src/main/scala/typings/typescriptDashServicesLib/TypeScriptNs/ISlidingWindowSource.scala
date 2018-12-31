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

