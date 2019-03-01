package typings
package webfontloaderLib.webfontloaderMod.WebFontNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fontdeck extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object Fontdeck {
  @scala.inline
  def apply(id: java.lang.String = null): Fontdeck = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Fontdeck]
  }
}

