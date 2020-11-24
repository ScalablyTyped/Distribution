package typings.vueDocgenApi

import typings.vueCompilerCore.mod.Node2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/utils/guards", JSImport.Namespace)
@js.native
object guardsMod extends js.Object {
  
  def isAttributeNode(): /* is @vue/compiler-core.@vue/compiler-core.AttributeNode */ Boolean = js.native
  def isAttributeNode(prop: Node2): /* is @vue/compiler-core.@vue/compiler-core.AttributeNode */ Boolean = js.native
  
  def isBaseElementNode(): /* is @vue/compiler-core.@vue/compiler-core.BaseElementNode */ Boolean = js.native
  def isBaseElementNode(node: Node2): /* is @vue/compiler-core.@vue/compiler-core.BaseElementNode */ Boolean = js.native
  
  def isCommentNode(node: js.Any): /* is @vue/compiler-core.@vue/compiler-core.CommentNode */ Boolean = js.native
  
  def isCompoundExpressionNode(): /* is @vue/compiler-core.@vue/compiler-core.CompoundExpressionNode */ Boolean = js.native
  def isCompoundExpressionNode(exp: Node2): /* is @vue/compiler-core.@vue/compiler-core.CompoundExpressionNode */ Boolean = js.native
  
  def isDirectiveNode(): /* is @vue/compiler-core.@vue/compiler-core.DirectiveNode */ Boolean = js.native
  def isDirectiveNode(prop: Node2): /* is @vue/compiler-core.@vue/compiler-core.DirectiveNode */ Boolean = js.native
  
  def isInterpolationNode(): /* is @vue/compiler-core.@vue/compiler-core.InterpolationNode */ Boolean = js.native
  def isInterpolationNode(exp: Node2): /* is @vue/compiler-core.@vue/compiler-core.InterpolationNode */ Boolean = js.native
  
  def isSimpleExpressionNode(): /* is @vue/compiler-core.@vue/compiler-core.SimpleExpressionNode */ Boolean = js.native
  def isSimpleExpressionNode(exp: Node2): /* is @vue/compiler-core.@vue/compiler-core.SimpleExpressionNode */ Boolean = js.native
}
