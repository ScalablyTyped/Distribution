package typings.ts3DashNodejsDashLibrary

import typings.node.Buffer
import typings.std.Partial
import typings.ts3DashNodejsDashLibrary.libNodeAbstractMod.Abstract
import typings.ts3DashNodejsDashLibrary.libNodeClientMod.TeamSpeakClient
import typings.ts3DashNodejsDashLibrary.libTeamSpeakMod.TeamSpeak
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.Codec
import typings.ts3DashNodejsDashLibrary.libTypesPropertyTypesMod.ChannelEdit
import typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.QueryResponseTypes
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ChannelInfo
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ChannelList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.ClientList
import typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod.PermList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/node/Channel", JSImport.Namespace)
@js.native
object libNodeChannelMod extends js.Object {
  @js.native
  class TeamSpeakChannel protected () extends Abstract {
    def this(parent: TeamSpeak, list: ChannelList) = this()
    val cid: Double = js.native
    val codec: js.UndefOr[Codec] = js.native
    val codecQuality: js.UndefOr[Double] = js.native
    val flagDefault: js.UndefOr[Double] = js.native
    val flagPassword: js.UndefOr[Double] = js.native
    val flagPermanent: js.UndefOr[Double] = js.native
    val flagSemiPermanent: js.UndefOr[Double] = js.native
    val iconId: js.UndefOr[Double] = js.native
    val maxclients: js.UndefOr[Double] = js.native
    val maxfamilyclients: js.UndefOr[Double] = js.native
    val name: String = js.native
    val neededSubscribePower: Double = js.native
    val neededTalkPower: js.UndefOr[Double] = js.native
    val order: Double = js.native
    val pid: Double = js.native
    val secondsEmpty: js.UndefOr[Double] = js.native
    val topic: js.UndefOr[String] = js.native
    val totalClients: Double = js.native
    val totalClientsFamily: js.UndefOr[Double] = js.native
    /**
      * Deletes an existing channel by ID.
      * If force is set to 1, the channel will be deleted even if there are clients within.
      * The clients will be kicked to the default channel with an appropriate reason message.
      * @param {number} force if set to 1 the channel will be deleted even when clients are in it
      */
    def del(): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def del(force: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * Removes a set of specified permissions from a channel.
      * Multiple permissions can be removed at once.
      * A permission can be specified by permid or permsid.
      * @param perm the permid or permsid
      */
    def delPerm(perm: String): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def delPerm(perm: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * Changes a channels configuration using given properties. Note that this command accepts multiple properties which means that you're able to change all settings of the channel specified with cid at once.
      * @param properties the properties of the channel which should get changed
      */
    def edit(properties: ChannelEdit): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * Gets a List of Clients in the current Channel
      * @param filter the filter object
      */
    def getClients(): js.Promise[js.Array[TeamSpeakClient]] = js.native
    def getClients(filter: Partial[ClientList]): js.Promise[js.Array[TeamSpeakClient]] = js.native
    /** returns a buffer with the icon of the channel */
    def getIcon(): js.Promise[Buffer] = js.native
    /** returns the icon name of the channel */
    def getIconName(): js.Promise[String] = js.native
    /** returns detailed configuration information about a channel including ID, topic, description, etc */
    def getInfo(): js.Promise[ChannelInfo] = js.native
    /**
      * Moves a channel to a new parent channel with the ID cpid.
      * If order is specified, the channel will be sorted right under the channel with the specified ID.
      * If order is set to 0, the channel will be sorted right below the new parent.
      * @param cpid channel parent id
      * @param order channel sort order
      */
    def move(cpid: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def move(cpid: Double, order: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    /**
      * Displays a list of permissions defined for a channel.
      * @param permsid whether the permsid should be displayed aswell
      */
    def permList(): js.Promise[js.Array[PermList]] = js.native
    def permList(permsid: Boolean): js.Promise[js.Array[PermList]] = js.native
    /**
      * Adds a set of specified permissions to a channel.
      * Multiple permissions can be added by providing the two parameters of each permission.
      * A permission can be specified by permid or permsid.
      * @param perm the permid or permsid
      * @param value the value which should be set
      */
    def setPerm(perm: String, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
    def setPerm(perm: Double, value: Double): js.Promise[js.Array[QueryResponseTypes]] = js.native
  }
  
}

