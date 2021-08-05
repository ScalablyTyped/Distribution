package typings.twilioChat

import typings.twilioChat.channelMod.Channel.NotificationLevel
import typings.twilioChat.channelMod.Channel.Status
import typings.twilioChat.channelsMod.Channels.DataSource
import typings.twilioChat.memberMod.Member.Type
import typings.twilioChat.messageMod.Message.UpdateReason
import typings.twilioChat.mod.Client.ChannelSortingCriteria
import typings.twilioChat.mod.Client.ChannelSortingOrder
import typings.twilioChat.mod.Client._LogLevel
import typings.twilioChat.userMod.User.SubscriptionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilioChatStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with NotificationLevel
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait active extends StObject
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait ascending
    extends StObject
       with ChannelSortingOrder
  inline def ascending: ascending = "ascending".asInstanceOf[ascending]
  
  @js.native
  sealed trait attributes
    extends StObject
       with UpdateReason
       with typings.twilioChat.channelMod.Channel.UpdateReason
       with typings.twilioChat.userMod.User.UpdateReason
       with typings.twilioChat.memberMod.Member.UpdateReason
  inline def attributes: attributes = "attributes".asInstanceOf[attributes]
  
  @js.native
  sealed trait author
    extends StObject
       with UpdateReason
  inline def author: author = "author".asInstanceOf[author]
  
  @js.native
  sealed trait body
    extends StObject
       with UpdateReason
  inline def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait chat
    extends StObject
       with DataSource
       with Type
  inline def chat: chat = "chat".asInstanceOf[chat]
  
  @js.native
  sealed trait closed extends StObject
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait createdBy
    extends StObject
       with typings.twilioChat.channelMod.Channel.UpdateReason
  inline def createdBy: createdBy = "createdBy".asInstanceOf[createdBy]
  
  @js.native
  sealed trait dateCreated
    extends StObject
       with UpdateReason
       with typings.twilioChat.channelMod.Channel.UpdateReason
       with typings.twilioChat.memberMod.Member.UpdateReason
  inline def dateCreated: dateCreated = "dateCreated".asInstanceOf[dateCreated]
  
  @js.native
  sealed trait dateUpdated
    extends StObject
       with UpdateReason
       with typings.twilioChat.channelMod.Channel.UpdateReason
       with typings.twilioChat.memberMod.Member.UpdateReason
  inline def dateUpdated: dateUpdated = "dateUpdated".asInstanceOf[dateUpdated]
  
  @js.native
  sealed trait debug
    extends StObject
       with _LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait descending
    extends StObject
       with ChannelSortingOrder
  inline def descending: descending = "descending".asInstanceOf[descending]
  
  @js.native
  sealed trait error
    extends StObject
       with _LogLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait friendlyName
    extends StObject
       with ChannelSortingCriteria
       with typings.twilioChat.channelMod.Channel.UpdateReason
       with typings.twilioChat.userMod.User.UpdateReason
  inline def friendlyName: friendlyName = "friendlyName".asInstanceOf[friendlyName]
  
  @js.native
  sealed trait inactive extends StObject
  inline def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait info
    extends StObject
       with _LogLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait initializing
    extends StObject
       with SubscriptionState
  inline def initializing: initializing = "initializing".asInstanceOf[initializing]
  
  @js.native
  sealed trait invited
    extends StObject
       with Status
  inline def invited: invited = "invited".asInstanceOf[invited]
  
  @js.native
  sealed trait joined
    extends StObject
       with Status
  inline def joined: joined = "joined".asInstanceOf[joined]
  
  @js.native
  sealed trait lastConsumedMessageIndex
    extends StObject
       with typings.twilioChat.channelMod.Channel.UpdateReason
       with typings.twilioChat.memberMod.Member.UpdateReason
  inline def lastConsumedMessageIndex: lastConsumedMessageIndex = "lastConsumedMessageIndex".asInstanceOf[lastConsumedMessageIndex]
  
  @js.native
  sealed trait lastConsumptionTimestamp
    extends StObject
       with typings.twilioChat.memberMod.Member.UpdateReason
  inline def lastConsumptionTimestamp: lastConsumptionTimestamp = "lastConsumptionTimestamp".asInstanceOf[lastConsumptionTimestamp]
  
  @js.native
  sealed trait lastMessage
    extends StObject
       with ChannelSortingCriteria
       with typings.twilioChat.channelMod.Channel.UpdateReason
  inline def lastMessage: lastMessage = "lastMessage".asInstanceOf[lastMessage]
  
  @js.native
  sealed trait lastUpdatedBy
    extends StObject
       with UpdateReason
  inline def lastUpdatedBy: lastUpdatedBy = "lastUpdatedBy".asInstanceOf[lastUpdatedBy]
  
  @js.native
  sealed trait media
    extends StObject
       with typings.twilioChat.messageMod.Message.Type
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait muted
    extends StObject
       with NotificationLevel
  inline def muted: muted = "muted".asInstanceOf[muted]
  
  @js.native
  sealed trait notParticipating
    extends StObject
       with Status
  inline def notParticipating: notParticipating = "notParticipating".asInstanceOf[notParticipating]
  
  @js.native
  sealed trait notifiable
    extends StObject
       with typings.twilioChat.userMod.User.UpdateReason
  inline def notifiable: notifiable = "notifiable".asInstanceOf[notifiable]
  
  @js.native
  sealed trait notificationLevel
    extends StObject
       with typings.twilioChat.channelMod.Channel.UpdateReason
  inline def notificationLevel: notificationLevel = "notificationLevel".asInstanceOf[notificationLevel]
  
  @js.native
  sealed trait online
    extends StObject
       with typings.twilioChat.userMod.User.UpdateReason
  inline def online: online = "online".asInstanceOf[online]
  
  @js.native
  sealed trait `private`
    extends StObject
       with typings.twilioChat.channelMod.Channel.Type
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait public
    extends StObject
       with typings.twilioChat.channelMod.Channel.Type
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait roleSid
    extends StObject
       with typings.twilioChat.memberMod.Member.UpdateReason
  inline def roleSid: roleSid = "roleSid".asInstanceOf[roleSid]
  
  @js.native
  sealed trait silent
    extends StObject
       with _LogLevel
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait sms
    extends StObject
       with Type
  inline def sms: sms = "sms".asInstanceOf[sms]
  
  @js.native
  sealed trait state
    extends StObject
       with typings.twilioChat.channelMod.Channel.UpdateReason
  inline def state: state = "state".asInstanceOf[state]
  
  @js.native
  sealed trait status
    extends StObject
       with typings.twilioChat.channelMod.Channel.UpdateReason
  inline def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait subscribed
    extends StObject
       with SubscriptionState
  inline def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  
  @js.native
  sealed trait sync
    extends StObject
       with DataSource
  inline def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait synclist
    extends StObject
       with DataSource
  inline def synclist: synclist = "synclist".asInstanceOf[synclist]
  
  @js.native
  sealed trait text
    extends StObject
       with typings.twilioChat.messageMod.Message.Type
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait trace
    extends StObject
       with _LogLevel
  inline def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait twilioDotchannelDotadded_to_channel
    extends StObject
       with typings.twilioChat.pushnotificationMod.PushNotification.Type
  inline def twilioDotchannelDotadded_to_channel: twilioDotchannelDotadded_to_channel = "twilio.channel.added_to_channel".asInstanceOf[twilioDotchannelDotadded_to_channel]
  
  @js.native
  sealed trait twilioDotchannelDotinvited_to_channel
    extends StObject
       with typings.twilioChat.pushnotificationMod.PushNotification.Type
  inline def twilioDotchannelDotinvited_to_channel: twilioDotchannelDotinvited_to_channel = "twilio.channel.invited_to_channel".asInstanceOf[twilioDotchannelDotinvited_to_channel]
  
  @js.native
  sealed trait twilioDotchannelDotnew_message
    extends StObject
       with typings.twilioChat.pushnotificationMod.PushNotification.Type
  inline def twilioDotchannelDotnew_message: twilioDotchannelDotnew_message = "twilio.channel.new_message".asInstanceOf[twilioDotchannelDotnew_message]
  
  @js.native
  sealed trait twilioDotchannelDotremoved_from_channel
    extends StObject
       with typings.twilioChat.pushnotificationMod.PushNotification.Type
  inline def twilioDotchannelDotremoved_from_channel: twilioDotchannelDotremoved_from_channel = "twilio.channel.removed_from_channel".asInstanceOf[twilioDotchannelDotremoved_from_channel]
  
  @js.native
  sealed trait uniqueName
    extends StObject
       with ChannelSortingCriteria
       with typings.twilioChat.channelMod.Channel.UpdateReason
  inline def uniqueName: uniqueName = "uniqueName".asInstanceOf[uniqueName]
  
  @js.native
  sealed trait unknown
    extends StObject
       with Status
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait unsubscribed
    extends StObject
       with SubscriptionState
  inline def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
  
  @js.native
  sealed trait warn
    extends StObject
       with _LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait whatsapp
    extends StObject
       with Type
  inline def whatsapp: whatsapp = "whatsapp".asInstanceOf[whatsapp]
}
