package typings
package tableifyLib.tableifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var classPrefix: js.UndefOr[java.lang.String] = js.undefined
  var classes: js.UndefOr[scala.Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(classPrefix: java.lang.String = null, classes: js.UndefOr[scala.Boolean] = js.undefined): Config = {
    val __obj = js.Dynamic.literal()
    if (classPrefix != null) __obj.updateDynamic("classPrefix")(classPrefix)
    if (!js.isUndefined(classes)) __obj.updateDynamic("classes")(classes)
    __obj.asInstanceOf[Config]
  }
}

