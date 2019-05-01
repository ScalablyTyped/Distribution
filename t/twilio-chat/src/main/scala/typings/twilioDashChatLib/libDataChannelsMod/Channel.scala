package typings
package twilioDashChatLib.libDataChannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc A Channel represents a remote channel of communication between multiple Programmable Chat Clients
  * @property {Object} attributes - The Channel's custom attributes
  * @property {String} createdBy - The identity of the User that created this Channel
  * @property {Date} dateCreated - The Date this Channel was created
  * @property {Date} dateUpdated - The Date this Channel was last updated
  * @property {String} friendlyName - The Channel's name
  * @property {Boolean} isPrivate - Whether the channel is private (as opposed to public)
  * @property {Number} lastConsumedMessageIndex - Index of the last Message the User has consumed in this Channel
  * @property {Channel#LastMessage} lastMessage - Last Message sent to this Channel
  * @property {Channel#NotificationLevel} notificationLevel - User Notification level for this Channel
  * @property {String} sid - The Channel's unique system identifier
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
  */
@JSImport("twilio-chat/lib/data/channels", "Channel")
@js.native
class Channel protected ()
  extends twilioDashChatLib.libChannelMod.Channel {
  /**
    * These options can be passed to {@link Channel#sendMessage}.
    * @typedef {Object} Channel#SendMediaOptions
    * @property {String} contentType - content type of media
    * @property {String | Buffer} media - content to post
    */
  /**
    * The update reason for <code>updated</code> event emitted on Channel
    * @typedef {('attributes' | 'createdBy' | 'dateCreated' | 'dateUpdated' |
    'friendlyName' | 'lastConsumedMessageIndex' | 'status' | 'uniqueName' | 'lastMessage' |
    'notificationLevel' )} Channel#UpdateReason
    */
  /**
    * The status of the Channel, relative to the Client: whether the Channel
    * is <code>known</code> to local Client, Client is <code>invited</code> to or
    * is <code>joined</code> to this Channel
    * @typedef {('unknown' | 'known' | 'invited' | 'joined')} Channel#Status
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
  def this(services: twilioDashChatLib.libChannelMod.ChannelServices, descriptor: twilioDashChatLib.libChannelMod.ChannelDescriptor, sid: java.lang.String) = this()
}

/* static members */
@JSImport("twilio-chat/lib/data/channels", "Channel")
@js.native
object Channel extends js.Object {
  var preprocessUpdate: js.Any = js.native
}

