package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "setEmitFlags")
@js.native
object setEmitFlags extends js.Object {
  
  /**
    * Sets flags that control emit behavior of a node.
    */
  def apply[T /* <: Node */](node: T, emitFlags: EmitFlags): T = js.native
}
