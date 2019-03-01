package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(id: java.lang.String = null, parent: stdLib.HTMLElement = null): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_Id]
  }
}

