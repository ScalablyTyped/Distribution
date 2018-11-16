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

