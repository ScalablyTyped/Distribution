package typings.symphonyApiClientNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionsClientMod {
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "ACCEPTED")
  @js.native
  val ACCEPTED: String = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "ALL")
  @js.native
  val ALL: String = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "PENDING_INCOMING")
  @js.native
  val PENDING_INCOMING: String = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "PENDING_OUTGOING")
  @js.native
  val PENDING_OUTGOING: String = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "REJECTED")
  @js.native
  val REJECTED: String = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "acceptConnectionRequest")
  @js.native
  def acceptConnectionRequest(userId: String, sessionToken: String): js.Promise[Connection] = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "getAcceptedConnections")
  @js.native
  def getAcceptedConnections(sessionToken: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "getAllConnections")
  @js.native
  def getAllConnections(sessionToken: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "getConnectionRequestStatus")
  @js.native
  def getConnectionRequestStatus(userId: String, sessionToken: String): js.Promise[Connection] = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "getConnections")
  @js.native
  def getConnections(status: String, commaSeparatedUserIds: String, sessionToken: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "getInboundPendingConnections")
  @js.native
  def getInboundPendingConnections(sessionToken: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "getPendingConnections")
  @js.native
  def getPendingConnections(sessionToken: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "getRejectedConnections")
  @js.native
  def getRejectedConnections(sessionToken: String): js.Promise[js.Array[Connection]] = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "rejectConnectionRequest")
  @js.native
  def rejectConnectionRequest(userId: String, sessionToken: String): js.Promise[Connection] = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "removeConnection")
  @js.native
  def removeConnection(userId: String, sessionToken: String): js.Promise[RemoveConnectionReponse] = js.native
  
  @JSImport("symphony-api-client-node/ConnectionsClient", "sendConnectionRequest")
  @js.native
  def sendConnectionRequest(userId: String, sessionToken: String): js.Promise[Connection] = js.native
  
  @js.native
  trait Connection extends StObject {
    
    var firstRequestedAt: js.UndefOr[Double] = js.native
    
    var requestCounter: js.UndefOr[Double] = js.native
    
    var status: typings.symphonyApiClientNode.symphonyApiClientNodeStrings.REJECTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.ACCEPTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_INCOMING | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_OUTGOING = js.native
    
    var updatedAt: js.UndefOr[Double] = js.native
    
    var userId: Double = js.native
  }
  object Connection {
    
    @scala.inline
    def apply(
      status: typings.symphonyApiClientNode.symphonyApiClientNodeStrings.REJECTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.ACCEPTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_INCOMING | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_OUTGOING,
      userId: Double
    ): Connection = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstRequestedAt(value: Double): Self = StObject.set(x, "firstRequestedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstRequestedAtUndefined: Self = StObject.set(x, "firstRequestedAt", js.undefined)
      
      @scala.inline
      def setRequestCounter(value: Double): Self = StObject.set(x, "requestCounter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestCounterUndefined: Self = StObject.set(x, "requestCounter", js.undefined)
      
      @scala.inline
      def setStatus(
        value: typings.symphonyApiClientNode.symphonyApiClientNodeStrings.REJECTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.ACCEPTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_INCOMING | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_OUTGOING
      ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAt(value: Double): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
      
      @scala.inline
      def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RemoveConnectionReponse extends StObject {
    
    var format: String = js.native
    
    var message: String = js.native
  }
  object RemoveConnectionReponse {
    
    @scala.inline
    def apply(format: String, message: String): RemoveConnectionReponse = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveConnectionReponse]
    }
    
    @scala.inline
    implicit class RemoveConnectionReponseMutableBuilder[Self <: RemoveConnectionReponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
