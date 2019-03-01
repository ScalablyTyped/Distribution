package typings
package tabtabLib.tabtabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompleteItem extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object CompleteItem {
  @scala.inline
  def apply(name: java.lang.String, description: java.lang.String = null): CompleteItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[CompleteItem]
  }
}

