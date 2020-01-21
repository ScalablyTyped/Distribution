package typings.tableify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var classPrefix: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(classPrefix: String = null, classes: js.UndefOr[Boolean] = js.undefined): Config = {
    val __obj = js.Dynamic.literal()
    if (classPrefix != null) __obj.updateDynamic("classPrefix")(classPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(classes)) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

