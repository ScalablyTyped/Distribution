package typings.tslint

import typings.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typings.tslint.tslintMod.Rules.AbstractRule
import typings.typescript.typescriptMod.Node
import typings.typescript.typescriptMod.NodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/rules/typedefRule", JSImport.Namespace)
@js.native
object libRulesTypedefRuleMod extends js.Object {
  @js.native
  class Rule () extends AbstractRule
  
  def isNodeArray(nodeOrArray: Node): /* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean = js.native
  def isNodeArray(nodeOrArray: NodeArray[Node]): /* is typescript.typescript.NodeArray<typescript.typescript.Node> */ Boolean = js.native
  /* static members */
  @js.native
  object Rule extends js.Object {
    var metadata: IRuleMetadata = js.native
  }
  
}

