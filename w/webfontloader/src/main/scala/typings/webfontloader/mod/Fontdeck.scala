package typings.webfontloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fontdeck extends js.Object {
  var id: js.UndefOr[String] = js.undefined
}

object Fontdeck {
  @scala.inline
  def apply(id: String = null): Fontdeck = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fontdeck]
  }
}

