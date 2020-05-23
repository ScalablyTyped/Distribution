package typings.winrtUwp.Windows.ApplicationModel.LockScreen

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.unlocking
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows the lock screen app to request that the device unlocks, and allows the app to register to be notified when the device begins to unlock. */
@js.native
trait LockApplicationHost extends js.Object {
  /** Indicates the device is unlocking. */
  @JSName("onunlocking")
  var onunlocking_Original: TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unlocking(`type`: unlocking, listener: TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs]): Unit = js.native
  /** Indicates the device is unlocking. */
  def onunlocking(ev: LockScreenUnlockingEventArgs with WinRTEvent[LockApplicationHost]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unlocking(`type`: unlocking, listener: TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs]): Unit = js.native
  /** Requests that the device unlocks. */
  def requestUnlock(): Unit = js.native
}

