package typings.utility.utilityMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "replace")
@js.native
object replace extends js.Object {
  /**
    * Replace string
    *
    * @param  {String} str
    * @param  {String|RegExp} substr
    * @param  {String|Function} newSubstr
    * @return {String}
    */
  def apply(str: String, substr: String, newSubstr: String): String = js.native
  def apply(str: String, substr: String, newSubstr: js.Function1[/* repeated */ js.Any, _]): String = js.native
  def apply(str: String, substr: RegExp, newSubstr: String): String = js.native
  def apply(str: String, substr: RegExp, newSubstr: js.Function1[/* repeated */ js.Any, _]): String = js.native
}

