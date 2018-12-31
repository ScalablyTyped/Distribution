package typings
package timezonecompleteLib.distLibTimesourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/timesource", "RealTimeSource")
@js.native
class RealTimeSource () extends TimeSource {
  /**
    * Return the current date+time as a javascript Date object
    */
  /* CompleteClass */
  override def now(): stdLib.Date = js.native
}

