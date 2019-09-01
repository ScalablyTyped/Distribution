package typings.timezonecomplete.distLibTimesourceMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/timesource", "RealTimeSource")
@js.native
class RealTimeSource () extends TimeSource {
  /**
    * Return the current date+time as a javascript Date object
    * @throws nothing
    */
  /* CompleteClass */
  override def now(): Date = js.native
}

