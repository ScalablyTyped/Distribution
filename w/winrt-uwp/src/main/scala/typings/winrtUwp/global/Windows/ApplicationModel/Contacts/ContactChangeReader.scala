package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a way to monitor and react to changes to contacts. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactChangeReader")
@js.native
abstract class ContactChangeReader ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactChangeReader {
  /** Call this method to indicate that you have processed and accepted all changes and you don't want the system to show them to you again. */
  /* CompleteClass */
  override def acceptChanges(): Unit = js.native
  /**
    * Call this method to indicate that you have processed and accepted up through the specified change.
    * @param lastChangeToAccept The last change that you want to system to track as accepted by your app.
    */
  /* CompleteClass */
  override def acceptChangesThrough(lastChangeToAccept: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactChange): Unit = js.native
  /**
    * Asynchronously gets a list of ContactChange objects.
    * @return A list of ContactChange objects.
    */
  /* CompleteClass */
  override def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
}

