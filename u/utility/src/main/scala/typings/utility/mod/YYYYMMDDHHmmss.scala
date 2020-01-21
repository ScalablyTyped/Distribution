package typings.utility.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "YYYYMMDDHHmmss")
@js.native
object YYYYMMDDHHmmss extends js.Object {
  def apply(d: String): String = js.native
  def apply(d: String, options: IYYYYMMDDHHmmssStaticOptions): String = js.native
  /**
    * `moment().format('YYYY-MM-DD HH:mm:ss')` format date string.
    *
    * @return {String}
    */
  def apply(d: Date): String = js.native
  def apply(d: Date, options: IYYYYMMDDHHmmssStaticOptions): String = js.native
}

