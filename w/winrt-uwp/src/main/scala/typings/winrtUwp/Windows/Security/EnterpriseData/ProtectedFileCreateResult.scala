package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a newly created enterprise protected file. */
trait ProtectedFileCreateResult extends js.Object {
  /** The newly created enterprise protected file. */
  var file: StorageFile
  /** Information about the enterprise protected file. */
  var protectionInfo: FileProtectionInfo
  /** The stream random access to the newly created enterprise protected file. */
  var stream: IRandomAccessStream
}

object ProtectedFileCreateResult {
  @scala.inline
  def apply(file: StorageFile, protectionInfo: FileProtectionInfo, stream: IRandomAccessStream): ProtectedFileCreateResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], protectionInfo = protectionInfo.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedFileCreateResult]
  }
}

