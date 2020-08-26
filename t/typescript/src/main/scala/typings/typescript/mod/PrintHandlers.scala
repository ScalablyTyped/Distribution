package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintHandlers extends js.Object {
  /**
    * A hook used by the Printer when generating unique names to avoid collisions with
    * globally defined names that exist outside of the current source file.
    */
  var hasGlobalName: js.UndefOr[js.Function1[/* name */ java.lang.String, Boolean]] = js.native
  /**
    * A hook used to check if an emit notification is required for a node.
    * @param node The node to emit.
    */
  var isEmitNotificationEnabled: js.UndefOr[js.Function1[/* node */ js.UndefOr[Node], Boolean]] = js.native
  /**
    * A hook used by the Printer to provide notifications prior to emitting a node. A
    * compatible implementation **must** invoke `emitCallback` with the provided `hint` and
    * `node` values.
    * @param hint A hint indicating the intended purpose of the node.
    * @param node The node to emit.
    * @param emitCallback A callback that, when invoked, will emit the node.
    * @example
    * ```ts
    * var printer = createPrinter(printerOptions, {
    *   onEmitNode(hint, node, emitCallback) {
    *     // set up or track state prior to emitting the node...
    *     emitCallback(hint, node);
    *     // restore state after emitting the node...
    *   }
    * });
    * ```
    */
  var onEmitNode: js.UndefOr[
    js.Function3[
      /* hint */ EmitHint, 
      /* node */ js.UndefOr[Node], 
      /* emitCallback */ js.Function2[/* hint */ EmitHint, /* node */ js.UndefOr[Node], Unit], 
      Unit
    ]
  ] = js.native
  /**
    * A hook used by the Printer to perform just-in-time substitution of a node. This is
    * primarily used by node transformations that need to substitute one node for another,
    * such as replacing `myExportedVar` with `exports.myExportedVar`.
    * @param hint A hint indicating the intended purpose of the node.
    * @param node The node to emit.
    * @example
    * ```ts
    * var printer = createPrinter(printerOptions, {
    *   substituteNode(hint, node) {
    *     // perform substitution if necessary...
    *     return node;
    *   }
    * });
    * ```
    */
  var substituteNode: js.UndefOr[js.Function2[/* hint */ EmitHint, /* node */ Node, Node]] = js.native
}

object PrintHandlers {
  @scala.inline
  def apply(): PrintHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintHandlers]
  }
  @scala.inline
  implicit class PrintHandlersOps[Self <: PrintHandlers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHasGlobalName(value: /* name */ java.lang.String => Boolean): Self = this.set("hasGlobalName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHasGlobalName: Self = this.set("hasGlobalName", js.undefined)
    @scala.inline
    def setIsEmitNotificationEnabled(value: /* node */ js.UndefOr[Node] => Boolean): Self = this.set("isEmitNotificationEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsEmitNotificationEnabled: Self = this.set("isEmitNotificationEnabled", js.undefined)
    @scala.inline
    def setOnEmitNode(
      value: (/* hint */ EmitHint, /* node */ js.UndefOr[Node], /* emitCallback */ js.Function2[/* hint */ EmitHint, /* node */ js.UndefOr[Node], Unit]) => Unit
    ): Self = this.set("onEmitNode", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnEmitNode: Self = this.set("onEmitNode", js.undefined)
    @scala.inline
    def setSubstituteNode(value: (/* hint */ EmitHint, /* node */ Node) => Node): Self = this.set("substituteNode", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSubstituteNode: Self = this.set("substituteNode", js.undefined)
  }
  
}

