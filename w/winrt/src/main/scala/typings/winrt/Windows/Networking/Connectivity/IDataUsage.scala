package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataUsage extends StObject {
  
  var bytesReceived: Double = js.native
  
  var bytesSent: Double = js.native
}
object IDataUsage {
  
  @scala.inline
  def apply(bytesReceived: Double, bytesSent: Double): IDataUsage = {
    val __obj = js.Dynamic.literal(bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataUsage]
  }
  
  @scala.inline
  implicit class IDataUsageMutableBuilder[Self <: IDataUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
  }
}
