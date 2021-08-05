package typings.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information on the transferred socket from the Socket Broker. */
trait SocketActivityInformation extends StObject {
  
  /** Get the context associated while transferring ownership of the socket. */
  var context: SocketActivityContext
  
  /** Based on the socket type, the app can reclaim the ownership of the appropriate DatagramSocket . */
  var datagramSocket: DatagramSocket
  
  /** A unique string for this app used to identify the transferred socket. This is passed by the app while transferring the socket ownership to the service. */
  var id: String
  
  /** Gets a SocketActivityKind enumeration value that identifies socket kind. */
  var socketKind: SocketActivityKind
  
  /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocket . */
  var streamSocket: StreamSocket
  
  /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocketListener . */
  var streamSocketListener: StreamSocketListener
  
  /** The background task ID used while transferring ownership of the socket. */
  var taskId: String
}
object SocketActivityInformation {
  
  inline def apply(
    context: SocketActivityContext,
    datagramSocket: DatagramSocket,
    id: String,
    socketKind: SocketActivityKind,
    streamSocket: StreamSocket,
    streamSocketListener: StreamSocketListener,
    taskId: String
  ): SocketActivityInformation = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], datagramSocket = datagramSocket.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], socketKind = socketKind.asInstanceOf[js.Any], streamSocket = streamSocket.asInstanceOf[js.Any], streamSocketListener = streamSocketListener.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketActivityInformation]
  }
  
  extension [Self <: SocketActivityInformation](x: Self) {
    
    inline def setContext(value: SocketActivityContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDatagramSocket(value: DatagramSocket): Self = StObject.set(x, "datagramSocket", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSocketKind(value: SocketActivityKind): Self = StObject.set(x, "socketKind", value.asInstanceOf[js.Any])
    
    inline def setStreamSocket(value: StreamSocket): Self = StObject.set(x, "streamSocket", value.asInstanceOf[js.Any])
    
    inline def setStreamSocketListener(value: StreamSocketListener): Self = StObject.set(x, "streamSocketListener", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
