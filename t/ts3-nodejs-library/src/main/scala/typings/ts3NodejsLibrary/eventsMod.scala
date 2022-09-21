package typings.ts3NodejsLibrary

import typings.std.Record
import typings.ts3NodejsLibrary.anon.Bantime
import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import typings.ts3NodejsLibrary.enumMod.TextMessageTargetMode
import typings.ts3NodejsLibrary.responseTypesMod.ClientEntry
import typings.ts3NodejsLibrary.responseTypesMod.ClientList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  trait ChannelCreate extends StObject {
    
    var channel: TeamSpeakChannel
    
    var cpid: String
    
    var invoker: TeamSpeakClient
    
    var modified: Record[String, Any]
  }
  object ChannelCreate {
    
    inline def apply(channel: TeamSpeakChannel, cpid: String, invoker: TeamSpeakClient, modified: Record[String, Any]): ChannelCreate = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], cpid = cpid.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelCreate]
    }
    
    extension [Self <: ChannelCreate](x: Self) {
      
      inline def setChannel(value: TeamSpeakChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setCpid(value: String): Self = StObject.set(x, "cpid", value.asInstanceOf[js.Any])
      
      inline def setInvoker(value: TeamSpeakClient): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
      
      inline def setModified(value: Record[String, Any]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelDelete extends StObject {
    
    var cid: String
    
    var invoker: js.UndefOr[TeamSpeakClient] = js.undefined
  }
  object ChannelDelete {
    
    inline def apply(cid: String): ChannelDelete = {
      val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelDelete]
    }
    
    extension [Self <: ChannelDelete](x: Self) {
      
      inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setInvoker(value: TeamSpeakClient): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
      
      inline def setInvokerUndefined: Self = StObject.set(x, "invoker", js.undefined)
    }
  }
  
  trait ChannelEdit extends StObject {
    
    var channel: TeamSpeakChannel
    
    var invoker: TeamSpeakClient
    
    var modified: Record[String, Any]
    
    var reasonid: String
  }
  object ChannelEdit {
    
    inline def apply(
      channel: TeamSpeakChannel,
      invoker: TeamSpeakClient,
      modified: Record[String, Any],
      reasonid: String
    ): ChannelEdit = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelEdit]
    }
    
    extension [Self <: ChannelEdit](x: Self) {
      
      inline def setChannel(value: TeamSpeakChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setInvoker(value: TeamSpeakClient): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
      
      inline def setModified(value: Record[String, Any]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setReasonid(value: String): Self = StObject.set(x, "reasonid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChannelMove extends StObject {
    
    var channel: TeamSpeakChannel
    
    var invoker: TeamSpeakClient
    
    var order: Double
    
    var parent: TeamSpeakChannel
  }
  object ChannelMove {
    
    inline def apply(channel: TeamSpeakChannel, invoker: TeamSpeakClient, order: Double, parent: TeamSpeakChannel): ChannelMove = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelMove]
    }
    
    extension [Self <: ChannelMove](x: Self) {
      
      inline def setChannel(value: TeamSpeakChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setInvoker(value: TeamSpeakClient): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setParent(value: TeamSpeakChannel): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientConnect extends StObject {
    
    var client: TeamSpeakClient
  }
  object ClientConnect {
    
    inline def apply(client: TeamSpeakClient): ClientConnect = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientConnect]
    }
    
    extension [Self <: ClientConnect](x: Self) {
      
      inline def setClient(value: TeamSpeakClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientDisconnect extends StObject {
    
    var client: js.UndefOr[TeamSpeakClient] = js.undefined
    
    var event: Bantime
  }
  object ClientDisconnect {
    
    inline def apply(event: Bantime): ClientDisconnect = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientDisconnect]
    }
    
    extension [Self <: ClientDisconnect](x: Self) {
      
      inline def setClient(value: TeamSpeakClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setEvent(value: Bantime): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientMoved extends StObject {
    
    var channel: TeamSpeakChannel
    
    var client: TeamSpeakClient
    
    var reasonid: String
  }
  object ClientMoved {
    
    inline def apply(channel: TeamSpeakChannel, client: TeamSpeakClient, reasonid: String): ClientMoved = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientMoved]
    }
    
    extension [Self <: ClientMoved](x: Self) {
      
      inline def setChannel(value: TeamSpeakChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setClient(value: TeamSpeakClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setReasonid(value: String): Self = StObject.set(x, "reasonid", value.asInstanceOf[js.Any])
    }
  }
  
  trait Debug extends StObject {
    
    var data: String
    
    var `type`: String
  }
  object Debug {
    
    inline def apply(data: String, `type`: String): Debug = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Debug]
    }
    
    extension [Self <: Debug](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerEdit extends StObject {
    
    var invoker: TeamSpeakClient
    
    var modified: Record[String, Any]
    
    var reasonid: String
  }
  object ServerEdit {
    
    inline def apply(invoker: TeamSpeakClient, modified: Record[String, Any], reasonid: String): ServerEdit = {
      val __obj = js.Dynamic.literal(invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerEdit]
    }
    
    extension [Self <: ServerEdit](x: Self) {
      
      inline def setInvoker(value: TeamSpeakClient): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
      
      inline def setModified(value: Record[String, Any]): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setReasonid(value: String): Self = StObject.set(x, "reasonid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextMessage extends StObject {
    
    var invoker: TeamSpeakClient
    
    var msg: String
    
    var targetmode: TextMessageTargetMode
  }
  object TextMessage {
    
    inline def apply(invoker: TeamSpeakClient, msg: String, targetmode: TextMessageTargetMode): TextMessage = {
      val __obj = js.Dynamic.literal(invoker = invoker.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], targetmode = targetmode.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextMessage]
    }
    
    extension [Self <: TextMessage](x: Self) {
      
      inline def setInvoker(value: TeamSpeakClient): Self = StObject.set(x, "invoker", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setTargetmode(value: TextMessageTargetMode): Self = StObject.set(x, "targetmode", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenUsed extends StObject {
    
    var client: ClientList
    
    var token: String
    
    var token1: String
    
    var token2: String
  }
  object TokenUsed {
    
    inline def apply(client: ClientList, token: String, token1: String, token2: String): TokenUsed = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], token1 = token1.asInstanceOf[js.Any], token2 = token2.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenUsed]
    }
    
    extension [Self <: TokenUsed](x: Self) {
      
      inline def setClient(value: ClientList): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientVarargs(value: ClientEntry*): Self = StObject.set(x, "client", js.Array(value*))
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setToken1(value: String): Self = StObject.set(x, "token1", value.asInstanceOf[js.Any])
      
      inline def setToken2(value: String): Self = StObject.set(x, "token2", value.asInstanceOf[js.Any])
    }
  }
}
