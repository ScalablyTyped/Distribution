package typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod

import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashNodesMod.TSNode
import typings.typescript.typescriptMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserServices extends js.Object {
  var esTreeNodeToTSNodeMap: js.UndefOr[ParserWeakMap[Node, TSNode]] = js.undefined
  var program: js.UndefOr[Program] = js.undefined
  var tsNodeToESTreeNodeMap: js.UndefOr[ParserWeakMap[TSNode, Node]] = js.undefined
}

object ParserServices {
  @scala.inline
  def apply(
    esTreeNodeToTSNodeMap: ParserWeakMap[Node, TSNode] = null,
    program: Program = null,
    tsNodeToESTreeNodeMap: ParserWeakMap[TSNode, Node] = null
  ): ParserServices = {
    val __obj = js.Dynamic.literal()
    if (esTreeNodeToTSNodeMap != null) __obj.updateDynamic("esTreeNodeToTSNodeMap")(esTreeNodeToTSNodeMap)
    if (program != null) __obj.updateDynamic("program")(program)
    if (tsNodeToESTreeNodeMap != null) __obj.updateDynamic("tsNodeToESTreeNodeMap")(tsNodeToESTreeNodeMap)
    __obj.asInstanceOf[ParserServices]
  }
}

