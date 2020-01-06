package typings.yaml.yamlMod.cst

import typings.yaml.yamlStrings.Colon
import typings.yaml.yamlStrings.Comma
import typings.yaml.yamlStrings.Leftcurlybracket
import typings.yaml.yamlStrings.Questionmark
import typings.yaml.yamlStrings.Rightcurlybracket
import typings.yaml.yamlStrings.`[`
import typings.yaml.yamlStrings.`]`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowChar extends js.Object {
  var char: Leftcurlybracket | Rightcurlybracket | `[` | `]` | Comma | Questionmark | Colon
  var offset: Double
  var origOffset: js.UndefOr[Double] = js.undefined
}

object FlowChar {
  @scala.inline
  def apply(
    char: Leftcurlybracket | Rightcurlybracket | `[` | `]` | Comma | Questionmark | Colon,
    offset: Double,
    origOffset: Int | Double = null
  ): FlowChar = {
    val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    if (origOffset != null) __obj.updateDynamic("origOffset")(origOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowChar]
  }
}

