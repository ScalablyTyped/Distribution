package typings.winrtUwp.global.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a newly created enterprise protected file. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedFileCreateResult")
@js.native
abstract class ProtectedFileCreateResult ()
  extends typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedFileCreateResult {
  /** The newly created enterprise protected file. */
  /* CompleteClass */
  override var file: StorageFile = js.native
  /** Information about the enterprise protected file. */
  /* CompleteClass */
  override var protectionInfo: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionInfo = js.native
  /** The stream random access to the newly created enterprise protected file. */
  /* CompleteClass */
  override var stream: IRandomAccessStream = js.native
}

