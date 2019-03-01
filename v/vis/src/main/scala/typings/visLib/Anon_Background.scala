package typings
package visLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Background {
  @scala.inline
  def apply(background: java.lang.String = null, border: java.lang.String = null): Anon_Background = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[Anon_Background]
  }
}

