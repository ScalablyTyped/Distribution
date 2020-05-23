package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationResult[T /* <: Node */] extends js.Object {
  /** Gets diagnostics for the transformation. */
  var diagnostics: js.UndefOr[js.Array[DiagnosticWithLocation]] = js.undefined
  /**
    * Indicates if a given node needs an emit notification
    *
    * @param node The node to emit.
    */
  var isEmitNotificationEnabled: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
  /** Gets the transformed source files. */
  var transformed: js.Array[T]
  /**
    * Clean up EmitNode entries on any parse-tree nodes.
    */
  def dispose(): Unit
  /**
    * Emits a node with possible notification.
    *
    * @param hint A hint as to the intended usage of the node.
    * @param node The node to emit.
    * @param emitCallback A callback used to emit the node.
    */
  def emitNodeWithNotification(hint: EmitHint, node: Node, emitCallback: js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]): Unit
  /**
    * Gets a substitute for a node, if one is available; otherwise, returns the original node.
    *
    * @param hint A hint as to the intended usage of the node.
    * @param node The node to substitute.
    */
  def substituteNode(hint: EmitHint, node: Node): Node
}

object TransformationResult {
  @scala.inline
  def apply[T](
    dispose: () => Unit,
    emitNodeWithNotification: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit,
    substituteNode: (EmitHint, Node) => Node,
    transformed: js.Array[T],
    diagnostics: js.Array[DiagnosticWithLocation] = null,
    isEmitNotificationEnabled: /* node */ Node => Boolean = null
  ): TransformationResult[T] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), emitNodeWithNotification = js.Any.fromFunction3(emitNodeWithNotification), substituteNode = js.Any.fromFunction2(substituteNode), transformed = transformed.asInstanceOf[js.Any])
    if (diagnostics != null) __obj.updateDynamic("diagnostics")(diagnostics.asInstanceOf[js.Any])
    if (isEmitNotificationEnabled != null) __obj.updateDynamic("isEmitNotificationEnabled")(js.Any.fromFunction1(isEmitNotificationEnabled))
    __obj.asInstanceOf[TransformationResult[T]]
  }
}

