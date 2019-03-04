package typings
package titaniumLib.TitaniumNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object for playing basic audio resources.
		 */
trait Sound
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Used to identify the volume of audio streams for alarms.
  			 */
  val AUDIO_TYPE_ALARM: scala.Double
  /**
  			 * Used to identify the volume of audio streams for media playback.
  			 */
  val AUDIO_TYPE_MEDIA: scala.Double
  /**
  			 * Used to identify the volume of audio streams for notifications.
  			 */
  val AUDIO_TYPE_NOTIFICATION: scala.Double
  /**
  			 * Used to identify the volume of audio streams for the phone ring.
  			 */
  val AUDIO_TYPE_RING: scala.Double
  /**
  			 * Used to identify the volume of audio streams for DTMF tones or beeps.
  			 */
  val AUDIO_TYPE_SIGNALLING: scala.Double
  /**
  			 * Used to identify the volume of audio streams for voice calls.
  			 */
  val AUDIO_TYPE_VOICE: scala.Double
  /**
  			 * Audio data is being buffered from the network.
  			 */
  val STATE_BUFFERING: scala.Double
  /**
  			 * Audio playback is being initialized.
  			 */
  val STATE_INITIALIZED: scala.Double
  /**
  			 * Playback is paused.
  			 */
  val STATE_PAUSED: scala.Double
  /**
  			 * Audio playback is active.
  			 */
  val STATE_PLAYING: scala.Double
  /**
  			 * Audio playback is starting.
  			 */
  val STATE_STARTING: scala.Double
  /**
  			 * Audio playback is stopped.
  			 */
  val STATE_STOPPED: scala.Double
  /**
  			 * Audio playback is stopping.
  			 */
  val STATE_STOPPING: scala.Double
  /**
  			 * Player is waiting for audio data from the network.
  			 */
  val STATE_WAITING_FOR_DATA: scala.Double
  /**
  			 * Player is waiting for audio data to fill the queue.
  			 */
  val STATE_WAITING_FOR_QUEUE: scala.Double
  /**
  			 * Determines whether the audio should continue playing even when its activity is paused.
  			 */
  var allowBackground: scala.Boolean
  /**
  			 * Changes the audio-stream-type.
  			 */
  var audioType: scala.Double
  /**
  			 * Duration of the audio resource.
  			 */
  val duration: scala.Double
  /**
  			 * Determines whether the audio should loop upon completion.
  			 */
  var looping: scala.Boolean
  /**
  			 * Indicates if the audio is paused.
  			 */
  var paused: scala.Boolean
  /**
  			 * Indicates if the audio is playing.
  			 */
  val playing: scala.Boolean
  /**
  			 * Current playback position of the audio.
  			 */
  var time: scala.Double
  /**
  			 * URL identifying the audio resource.
  			 */
  var url: java.lang.String
  /**
  			 * Volume of the audio from 0.0 (muted) to 1.0 (loudest).
  			 */
  var volume: scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Sound.audioType> property.
  			 */
  def getAudioType(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Sound.duration> property.
  			 */
  def getDuration(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Sound.time> property.
  			 */
  def getTime(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Media.Sound.url> property.
  			 */
  def getUrl(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Media.Sound.volume> property.
  			 */
  def getVolume(): scala.Double
  /**
  			 * Returns the value of the [looping](Titanium.Media.Sound.looping) property.
  			 */
  def isLooping(): scala.Boolean
  /**
  			 * Returns the value of the [paused](Titanium.Media.Sound.paused) property.
  			 */
  def isPaused(): scala.Boolean
  /**
  			 * Returns the value of the [playing](Titanium.Media.Sound.playing) property.
  			 */
  def isPlaying(): scala.Boolean
  /**
  			 * Pauses the audio.
  			 */
  def pause(): scala.Unit
  /**
  			 * Starting playing the sound, or resume playing a paused sound.
  			 */
  def play(): scala.Unit
  /**
  			 * Releases all internal resources.
  			 */
  def release(): scala.Unit
  /**
  			 * Resets the audio playback position to the beginning.
  			 */
  def reset(): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.Sound.audioType> property.
  			 */
  def setAudioType(audioType: scala.Double): scala.Unit
  /**
  			 * Sets the value of the [looping](Titanium.Media.Sound.looping) property.
  			 */
  def setLooping(looping: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the [paused](Titanium.Media.Sound.paused) property.
  			 */
  def setPaused(paused: scala.Boolean): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.Sound.time> property.
  			 */
  def setTime(time: scala.Double): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.Sound.url> property.
  			 */
  def setUrl(url: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.Media.Sound.volume> property.
  			 */
  def setVolume(volume: scala.Double): scala.Unit
  /**
  			 * Stops playing the audio and resets the playback position to the beginning of the clip.
  			 */
  def stop(): scala.Unit
}

object Sound {
  @scala.inline
  def apply(
    AUDIO_TYPE_ALARM: scala.Double,
    AUDIO_TYPE_MEDIA: scala.Double,
    AUDIO_TYPE_NOTIFICATION: scala.Double,
    AUDIO_TYPE_RING: scala.Double,
    AUDIO_TYPE_SIGNALLING: scala.Double,
    AUDIO_TYPE_VOICE: scala.Double,
    STATE_BUFFERING: scala.Double,
    STATE_INITIALIZED: scala.Double,
    STATE_PAUSED: scala.Double,
    STATE_PLAYING: scala.Double,
    STATE_STARTING: scala.Double,
    STATE_STOPPED: scala.Double,
    STATE_STOPPING: scala.Double,
    STATE_WAITING_FOR_DATA: scala.Double,
    STATE_WAITING_FOR_QUEUE: scala.Double,
    addEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    allowBackground: scala.Boolean,
    apiName: java.lang.String,
    applyProperties: js.Function1[js.Any, scala.Unit],
    audioType: scala.Double,
    bubbleParent: scala.Boolean,
    duration: scala.Double,
    fireEvent: js.Function2[java.lang.String, js.Any, scala.Unit],
    getApiName: js.Function0[java.lang.String],
    getAudioType: js.Function0[scala.Double],
    getBubbleParent: js.Function0[scala.Boolean],
    getDuration: js.Function0[scala.Double],
    getTime: js.Function0[scala.Double],
    getUrl: js.Function0[java.lang.String],
    getVolume: js.Function0[scala.Double],
    isLooping: js.Function0[scala.Boolean],
    isPaused: js.Function0[scala.Boolean],
    isPlaying: js.Function0[scala.Boolean],
    looping: scala.Boolean,
    pause: js.Function0[scala.Unit],
    paused: scala.Boolean,
    play: js.Function0[scala.Unit],
    playing: scala.Boolean,
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* param0 */ js.Any, _], scala.Unit],
    reset: js.Function0[scala.Unit],
    setAudioType: js.Function1[scala.Double, scala.Unit],
    setBubbleParent: js.Function1[scala.Boolean, scala.Unit],
    setLooping: js.Function1[scala.Boolean, scala.Unit],
    setPaused: js.Function1[scala.Boolean, scala.Unit],
    setTime: js.Function1[scala.Double, scala.Unit],
    setUrl: js.Function1[java.lang.String, scala.Unit],
    setVolume: js.Function1[scala.Double, scala.Unit],
    stop: js.Function0[scala.Unit],
    time: scala.Double,
    url: java.lang.String,
    volume: scala.Double,
    getLifecycleContainer: js.Function0[titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup] = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Sound = {
    val __obj = js.Dynamic.literal(AUDIO_TYPE_ALARM = AUDIO_TYPE_ALARM, AUDIO_TYPE_MEDIA = AUDIO_TYPE_MEDIA, AUDIO_TYPE_NOTIFICATION = AUDIO_TYPE_NOTIFICATION, AUDIO_TYPE_RING = AUDIO_TYPE_RING, AUDIO_TYPE_SIGNALLING = AUDIO_TYPE_SIGNALLING, AUDIO_TYPE_VOICE = AUDIO_TYPE_VOICE, STATE_BUFFERING = STATE_BUFFERING, STATE_INITIALIZED = STATE_INITIALIZED, STATE_PAUSED = STATE_PAUSED, STATE_PLAYING = STATE_PLAYING, STATE_STARTING = STATE_STARTING, STATE_STOPPED = STATE_STOPPED, STATE_STOPPING = STATE_STOPPING, STATE_WAITING_FOR_DATA = STATE_WAITING_FOR_DATA, STATE_WAITING_FOR_QUEUE = STATE_WAITING_FOR_QUEUE, addEventListener = addEventListener, allowBackground = allowBackground, apiName = apiName, applyProperties = applyProperties, audioType = audioType, bubbleParent = bubbleParent, duration = duration, fireEvent = fireEvent, getApiName = getApiName, getAudioType = getAudioType, getBubbleParent = getBubbleParent, getDuration = getDuration, getTime = getTime, getUrl = getUrl, getVolume = getVolume, isLooping = isLooping, isPaused = isPaused, isPlaying = isPlaying, looping = looping, pause = pause, paused = paused, play = play, playing = playing, release = release, removeEventListener = removeEventListener, reset = reset, setAudioType = setAudioType, setBubbleParent = setBubbleParent, setLooping = setLooping, setPaused = setPaused, setTime = setTime, setUrl = setUrl, setVolume = setVolume, stop = stop, time = time, url = url, volume = volume)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(getLifecycleContainer)
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Sound]
  }
}

