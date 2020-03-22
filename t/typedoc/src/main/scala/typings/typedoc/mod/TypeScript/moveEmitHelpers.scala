package typings.typedoc.mod.TypeScript

import typings.typescript.mod.EmitHelper
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.moveEmitHelpers")
@js.native
object moveEmitHelpers extends js.Object {
  /**
    * Moves matching emit helpers from a source node to a target node.
    */
  def apply(source: Node, target: Node, predicate: js.Function1[/* helper */ EmitHelper, Boolean]): Unit = js.native
}

