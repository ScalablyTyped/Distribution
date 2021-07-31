package typings.twilioChat

import typings.node.eventsMod.EventEmitter
import typings.std.Map
import typings.twilioChat.channelMod.Channel
import typings.twilioChat.memberMod.Member
import typings.twilioChat.memberMod.MemberDescriptor
import typings.twilioChat.sessionMod.Session
import typings.twilioChat.usersMod.Users
import typings.twilioSync.mod.SyncClient
import typings.twilioSync.mod.SyncMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object membersMod {
  
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
    
    /**
      * Add user to the channel
      * @returns {Promise<void|SessionError>}
      */
    def add(identity: String): js.Promise[js.Object] = js.native
    
    val channel: Channel = js.native
    
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
    
    val members: Map[String, Member] = js.native
    
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
    
    var rosterEntityPromise: js.Promise[SyncMap] = js.native
    
    var services: MembersServices = js.native
    
    def subscribe(rosterObjectName: String): js.Promise[SyncMap] = js.native
    
    def unsubscribe(): js.Promise[Unit] = js.native
    
    def upsertMember(memberSid: String, data: MemberDescriptor): js.Promise[Member] = js.native
  }
  
  trait MembersServices extends StObject {
    
    var session: Session
    
    var syncClient: SyncClient
    
    var users: Users
  }
  object MembersServices {
    
    @scala.inline
    def apply(session: Session, syncClient: SyncClient, users: Users): MembersServices = {
      val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[MembersServices]
    }
    
    @scala.inline
    implicit class MembersServicesMutableBuilder[Self <: MembersServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncClient(value: SyncClient): Self = StObject.set(x, "syncClient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: Users): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
}
