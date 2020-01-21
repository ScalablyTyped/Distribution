package typings.utility.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "datestruct")
@js.native
object datestruct extends js.Object {
  /**
    * return datetime struct.
    *
    * @return {Object} date
    *  - {Number} YYYYMMDD, 20130401
    *  - {Number} H, 0, 1, 9, 12, 23
    */
  def apply(): IDateStructStaticReturns = js.native
  def apply(now: Date): IDateStructStaticReturns = js.native
}

