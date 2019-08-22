package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.Block
import typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeStrings.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends BaseNode {
  var `type`: Line | Block
  var value: String
}

object Comment {
  @scala.inline
  def apply(loc: SourceLocation, range: Range, `type`: Line | Block, value: String, parent: Node = null): Comment = {
    val __obj = js.Dynamic.literal(loc = loc, range = range, value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Comment]
  }
}

