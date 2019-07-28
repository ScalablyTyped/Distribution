package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.LockScreenNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.unlocking
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows the lock screen app to request that the device unlocks, and allows the app to register to be notified when the device begins to unlock. */
@JSGlobal("Windows.ApplicationModel.LockScreen.LockApplicationHost")
@js.native
abstract class LockApplicationHost () extends js.Object {
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

/* static members */
@JSGlobal("Windows.ApplicationModel.LockScreen.LockApplicationHost")
@js.native
object LockApplicationHost extends js.Object {
  /**
    * Gets a LockApplicationHost object.
    * @return A LockApplicationHost object.
    */
  def getForCurrentView(): LockApplicationHost = js.native
}

