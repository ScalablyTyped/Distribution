package typings.stylableOptimizer

import typings.postcss.mod.Comment_
import typings.postcss.mod.Node
import typings.postcss.mod.Root_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/optimizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stylable/optimizer", "StylableClassNameOptimizer")
  @js.native
  class StylableClassNameOptimizer ()
    extends typings.stylableOptimizer.classnameOptimizerMod.StylableClassNameOptimizer
  
  @JSImport("@stylable/optimizer", "StylableNamespaceOptimizer")
  @js.native
  class StylableNamespaceOptimizer ()
    extends typings.stylableOptimizer.namespaceOptimizerMod.StylableNamespaceOptimizer
  
  @JSImport("@stylable/optimizer", "StylableOptimizer")
  @js.native
  class StylableOptimizer ()
    extends typings.stylableOptimizer.stylableOptimizerMod.StylableOptimizer {
    def this(classNameOptimizer: typings.stylableOptimizer.classnameOptimizerMod.StylableClassNameOptimizer) = this()
    def this(
      classNameOptimizer: Unit,
      namespaceOptimizer: typings.stylableOptimizer.namespaceOptimizerMod.StylableNamespaceOptimizer
    ) = this()
    def this(
      classNameOptimizer: typings.stylableOptimizer.classnameOptimizerMod.StylableClassNameOptimizer,
      namespaceOptimizer: typings.stylableOptimizer.namespaceOptimizerMod.StylableNamespaceOptimizer
    ) = this()
  }
  
  inline def createCommentFromNode(label: String, node: Node): js.Array[Comment_] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCommentFromNode")(label.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[Comment_]]
  
  inline def createLineByLineComment(node: Node): js.Array[Comment_] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLineByLineComment")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Comment_]]
  
  inline def removeCommentNodes(root: Root_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCommentNodes")(root.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeEmptyNodes(root: Root_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEmptyNodes")(root.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeRecursiveUpIfEmpty(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRecursiveUpIfEmpty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def replaceRecursiveUpIfEmpty(label: String, node: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceRecursiveUpIfEmpty")(label.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
