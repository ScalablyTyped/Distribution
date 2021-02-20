package typings.vueComponentCompilerUtils

import typings.vueComponentCompilerUtils.utilsMod.ASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait PostTransformNode extends StObject {
    
    def postTransformNode(node: ASTNode): Unit = js.native
  }
  object PostTransformNode {
    
    @scala.inline
    def apply(postTransformNode: ASTNode => Unit): PostTransformNode = {
      val __obj = js.Dynamic.literal(postTransformNode = js.Any.fromFunction1(postTransformNode))
      __obj.asInstanceOf[PostTransformNode]
    }
    
    @scala.inline
    implicit class PostTransformNodeMutableBuilder[Self <: PostTransformNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostTransformNode(value: ASTNode => Unit): Self = StObject.set(x, "postTransformNode", js.Any.fromFunction1(value))
    }
  }
}
