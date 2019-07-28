package typings.vegaDashLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datum extends js.Object {
  var datum: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[String] = js.undefined
}

object Anon_Datum {
  @scala.inline
  def apply(datum: String = null, group: String = null, parent: String = null): Anon_Datum = {
    val __obj = js.Dynamic.literal()
    if (datum != null) __obj.updateDynamic("datum")(datum)
    if (group != null) __obj.updateDynamic("group")(group)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_Datum]
  }
}

