package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "hasJSDocParameterTags")
@js.native
object hasJSDocParameterTags extends js.Object {
  
  /**
    * Return true if the node has JSDoc parameter tags.
    *
    * @remarks Includes parameter tags that are not directly on the node,
    * for example on a variable declaration whose initializer is a function expression.
    */
  def apply(node: FunctionLikeDeclaration): Boolean = js.native
  def apply(node: SignatureDeclaration): Boolean = js.native
}
