package typings.typedoc.mod.TypeScript

import typings.typescript.mod.EmitHelper
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.removeEmitHelper")
@js.native
object removeEmitHelper extends js.Object {
  
  /**
    * Removes an EmitHelper from a node.
    */
  def apply(node: Node, helper: EmitHelper): Boolean = js.native
}
