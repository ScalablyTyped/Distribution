package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a newly created enterprise protected file. */
@js.native
trait ProtectedFileCreateResult extends StObject {
  
  /** The newly created enterprise protected file. */
  var file: StorageFile = js.native
  
  /** Information about the enterprise protected file. */
  var protectionInfo: FileProtectionInfo = js.native
  
  /** The stream random access to the newly created enterprise protected file. */
  var stream: IRandomAccessStream = js.native
}
object ProtectedFileCreateResult {
  
  @scala.inline
  def apply(file: StorageFile, protectionInfo: FileProtectionInfo, stream: IRandomAccessStream): ProtectedFileCreateResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], protectionInfo = protectionInfo.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedFileCreateResult]
  }
  
  @scala.inline
  implicit class ProtectedFileCreateResultMutableBuilder[Self <: ProtectedFileCreateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: StorageFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionInfo(value: FileProtectionInfo): Self = StObject.set(x, "protectionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStream(value: IRandomAccessStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
