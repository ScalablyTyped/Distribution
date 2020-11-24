package typings.stylableOptimizer

import typings.postcss.mod.Comment_
import typings.postcss.mod.Node
import typings.postcss.mod.Root_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/optimizer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createCommentFromNode(label: String, node: Node): js.Array[Comment_] = js.native
  
  def createLineByLineComment(node: Node): js.Array[Comment_] = js.native
  
  def removeCommentNodes(root: Root_): Unit = js.native
  
  def removeEmptyNodes(root: Root_): Unit = js.native
  
  def removeRecursiveUpIfEmpty(node: Node): Unit = js.native
  
  def replaceRecursiveUpIfEmpty(label: String, node: Node): Unit = js.native
  
  @js.native
  class StylableClassNameOptimizer ()
    extends typings.stylableOptimizer.classnameOptimizerMod.StylableClassNameOptimizer
  
  @js.native
  class StylableNamespaceOptimizer ()
    extends typings.stylableOptimizer.namespaceOptimizerMod.StylableNamespaceOptimizer
  
  @js.native
  class StylableOptimizer ()
    extends typings.stylableOptimizer.stylableOptimizerMod.StylableOptimizer {
    def this(classNameOptimizer: typings.stylableOptimizer.classnameOptimizerMod.StylableClassNameOptimizer) = this()
    def this(
      classNameOptimizer: js.UndefOr[scala.Nothing],
      namespaceOptimizer: typings.stylableOptimizer.namespaceOptimizerMod.StylableNamespaceOptimizer
    ) = this()
    def this(
      classNameOptimizer: typings.stylableOptimizer.classnameOptimizerMod.StylableClassNameOptimizer,
      namespaceOptimizer: typings.stylableOptimizer.namespaceOptimizerMod.StylableNamespaceOptimizer
    ) = this()
  }
}
