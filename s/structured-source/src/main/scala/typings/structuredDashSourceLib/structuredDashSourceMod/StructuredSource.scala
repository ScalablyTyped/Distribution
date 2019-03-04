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
    indexToPosition: js.Function1[
      scala.Double, 
      structuredDashSourceLib.structuredDashSourceMod.StructuredSourceNs.SourcePosition
    ],
    locationToRange: js.Function1[
      structuredDashSourceLib.structuredDashSourceMod.StructuredSourceNs.SourceLocation, 
      js.Tuple2[scala.Double, scala.Double]
    ],
    positionToIndex: js.Function1[
      structuredDashSourceLib.structuredDashSourceMod.StructuredSourceNs.SourcePosition, 
      scala.Double
    ],
    rangeToLocation: js.Function1[
      js.Tuple2[scala.Double, scala.Double], 
      structuredDashSourceLib.structuredDashSourceMod.StructuredSourceNs.SourceLocation
    ]
  ): StructuredSource = {
    val __obj = js.Dynamic.literal(indexToPosition = indexToPosition, locationToRange = locationToRange, positionToIndex = positionToIndex, rangeToLocation = rangeToLocation)
  
    __obj.asInstanceOf[StructuredSource]
  }
}

