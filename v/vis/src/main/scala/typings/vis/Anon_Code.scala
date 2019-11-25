package typings.vis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: js.UndefOr[String] = js.undefined
    // 50,
  var color: js.UndefOr[String] = js.undefined
  var face: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(code: String = null, color: String = null, face: String = null, size: Int | Double = null): Anon_Code = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (face != null) __obj.updateDynamic("face")(face.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Code]
  }
}

