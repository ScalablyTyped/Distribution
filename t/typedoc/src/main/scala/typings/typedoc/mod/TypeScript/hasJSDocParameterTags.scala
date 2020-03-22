package typings.typedoc.mod.TypeScript

import typings.typescript.mod.FunctionLikeDeclaration
import typings.typescript.mod.SignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.hasJSDocParameterTags")
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

