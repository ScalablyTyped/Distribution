package typings.titanium.Titanium.Media

import typings.titanium.Titanium.Filesystem.File
import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An audio recorder object used for recording audio from the device microphone.
		 */
trait AudioRecorder extends Proxy {
  /**
  			 * Audio compression to be used for the recording.
  			 */
  var compression: Double
  /**
  			 * Audio format to be used for the recording.
  			 */
  var format: Double
  /**
  			 * Indicates if the audio recorder is paused.
  			 */
  val paused: Boolean
  /**
  			 * Indicates if the audio recorder is recording.
  			 */
  val recording: Boolean
  /**
  			 * Indicates if the audio recorder is stopped.
  			 */
  val stopped: Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.compression> property.
  			 */
  def getCompression(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.format> property.
  			 */
  def getFormat(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.paused> property.
  			 */
  def getPaused(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.recording> property.
  			 */
  def getRecording(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.stopped> property.
  			 */
  def getStopped(): Boolean
  /**
  			 * Pauses the current audio recording.
  			 */
  def pause(): Unit
  /**
  			 * Resumes a paused recording.
  			 */
  def resume(): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioRecorder.compression> property.
  			 */
  def setCompression(compression: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioRecorder.format> property.
  			 */
  def setFormat(format: Double): Unit
  /**
  			 * Starts an audio recording.
  			 */
  def start(): Unit
  /**
  			 * Stops the current audio recording and returns the recorded audio file.
  			 */
  def stop(): File
}

object AudioRecorder {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    applyProperties: js.Any => Unit,
    bubbleParent: Boolean,
    compression: Double,
    fireEvent: (String, js.Any) => Unit,
    format: Double,
    getApiName: () => String,
    getBubbleParent: () => Boolean,
    getCompression: () => Double,
    getFormat: () => Double,
    getPaused: () => Boolean,
    getRecording: () => Boolean,
    getStopped: () => Boolean,
    pause: () => Unit,
    paused: Boolean,
    recording: Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    resume: () => Unit,
    setBubbleParent: Boolean => Unit,
    setCompression: Double => Unit,
    setFormat: Double => Unit,
    start: () => Unit,
    stop: () => File,
    stopped: Boolean,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): AudioRecorder = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, compression = compression, fireEvent = js.Any.fromFunction2(fireEvent), format = format, getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getCompression = js.Any.fromFunction0(getCompression), getFormat = js.Any.fromFunction0(getFormat), getPaused = js.Any.fromFunction0(getPaused), getRecording = js.Any.fromFunction0(getRecording), getStopped = js.Any.fromFunction0(getStopped), pause = js.Any.fromFunction0(pause), paused = paused, recording = recording, removeEventListener = js.Any.fromFunction2(removeEventListener), resume = js.Any.fromFunction0(resume), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setCompression = js.Any.fromFunction1(setCompression), setFormat = js.Any.fromFunction1(setFormat), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), stopped = stopped)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[AudioRecorder]
  }
}

