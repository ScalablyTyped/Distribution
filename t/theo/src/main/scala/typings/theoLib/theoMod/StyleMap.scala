package typings
package theoLib.theoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleMap extends js.Object {
  var aliases: Aliases
  var global: js.UndefOr[Props] = js.undefined
  var imports: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var meta: Meta
  var options: js.Object
  var props: Props
}

object StyleMap {
  @scala.inline
  def apply(
    aliases: Aliases,
    meta: Meta,
    options: js.Object,
    props: Props,
    global: Props = null,
    imports: js.Array[java.lang.String] = null
  ): StyleMap = {
    val __obj = js.Dynamic.literal(aliases = aliases, meta = meta, options = options, props = props)
    if (global != null) __obj.updateDynamic("global")(global)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    __obj.asInstanceOf[StyleMap]
  }
}

