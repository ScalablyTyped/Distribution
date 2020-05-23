package typings.xstyledSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssProperty extends js.Object {
  var cssProperty: String | js.Array[String]
  var key: js.UndefOr[js.Any] = js.undefined
  var prop: String | js.Array[String]
  var themeGet: js.UndefOr[js.Any] = js.undefined
  var transform: js.UndefOr[js.Any] = js.undefined
}

object CssProperty {
  @scala.inline
  def apply(
    cssProperty: String | js.Array[String],
    prop: String | js.Array[String],
    key: js.Any = null,
    themeGet: js.Any = null,
    transform: js.Any = null
  ): CssProperty = {
    val __obj = js.Dynamic.literal(cssProperty = cssProperty.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (themeGet != null) __obj.updateDynamic("themeGet")(themeGet.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssProperty]
  }
}

