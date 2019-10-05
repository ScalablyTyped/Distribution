package typings.utility.utilityMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "logDate")
@js.native
object logDate extends js.Object {
  /**
    * Normal log format date. format: `moment().format('YYYY-MM-DD HH:mm:ss.SSS')`
    *
    * @return {String}
    */
  def apply(d: String): String = js.native
  def apply(d: String, msSep: String): String = js.native
  def apply(d: Date): String = js.native
  def apply(d: Date, msSep: String): String = js.native
}

