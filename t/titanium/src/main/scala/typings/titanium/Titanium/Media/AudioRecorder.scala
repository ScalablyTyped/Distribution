package typings.titanium.Titanium.Media

import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An audio recorder object used for recording audio from the device microphone.
  */
@js.native
trait AudioRecorder extends Proxy {
  /**
    * Audio compression to be used for the recording.
    */
  var compression: Double = js.native
  /**
    * Audio format to be used for the recording.
    */
  var format: Double = js.native
  /**
    * Indicates if the audio recorder is paused.
    */
  val paused: Boolean = js.native
  /**
    * Indicates if the audio recorder is recording.
    */
  val recording: Boolean = js.native
  /**
    * Indicates if the audio recorder is stopped.
    */
  val stopped: Boolean = js.native
  /**
    * Gets the value of the <Titanium.Media.AudioRecorder.compression> property.
    * @deprecated Access <Titanium.Media.AudioRecorder.compression> instead.
    */
  def getCompression(): Double = js.native
  /**
    * Gets the value of the <Titanium.Media.AudioRecorder.format> property.
    * @deprecated Access <Titanium.Media.AudioRecorder.format> instead.
    */
  def getFormat(): Double = js.native
  /**
    * Gets the value of the <Titanium.Media.AudioRecorder.paused> property.
    * @deprecated Access <Titanium.Media.AudioRecorder.paused> instead.
    */
  def getPaused(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.Media.AudioRecorder.recording> property.
    * @deprecated Access <Titanium.Media.AudioRecorder.recording> instead.
    */
  def getRecording(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.Media.AudioRecorder.stopped> property.
    * @deprecated Access <Titanium.Media.AudioRecorder.stopped> instead.
    */
  def getStopped(): Boolean = js.native
  /**
    * Pauses the current audio recording.
    */
  def pause(): Unit = js.native
  /**
    * Resumes a paused recording.
    */
  def resume(): Unit = js.native
  /**
    * Sets the value of the <Titanium.Media.AudioRecorder.compression> property.
    * @deprecated Set the value using <Titanium.Media.AudioRecorder.compression> instead.
    */
  def setCompression(compression: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.Media.AudioRecorder.format> property.
    * @deprecated Set the value using <Titanium.Media.AudioRecorder.format> instead.
    */
  def setFormat(format: Double): Unit = js.native
  /**
    * Starts an audio recording.
    */
  def start(): Unit = js.native
  /**
    * Stops the current audio recording and returns the recorded audio file.
    */
  def stop(): File = js.native
}

