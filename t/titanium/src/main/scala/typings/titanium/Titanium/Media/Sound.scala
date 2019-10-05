package typings.titanium.Titanium.Media

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object for playing basic audio resources.
		 */
trait Sound extends Proxy {
  /**
  			 * Used to identify the volume of audio streams for alarms.
  			 */
  val AUDIO_TYPE_ALARM: Double
  /**
  			 * Used to identify the volume of audio streams for media playback.
  			 */
  val AUDIO_TYPE_MEDIA: Double
  /**
  			 * Used to identify the volume of audio streams for notifications.
  			 */
  val AUDIO_TYPE_NOTIFICATION: Double
  /**
  			 * Used to identify the volume of audio streams for the phone ring.
  			 */
  val AUDIO_TYPE_RING: Double
  /**
  			 * Used to identify the volume of audio streams for DTMF tones or beeps.
  			 */
  val AUDIO_TYPE_SIGNALLING: Double
  /**
  			 * Used to identify the volume of audio streams for voice calls.
  			 */
  val AUDIO_TYPE_VOICE: Double
  /**
  			 * Audio data is being buffered from the network.
  			 */
  val STATE_BUFFERING: Double
  /**
  			 * Audio playback is being initialized.
  			 */
  val STATE_INITIALIZED: Double
  /**
  			 * Playback is paused.
  			 */
  val STATE_PAUSED: Double
  /**
  			 * Audio playback is active.
  			 */
  val STATE_PLAYING: Double
  /**
  			 * Audio playback is starting.
  			 */
  val STATE_STARTING: Double
  /**
  			 * Audio playback is stopped.
  			 */
  val STATE_STOPPED: Double
  /**
  			 * Audio playback is stopping.
  			 */
  val STATE_STOPPING: Double
  /**
  			 * Player is waiting for audio data from the network.
  			 */
  val STATE_WAITING_FOR_DATA: Double
  /**
  			 * Player is waiting for audio data to fill the queue.
  			 */
  val STATE_WAITING_FOR_QUEUE: Double
  /**
  			 * Determines whether the audio should continue playing even when its activity is paused.
  			 */
  var allowBackground: Boolean
  /**
  			 * Changes the audio-stream-type.
  			 */
  var audioType: Double
  /**
  			 * Duration of the audio resource.
  			 */
  val duration: Double
  /**
  			 * Determines whether the audio should loop upon completion.
  			 */
  var looping: Boolean
  /**
  			 * Indicates if the audio is paused.
  			 */
  var paused: Boolean
  /**
  			 * Indicates if the audio is playing.
  			 */
  val playing: Boolean
  /**
  			 * Current playback position of the audio.
  			 */
  var time: Double
  /**
  			 * URL identifying the audio resource.
  			 */
  var url: String
  /**
  			 * Volume of the audio from 0.0 (muted) to 1.0 (loudest).
  			 */
  var volume: Double
  /**
  			 * Gets the value of the <Titanium.Media.Sound.audioType> property.
  			 */
  def getAudioType(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Sound.duration> property.
  			 */
  def getDuration(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Sound.time> property.
  			 */
  def getTime(): Double
  /**
  			 * Gets the value of the <Titanium.Media.Sound.url> property.
  			 */
  def getUrl(): String
  /**
  			 * Gets the value of the <Titanium.Media.Sound.volume> property.
  			 */
  def getVolume(): Double
  /**
  			 * Returns the value of the [looping](Titanium.Media.Sound.looping) property.
  			 */
  def isLooping(): Boolean
  /**
  			 * Returns the value of the [paused](Titanium.Media.Sound.paused) property.
  			 */
  def isPaused(): Boolean
  /**
  			 * Returns the value of the [playing](Titanium.Media.Sound.playing) property.
  			 */
  def isPlaying(): Boolean
  /**
  			 * Pauses the audio.
  			 */
  def pause(): Unit
  /**
  			 * Starting playing the sound, or resume playing a paused sound.
  			 */
  def play(): Unit
  /**
  			 * Releases all internal resources.
  			 */
  def release(): Unit
  /**
  			 * Resets the audio playback position to the beginning.
  			 */
  def reset(): Unit
  /**
  			 * Sets the value of the <Titanium.Media.Sound.audioType> property.
  			 */
  def setAudioType(audioType: Double): Unit
  /**
  			 * Sets the value of the [looping](Titanium.Media.Sound.looping) property.
  			 */
  def setLooping(looping: Boolean): Unit
  /**
  			 * Sets the value of the [paused](Titanium.Media.Sound.paused) property.
  			 */
  def setPaused(paused: Boolean): Unit
  /**
  			 * Sets the value of the <Titanium.Media.Sound.time> property.
  			 */
  def setTime(time: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.Sound.url> property.
  			 */
  def setUrl(url: String): Unit
  /**
  			 * Sets the value of the <Titanium.Media.Sound.volume> property.
  			 */
  def setVolume(volume: Double): Unit
  /**
  			 * Stops playing the audio and resets the playback position to the beginning of the clip.
  			 */
  def stop(): Unit
}

object Sound {
  @scala.inline
  def apply(
    AUDIO_TYPE_ALARM: Double,
    AUDIO_TYPE_MEDIA: Double,
    AUDIO_TYPE_NOTIFICATION: Double,
    AUDIO_TYPE_RING: Double,
    AUDIO_TYPE_SIGNALLING: Double,
    AUDIO_TYPE_VOICE: Double,
    STATE_BUFFERING: Double,
    STATE_INITIALIZED: Double,
    STATE_PAUSED: Double,
    STATE_PLAYING: Double,
    STATE_STARTING: Double,
    STATE_STOPPED: Double,
    STATE_STOPPING: Double,
    STATE_WAITING_FOR_DATA: Double,
    STATE_WAITING_FOR_QUEUE: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    allowBackground: Boolean,
    apiName: String,
    applyProperties: js.Any => Unit,
    audioType: Double,
    bubbleParent: Boolean,
    duration: Double,
    fireEvent: (String, js.Any) => Unit,
    getApiName: () => String,
    getAudioType: () => Double,
    getBubbleParent: () => Boolean,
    getDuration: () => Double,
    getTime: () => Double,
    getUrl: () => String,
    getVolume: () => Double,
    isLooping: () => Boolean,
    isPaused: () => Boolean,
    isPlaying: () => Boolean,
    looping: Boolean,
    pause: () => Unit,
    paused: Boolean,
    play: () => Unit,
    playing: Boolean,
    release: () => Unit,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    reset: () => Unit,
    setAudioType: Double => Unit,
    setBubbleParent: Boolean => Unit,
    setLooping: Boolean => Unit,
    setPaused: Boolean => Unit,
    setTime: Double => Unit,
    setUrl: String => Unit,
    setVolume: Double => Unit,
    stop: () => Unit,
    time: Double,
    url: String,
    volume: Double,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Sound = {
    val __obj = js.Dynamic.literal(AUDIO_TYPE_ALARM = AUDIO_TYPE_ALARM, AUDIO_TYPE_MEDIA = AUDIO_TYPE_MEDIA, AUDIO_TYPE_NOTIFICATION = AUDIO_TYPE_NOTIFICATION, AUDIO_TYPE_RING = AUDIO_TYPE_RING, AUDIO_TYPE_SIGNALLING = AUDIO_TYPE_SIGNALLING, AUDIO_TYPE_VOICE = AUDIO_TYPE_VOICE, STATE_BUFFERING = STATE_BUFFERING, STATE_INITIALIZED = STATE_INITIALIZED, STATE_PAUSED = STATE_PAUSED, STATE_PLAYING = STATE_PLAYING, STATE_STARTING = STATE_STARTING, STATE_STOPPED = STATE_STOPPED, STATE_STOPPING = STATE_STOPPING, STATE_WAITING_FOR_DATA = STATE_WAITING_FOR_DATA, STATE_WAITING_FOR_QUEUE = STATE_WAITING_FOR_QUEUE, addEventListener = js.Any.fromFunction2(addEventListener), allowBackground = allowBackground, apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), audioType = audioType, bubbleParent = bubbleParent, duration = duration, fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getAudioType = js.Any.fromFunction0(getAudioType), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getDuration = js.Any.fromFunction0(getDuration), getTime = js.Any.fromFunction0(getTime), getUrl = js.Any.fromFunction0(getUrl), getVolume = js.Any.fromFunction0(getVolume), isLooping = js.Any.fromFunction0(isLooping), isPaused = js.Any.fromFunction0(isPaused), isPlaying = js.Any.fromFunction0(isPlaying), looping = looping, pause = js.Any.fromFunction0(pause), paused = paused, play = js.Any.fromFunction0(play), playing = playing, release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction2(removeEventListener), reset = js.Any.fromFunction0(reset), setAudioType = js.Any.fromFunction1(setAudioType), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setLooping = js.Any.fromFunction1(setLooping), setPaused = js.Any.fromFunction1(setPaused), setTime = js.Any.fromFunction1(setTime), setUrl = js.Any.fromFunction1(setUrl), setVolume = js.Any.fromFunction1(setVolume), stop = js.Any.fromFunction0(stop), time = time, url = url, volume = volume)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Sound]
  }
}

