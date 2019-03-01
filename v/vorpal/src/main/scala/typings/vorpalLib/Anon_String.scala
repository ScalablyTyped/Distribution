package typings
package vorpalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_String extends js.Object {
  var string: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_String {
  @scala.inline
  def apply(string: js.Array[java.lang.String] = null): Anon_String = {
    val __obj = js.Dynamic.literal()
    if (string != null) __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[Anon_String]
  }
}

