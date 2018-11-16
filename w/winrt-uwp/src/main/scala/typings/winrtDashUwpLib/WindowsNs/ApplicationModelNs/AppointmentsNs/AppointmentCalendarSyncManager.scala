package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to sync functionality for an AppointmentCalendar object. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentCalendarSyncManager")
@js.native
abstract class AppointmentCalendarSyncManager () extends js.Object {
  /** Gets the last date and time that a sync with the AppointmentCalendar server was attempted. */
  var lastAttemptedSyncTime: stdLib.Date = js.native
  /** Gets the last date and time that a sync with the AppointmentCalendar server was successful. */
  var lastSuccessfulSyncTime: stdLib.Date = js.native
  /** Occurs when the status of an AppointmentCalendar sync operation changes. */
  @JSName("onsyncstatuschanged")
  var onsyncstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppointmentCalendarSyncManager, _] = js.native
  /** Gets the current status of the AppointmentCalendarSyncManager . */
  var status: AppointmentCalendarSyncStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_syncstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.syncstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppointmentCalendarSyncManager, _]
  ): scala.Unit = js.native
  /** Occurs when the status of an AppointmentCalendar sync operation changes. */
  def onsyncstatuschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[AppointmentCalendarSyncManager]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_syncstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.syncstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AppointmentCalendarSyncManager, _]
  ): scala.Unit = js.native
  /**
                   * Initiates a sync operation on the AppointmentCalendar .
                   * @return A Boolean value indicating if the sync was successfully initiated.
                   */
  def syncAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

