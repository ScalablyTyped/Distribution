package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datum extends js.Object {
  var datum: js.UndefOr[java.lang.String] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Datum {
  @scala.inline
  def apply(datum: java.lang.String = null, group: java.lang.String = null, parent: java.lang.String = null): Anon_Datum = {
    val __obj = js.Dynamic.literal()
    if (datum != null) __obj.updateDynamic("datum")(datum)
    if (group != null) __obj.updateDynamic("group")(group)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_Datum]
  }
}

