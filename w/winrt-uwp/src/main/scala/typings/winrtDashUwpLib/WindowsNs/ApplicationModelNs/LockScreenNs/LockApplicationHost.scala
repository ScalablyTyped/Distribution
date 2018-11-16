package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.LockScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows the lock screen app to request that the device unlocks, and allows the app to register to be notified when the device begins to unlock. */
@JSGlobal("Windows.ApplicationModel.LockScreen.LockApplicationHost")
@js.native
abstract class LockApplicationHost () extends js.Object {
  /** Indicates the device is unlocking. */
  @JSName("onunlocking")
  var onunlocking_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unlocking(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.unlocking,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs]
  ): scala.Unit = js.native
  /** Indicates the device is unlocking. */
  def onunlocking(ev: LockScreenUnlockingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[LockApplicationHost]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unlocking(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.unlocking,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockApplicationHost, LockScreenUnlockingEventArgs]
  ): scala.Unit = js.native
  /** Requests that the device unlocks. */
  def requestUnlock(): scala.Unit = js.native
}

/** Allows the lock screen app to request that the device unlocks, and allows the app to register to be notified when the device begins to unlock. */
@JSGlobal("Windows.ApplicationModel.LockScreen.LockApplicationHost")
@js.native
object LockApplicationHost extends js.Object {
  /**
                   * Gets a LockApplicationHost object.
                   * @return A LockApplicationHost object.
                   */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.ApplicationModelNs.LockScreenNs.LockApplicationHost = js.native
}

