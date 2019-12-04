package typings.twilioDashChat.libDataMembersMod

import typings.node.eventsMod.EventEmitter
import typings.std.Map
import typings.twilioDashChat.libChannelMod.Channel
import typings.twilioDashChat.libMemberMod.Member
import typings.twilioDashChat.libMemberMod.MemberDescriptor
import typings.twilioDashSync.twilioDashSyncMod.SyncMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc Represents the collection of members for the channel
  * @fires Members#memberJoined
  * @fires Members#memberLeft
  * @fires Members#memberUpdated
  */
@JSImport("twilio-chat/lib/data/members", "Members")
@js.native
class Members protected () extends EventEmitter {
  def this(channel: Channel, services: MembersServices, members: Map[String, Member]) = this()
  val channel: Channel = js.native
  val members: Map[String, Member] = js.native
  var rosterEntityPromise: js.Promise[SyncMap] = js.native
  var services: MembersServices = js.native
  /**
    * Add user to the channel
    * @returns {Promise<void|SessionError>}
    */
  def add(identity: String): js.Promise[js.Object] = js.native
  /**
    * Get member by identity from channel
    * @returns {Promise<|Error>}
    */
  def getMemberByIdentity(identity: String): js.Promise[Member] = js.native
  /**
    * Get member by SID from channel
    * @returns {Promise<|Error>}
    */
  def getMemberBySid(memberSid: String): js.Promise[Member] = js.native
  /**
    * @returns {Promise<Array<Member>>} returns list of members {@see Member}
    */
  def getMembers(): js.Promise[js.Array[Member]] = js.native
  /**
    * Invites user to the channel
    * User can choose either to join or not
    * @returns {Promise<|SessionError>}
    */
  def invite(identity: String): js.Promise[js.Object] = js.native
  /**
    * Remove member from channel by Identity
    * @returns {Promise<|SessionError>}
    */
  def removeByIdentity(identity: String): js.Promise[js.Object] = js.native
  /**
    * Remove member from channel by sid
    * @returns {Promise<|SessionError>}
    */
  def removeBySid(sid: String): js.Promise[js.Object] = js.native
  def subscribe(rosterObjectName: String): js.Promise[SyncMap] = js.native
  def unsubscribe(): js.Promise[Unit] = js.native
  def upsertMember(memberSid: String, data: MemberDescriptor): js.Promise[Member] = js.native
}

