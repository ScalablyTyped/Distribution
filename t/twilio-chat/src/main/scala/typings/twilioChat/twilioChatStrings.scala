package typings.twilioChat

import typings.twilioChat.mod.ChannelSortingCriteria
import typings.twilioChat.mod.ChannelSortingOrder
import typings.twilioChat.mod.ChannelStatus
import typings.twilioChat.mod.ChannelType0
import typings.twilioChat.mod.ChannelUpdateReason
import typings.twilioChat.mod.Channels.DataSource
import typings.twilioChat.mod.MemberType
import typings.twilioChat.mod.MemberUpdateReason
import typings.twilioChat.mod.MessageType
import typings.twilioChat.mod.MessageUpdateReason
import typings.twilioChat.mod.NotificationLevel
import typings.twilioChat.mod.PushNotificationType
import typings.twilioChat.mod.State
import typings.twilioChat.mod.UserUpdateReason
import typings.twilioChat.mod._LogLevel
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
       with ChannelUpdateReason
       with MemberUpdateReason
       with MessageUpdateReason
       with UserUpdateReason
  inline def attributes: attributes = "attributes".asInstanceOf[attributes]
  
  @js.native
  sealed trait author
    extends StObject
       with MessageUpdateReason
  inline def author: author = "author".asInstanceOf[author]
  
  @js.native
  sealed trait backwards extends StObject
  inline def backwards: backwards = "backwards".asInstanceOf[backwards]
  
  @js.native
  sealed trait body
    extends StObject
       with MessageUpdateReason
  inline def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait chat
    extends StObject
       with DataSource
       with MemberType
  inline def chat: chat = "chat".asInstanceOf[chat]
  
  @js.native
  sealed trait closed extends StObject
  inline def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait createdBy
    extends StObject
       with ChannelUpdateReason
  inline def createdBy: createdBy = "createdBy".asInstanceOf[createdBy]
  
  @js.native
  sealed trait dateCreated
    extends StObject
       with ChannelUpdateReason
       with MemberUpdateReason
       with MessageUpdateReason
  inline def dateCreated: dateCreated = "dateCreated".asInstanceOf[dateCreated]
  
  @js.native
  sealed trait dateUpdated
    extends StObject
       with ChannelUpdateReason
       with MemberUpdateReason
       with MessageUpdateReason
  inline def dateUpdated: dateUpdated = "dateUpdated".asInstanceOf[dateUpdated]
  
  @js.native
  sealed trait debug
    extends StObject
       with _LogLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait delete extends StObject
  inline def delete: delete = "delete".asInstanceOf[delete]
  
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
  sealed trait failed
    extends StObject
       with State
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait forward extends StObject
  inline def forward: forward = "forward".asInstanceOf[forward]
  
  @js.native
  sealed trait friendlyName
    extends StObject
       with ChannelSortingCriteria
       with ChannelUpdateReason
       with UserUpdateReason
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
  sealed trait initialized
    extends StObject
       with State
  inline def initialized: initialized = "initialized".asInstanceOf[initialized]
  
  @js.native
  sealed trait invited
    extends StObject
       with ChannelStatus
  inline def invited: invited = "invited".asInstanceOf[invited]
  
  @js.native
  sealed trait joined
    extends StObject
       with ChannelStatus
  inline def joined: joined = "joined".asInstanceOf[joined]
  
  @js.native
  sealed trait lastConsumedMessageIndex
    extends StObject
       with ChannelUpdateReason
       with MemberUpdateReason
  inline def lastConsumedMessageIndex: lastConsumedMessageIndex = "lastConsumedMessageIndex".asInstanceOf[lastConsumedMessageIndex]
  
  @js.native
  sealed trait lastConsumptionTimestamp
    extends StObject
       with MemberUpdateReason
  inline def lastConsumptionTimestamp: lastConsumptionTimestamp = "lastConsumptionTimestamp".asInstanceOf[lastConsumptionTimestamp]
  
  @js.native
  sealed trait lastMessage
    extends StObject
       with ChannelSortingCriteria
       with ChannelUpdateReason
  inline def lastMessage: lastMessage = "lastMessage".asInstanceOf[lastMessage]
  
  @js.native
  sealed trait lastUpdatedBy
    extends StObject
       with MessageUpdateReason
  inline def lastUpdatedBy: lastUpdatedBy = "lastUpdatedBy".asInstanceOf[lastUpdatedBy]
  
  @js.native
  sealed trait media
    extends StObject
       with MessageType
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait muted
    extends StObject
       with NotificationLevel
  inline def muted: muted = "muted".asInstanceOf[muted]
  
  @js.native
  sealed trait notParticipating
    extends StObject
       with ChannelStatus
  inline def notParticipating: notParticipating = "notParticipating".asInstanceOf[notParticipating]
  
  @js.native
  sealed trait notifiable
    extends StObject
       with UserUpdateReason
  inline def notifiable: notifiable = "notifiable".asInstanceOf[notifiable]
  
  @js.native
  sealed trait notificationLevel
    extends StObject
       with ChannelUpdateReason
  inline def notificationLevel: notificationLevel = "notificationLevel".asInstanceOf[notificationLevel]
  
  @js.native
  sealed trait online
    extends StObject
       with UserUpdateReason
  inline def online: online = "online".asInstanceOf[online]
  
  @js.native
  sealed trait post extends StObject
  inline def post: post = "post".asInstanceOf[post]
  
  @js.native
  sealed trait `private`
    extends StObject
       with ChannelType0
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait public
    extends StObject
       with ChannelType0
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait rest
    extends StObject
       with DataSource
  inline def rest: rest = "rest".asInstanceOf[rest]
  
  @js.native
  sealed trait roleSid
    extends StObject
       with MemberUpdateReason
  inline def roleSid: roleSid = "roleSid".asInstanceOf[roleSid]
  
  @js.native
  sealed trait silent
    extends StObject
       with _LogLevel
  inline def silent: silent = "silent".asInstanceOf[silent]
  
  @js.native
  sealed trait sms
    extends StObject
       with MemberType
  inline def sms: sms = "sms".asInstanceOf[sms]
  
  @js.native
  sealed trait state
    extends StObject
       with ChannelUpdateReason
  inline def state: state = "state".asInstanceOf[state]
  
  @js.native
  sealed trait status
    extends StObject
       with ChannelUpdateReason
  inline def status: status = "status".asInstanceOf[status]
  
  @js.native
  sealed trait sync
    extends StObject
       with DataSource
  inline def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait text
    extends StObject
       with MessageType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait trace
    extends StObject
       with _LogLevel
  inline def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait twilioDotchannelDotadded_to_channel
    extends StObject
       with PushNotificationType
  inline def twilioDotchannelDotadded_to_channel: twilioDotchannelDotadded_to_channel = "twilio.channel.added_to_channel".asInstanceOf[twilioDotchannelDotadded_to_channel]
  
  @js.native
  sealed trait twilioDotchannelDotinvited_to_channel
    extends StObject
       with PushNotificationType
  inline def twilioDotchannelDotinvited_to_channel: twilioDotchannelDotinvited_to_channel = "twilio.channel.invited_to_channel".asInstanceOf[twilioDotchannelDotinvited_to_channel]
  
  @js.native
  sealed trait twilioDotchannelDotnew_message
    extends StObject
       with PushNotificationType
  inline def twilioDotchannelDotnew_message: twilioDotchannelDotnew_message = "twilio.channel.new_message".asInstanceOf[twilioDotchannelDotnew_message]
  
  @js.native
  sealed trait twilioDotchannelDotremoved_from_channel
    extends StObject
       with PushNotificationType
  inline def twilioDotchannelDotremoved_from_channel: twilioDotchannelDotremoved_from_channel = "twilio.channel.removed_from_channel".asInstanceOf[twilioDotchannelDotremoved_from_channel]
  
  @js.native
  sealed trait uniqueName
    extends StObject
       with ChannelSortingCriteria
       with ChannelUpdateReason
  inline def uniqueName: uniqueName = "uniqueName".asInstanceOf[uniqueName]
  
  @js.native
  sealed trait unknown
    extends StObject
       with ChannelStatus
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait warn
    extends StObject
       with _LogLevel
  inline def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait whatsapp
    extends StObject
       with MemberType
  inline def whatsapp: whatsapp = "whatsapp".asInstanceOf[whatsapp]
}
