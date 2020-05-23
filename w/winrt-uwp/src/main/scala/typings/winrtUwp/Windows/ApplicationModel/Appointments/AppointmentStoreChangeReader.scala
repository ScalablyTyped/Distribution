package typings.winrtUwp.Windows.ApplicationModel.Appointments

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the calling app to read through the changes to appointments in its appointment store. */
trait AppointmentStoreChangeReader extends js.Object {
  /** Tells the system that all of the changes to appointments returned by the call to ReadBatchAsync have been addressed by the app. */
  def acceptChanges(): Unit
  /**
    * Tells the system that all of the changes to appointments returned by the call to ReadBatchAsync , up to the specified AppointmentStoreChange , have been addressed by the app.
    * @param lastChangeToAccept The AppointmentStoreChange object indicating the latest change that has been addressed by the app.
    */
  def acceptChangesThrough(lastChangeToAccept: AppointmentStoreChange): Unit
  /**
    * Returns a list of the changes that have occurred in the appointment store that have not yet been accepted by the calling app.
    * @return An asynchronous operation that returns an IVectorView upon successful completion.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]]
}

object AppointmentStoreChangeReader {
  @scala.inline
  def apply(
    acceptChanges: () => Unit,
    acceptChangesThrough: AppointmentStoreChange => Unit,
    readBatchAsync: () => IPromiseWithIAsyncOperation[IVectorView[_]]
  ): AppointmentStoreChangeReader = {
    val __obj = js.Dynamic.literal(acceptChanges = js.Any.fromFunction0(acceptChanges), acceptChangesThrough = js.Any.fromFunction1(acceptChangesThrough), readBatchAsync = js.Any.fromFunction0(readBatchAsync))
    __obj.asInstanceOf[AppointmentStoreChangeReader]
  }
}

