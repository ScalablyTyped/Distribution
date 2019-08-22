package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.Anon_Flags
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralBase extends BaseNode {
  var raw: String
  var regex: js.UndefOr[Anon_Flags] = js.undefined
  var value: Boolean | Double | RegExp | String | Null
}

object LiteralBase {
  @scala.inline
  def apply(
    loc: SourceLocation,
    range: Range,
    raw: String,
    parent: Node = null,
    regex: Anon_Flags = null,
    value: Boolean | Double | RegExp | String = null
  ): LiteralBase = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, raw = raw)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralBase]
  }
}

