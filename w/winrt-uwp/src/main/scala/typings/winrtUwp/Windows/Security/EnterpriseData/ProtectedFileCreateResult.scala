package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Storage.StorageFile
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a newly created enterprise protected file. */
trait ProtectedFileCreateResult extends StObject {
  
  /** The newly created enterprise protected file. */
  var file: StorageFile
  
  /** Information about the enterprise protected file. */
  var protectionInfo: FileProtectionInfo
  
  /** The stream random access to the newly created enterprise protected file. */
  var stream: IRandomAccessStream
}
object ProtectedFileCreateResult {
  
  inline def apply(file: StorageFile, protectionInfo: FileProtectionInfo, stream: IRandomAccessStream): ProtectedFileCreateResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], protectionInfo = protectionInfo.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedFileCreateResult]
  }
  
  extension [Self <: ProtectedFileCreateResult](x: Self) {
    
    inline def setFile(value: StorageFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setProtectionInfo(value: FileProtectionInfo): Self = StObject.set(x, "protectionInfo", value.asInstanceOf[js.Any])
    
    inline def setStream(value: IRandomAccessStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
