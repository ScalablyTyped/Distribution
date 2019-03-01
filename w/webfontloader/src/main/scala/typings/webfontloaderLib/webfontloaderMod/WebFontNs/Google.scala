package typings
package webfontloaderLib.webfontloaderMod.WebFontNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Google extends js.Object {
  var families: js.Array[java.lang.String]
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Google {
  @scala.inline
  def apply(families: js.Array[java.lang.String], text: java.lang.String = null): Google = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("families")(families)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Google]
  }
}

