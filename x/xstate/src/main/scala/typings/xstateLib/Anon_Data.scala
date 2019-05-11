package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */] extends js.Object {
  /**
    * Data from the parent machine's context to set as the (partial or full) context
    * for the invoked child machine.
    *
    * Data should be mapped to match the child machine's context shape.
    */
  var data: js.UndefOr[
    (xstateLib.esTypesMod.Mapper[TContext, TEvent]) | (xstateLib.esTypesMod.PropertyMapper[TContext, TEvent])
  ] = js.undefined
  /**
    * If `true`, events sent to the parent service will be forwarded to the invoked service.
    *
    * Default: `false`
    */
  var forward: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The unique identifier for the invoked machine. If not specified, this
    * will be the machine's own `id`, or the URL (from `src`).
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The transition to take upon the invoked child machine reaching its final top-level state.
    */
  var onDone: js.UndefOr[
    java.lang.String | (xstateLib.esTypesMod.SingleOrArray[
      xstateLib.esTypesMod.TransitionConfig[TContext, xstateLib.esTypesMod.DoneInvokeEvent[_]]
    ])
  ] = js.undefined
  /**
    * The transition to take upon the invoked child machine sending an error event.
    */
  var onError: js.UndefOr[
    java.lang.String | (xstateLib.esTypesMod.SingleOrArray[
      xstateLib.esTypesMod.TransitionConfig[TContext, xstateLib.esTypesMod.DoneInvokeEvent[_]]
    ])
  ] = js.undefined
  /**
    * The source of the machine to be invoked, or the machine itself.
    */
  var src: java.lang.String | (xstateLib.esTypesMod.StateMachine[_, _, _]) | (xstateLib.esTypesMod.InvokeCreator[_, TContext])
}

object Anon_Data {
  @scala.inline
  def apply[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    src: java.lang.String | (xstateLib.esTypesMod.StateMachine[_, _, _]) | (xstateLib.esTypesMod.InvokeCreator[_, TContext]),
    data: (xstateLib.esTypesMod.Mapper[TContext, TEvent]) | (xstateLib.esTypesMod.PropertyMapper[TContext, TEvent]) = null,
    forward: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    onDone: java.lang.String | (xstateLib.esTypesMod.SingleOrArray[
      xstateLib.esTypesMod.TransitionConfig[TContext, xstateLib.esTypesMod.DoneInvokeEvent[_]]
    ]) = null,
    onError: java.lang.String | (xstateLib.esTypesMod.SingleOrArray[
      xstateLib.esTypesMod.TransitionConfig[TContext, xstateLib.esTypesMod.DoneInvokeEvent[_]]
    ]) = null
  ): Anon_Data[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(forward)) __obj.updateDynamic("forward")(forward)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onDone != null) __obj.updateDynamic("onDone")(onDone.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data[TContext, TEvent]]
  }
}

