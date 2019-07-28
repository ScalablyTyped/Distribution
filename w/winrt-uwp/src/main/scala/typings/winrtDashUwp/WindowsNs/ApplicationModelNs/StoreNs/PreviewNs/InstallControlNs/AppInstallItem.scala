package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.completed
import typings.winrtDashUwp.winrtDashUwpStrings.statuschanged
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
  var isUserInitiated: Boolean = js.native
  /** Occurs when the installation of the current app has finished. */
  @JSName("oncompleted")
  var oncompleted_Original: TypedEventHandler[AppInstallItem, _] = js.native
  /** Occurs when the installation status of the current app has changed. */
  @JSName("onstatuschanged")
  var onstatuschanged_Original: TypedEventHandler[AppInstallItem, _] = js.native
  /** Gets the package family name for the current app. */
  var packageFamilyName: String = js.native
  /** Gets the product ID for the current app. */
  var productId: String = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_completed(`type`: completed, listener: TypedEventHandler[AppInstallItem, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statuschanged(`type`: statuschanged, listener: TypedEventHandler[AppInstallItem, _]): Unit = js.native
  /** Cancels the installation of the current app. */
  def cancel(): Unit = js.native
  /**
    * Cancels the installation of the current app, with the option to generate telemetry data.
    * @param correlationVector A correlation vector string that can be used to generate telemetry data.
    */
  def cancel(correlationVector: String): Unit = js.native
  /**
    * Gets the installation status of the current app.
    * @return A value that specifies the installation status of the current app.
    */
  def getCurrentStatus(): AppInstallStatus = js.native
  /** Occurs when the installation of the current app has finished. */
  def oncompleted(ev: js.Any with WinRTEvent[AppInstallItem]): Unit = js.native
  /** Occurs when the installation status of the current app has changed. */
  def onstatuschanged(ev: js.Any with WinRTEvent[AppInstallItem]): Unit = js.native
  /** Pauses the installation of the current app. */
  def pause(): Unit = js.native
  /**
    * Pauses the installation of the current app, with the option to generate telemetry data.
    * @param correlationVector A correlation vector string that can be used to generate telemetry data.
    */
  def pause(correlationVector: String): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_completed(`type`: completed, listener: TypedEventHandler[AppInstallItem, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statuschanged(`type`: statuschanged, listener: TypedEventHandler[AppInstallItem, _]): Unit = js.native
  /** Restarts the installation of the current app. */
  def restart(): Unit = js.native
  /**
    * Restarts the installation of the current app, with the option to generate telemetry data.
    * @param correlationVector A correlation vector string that can be used to generate telemetry data.
    */
  def restart(correlationVector: String): Unit = js.native
}

