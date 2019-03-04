package typings
package yamlLib.yamlMod.cstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowChar extends js.Object {
  var char: yamlLib.yamlLibStrings.`{` | yamlLib.yamlLibStrings.`}` | yamlLib.yamlLibStrings.`[` | yamlLib.yamlLibStrings.`]` | yamlLib.yamlLibStrings.`,` | yamlLib.yamlLibStrings.`?` | yamlLib.yamlLibStrings.`:`
  var offset: scala.Double
  var origOffset: js.UndefOr[scala.Double] = js.undefined
}

object FlowChar {
  @scala.inline
  def apply(
    char: yamlLib.yamlLibStrings.`{` | yamlLib.yamlLibStrings.`}` | yamlLib.yamlLibStrings.`[` | yamlLib.yamlLibStrings.`]` | yamlLib.yamlLibStrings.`,` | yamlLib.yamlLibStrings.`?` | yamlLib.yamlLibStrings.`:`,
    offset: scala.Double,
    origOffset: scala.Int | scala.Double = null
  ): FlowChar = {
    val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any], offset = offset)
    if (origOffset != null) __obj.updateDynamic("origOffset")(origOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowChar]
  }
}

