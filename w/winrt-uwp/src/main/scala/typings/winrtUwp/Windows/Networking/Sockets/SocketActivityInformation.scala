package typings.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information on the transferred socket from the Socket Broker. */
@js.native
trait SocketActivityInformation extends StObject {
  
  /** Get the context associated while transferring ownership of the socket. */
  var context: SocketActivityContext = js.native
  
  /** Based on the socket type, the app can reclaim the ownership of the appropriate DatagramSocket . */
  var datagramSocket: DatagramSocket = js.native
  
  /** A unique string for this app used to identify the transferred socket. This is passed by the app while transferring the socket ownership to the service. */
  var id: String = js.native
  
  /** Gets a SocketActivityKind enumeration value that identifies socket kind. */
  var socketKind: SocketActivityKind = js.native
  
  /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocket . */
  var streamSocket: StreamSocket = js.native
  
  /** Based on the socket type, the app can reclaim the ownership of the appropriate StreamSocketListener . */
  var streamSocketListener: StreamSocketListener = js.native
  
  /** The background task ID used while transferring ownership of the socket. */
  var taskId: String = js.native
}
object SocketActivityInformation {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SocketActivityInformationMutableBuilder[Self <: SocketActivityInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: SocketActivityContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatagramSocket(value: DatagramSocket): Self = StObject.set(x, "datagramSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketKind(value: SocketActivityKind): Self = StObject.set(x, "socketKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamSocket(value: StreamSocket): Self = StObject.set(x, "streamSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamSocketListener(value: StreamSocketListener): Self = StObject.set(x, "streamSocketListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
