package typings.twilioDashChat

import typings.twilioDashChat.libChannelMod.Channel.NotificationLevel
import typings.twilioDashChat.libChannelMod.Channel.Status
import typings.twilioDashChat.libDataChannelsMod.Channels.DataSource
import typings.twilioDashChat.libMemberMod.Member.Type
import typings.twilioDashChat.libUserMod.User.SubscriptionState
import typings.twilioDashChat.libUserMod.User.UpdateReason
import typings.twilioDashChat.twilioDashChatMod.Client.ChannelSortingCriteria
import typings.twilioDashChat.twilioDashChatMod.Client.ChannelSortingOrder
import typings.twilioDashChat.twilioDashChatMod.Client._LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object twilioDashChatStrings {
  @js.native
  sealed trait ascending extends ChannelSortingOrder
  
  @js.native
  sealed trait attributes
    extends UpdateReason
       with typings.twilioDashChat.libMemberMod.Member.UpdateReason
       with typings.twilioDashChat.libChannelMod.Channel.UpdateReason
       with typings.twilioDashChat.libMessageMod.Message.UpdateReason
  
  @js.native
  sealed trait author
    extends typings.twilioDashChat.libMessageMod.Message.UpdateReason
  
  @js.native
  sealed trait body
    extends typings.twilioDashChat.libMessageMod.Message.UpdateReason
  
  @js.native
  sealed trait chat
    extends DataSource
       with Type
  
  @js.native
  sealed trait createdBy
    extends typings.twilioDashChat.libChannelMod.Channel.UpdateReason
  
  @js.native
  sealed trait dateCreated
    extends typings.twilioDashChat.libMemberMod.Member.UpdateReason
       with typings.twilioDashChat.libChannelMod.Channel.UpdateReason
  
  @js.native
  sealed trait dateUpdated
    extends typings.twilioDashChat.libMemberMod.Member.UpdateReason
       with typings.twilioDashChat.libChannelMod.Channel.UpdateReason
       with typings.twilioDashChat.libMessageMod.Message.UpdateReason
  
  @js.native
  sealed trait debug extends _LogLevel
  
  @js.native
  sealed trait default extends NotificationLevel
  
  @js.native
  sealed trait descending extends ChannelSortingOrder
  
  @js.native
  sealed trait error extends _LogLevel
  
  @js.native
  sealed trait friendlyName
    extends ChannelSortingCriteria
       with UpdateReason
       with typings.twilioDashChat.libChannelMod.Channel.UpdateReason
  
  @js.native
  sealed trait info extends _LogLevel
  
  @js.native
  sealed trait initializing extends SubscriptionState
  
  @js.native
  sealed trait invited extends Status
  
  @js.native
  sealed trait joined extends Status
  
  @js.native
  sealed trait known extends Status
  
  @js.native
  sealed trait lastConsumedMessageIndex
    extends typings.twilioDashChat.libMemberMod.Member.UpdateReason
       with typings.twilioDashChat.libChannelMod.Channel.UpdateReason
  
  @js.native
  sealed trait lastConsumptionTimestamp
    extends typings.twilioDashChat.libMemberMod.Member.UpdateReason
  
  @js.native
  sealed trait lastMessage
    extends ChannelSortingCriteria
       with typings.twilioDashChat.libChannelMod.Channel.UpdateReason
  
  @js.native
  sealed trait lastUpdatedBy
    extends typings.twilioDashChat.libMessageMod.Message.UpdateReason
  
  @js.native
  sealed trait media
    extends typings.twilioDashChat.libMessageMod.Message.Type
  
  @js.native
  sealed trait muted extends NotificationLevel
  
  @js.native
  sealed trait notifiable extends UpdateReason
  
  @js.native
  sealed trait notificationLevel
    extends typings.twilioDashChat.libChannelMod.Channel.UpdateReason
  
  @js.native
  sealed trait online extends UpdateReason
  
  @js.native
  sealed trait `private`
    extends typings.twilioDashChat.libChannelMod.Channel.Type
  
  @js.native
  sealed trait public
    extends typings.twilioDashChat.libChannelMod.Channel.Type
  
  @js.native
  sealed trait roleSid
    extends typings.twilioDashChat.libMemberMod.Member.UpdateReason
  
  @js.native
  sealed trait silent extends _LogLevel
  
  @js.native
  sealed trait sms extends Type
  
  @js.native
  sealed trait status
    extends typings.twilioDashChat.libChannelMod.Channel.UpdateReason
  
  @js.native
  sealed trait subscribed extends SubscriptionState
  
  @js.native
  sealed trait sync extends DataSource
  
  @js.native
  sealed trait synclist extends DataSource
  
  @js.native
  sealed trait text
    extends typings.twilioDashChat.libMessageMod.Message.Type
  
  @js.native
  sealed trait timestamp
    extends typings.twilioDashChat.libMessageMod.Message.UpdateReason
  
  @js.native
  sealed trait trace extends _LogLevel
  
  @js.native
  sealed trait twilioDOTchannelDOTadded_to_channel
    extends typings.twilioDashChat.libPushnotificationMod.PushNotification.Type
  
  @js.native
  sealed trait twilioDOTchannelDOTinvited_to_channel
    extends typings.twilioDashChat.libPushnotificationMod.PushNotification.Type
  
  @js.native
  sealed trait twilioDOTchannelDOTnew_message
    extends typings.twilioDashChat.libPushnotificationMod.PushNotification.Type
  
  @js.native
  sealed trait twilioDOTchannelDOTremoved_from_channel
    extends typings.twilioDashChat.libPushnotificationMod.PushNotification.Type
  
  @js.native
  sealed trait uniqueName
    extends ChannelSortingCriteria
       with typings.twilioDashChat.libChannelMod.Channel.UpdateReason
  
  @js.native
  sealed trait unknown extends Status
  
  @js.native
  sealed trait unsubscribed extends SubscriptionState
  
  @js.native
  sealed trait warn extends _LogLevel
  
  @js.native
  sealed trait whatsapp extends Type
  
  @scala.inline
  def ascending: ascending = "ascending".asInstanceOf[ascending]
  @scala.inline
  def attributes: attributes = "attributes".asInstanceOf[attributes]
  @scala.inline
  def author: author = "author".asInstanceOf[author]
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  @scala.inline
  def chat: chat = "chat".asInstanceOf[chat]
  @scala.inline
  def createdBy: createdBy = "createdBy".asInstanceOf[createdBy]
  @scala.inline
  def dateCreated: dateCreated = "dateCreated".asInstanceOf[dateCreated]
  @scala.inline
  def dateUpdated: dateUpdated = "dateUpdated".asInstanceOf[dateUpdated]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def descending: descending = "descending".asInstanceOf[descending]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def friendlyName: friendlyName = "friendlyName".asInstanceOf[friendlyName]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def initializing: initializing = "initializing".asInstanceOf[initializing]
  @scala.inline
  def invited: invited = "invited".asInstanceOf[invited]
  @scala.inline
  def joined: joined = "joined".asInstanceOf[joined]
  @scala.inline
  def known: known = "known".asInstanceOf[known]
  @scala.inline
  def lastConsumedMessageIndex: lastConsumedMessageIndex = "lastConsumedMessageIndex".asInstanceOf[lastConsumedMessageIndex]
  @scala.inline
  def lastConsumptionTimestamp: lastConsumptionTimestamp = "lastConsumptionTimestamp".asInstanceOf[lastConsumptionTimestamp]
  @scala.inline
  def lastMessage: lastMessage = "lastMessage".asInstanceOf[lastMessage]
  @scala.inline
  def lastUpdatedBy: lastUpdatedBy = "lastUpdatedBy".asInstanceOf[lastUpdatedBy]
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  @scala.inline
  def muted: muted = "muted".asInstanceOf[muted]
  @scala.inline
  def notifiable: notifiable = "notifiable".asInstanceOf[notifiable]
  @scala.inline
  def notificationLevel: notificationLevel = "notificationLevel".asInstanceOf[notificationLevel]
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  @scala.inline
  def roleSid: roleSid = "roleSid".asInstanceOf[roleSid]
  @scala.inline
  def silent: silent = "silent".asInstanceOf[silent]
  @scala.inline
  def sms: sms = "sms".asInstanceOf[sms]
  @scala.inline
  def status: status = "status".asInstanceOf[status]
  @scala.inline
  def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
  @scala.inline
  def synclist: synclist = "synclist".asInstanceOf[synclist]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  @scala.inline
  def twilioDOTchannelDOTadded_to_channel: twilioDOTchannelDOTadded_to_channel = "twilio.channel.added_to_channel".asInstanceOf[twilioDOTchannelDOTadded_to_channel]
  @scala.inline
  def twilioDOTchannelDOTinvited_to_channel: twilioDOTchannelDOTinvited_to_channel = "twilio.channel.invited_to_channel".asInstanceOf[twilioDOTchannelDOTinvited_to_channel]
  @scala.inline
  def twilioDOTchannelDOTnew_message: twilioDOTchannelDOTnew_message = "twilio.channel.new_message".asInstanceOf[twilioDOTchannelDOTnew_message]
  @scala.inline
  def twilioDOTchannelDOTremoved_from_channel: twilioDOTchannelDOTremoved_from_channel = "twilio.channel.removed_from_channel".asInstanceOf[twilioDOTchannelDOTremoved_from_channel]
  @scala.inline
  def uniqueName: uniqueName = "uniqueName".asInstanceOf[uniqueName]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  @scala.inline
  def whatsapp: whatsapp = "whatsapp".asInstanceOf[whatsapp]
}

