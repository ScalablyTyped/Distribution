package typings
package structuredDashSourceLib.structuredDashSourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuredSource extends js.Object {
  def indexToPosition(index: scala.Double): structuredDashSourceLib.structuredDashSourceMod.StructuredSourceNs.SourcePosition
  def locationToRange(loc: structuredDashSourceLib.structuredDashSourceMod.StructuredSourceNs.SourceLocation): js.Tuple2[scala.Double, scala.Double]
  def positionToIndex(pos: structuredDashSourceLib.structuredDashSourceMod.StructuredSourceNs.SourcePosition): scala.Double
  def rangeToLocation(range: js.Tuple2[scala.Double, scala.Double]): structuredDashSourceLib.structuredDashSourceMod.StructuredSourceNs.SourceLocation
}

object StructuredSource {
  @scala.inline
  def apply(
    indexToPosition: scala.Double => structuredDashSourceLib.structuredDashSourceMod.StructuredSourceNs.SourcePosition,
    locationToRange: structuredDashSourceLib.structuredDashSourceMod.StructuredSourceNs.SourceLocation => js.Tuple2[scala.Double, scala.Double],
    positionToIndex: structuredDashSourceLib.structuredDashSourceMod.StructuredSourceNs.SourcePosition => scala.Double,
    rangeToLocation: js.Tuple2[scala.Double, scala.Double] => structuredDashSourceLib.structuredDashSourceMod.StructuredSourceNs.SourceLocation
  ): StructuredSource = {
    val __obj = js.Dynamic.literal(indexToPosition = js.Any.fromFunction1(indexToPosition), locationToRange = js.Any.fromFunction1(locationToRange), positionToIndex = js.Any.fromFunction1(positionToIndex), rangeToLocation = js.Any.fromFunction1(rangeToLocation))
  
    __obj.asInstanceOf[StructuredSource]
  }
}

