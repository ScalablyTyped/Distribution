package typings.winrtUwp.Windows.Networking.Connectivity

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to property values containing information on current usage of the attributed network connection. */
trait AttributedNetworkUsage extends StObject {
  
  /** Gets the Id of the of the app. */
  var attributionId: String
  
  /** Gets the name of the app. */
  var attributionName: String
  
  /** Gets the thumbnail of the app. */
  var attributionThumbnail: IRandomAccessStreamReference
  
  /** Gets the number of bytes received by the app over the network. */
  var bytesReceived: Double
  
  /** Gets the number of bytes sent by the app over the network. */
  var bytesSent: Double
}
object AttributedNetworkUsage {
  
  inline def apply(
    attributionId: String,
    attributionName: String,
    attributionThumbnail: IRandomAccessStreamReference,
    bytesReceived: Double,
    bytesSent: Double
  ): AttributedNetworkUsage = {
    val __obj = js.Dynamic.literal(attributionId = attributionId.asInstanceOf[js.Any], attributionName = attributionName.asInstanceOf[js.Any], attributionThumbnail = attributionThumbnail.asInstanceOf[js.Any], bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributedNetworkUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributedNetworkUsage] (val x: Self) extends AnyVal {
    
    inline def setAttributionId(value: String): Self = StObject.set(x, "attributionId", value.asInstanceOf[js.Any])
    
    inline def setAttributionName(value: String): Self = StObject.set(x, "attributionName", value.asInstanceOf[js.Any])
    
    inline def setAttributionThumbnail(value: IRandomAccessStreamReference): Self = StObject.set(x, "attributionThumbnail", value.asInstanceOf[js.Any])
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
  }
}
