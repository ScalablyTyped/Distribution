package typings.ts3NodejsLibrary

import typings.node.bufferMod.global.Buffer
import typings.ts3NodejsLibrary.abstractMod.Abstract
import typings.ts3NodejsLibrary.anon.Cid
import typings.ts3NodejsLibrary.anon.PartialClientEntry
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import typings.ts3NodejsLibrary.enumMod.Codec
import typings.ts3NodejsLibrary.permissionMod.Permission
import typings.ts3NodejsLibrary.permissionMod.Permission.PermType
import typings.ts3NodejsLibrary.propertyTypesMod.ChannelEdit
import typings.ts3NodejsLibrary.responseTypesMod.ChannelEntry
import typings.ts3NodejsLibrary.responseTypesMod.ChannelInfo
import typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMod {
  
  @JSImport("ts3-nodejs-library/lib/node/Channel", "TeamSpeakChannel")
  @js.native
  open class TeamSpeakChannel protected () extends Abstract[ChannelEntry] {
    def this(parent: TeamSpeak, list: ChannelEntry) = this()
    
    def bannerGfxUrl: String = js.native
    
    def bannerMode: Double = js.native
    
    def cid: String = js.native
    
    def codec: Codec = js.native
    
    def codecQuality: Double = js.native
    
    /**
      * Adds a permission to a channel
      * Multiple permissions can be added by providing the two parameters of each permission.
      * A permission can be specified by permid or permsid.
      * @param perm permission object to set
      */
    def createPerm(): Permission[Any] = js.native
    
    /**
      * Deletes an existing channel by ID.
      * If force is set to 1, the channel will be deleted even if there are clients within.
      * The clients will be kicked to the default channel with an appropriate reason message.
      * @param {number} force if set to 1 the channel will be deleted even when clients are in it
      */
    def del(): js.Promise[js.Array[Any]] = js.native
    def del(force: Boolean): js.Promise[js.Array[Any]] = js.native
    
    /**
      * Removes a set of specified permissions from a channel.
      * Multiple permissions can be removed at once.
      * A permission can be specified by permid or permsid.
      * @param perm the permid or permsid
      */
    def delPerm(perm: String): js.Promise[js.Array[Any]] = js.native
    def delPerm(perm: Double): js.Promise[js.Array[Any]] = js.native
    
    /**
      * Changes a channels configuration using given properties. Note that this command accepts multiple properties which means that you're able to change all settings of the channel specified with cid at once.
      * @param properties the properties of the channel which should get changed
      */
    def edit(properties: ChannelEdit): js.Promise[js.Array[Any]] = js.native
    
    def flagDefault: Boolean = js.native
    
    def flagPassword: Boolean = js.native
    
    def flagPermanent: Boolean = js.native
    
    def flagSemiPermanent: Boolean = js.native
    
    /**
      * Gets a List of Clients in the current Channel
      * @param filter the filter object
      */
    def getClients(): js.Promise[js.Array[TeamSpeakClient]] = js.native
    def getClients(filter: PartialClientEntry): js.Promise[js.Array[TeamSpeakClient]] = js.native
    
    /** returns a buffer with the icon of the channel */
    def getIcon(): js.Promise[Buffer] = js.native
    
    /** returns the icon name of the channel */
    def getIconId(): js.Promise[Double] = js.native
    
    /** returns detailed configuration information about a channel including ID, topic, description, etc */
    def getInfo(): js.Promise[ChannelInfo] = js.native
    
    def iconId: String = js.native
    
    def maxclients: Double = js.native
    
    def maxfamilyclients: Double = js.native
    
    /**
      * sends a message to the specified channel
      * @param msg message which should be sent to the channel
      */
    def message(msg: String): js.Promise[Unit] = js.native
    
    /**
      * Moves a channel to a new parent channel with the ID cpid.
      * If order is specified, the channel will be sorted right under the channel with the specified ID.
      * If order is set to 0, the channel will be sorted right below the new parent.
      * @param parent channel parent id
      * @param order channel sort order
      */
    def move(parent: String): js.Promise[js.Array[Any]] = js.native
    def move(parent: String, order: Double): js.Promise[js.Array[Any]] = js.native
    def move(parent: TeamSpeakChannel): js.Promise[js.Array[Any]] = js.native
    def move(parent: TeamSpeakChannel, order: Double): js.Promise[js.Array[Any]] = js.native
    
    def name: String = js.native
    
    def neededSubscribePower: Double = js.native
    
    def neededTalkPower: Double = js.native
    
    def order: Double = js.native
    
    /**
      * Displays a list of permissions defined for a channel.
      * @param permsid whether the permsid should be displayed aswell
      */
    def permList(): js.Promise[js.Array[Permission[Cid]]] = js.native
    def permList(permsid: Boolean): js.Promise[js.Array[Permission[Cid]]] = js.native
    
    def pid: String = js.native
    
    def secondsEmpty: Double = js.native
    
    /**
      * Adds a set of specified permissions to a channel.
      * Multiple permissions can be added by providing the two parameters of each permission.
      * A permission can be specified by permid or permsid.
      * @param perm permission object to set
      */
    def setPerm(perm: PermType): js.Promise[js.Array[Any]] = js.native
    
    def topic: String = js.native
    
    def totalClients: Double = js.native
    
    def totalClientsFamily: Double = js.native
  }
  /* static members */
  object TeamSpeakChannel {
    
    @JSImport("ts3-nodejs-library/lib/node/Channel", "TeamSpeakChannel")
    @js.native
    val ^ : js.Any = js.native
    
    /** retrieves the client id from a string or teamspeak client */
    inline def getId[T /* <: ChannelType */](): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.UndefOr[String]]
    inline def getId[T /* <: ChannelType */](channel: T): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")(channel.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    
    /** retrieves the clients from an array */
    inline def getMultipleIds(channels: MultiChannelType): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMultipleIds")(channels.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    type ChannelType = String | TeamSpeakChannel
    
    type MultiChannelType = (js.Array[String | TeamSpeakChannel]) | ChannelType
  }
}
