package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TransformationResult[T /* <: Node */] extends js.Object {
  /** Gets diagnostics for the transformation. */
  var diagnostics: js.UndefOr[js.Array[DiagnosticWithLocation]] = js.undefined
  /** Gets the transformed source files. */
  var transformed: js.Array[T]
  /**
           * Clean up EmitNode entries on any parse-tree nodes.
           */
  def dispose(): scala.Unit
  /**
           * Emits a node with possible notification.
           *
           * @param hint A hint as to the intended usage of the node.
           * @param node The node to emit.
           * @param emitCallback A callback used to emit the node.
           */
  def emitNodeWithNotification(
    hint: EmitHint,
    node: Node,
    emitCallback: js.Function2[/* hint */ EmitHint, /* node */ Node, scala.Unit]
  ): scala.Unit
  /**
           * Gets a substitute for a node, if one is available; otherwise, returns the original node.
           *
           * @param hint A hint as to the intended usage of the node.
           * @param node The node to substitute.
           */
  def substituteNode(hint: EmitHint, node: Node): Node
}

