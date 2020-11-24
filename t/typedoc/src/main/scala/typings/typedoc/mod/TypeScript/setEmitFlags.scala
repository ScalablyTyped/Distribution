package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.setEmitFlags")
@js.native
object setEmitFlags extends js.Object {
  
  /**
    * Sets flags that control emit behavior of a node.
    */
  def apply[T /* <: Node */](node: T, emitFlags: typings.typescript.mod.EmitFlags): T = js.native
}
