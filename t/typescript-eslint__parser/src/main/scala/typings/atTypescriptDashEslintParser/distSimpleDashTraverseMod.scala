package typings.atTypescriptDashEslintParser

import typings.atTypescriptDashEslintParser.distSimpleDashTraverseMod.SimpleTraverseOptions
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/parser/dist/simple-traverse", JSImport.Namespace)
@js.native
object distSimpleDashTraverseMod extends js.Object {
  @js.native
  trait SimpleTraverseOptions extends js.Object {
    def enter(node: Node): Unit = js.native
    def enter(node: Node, parent: Node): Unit = js.native
  }
  
  def simpleTraverse(startingNode: Node, options: SimpleTraverseOptions): Unit = js.native
}

