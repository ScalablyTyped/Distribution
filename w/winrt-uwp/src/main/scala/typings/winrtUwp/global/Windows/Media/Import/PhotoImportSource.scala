package typings.winrtUwp.global.Windows.Media.Import

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the source device for a photo import session. */
@JSGlobal("Windows.Media.Import.PhotoImportSource")
@js.native
abstract class PhotoImportSource ()
  extends typings.winrtUwp.Windows.Media.Import.PhotoImportSource
/* static members */
@JSGlobal("Windows.Media.Import.PhotoImportSource")
@js.native
object PhotoImportSource extends js.Object {
  
  /**
    * Creates a new instance of PhotoImportSource from the specified root folder.
    * @param sourceRootFolder The root folder from which the photo import source is created.
    * @return An asynchronous operation that returns a PhotoImportSource upon successful completion.
    */
  def fromFolderAsync(sourceRootFolder: IStorageFolder): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Import.PhotoImportSource] = js.native
  
  /**
    * Creates a new instance of PhotoImportSource from the specified device ID.
    * @param sourceId The root folder from which the photo import source is created.
    * @return An asynchronous operation that returns a PhotoImportSource upon successful completion.
    */
  def fromIdAsync(sourceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.Import.PhotoImportSource] = js.native
}
