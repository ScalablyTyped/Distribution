package typings.timelinejs3.TL

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TL.Timeline")
@js.native
class Timeline protected () extends ITimeline {
  def this(containerId: String, data: String) = this()
  def this(containerId: String, data: ITimelineConfig) = this()
  def this(containerId: String, data: String, options: ITimelineOptions) = this()
  def this(containerId: String, data: ITimelineConfig, options: ITimelineOptions) = this()
}

@JSGlobal("TL.Timeline")
@js.native
object Timeline extends TopLevel[ITimeline]

