package typings.tabris

import typings.tabris.mod.Flatten
import typings.tabris.mod.TextInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var children: js.UndefOr[Flatten[String | TextInput]] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(children: Flatten[String | TextInput] = null): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

