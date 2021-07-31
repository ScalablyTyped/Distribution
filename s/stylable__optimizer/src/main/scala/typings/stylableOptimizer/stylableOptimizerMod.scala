package typings.stylableOptimizer

import typings.postcss.mod.Comment_
import typings.postcss.mod.Node
import typings.postcss.mod.Root_
import typings.std.Record
import typings.stylableCore.stylableTransformerMod.StylableResults
import typings.stylableCore.typesMod.IStylableOptimizer
import typings.stylableOptimizer.classnameOptimizerMod.StylableClassNameOptimizer
import typings.stylableOptimizer.namespaceOptimizerMod.StylableNamespaceOptimizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableOptimizerMod {
  
  @JSImport("@stylable/optimizer/cjs/stylable-optimizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stylable/optimizer/cjs/stylable-optimizer", "StylableOptimizer")
  @js.native
  class StylableOptimizer ()
    extends StObject
       with IStylableOptimizer {
    def this(classNameOptimizer: StylableClassNameOptimizer) = this()
    def this(classNameOptimizer: Unit, namespaceOptimizer: StylableNamespaceOptimizer) = this()
    def this(classNameOptimizer: StylableClassNameOptimizer, namespaceOptimizer: StylableNamespaceOptimizer) = this()
    
    @JSName("classNameOptimizer")
    var classNameOptimizer_StylableOptimizer: StylableClassNameOptimizer = js.native
    
    var isContainsUnusedParts: js.Any = js.native
    
    @JSName("namespaceOptimizer")
    var namespaceOptimizer_StylableOptimizer: StylableNamespaceOptimizer = js.native
    
    def optimize(config: OptimizeConfig, stylableResults: StylableResults, usageMapping: Record[String, Boolean]): Unit = js.native
    def optimize(
      config: OptimizeConfig,
      stylableResults: StylableResults,
      usageMapping: Record[String, Boolean],
      delimiter: String
    ): Unit = js.native
    
    var removeComments: js.Any = js.native
    
    var removeEmptyNodes: js.Any = js.native
    
    def removeStylableDirectives(root: Root_): Unit = js.native
    
    var removeUnusedComponents: js.Any = js.native
  }
  
  @scala.inline
  def createCommentFromNode(label: String, node: Node): js.Array[Comment_] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCommentFromNode")(label.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.Array[Comment_]]
  
  @scala.inline
  def createLineByLineComment(node: Node): js.Array[Comment_] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLineByLineComment")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Comment_]]
  
  @scala.inline
  def removeCommentNodes(root: Root_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCommentNodes")(root.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def removeEmptyNodes(root: Root_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEmptyNodes")(root.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def removeRecursiveUpIfEmpty(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRecursiveUpIfEmpty")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def replaceRecursiveUpIfEmpty(label: String, node: Node): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceRecursiveUpIfEmpty")(label.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait OptimizeConfig extends StObject {
    
    var classNameOptimizations: js.UndefOr[Boolean] = js.undefined
    
    var removeComments: js.UndefOr[Boolean] = js.undefined
    
    var removeEmptyNodes: js.UndefOr[Boolean] = js.undefined
    
    var removeStylableDirectives: js.UndefOr[Boolean] = js.undefined
    
    var removeUnusedComponents: js.UndefOr[Boolean] = js.undefined
  }
  object OptimizeConfig {
    
    @scala.inline
    def apply(): OptimizeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptimizeConfig]
    }
    
    @scala.inline
    implicit class OptimizeConfigMutableBuilder[Self <: OptimizeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNameOptimizations(value: Boolean): Self = StObject.set(x, "classNameOptimizations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameOptimizationsUndefined: Self = StObject.set(x, "classNameOptimizations", js.undefined)
      
      @scala.inline
      def setRemoveComments(value: Boolean): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveCommentsUndefined: Self = StObject.set(x, "removeComments", js.undefined)
      
      @scala.inline
      def setRemoveEmptyNodes(value: Boolean): Self = StObject.set(x, "removeEmptyNodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveEmptyNodesUndefined: Self = StObject.set(x, "removeEmptyNodes", js.undefined)
      
      @scala.inline
      def setRemoveStylableDirectives(value: Boolean): Self = StObject.set(x, "removeStylableDirectives", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveStylableDirectivesUndefined: Self = StObject.set(x, "removeStylableDirectives", js.undefined)
      
      @scala.inline
      def setRemoveUnusedComponents(value: Boolean): Self = StObject.set(x, "removeUnusedComponents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUnusedComponentsUndefined: Self = StObject.set(x, "removeUnusedComponents", js.undefined)
    }
  }
}
