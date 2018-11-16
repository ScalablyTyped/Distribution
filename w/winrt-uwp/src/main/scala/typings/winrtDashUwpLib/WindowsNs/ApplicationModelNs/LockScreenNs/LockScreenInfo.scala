package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.LockScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the same data that the default lock screen has access to, such as wallpaper, badges, and so on. */
@JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenInfo")
@js.native
abstract class LockScreenInfo () extends js.Object {
  /** Gets the alarm icon to display. */
  var alarmIcon: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  /** Gets the badges to display. */
  var badges: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[LockScreenBadge] = js.native
  /** Gets the detail text to display. */
  var detailText: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** Gets the image to display on the lock screen. */
  var lockScreenImage: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  /** Indicates the alarm icon has changed. */
  @JSName("onalarmiconchanged")
  var onalarmiconchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenInfo, _] = js.native
  /** Indicates the badges have changed. */
  @JSName("onbadgeschanged")
  var onbadgeschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenInfo, _] = js.native
  /** Indicates the detail text has changed. */
  @JSName("ondetailtextchanged")
  var ondetailtextchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenInfo, _] = js.native
  /** Indicates the lock screen image has changed. */
  @JSName("onlockscreenimagechanged")
  var onlockscreenimagechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenInfo, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_alarmiconchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.alarmiconchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenInfo, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_badgeschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.badgeschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenInfo, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_detailtextchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.detailtextchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenInfo, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lockscreenimagechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.lockscreenimagechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenInfo, _]
  ): scala.Unit = js.native
  /** Indicates the alarm icon has changed. */
  def onalarmiconchanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[LockScreenInfo]): scala.Unit = js.native
  /** Indicates the badges have changed. */
  def onbadgeschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[LockScreenInfo]): scala.Unit = js.native
  /** Indicates the detail text has changed. */
  def ondetailtextchanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[LockScreenInfo]): scala.Unit = js.native
  /** Indicates the lock screen image has changed. */
  def onlockscreenimagechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[LockScreenInfo]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_alarmiconchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.alarmiconchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenInfo, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_badgeschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.badgeschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenInfo, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_detailtextchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.detailtextchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenInfo, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lockscreenimagechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.lockscreenimagechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[LockScreenInfo, _]
  ): scala.Unit = js.native
}

