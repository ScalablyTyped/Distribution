package typings
package webgmeLib.GmeClassesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /** array of hashes */
  var artifacts: js.Array[webgmeLib.GmeCommonNs.ArtifactHash] = js.native
  var commits: js.Array[_] = js.native
  var error: nodeLib.Error = js.native
  var finishTime: stdLib.Date = js.native
  /** array of PluginMessages */
  var messages: js.Array[java.lang.String] = js.native
  var pluginName: java.lang.String = js.native
  var projectId: js.Any = js.native
  var startTime: stdLib.Date = js.native
  var success: scala.Boolean = js.native
  /**
          * Adds a saved artifact to the result - linked via its metadataHash.
          * Takes the metadataHash of saved artifact.
          */
  def addArtifact(metadataHash: webgmeLib.GmeCommonNs.MetadataHash): scala.Unit = js.native
  /**
          * Adds a commit to the commit container.
          */
  def addCommit(commitData: Commit): scala.Unit = js.native
  /**
          * Adds a new plugin message to the messages list.
          */
  def addMessage(pluginMessage: webgmeLib.GmeCommonNs.Message): scala.Unit = js.native
  /**
          * Returns the plugin artifacts.
          */
  def getArtifacts(): js.Array[Artifact] = js.native
  /**
          * Gets error if any error occured during execution.
          * FIXME: should this return an Error object?
          */
  def getError(): webgmeLib.GmeCommonNs.ErrorStr = js.native
  /**
          * Gets the ISO 8601 representation of the time when the plugin finished its execution.
          */
  def getFinishTime(): webgmeLib.GmeCommonNs.ISO8601 = js.native
  /**
          * Returns with the plugin messages.
          */
  def getMessages(): js.Array[webgmeLib.GmeCommonNs.Message] = js.native
  /**
          * Gets the name of the plugin to which the result object belongs.
          */
  def getPluginName(): java.lang.String = js.native
  /**
          * Gets the ISO 8601 representation of the time when the plugin started its execution.
          */
  def getStartTime(): webgmeLib.GmeCommonNs.ISO8601 = js.native
  /**
          * Gets the success flag of this result object
          */
  def getSuccess(): scala.Boolean = js.native
  /**
          * Serializes this object to a JSON representation.
          */
  def serialize(): webgmeLib.Anon_PluginName = js.native
  /**
          * Sets the error string if any error occured during execution.
          */
  def setError(error: nodeLib.Error): scala.Unit = js.native
  /**
          * Sets the error string if any error occured during execution.
          */
  def setError(error: webgmeLib.GmeCommonNs.ErrorStr): scala.Unit = js.native
  /**
          * Sets the ISO 8601 representation of the time when the plugin finished its execution.
          */
  def setFinishTime(time: webgmeLib.GmeCommonNs.ISO8601): scala.Unit = js.native
  //------------------------------------------
  // Methods used by the plugin manager
  //-----------------------------------------
  /**
          * Sets the name of the plugin to which the result object belongs to.
          */
  def setPluginName(pluginName: java.lang.String): java.lang.String = js.native
  /**
          * Sets the name of the projectId the result was generated from.
          */
  def setProjectId(projectId: java.lang.String): scala.Unit = js.native
  /**
          * Sets the ISO 8601 representation of the time when the plugin started its execution.
          */
  def setStartTime(time: webgmeLib.GmeCommonNs.ISO8601): scala.Unit = js.native
  /**
          * Sets the success flag of this result.
          */
  def setSuccess(value: scala.Boolean): scala.Unit = js.native
}

