package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a data cue that can be included in a TimedMetadataTrack . */
@js.native
trait DataCue extends js.Object {
  /** Gets the data associated with the cue. */
  var data: IBuffer = js.native
  /** Gets or sets the duration of the cue. */
  var duration: Double = js.native
  /** Gets the identifier for the timed metadata track. */
  var id: String = js.native
  /** Gets the start time of the cue. */
  var startTime: Double = js.native
}

object DataCue {
  @scala.inline
  def apply(data: IBuffer, duration: Double, id: String, startTime: Double): DataCue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCue]
  }
  @scala.inline
  implicit class DataCueOps[Self <: DataCue] (val x: Self) extends AnyVal {
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
    def setData(value: IBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
  }
  
}

