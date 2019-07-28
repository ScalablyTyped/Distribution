package typings.ts3DashNodejsDashLibrary.propertyAbstractMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Abstract extends EventEmitter {
  /**
    * Safely unsubscribes to all Events
    */
  def destruct(): Unit = js.native
  /**
    * Returns the data from the last List Command
    */
  def getCache(): js.Any = js.native
  /**
    * retrieves the namespace of this class
    * @returns the current namespace
    */
  def getNameSpace(): String = js.native
  /**
    * Returns the Parent Class
    * @returns the teamspeak instance
    */
  def getParent(): typings.ts3DashNodejsDashLibrary.teamSpeak3Mod.^ = js.native
  /**
    * retrieves a single property value by the given name
    * @param - the name from where the value should be retrieved
    */
  def getPropertyByName(name: String): Unit = js.native
  /**
    * Copies the the new values and keys from src to dst and returns the changes to dst
    * @param - the object to copy the src object onto
    * @param - the object with the new values
    * @returns the updated values from src to dst
    */
  def objectCopy(dst: js.Any, src: js.Any): js.Any = js.native
  /**
    * returns JSONifyable data
    */
  def toJSON(): Unit = js.native
  /**
    * translates a TeamSpeak property key to a JavaScript conform name
    * @param - the name which will get converted
    * @returns returns the JavaScript conform name
    * @example
    *  // given that the abstract is extending a TeamSpeakClient
    *  client.translatePropName("client_nickname") //returns "nickname"
    *  client.translatePropName("client_is_talker") //returns "isTalker"
    *  client.translatePropName("client_channel_group_id") //returns "channelGroupId"
    */
  def translatePropName(name: String): String = js.native
  /**
    * Sets the Data from the Last List Command
    */
  def updateCache(): Unit = js.native
}

