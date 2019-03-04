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
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    bubbleParent: scala.Boolean,
    compression: scala.Double,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    format: scala.Double,
    getApiName: js.Function0[java.lang.String],
    getBubbleParent: js.Function0[scala.Boolean],
    getCompression: js.Function0[scala.Double],
    getFormat: js.Function0[scala.Double],
    getPaused: js.Function0[scala.Boolean],
    getRecording: js.Function0[scala.Boolean],
    getStopped: js.Function0[scala.Boolean],
    pause: js.Function0[scala.Unit],
    paused: scala.Boolean,
    recording: scala.Boolean,
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    resume: js.Function0[scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setCompression: js.Function1[scala.Double, scala.Unit],
    setFormat: js.Function1[scala.Double, scala.Unit],
    start: js.Function0[scala.Unit],
    stop: js.Function0[titaniumLib.TitaniumNs.FilesystemNs.File],
    stopped: scala.Boolean,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): AudioRecorder = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, apiName = apiName, applyProperties = applyProperties, bubbleParent = bubbleParent, compression = compression, fireEvent = fireEvent, format = format, getApiName = getApiName, getBubbleParent = getBubbleParent, getCompression = getCompression, getFormat = getFormat, getPaused = getPaused, getRecording = getRecording, getStopped = getStopped, pause = pause, paused = paused, recording = recording, removeEventListener = removeEventListener, resume = resume, setBubbleParent = setBubbleParent, setCompression = setCompression, setFormat = setFormat, start = start, stop = stop, stopped = stopped)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[AudioRecorder]
  }
}

