package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents data usage information returned by the ConnectionProfile.GetLocalUsage method. */
@js.native
trait DataUsage extends StObject {
  
  /** Gets a value indicating the number of bytes received by a connection over a specific period of time. */
  var bytesReceived: Double = js.native
  
  /** Gets a value indicating the number of bytes sent by the connection over a specific period of time. */
  var bytesSent: Double = js.native
}
object DataUsage {
  
  @scala.inline
  def apply(bytesReceived: Double, bytesSent: Double): DataUsage = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataUsage]
  }
  
  @scala.inline
  implicit class DataUsageMutableBuilder[Self <: DataUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
  }
}
