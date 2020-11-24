package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a text cue in a TimedMetadataTrack . */
@js.native
trait TimedTextCue extends js.Object {
  
  /** Gets or sets the TimedTextRegion of the cue, which defines the style of the rendering area for the cue. */
  var cueRegion: TimedTextRegion = js.native
  
  /** Gets or sets the TimedTextStyle of the cue, which defines the style of the rendered text. */
  var cueStyle: TimedTextStyle = js.native
  
  /** Gets or sets the duration of the cue. */
  var duration: Double = js.native
  
  /** Gets or sets an identifier for the cue. */
  var id: String = js.native
  
  /** Gets the collection of TimedTextLine objects that convey the text of the cue. */
  var lines: IVector[TimedTextLine] = js.native
  
  /** Gets the start time of the cue. */
  var startTime: Double = js.native
}
object TimedTextCue {
  
  @scala.inline
  def apply(
    cueRegion: TimedTextRegion,
    cueStyle: TimedTextStyle,
    duration: Double,
    id: String,
    lines: IVector[TimedTextLine],
    startTime: Double
  ): TimedTextCue = {
    val __obj = js.Dynamic.literal(cueRegion = cueRegion.asInstanceOf[js.Any], cueStyle = cueStyle.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextCue]
  }
  
  @scala.inline
  implicit class TimedTextCueOps[Self <: TimedTextCue] (val x: Self) extends AnyVal {
    
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
    def setCueRegion(value: TimedTextRegion): Self = this.set("cueRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCueStyle(value: TimedTextStyle): Self = this.set("cueStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: IVector[TimedTextLine]): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
  }
}
