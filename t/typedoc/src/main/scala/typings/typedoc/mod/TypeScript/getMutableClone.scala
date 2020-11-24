package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getMutableClone")
@js.native
object getMutableClone extends js.Object {
  
  /**
    * Creates a shallow, memberwise clone of a node ~for mutation~ with its `pos`, `end`, and `parent` set.
    *
    * NOTE: It is unsafe to change any properties of a `Node` that relate to its AST children, as those changes won't be
    * captured with respect to transformations.
    *
    * @deprecated Use `factory.cloneNode` instead and use `setCommentRange` or `setSourceMapRange` and avoid setting `parent`.
    */
  def apply[T /* <: Node */](node: T): T = js.native
}
