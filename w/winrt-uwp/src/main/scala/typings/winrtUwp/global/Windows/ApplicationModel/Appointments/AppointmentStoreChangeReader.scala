package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the calling app to read through the changes to appointments in its appointment store. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreChangeReader")
@js.native
abstract class AppointmentStoreChangeReader ()
  extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangeReader {
  /** Tells the system that all of the changes to appointments returned by the call to ReadBatchAsync have been addressed by the app. */
  /* CompleteClass */
  override def acceptChanges(): Unit = js.native
  /**
    * Tells the system that all of the changes to appointments returned by the call to ReadBatchAsync , up to the specified AppointmentStoreChange , have been addressed by the app.
    * @param lastChangeToAccept The AppointmentStoreChange object indicating the latest change that has been addressed by the app.
    */
  /* CompleteClass */
  override def acceptChangesThrough(lastChangeToAccept: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChange): Unit = js.native
  /**
    * Returns a list of the changes that have occurred in the appointment store that have not yet been accepted by the calling app.
    * @return An asynchronous operation that returns an IVectorView upon successful completion.
    */
  /* CompleteClass */
  override def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

