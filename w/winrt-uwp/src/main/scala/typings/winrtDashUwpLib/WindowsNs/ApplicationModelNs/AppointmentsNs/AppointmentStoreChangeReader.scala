package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the calling app to read through the changes to appointments in its appointment store. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreChangeReader")
@js.native
abstract class AppointmentStoreChangeReader () extends js.Object {
  /** Tells the system that all of the changes to appointments returned by the call to ReadBatchAsync have been addressed by the app. */
  def acceptChanges(): scala.Unit = js.native
  /**
                   * Tells the system that all of the changes to appointments returned by the call to ReadBatchAsync , up to the specified AppointmentStoreChange , have been addressed by the app.
                   * @param lastChangeToAccept The AppointmentStoreChange object indicating the latest change that has been addressed by the app.
                   */
  def acceptChangesThrough(lastChangeToAccept: AppointmentStoreChange): scala.Unit = js.native
  /**
                   * Returns a list of the changes that have occurred in the appointment store that have not yet been accepted by the calling app.
                   * @return An asynchronous operation that returns an IVectorView upon successful completion.
                   */
  def readBatchAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
}

