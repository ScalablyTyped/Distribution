package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSProperty extends js.Object {
  var parsed: js.UndefOr[webdriverioLib.Anon_Alpha] = js.undefined
  var property: java.lang.String
  var value: js.Any
}

object CSSProperty {
  @scala.inline
  def apply(property: java.lang.String, value: js.Any, parsed: webdriverioLib.Anon_Alpha = null): CSSProperty = {
    val __obj = js.Dynamic.literal(property = property, value = value)
    if (parsed != null) __obj.updateDynamic("parsed")(parsed)
    __obj.asInstanceOf[CSSProperty]
  }
}

