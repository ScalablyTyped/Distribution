package typings.typedoc.mod.TypeScript

import typings.typescript.mod.EmitHelper
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.addEmitHelpers")
@js.native
object addEmitHelpers extends js.Object {
  
  /**
    * Add EmitHelpers to a node.
    */
  def apply[T /* <: Node */](node: T): T = js.native
  def apply[T /* <: Node */](node: T, helpers: js.Array[EmitHelper]): T = js.native
}
