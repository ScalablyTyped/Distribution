package typings.utility.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("utility", "YYYYMMDD")
@js.native
object YYYYMMDD extends js.Object {
  
  /**
    * `moment().format('YYYY-MM-DD')` format date string.
    *
    * @return {String}
    */
  def apply(d: String): String = js.native
  def apply(d: String, sep: String): String = js.native
  def apply(d: Date): String = js.native
  def apply(d: Date, sep: String): String = js.native
}
