package typings.structuredSource.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StructuredSource extends js.Object {
  def indexToPosition(index: Double): SourcePosition = js.native
  def locationToRange(loc: SourceLocation): js.Tuple2[Double, Double] = js.native
  def positionToIndex(pos: SourcePosition): Double = js.native
  def rangeToLocation(range: js.Tuple2[Double, Double]): SourceLocation = js.native
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
  @scala.inline
  implicit class StructuredSourceOps[Self <: StructuredSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndexToPosition(value: Double => SourcePosition): Self = this.set("indexToPosition", js.Any.fromFunction1(value))
    @scala.inline
    def setLocationToRange(value: SourceLocation => js.Tuple2[Double, Double]): Self = this.set("locationToRange", js.Any.fromFunction1(value))
    @scala.inline
    def setPositionToIndex(value: SourcePosition => Double): Self = this.set("positionToIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setRangeToLocation(value: js.Tuple2[Double, Double] => SourceLocation): Self = this.set("rangeToLocation", js.Any.fromFunction1(value))
  }
  
}

