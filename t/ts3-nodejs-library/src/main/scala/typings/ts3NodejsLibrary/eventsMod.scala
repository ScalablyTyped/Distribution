package typings.ts3NodejsLibrary

import typings.std.Record
import typings.ts3NodejsLibrary.anon.Cfid
import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import typings.ts3NodejsLibrary.enumMod.ReasonIdentifier
import typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode
import typings.ts3NodejsLibrary.responseTypesMod.ClientEntry
import typings.ts3NodejsLibrary.responseTypesMod.ClientList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  trait ChannelCreate extends StObject {
    
    var channel: TeamSpeakChannel
    
    var cpid: Double
    
    var invoker: TeamSpeakClient
    
    var modified: Record[String, js.Any]
  }
  object ChannelCreate {
    
    @scala.inline
    def apply(
      channel: TeamSpeakChannel,
      cpid: Double,
      invoker: TeamSpeakClient,
      modified: Record[String, js.Any]
    ): ChannelCreate = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], cpid = cpid.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelCreate]
    }
    
    @scala.inline
    implicit class ChannelCreateMutableBuilder[Self <: ChannelCreate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: TeamSpeakChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpid(value: Double): Self = StObject.set(x, "cpid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoker(value: TeamSpeakClient): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: Record[String, js.Any]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelDelete extends StObject {
    
    var cid: Double
    
    var invoker: js.UndefOr[TeamSpeakClient] = js.undefined
  }
  object ChannelDelete {
    
    @scala.inline
    def apply(cid: Double): ChannelDelete = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelDelete]
    }
    
    @scala.inline
    implicit class ChannelDeleteMutableBuilder[Self <: ChannelDelete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCid(value: Double): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoker(value: TeamSpeakClient): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvokerUndefined: Self = StObject.set(x, "invoker", js.undefined)
    }
  }
  
  trait ChannelEdit extends StObject {
    
    var channel: TeamSpeakChannel
    
    var invoker: TeamSpeakClient
    
    var modified: Record[String, js.Any]
    
    var reasonid: Double
  }
  object ChannelEdit {
    
    @scala.inline
    def apply(
      channel: TeamSpeakChannel,
      invoker: TeamSpeakClient,
      modified: Record[String, js.Any],
      reasonid: Double
    ): ChannelEdit = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelEdit]
    }
    
    @scala.inline
    implicit class ChannelEditMutableBuilder[Self <: ChannelEdit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: TeamSpeakChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoker(value: TeamSpeakClient): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: Record[String, js.Any]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonid(value: Double): Self = StObject.set(x, "reasonid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelMove extends StObject {
    
    var channel: TeamSpeakChannel
    
    var invoker: TeamSpeakClient
    
    var order: Double
    
    var parent: TeamSpeakChannel
  }
  object ChannelMove {
    
    @scala.inline
    def apply(channel: TeamSpeakChannel, invoker: TeamSpeakClient, order: Double, parent: TeamSpeakChannel): ChannelMove = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelMove]
    }
    
    @scala.inline
    implicit class ChannelMoveMutableBuilder[Self <: ChannelMove] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: TeamSpeakChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoker(value: TeamSpeakClient): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: TeamSpeakChannel): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientConnect extends StObject {
    
    var client: TeamSpeakClient
  }
  object ClientConnect {
    
    @scala.inline
    def apply(client: TeamSpeakClient): ClientConnect = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientConnect]
    }
    
    @scala.inline
    implicit class ClientConnectMutableBuilder[Self <: ClientConnect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: TeamSpeakClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientDisconnect extends StObject {
    
    var client: js.UndefOr[TeamSpeakClient] = js.undefined
    
    var event: Cfid
  }
  object ClientDisconnect {
    
    @scala.inline
    def apply(event: Cfid): ClientDisconnect = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientDisconnect]
    }
    
    @scala.inline
    implicit class ClientDisconnectMutableBuilder[Self <: ClientDisconnect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: TeamSpeakClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setEvent(value: Cfid): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientMoved extends StObject {
    
    var channel: TeamSpeakChannel
    
    var client: TeamSpeakClient
    
    var reasonid: ReasonIdentifier
  }
  object ClientMoved {
    
    @scala.inline
    def apply(channel: TeamSpeakChannel, client: TeamSpeakClient, reasonid: ReasonIdentifier): ClientMoved = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientMoved]
    }
    
    @scala.inline
    implicit class ClientMovedMutableBuilder[Self <: ClientMoved] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: TeamSpeakChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient(value: TeamSpeakClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonid(value: ReasonIdentifier): Self = StObject.set(x, "reasonid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Debug extends StObject {
    
    var data: String
    
    var `type`: String
  }
  object Debug {
    
    @scala.inline
    def apply(data: String, `type`: String): Debug = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Debug]
    }
    
    @scala.inline
    implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerEdit extends StObject {
    
    var invoker: TeamSpeakClient
    
    var modified: Record[String, js.Any]
    
    var reasonid: Double
  }
  object ServerEdit {
    
    @scala.inline
    def apply(invoker: TeamSpeakClient, modified: Record[String, js.Any], reasonid: Double): ServerEdit = {
      val __obj = js.Dynamic.literal(invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerEdit]
    }
    
    @scala.inline
    implicit class ServerEditMutableBuilder[Self <: ServerEdit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvoker(value: TeamSpeakClient): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: Record[String, js.Any]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonid(value: Double): Self = StObject.set(x, "reasonid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextMessage extends StObject {
    
    var invoker: TeamSpeakClient
    
    var msg: String
    
    var targetmode: TextMessageTargetMode
  }
  object TextMessage {
    
    @scala.inline
    def apply(invoker: TeamSpeakClient, msg: String, targetmode: TextMessageTargetMode): TextMessage = {
      val __obj = js.Dynamic.literal(invoker = invoker.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], targetmode = targetmode.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextMessage]
    }
    
    @scala.inline
    implicit class TextMessageMutableBuilder[Self <: TextMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvoker(value: TeamSpeakClient): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetmode(value: TextMessageTargetMode): Self = StObject.set(x, "targetmode", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenUsed extends StObject {
    
    var client: ClientList
    
    var token: String
    
    var token1: String
    
    var token2: String
  }
  object TokenUsed {
    
    @scala.inline
    def apply(client: ClientList, token: String, token1: String, token2: String): TokenUsed = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], token1 = token1.asInstanceOf[js.Any], token2 = token2.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenUsed]
    }
    
    @scala.inline
    implicit class TokenUsedMutableBuilder[Self <: TokenUsed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: ClientList): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientVarargs(value: ClientEntry*): Self = StObject.set(x, "client", js.Array(value :_*))
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken1(value: String): Self = StObject.set(x, "token1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken2(value: String): Self = StObject.set(x, "token2", value.asInstanceOf[js.Any])
    }
  }
}
