package typings.symphonyApiClientNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionsClientMod {
  
  @JSImport("symphony-api-client-node/ConnectionsClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def acceptConnectionRequest(userId: String, sessionToken: String): js.Promise[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("acceptConnectionRequest")(userId.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Connection]]
  
  @scala.inline
  def getAcceptedConnections(sessionToken: String): js.Promise[js.Array[Connection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAcceptedConnections")(sessionToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  @scala.inline
  def getAllConnections(sessionToken: String): js.Promise[js.Array[Connection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllConnections")(sessionToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  @scala.inline
  def getConnectionRequestStatus(userId: String, sessionToken: String): js.Promise[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnectionRequestStatus")(userId.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Connection]]
  
  @scala.inline
  def getConnections(status: String, commaSeparatedUserIds: String, sessionToken: String): js.Promise[js.Array[Connection]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getConnections")(status.asInstanceOf[js.Any], commaSeparatedUserIds.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  @scala.inline
  def getInboundPendingConnections(sessionToken: String): js.Promise[js.Array[Connection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInboundPendingConnections")(sessionToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  @scala.inline
  def getPendingConnections(sessionToken: String): js.Promise[js.Array[Connection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPendingConnections")(sessionToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  @scala.inline
  def getRejectedConnections(sessionToken: String): js.Promise[js.Array[Connection]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRejectedConnections")(sessionToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Connection]]]
  
  @scala.inline
  def rejectConnectionRequest(userId: String, sessionToken: String): js.Promise[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejectConnectionRequest")(userId.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Connection]]
  
  @scala.inline
  def removeConnection(userId: String, sessionToken: String): js.Promise[RemoveConnectionReponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeConnection")(userId.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RemoveConnectionReponse]]
  
  @scala.inline
  def sendConnectionRequest(userId: String, sessionToken: String): js.Promise[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendConnectionRequest")(userId.asInstanceOf[js.Any], sessionToken.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Connection]]
  
  trait Connection extends StObject {
    
    var firstRequestedAt: js.UndefOr[Double] = js.undefined
    
    var requestCounter: js.UndefOr[Double] = js.undefined
    
    var status: typings.symphonyApiClientNode.symphonyApiClientNodeStrings.REJECTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.ACCEPTED | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_INCOMING | typings.symphonyApiClientNode.symphonyApiClientNodeStrings.PENDING_OUTGOING
    
    var updatedAt: js.UndefOr[Double] = js.undefined
    
    var userId: Double
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
  
  trait RemoveConnectionReponse extends StObject {
    
    var format: String
    
    var message: String
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
