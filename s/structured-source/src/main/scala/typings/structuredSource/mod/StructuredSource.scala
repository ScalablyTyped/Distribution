package typings.structuredSource.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuredSource extends js.Object {
  def indexToPosition(index: Double): SourcePosition
  def locationToRange(loc: SourceLocation): js.Tuple2[Double, Double]
  def positionToIndex(pos: SourcePosition): Double
  def rangeToLocation(range: js.Tuple2[Double, Double]): SourceLocation
}

object StructuredSource {
  @scala.inline
  def apply(
    indexToPosition: Double => SourcePosition,
    locationToRange: SourceLocation => js.Tuple2[Double, Double],
    positionToIndex: SourcePosition => Double,
    rangeToLocation: js.Tuple2[Double, Double] => SourceLocation
  ): StructuredSource = {
    val __obj = js.Dynamic.literal(indexToPosition = js.Any.fromFunction1(indexToPosition), locationToRange = js.Any.fromFunction1(locationToRange), positionToIndex = js.Any.fromFunction1(positionToIndex), rangeToLocation = js.Any.fromFunction1(rangeToLocation))
    __obj.asInstanceOf[StructuredSource]
  }
}

