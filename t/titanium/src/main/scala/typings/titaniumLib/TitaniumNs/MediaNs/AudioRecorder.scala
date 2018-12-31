package typings
package titaniumLib.TitaniumNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An audio recorder object used for recording audio from the device microphone.
		 */
trait AudioRecorder
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Audio compression to be used for the recording.
  			 */
  var compression: scala.Double
  /**
  			 * Audio format to be used for the recording.
  			 */
  var format: scala.Double
  /**
  			 * Indicates if the audio recorder is paused.
  			 */
  val paused: scala.Boolean
  /**
  			 * Indicates if the audio recorder is recording.
  			 */
  val recording: scala.Boolean
  /**
  			 * Indicates if the audio recorder is stopped.
  			 */
  val stopped: scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.compression> property.
  			 */
  def getCompression(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.format> property.
  			 */
  def getFormat(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.paused> property.
  			 */
  def getPaused(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.recording> property.
  			 */
  def getRecording(): scala.Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.stopped> property.
  			 */
  def getStopped(): scala.Boolean
  /**
  			 * Pauses the current audio recording.
  			 */
  def pause(): scala.Unit
  /**
  			 * Resumes a paused recording.
  			 */
  def resume(): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioRecorder.compression> property.
  			 */
  def setCompression(compression: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioRecorder.format> property.
  			 */
  def setFormat(format: scala.Double): scala.Unit
  /**
  			 * Starts an audio recording.
  			 */
  def start(): scala.Unit
  /**
  			 * Stops the current audio recording and returns the recorded audio file.
  			 */
  def stop(): titaniumLib.TitaniumNs.FilesystemNs.File
}

