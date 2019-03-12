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

object AudioRecorder {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    compression: scala.Double,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    format: scala.Double,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getCompression: () => scala.Double,
    getFormat: () => scala.Double,
    getPaused: () => scala.Boolean,
    getRecording: () => scala.Boolean,
    getStopped: () => scala.Boolean,
    pause: () => scala.Unit,
    paused: scala.Boolean,
    recording: scala.Boolean,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    resume: () => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setCompression: scala.Double => scala.Unit,
    setFormat: scala.Double => scala.Unit,
    start: () => scala.Unit,
    stop: () => titaniumLib.TitaniumNs.FilesystemNs.File,
    stopped: scala.Boolean,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): AudioRecorder = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, compression = compression, fireEvent = js.Any.fromFunction2(fireEvent), format = format, getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getCompression = js.Any.fromFunction0(getCompression), getFormat = js.Any.fromFunction0(getFormat), getPaused = js.Any.fromFunction0(getPaused), getRecording = js.Any.fromFunction0(getRecording), getStopped = js.Any.fromFunction0(getStopped), pause = js.Any.fromFunction0(pause), paused = paused, recording = recording, removeEventListener = js.Any.fromFunction2(removeEventListener), resume = js.Any.fromFunction0(resume), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setCompression = js.Any.fromFunction1(setCompression), setFormat = js.Any.fromFunction1(setFormat), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), stopped = stopped)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[AudioRecorder]
  }
}

