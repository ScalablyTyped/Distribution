package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[String] = js.undefined
}

object Anon_Background {
  @scala.inline
  def apply(background: String = null, border: String = null): Anon_Background = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[Anon_Background]
  }
}

