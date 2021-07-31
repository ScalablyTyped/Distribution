package typings.vueDocgenApi

import typings.vueCompilerCore.mod.Node2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object guardsMod {
  
  @JSImport("vue-docgen-api/dist/utils/guards", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isAttributeNode(): /* is @vue/compiler-core.@vue/compiler-core.AttributeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAttributeNode")().asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.AttributeNode */ Boolean]
  @scala.inline
  def isAttributeNode(prop: Node2): /* is @vue/compiler-core.@vue/compiler-core.AttributeNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAttributeNode")(prop.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.AttributeNode */ Boolean]
  
  @scala.inline
  def isBaseElementNode(): /* is @vue/compiler-core.@vue/compiler-core.BaseElementNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBaseElementNode")().asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.BaseElementNode */ Boolean]
  @scala.inline
  def isBaseElementNode(node: Node2): /* is @vue/compiler-core.@vue/compiler-core.BaseElementNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBaseElementNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.BaseElementNode */ Boolean]
  
  @scala.inline
  def isCommentNode(node: js.Any): /* is @vue/compiler-core.@vue/compiler-core.CommentNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommentNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.CommentNode */ Boolean]
  
  @scala.inline
  def isCompoundExpressionNode(): /* is @vue/compiler-core.@vue/compiler-core.CompoundExpressionNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompoundExpressionNode")().asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.CompoundExpressionNode */ Boolean]
  @scala.inline
  def isCompoundExpressionNode(exp: Node2): /* is @vue/compiler-core.@vue/compiler-core.CompoundExpressionNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompoundExpressionNode")(exp.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.CompoundExpressionNode */ Boolean]
  
  @scala.inline
  def isDirectiveNode(): /* is @vue/compiler-core.@vue/compiler-core.DirectiveNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectiveNode")().asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.DirectiveNode */ Boolean]
  @scala.inline
  def isDirectiveNode(prop: Node2): /* is @vue/compiler-core.@vue/compiler-core.DirectiveNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDirectiveNode")(prop.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.DirectiveNode */ Boolean]
  
  @scala.inline
  def isInterpolationNode(): /* is @vue/compiler-core.@vue/compiler-core.InterpolationNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterpolationNode")().asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.InterpolationNode */ Boolean]
  @scala.inline
  def isInterpolationNode(exp: Node2): /* is @vue/compiler-core.@vue/compiler-core.InterpolationNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterpolationNode")(exp.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.InterpolationNode */ Boolean]
  
  @scala.inline
  def isSimpleExpressionNode(): /* is @vue/compiler-core.@vue/compiler-core.SimpleExpressionNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleExpressionNode")().asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.SimpleExpressionNode */ Boolean]
  @scala.inline
  def isSimpleExpressionNode(exp: Node2): /* is @vue/compiler-core.@vue/compiler-core.SimpleExpressionNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimpleExpressionNode")(exp.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/compiler-core.@vue/compiler-core.SimpleExpressionNode */ Boolean]
}
