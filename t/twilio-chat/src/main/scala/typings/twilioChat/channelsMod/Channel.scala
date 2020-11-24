package typings.twilioChat.channelsMod

import typings.twilioChat.channelMod.ChannelDescriptor
import typings.twilioChat.channelMod.ChannelServices
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc A Channel represents a remote channel of communication between multiple Programmable Chat Clients
  * @property {any} attributes - The Channel's custom attributes
  * @property {String} createdBy - The identity of the User that created this Channel
  * @property {Date} dateCreated - The Date this Channel was created
  * @property {Date} dateUpdated - The Date this Channel was last updated
  * @property {String} friendlyName - The Channel's name
  * @property {Boolean} isPrivate - Whether the channel is private (as opposed to public)
  * @property {Number} lastConsumedMessageIndex - Index of the last Message the User has consumed in this Channel
  * @property {Channel#LastMessage} lastMessage - Last Message sent to this Channel
  * @property {Channel#NotificationLevel} notificationLevel - User Notification level for this Channel
  * @property {String} sid - The Channel's unique system identifier
  * @property {Channel#State} state - The Channel's state
  * @property {Channel#Status} status - The Channel's status
  * @property {Channel#Type} type - The Channel's type
  * @property {String} uniqueName - The Channel's unique name (tag)
  * @fires Channel#memberJoined
  * @fires Channel#memberLeft
  * @fires Channel#memberUpdated
  * @fires Channel#messageAdded
  * @fires Channel#messageRemoved
  * @fires Channel#messageUpdated
  * @fires Channel#typingEnded
  * @fires Channel#typingStarted
  * @fires Channel#updated
  * @fires Channel#removed
  */
@JSImport("twilio-chat/lib/data/channels", "Channel")
@js.native
class Channel protected ()
  extends typings.twilioChat.channelMod.Channel {
  /**
    * These options can be passed to {@link Channel#sendMessage}.
    * @typedef {Object} Channel#SendMediaOptions
    * @property {String} contentType - content type of media
    * @property {String | Buffer} media - content to post
    */
  /**
    * The update reason for <code>updated</code> event emitted on Channel
    * @typedef {('attributes' | 'createdBy' | 'dateCreated' | 'dateUpdated' |
    'friendlyName' | 'lastConsumedMessageIndex' | 'state' | 'status' | 'uniqueName' | 'lastMessage' |
    'notificationLevel' )} Channel#UpdateReason
    */
  /**
    * The status of the Channel, relative to the Client: whether the Channel
    * is <code>notParticipating</code> to local Client, Client is <code>invited</code> to or
    * is <code>joined</code> to this Channel
    * @typedef {('unknown' | 'notParticipating' | 'invited' | 'joined')} Channel#Status
    */
  /**
    * The type of Channel (<code>public</code> or <code>private</code>).
    * @typedef {('public' | 'private')} Channel#Type
    */
  /**
    * The User's Notification level for Channel, determines whether the currently logged-in User will receive
    * pushes for events in this Channel. Can be either <code>muted</code> or <code>default</code>,
    * where <code>default</code> defers to global Service push configuration.
    * @typedef {('default' | 'muted')} Channel#NotificationLevel
    */
  /**
    * The Channel's state. Set to undefined if the channel is not a conversation.
    * @typedef {Object | undefined} Channel#State
    * @property {('active' | 'inactive' | 'closed')} current - the current state
    * @property {Date} dateUpdated - date at which the latest channel state update happened
    */
  def this(services: ChannelServices, descriptor: ChannelDescriptor, sid: String) = this()
}
/* static members */
@JSImport("twilio-chat/lib/data/channels", "Channel")
@js.native
object Channel extends js.Object {
  
  var preprocessUpdate: js.Any = js.native
}
