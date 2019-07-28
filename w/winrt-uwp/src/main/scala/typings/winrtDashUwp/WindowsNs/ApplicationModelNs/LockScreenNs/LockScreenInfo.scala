package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.LockScreenNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.alarmiconchanged
import typings.winrtDashUwp.winrtDashUwpStrings.badgeschanged
import typings.winrtDashUwp.winrtDashUwpStrings.detailtextchanged
import typings.winrtDashUwp.winrtDashUwpStrings.lockscreenimagechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the same data that the default lock screen has access to, such as wallpaper, badges, and so on. */
@JSGlobal("Windows.ApplicationModel.LockScreen.LockScreenInfo")
@js.native
abstract class LockScreenInfo () extends js.Object {
  /** Gets the alarm icon to display. */
  var alarmIcon: IRandomAccessStream = js.native
  /** Gets the badges to display. */
  var badges: IVectorView[LockScreenBadge] = js.native
  /** Gets the detail text to display. */
  var detailText: IVectorView[String] = js.native
  /** Gets the image to display on the lock screen. */
  var lockScreenImage: IRandomAccessStream = js.native
  /** Indicates the alarm icon has changed. */
  @JSName("onalarmiconchanged")
  var onalarmiconchanged_Original: TypedEventHandler[LockScreenInfo, _] = js.native
  /** Indicates the badges have changed. */
  @JSName("onbadgeschanged")
  var onbadgeschanged_Original: TypedEventHandler[LockScreenInfo, _] = js.native
  /** Indicates the detail text has changed. */
  @JSName("ondetailtextchanged")
  var ondetailtextchanged_Original: TypedEventHandler[LockScreenInfo, _] = js.native
  /** Indicates the lock screen image has changed. */
  @JSName("onlockscreenimagechanged")
  var onlockscreenimagechanged_Original: TypedEventHandler[LockScreenInfo, _] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_alarmiconchanged(`type`: alarmiconchanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_badgeschanged(`type`: badgeschanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_detailtextchanged(`type`: detailtextchanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_lockscreenimagechanged(`type`: lockscreenimagechanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  /** Indicates the alarm icon has changed. */
  def onalarmiconchanged(ev: js.Any with WinRTEvent[LockScreenInfo]): Unit = js.native
  /** Indicates the badges have changed. */
  def onbadgeschanged(ev: js.Any with WinRTEvent[LockScreenInfo]): Unit = js.native
  /** Indicates the detail text has changed. */
  def ondetailtextchanged(ev: js.Any with WinRTEvent[LockScreenInfo]): Unit = js.native
  /** Indicates the lock screen image has changed. */
  def onlockscreenimagechanged(ev: js.Any with WinRTEvent[LockScreenInfo]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_alarmiconchanged(`type`: alarmiconchanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_badgeschanged(`type`: badgeschanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_detailtextchanged(`type`: detailtextchanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_lockscreenimagechanged(`type`: lockscreenimagechanged, listener: TypedEventHandler[LockScreenInfo, _]): Unit = js.native
}

