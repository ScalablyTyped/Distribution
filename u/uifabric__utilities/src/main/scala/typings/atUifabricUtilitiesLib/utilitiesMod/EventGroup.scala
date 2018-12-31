package typings
package atUifabricUtilitiesLib.utilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities", "EventGroup")
@js.native
class EventGroup protected ()
  extends atUifabricUtilitiesLib.libEventGroupMod.EventGroup {
  /** parent: the context in which events attached to non-HTMLElements are called */
  def this(parent: js.Any) = this()
}

@JSImport("@uifabric/utilities", "EventGroup")
@js.native
object EventGroup extends js.Object {
  var _uniqueId: js.Any = js.native
  /* private */ def _isElement(target: js.Any): js.Any = js.native
  /** Check to see if the target has declared support of the given event. */
  def isDeclared(target: js.Any, eventName: java.lang.String): scala.Boolean = js.native
  def isObserved(target: js.Any, eventName: java.lang.String): scala.Boolean = js.native
  /** For IE8, bubbleEvent is ignored here and must be dealt with by the handler.
    *  Events raised here by default have bubbling set to false and cancelable set to true.
    *  This applies also to built-in events being raised manually here on HTMLElements,
    *  which may lead to unexpected behavior if it differs from the defaults.
    *
    */
  def raise(target: js.Any, eventName: java.lang.String): js.UndefOr[scala.Boolean] = js.native
  def raise(target: js.Any, eventName: java.lang.String, eventArgs: js.Any): js.UndefOr[scala.Boolean] = js.native
  def raise(target: js.Any, eventName: java.lang.String, eventArgs: js.Any, bubbleEvent: scala.Boolean): js.UndefOr[scala.Boolean] = js.native
  def stopPropagation(event: js.Any): scala.Unit = js.native
}

