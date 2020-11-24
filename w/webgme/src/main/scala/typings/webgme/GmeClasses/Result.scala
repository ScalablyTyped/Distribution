package typings.webgme.GmeClasses

import typings.std.Date
import typings.std.Error
import typings.webgme.GmeCommon.ArtifactHash
import typings.webgme.GmeCommon.ErrorStr
import typings.webgme.GmeCommon.ISO8601
import typings.webgme.GmeCommon.Message
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.anon.FinishTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Result extends js.Object {
  
  /**
    * Adds a saved artifact to the result - linked via its metadataHash.
    * Takes the metadataHash of saved artifact.
    */
  def addArtifact(metadataHash: MetadataHash): Unit = js.native
  
  /**
    * Adds a commit to the commit container.
    */
  def addCommit(commitData: Commit): Unit = js.native
  
  /**
    * Adds a new plugin message to the messages list.
    */
  def addMessage(pluginMessage: Message): Unit = js.native
  
  /** array of hashes */
  var artifacts: js.Array[ArtifactHash] = js.native
  
  var commits: js.Array[_] = js.native
  
  var error: Error = js.native
  
  var finishTime: Date = js.native
  
  /**
    * Returns the plugin artifacts.
    */
  def getArtifacts(): js.Array[Artifact] = js.native
  
  /**
    * Gets error if any error occured during execution.
    * FIXME: should this return an Error object?
    */
  def getError(): ErrorStr = js.native
  
  /**
    * Gets the ISO 8601 representation of the time when the plugin finished its execution.
    */
  def getFinishTime(): ISO8601 = js.native
  
  /**
    * Returns with the plugin messages.
    */
  def getMessages(): js.Array[Message] = js.native
  
  /**
    * Gets the name of the plugin to which the result object belongs.
    */
  def getPluginName(): String = js.native
  
  /**
    * Gets the ISO 8601 representation of the time when the plugin started its execution.
    */
  def getStartTime(): ISO8601 = js.native
  
  /**
    * Gets the success flag of this result object
    */
  def getSuccess(): Boolean = js.native
  
  /** array of PluginMessages */
  var messages: js.Array[String] = js.native
  
  var pluginName: String = js.native
  
  var projectId: js.Any = js.native
  
  /**
    * Serializes this object to a JSON representation.
    */
  def serialize(): FinishTime = js.native
  
  def setError(error: Error): Unit = js.native
  /**
    * Sets the error string if any error occured during execution.
    */
  def setError(error: ErrorStr): Unit = js.native
  
  /**
    * Sets the ISO 8601 representation of the time when the plugin finished its execution.
    */
  def setFinishTime(time: ISO8601): Unit = js.native
  
  //------------------------------------------
  // Methods used by the plugin manager
  //-----------------------------------------
  /**
    * Sets the name of the plugin to which the result object belongs to.
    */
  def setPluginName(pluginName: String): String = js.native
  
  /**
    * Sets the name of the projectId the result was generated from.
    */
  def setProjectId(projectId: String): Unit = js.native
  
  /**
    * Sets the ISO 8601 representation of the time when the plugin started its execution.
    */
  def setStartTime(time: ISO8601): Unit = js.native
  
  /**
    * Sets the success flag of this result.
    */
  def setSuccess(value: Boolean): Unit = js.native
  
  var startTime: Date = js.native
  
  var success: Boolean = js.native
}
