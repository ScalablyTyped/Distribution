package typings.winrtDashUwp.WindowsNs.MediaNs.ImportNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs for determining if photo import is supported on the current device, finding sources from which to import photos, and getting references to any pending photo import operations. */
@JSGlobal("Windows.Media.Import.PhotoImportManager")
@js.native
abstract class PhotoImportManager () extends js.Object

/* static members */
@JSGlobal("Windows.Media.Import.PhotoImportManager")
@js.native
object PhotoImportManager extends js.Object {
  /**
    * Finds all currently available sources from which photos can be imported.
    * @return An asynchronous operation that returns a list of available sources on successful completion.
    */
  def findAllSourcesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Gets the list of all pending photo import operations.
    * @return The list of all pending photo operations.
    */
  def getPendingOperations(): IVectorView[PhotoImportOperation] = js.native
  /**
    * Gets a value indicating if photo import is supported on the current device.
    * @return An asynchronous operation that returns true if photo import is supported. Otherwise, returns false.
    */
  def isSupportedAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
}

