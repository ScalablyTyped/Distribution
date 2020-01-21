package typings.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleMap extends js.Object {
  var aliases: Aliases
  var global: js.UndefOr[Props] = js.undefined
  var imports: js.UndefOr[js.Array[String]] = js.undefined
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
    imports: js.Array[String] = null
  ): StyleMap = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (global != null) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleMap]
  }
}

