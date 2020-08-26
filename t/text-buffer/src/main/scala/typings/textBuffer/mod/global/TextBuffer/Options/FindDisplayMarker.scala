package typings.textBuffer.mod.global.TextBuffer.Options

import typings.textBuffer.mod.global.TextBuffer.PointCompatible
import typings.textBuffer.mod.global.TextBuffer.RangeCompatible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindDisplayMarker extends js.Object {
  /** Only include markers contained in this Range in buffer coordinates. */
  var containedInBufferRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers contained in this Range in screen coordinates. */
  var containedInScreenRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers containing this Point in buffer coordinates. */
  var containsBufferPosition: js.UndefOr[PointCompatible] = js.native
  /** Only include markers containing this Range in buffer coordinates. */
  var containsBufferRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers ending at this Point in buffer coordinates. */
  var endBufferPosition: js.UndefOr[PointCompatible] = js.native
  /** Only include markers ending at this row in buffer coordinates. */
  var endBufferRow: js.UndefOr[Double] = js.native
  /** Only include markers ending at this Point in screen coordinates. */
  var endScreenPosition: js.UndefOr[PointCompatible] = js.native
  /** Only include markers ending at this row in screen coordinates. */
  var endScreenRow: js.UndefOr[Double] = js.native
  /** Only include markers ending inside this Range in buffer coordinates. */
  var endsInBufferRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers ending inside this Range in screen coordinates. */
  var endsInScreenRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers intersecting this Range in buffer coordinates. */
  var intersectsBufferRange: js.UndefOr[RangeCompatible] = js.native
  /**
    *  Only include markers intersecting this Array of [startRow, endRow] in
    *  buffer coordinates.
    */
  var intersectsBufferRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /** Only include markers intersecting this Range in screen coordinates. */
  var intersectsScreenRange: js.UndefOr[RangeCompatible] = js.native
  /**
    *  Only include markers intersecting this Array of [startRow, endRow] in
    *  screen coordinates.
    */
  var intersectsScreenRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  /** Only include markers starting at this Point in buffer coordinates. */
  var startBufferPosition: js.UndefOr[PointCompatible] = js.native
  /** Only include markers starting at this row in buffer coordinates. */
  var startBufferRow: js.UndefOr[Double] = js.native
  /** Only include markers starting at this Point in screen coordinates. */
  var startScreenPosition: js.UndefOr[PointCompatible] = js.native
  /** Only include markers starting at this row in screen coordinates. */
  var startScreenRow: js.UndefOr[Double] = js.native
  /** Only include markers starting inside this Range in buffer coordinates. */
  var startsInBufferRange: js.UndefOr[RangeCompatible] = js.native
  /** Only include markers starting inside this Range in screen coordinates. */
  var startsInScreenRange: js.UndefOr[RangeCompatible] = js.native
}

object FindDisplayMarker {
  @scala.inline
  def apply(): FindDisplayMarker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindDisplayMarker]
  }
  @scala.inline
  implicit class FindDisplayMarkerOps[Self <: FindDisplayMarker] (val x: Self) extends AnyVal {
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
    def setContainedInBufferRange(value: RangeCompatible): Self = this.set("containedInBufferRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainedInBufferRange: Self = this.set("containedInBufferRange", js.undefined)
    @scala.inline
    def setContainedInScreenRange(value: RangeCompatible): Self = this.set("containedInScreenRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainedInScreenRange: Self = this.set("containedInScreenRange", js.undefined)
    @scala.inline
    def setContainsBufferPosition(value: PointCompatible): Self = this.set("containsBufferPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsBufferPosition: Self = this.set("containsBufferPosition", js.undefined)
    @scala.inline
    def setContainsBufferRange(value: RangeCompatible): Self = this.set("containsBufferRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainsBufferRange: Self = this.set("containsBufferRange", js.undefined)
    @scala.inline
    def setEndBufferPosition(value: PointCompatible): Self = this.set("endBufferPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndBufferPosition: Self = this.set("endBufferPosition", js.undefined)
    @scala.inline
    def setEndBufferRow(value: Double): Self = this.set("endBufferRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndBufferRow: Self = this.set("endBufferRow", js.undefined)
    @scala.inline
    def setEndScreenPosition(value: PointCompatible): Self = this.set("endScreenPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndScreenPosition: Self = this.set("endScreenPosition", js.undefined)
    @scala.inline
    def setEndScreenRow(value: Double): Self = this.set("endScreenRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndScreenRow: Self = this.set("endScreenRow", js.undefined)
    @scala.inline
    def setEndsInBufferRange(value: RangeCompatible): Self = this.set("endsInBufferRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndsInBufferRange: Self = this.set("endsInBufferRange", js.undefined)
    @scala.inline
    def setEndsInScreenRange(value: RangeCompatible): Self = this.set("endsInScreenRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndsInScreenRange: Self = this.set("endsInScreenRange", js.undefined)
    @scala.inline
    def setIntersectsBufferRange(value: RangeCompatible): Self = this.set("intersectsBufferRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntersectsBufferRange: Self = this.set("intersectsBufferRange", js.undefined)
    @scala.inline
    def setIntersectsBufferRowRange(value: js.Tuple2[Double, Double]): Self = this.set("intersectsBufferRowRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntersectsBufferRowRange: Self = this.set("intersectsBufferRowRange", js.undefined)
    @scala.inline
    def setIntersectsScreenRange(value: RangeCompatible): Self = this.set("intersectsScreenRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntersectsScreenRange: Self = this.set("intersectsScreenRange", js.undefined)
    @scala.inline
    def setIntersectsScreenRowRange(value: js.Tuple2[Double, Double]): Self = this.set("intersectsScreenRowRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntersectsScreenRowRange: Self = this.set("intersectsScreenRowRange", js.undefined)
    @scala.inline
    def setStartBufferPosition(value: PointCompatible): Self = this.set("startBufferPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartBufferPosition: Self = this.set("startBufferPosition", js.undefined)
    @scala.inline
    def setStartBufferRow(value: Double): Self = this.set("startBufferRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartBufferRow: Self = this.set("startBufferRow", js.undefined)
    @scala.inline
    def setStartScreenPosition(value: PointCompatible): Self = this.set("startScreenPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartScreenPosition: Self = this.set("startScreenPosition", js.undefined)
    @scala.inline
    def setStartScreenRow(value: Double): Self = this.set("startScreenRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartScreenRow: Self = this.set("startScreenRow", js.undefined)
    @scala.inline
    def setStartsInBufferRange(value: RangeCompatible): Self = this.set("startsInBufferRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartsInBufferRange: Self = this.set("startsInBufferRange", js.undefined)
    @scala.inline
    def setStartsInScreenRange(value: RangeCompatible): Self = this.set("startsInScreenRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartsInScreenRange: Self = this.set("startsInScreenRange", js.undefined)
  }
  
}

