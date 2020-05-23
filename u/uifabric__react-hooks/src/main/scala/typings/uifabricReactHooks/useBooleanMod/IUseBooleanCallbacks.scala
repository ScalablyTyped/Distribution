package typings.uifabricReactHooks.useBooleanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUseBooleanCallbacks extends js.Object {
  /** Set the value to false. Always has the same identity. */
  def setFalse(): Unit
  /** Set the value to true. Always has the same identity. */
  def setTrue(): Unit
  /** Toggle the value. Always has the same identity. */
  def toggle(): Unit
}

object IUseBooleanCallbacks {
  @scala.inline
  def apply(setFalse: () => Unit, setTrue: () => Unit, toggle: () => Unit): IUseBooleanCallbacks = {
    val __obj = js.Dynamic.literal(setFalse = js.Any.fromFunction0(setFalse), setTrue = js.Any.fromFunction0(setTrue), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[IUseBooleanCallbacks]
  }
}

