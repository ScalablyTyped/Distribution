package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an app that is in the installation queue. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallItem")
@js.native
abstract class AppInstallItem () extends js.Object {
  /** Gets the type of the current app install. */
  var installType: AppInstallType = js.native
  /** Indicates whether the current app install was initiated by the user. */
  var isUserInitiated: scala.Boolean = js.native
  /** Occurs when the installation of the current app has finished. */
  @JSName("oncompleted")
  var oncompleted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppInstallItem, _] = js.native
  /** Occurs when the installation status of the current app has changed. */
  @JSName("onstatuschanged")
  var onstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppInstallItem, _] = js.native
  /** Gets the package family name for the current app. */
  var packageFamilyName: java.lang.String = js.native
  /** Gets the product ID for the current app. */
  var productId: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_completed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.completed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppInstallItem, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppInstallItem, _]
  ): scala.Unit = js.native
  /** Cancels the installation of the current app. */
  def cancel(): scala.Unit = js.native
  /**
                           * Cancels the installation of the current app, with the option to generate telemetry data.
                           * @param correlationVector A correlation vector string that can be used to generate telemetry data.
                           */
  def cancel(correlationVector: java.lang.String): scala.Unit = js.native
  /**
                           * Gets the installation status of the current app.
                           * @return A value that specifies the installation status of the current app.
                           */
  def getCurrentStatus(): AppInstallStatus = js.native
  /** Occurs when the installation of the current app has finished. */
  def oncompleted(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[AppInstallItem]): scala.Unit = js.native
  /** Occurs when the installation status of the current app has changed. */
  def onstatuschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[AppInstallItem]): scala.Unit = js.native
  /** Pauses the installation of the current app. */
  def pause(): scala.Unit = js.native
  /**
                           * Pauses the installation of the current app, with the option to generate telemetry data.
                           * @param correlationVector A correlation vector string that can be used to generate telemetry data.
                           */
  def pause(correlationVector: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_completed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.completed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppInstallItem, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppInstallItem, _]
  ): scala.Unit = js.native
  /** Restarts the installation of the current app. */
  def restart(): scala.Unit = js.native
  /**
                           * Restarts the installation of the current app, with the option to generate telemetry data.
                           * @param correlationVector A correlation vector string that can be used to generate telemetry data.
                           */
  def restart(correlationVector: java.lang.String): scala.Unit = js.native
}

