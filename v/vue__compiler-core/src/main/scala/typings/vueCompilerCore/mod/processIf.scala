package typings.vueCompilerCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-core", "processIf")
@js.native
object processIf extends js.Object {
  
  def apply(node: ElementNode, dir: DirectiveNode, context: TransformContext): js.UndefOr[js.Function0[Unit]] = js.native
  def apply(
    node: ElementNode,
    dir: DirectiveNode,
    context: TransformContext,
    processCodegen: js.Function3[
      /* node */ IfNode, 
      /* branch */ IfBranchNode, 
      /* isRoot */ Boolean, 
      js.UndefOr[js.Function0[Unit]]
    ]
  ): js.UndefOr[js.Function0[Unit]] = js.native
}
