package typings.titanium.Titanium.Media

import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.change
import typings.titanium.titaniumStrings.complete
import typings.titanium.titaniumStrings.error
import typings.titanium.titaniumStrings.interrupted
import typings.titanium.titaniumStrings.resume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object for playing basic audio resources.
		 */
@JSGlobal("Titanium.Media.Sound")
@js.native
class Sound () extends Proxy {
  /**
  			 * Used to identify the volume of audio streams for alarms.
  			 */
  val AUDIO_TYPE_ALARM: Double = js.native
  /**
  			 * Used to identify the volume of audio streams for media playback.
  			 */
  val AUDIO_TYPE_MEDIA: Double = js.native
  /**
  			 * Used to identify the volume of audio streams for notifications.
  			 */
  val AUDIO_TYPE_NOTIFICATION: Double = js.native
  /**
  			 * Used to identify the volume of audio streams for the phone ring.
  			 */
  val AUDIO_TYPE_RING: Double = js.native
  /**
  			 * Used to identify the volume of audio streams for DTMF tones or beeps.
  			 */
  val AUDIO_TYPE_SIGNALLING: Double = js.native
  /**
  			 * Used to identify the volume of audio streams for voice calls.
  			 */
  val AUDIO_TYPE_VOICE: Double = js.native
  /**
  			 * Audio data is being buffered from the network.
  			 */
  val STATE_BUFFERING: Double = js.native
  /**
  			 * Audio playback is being initialized.
  			 */
  val STATE_INITIALIZED: Double = js.native
  /**
  			 * Playback is paused.
  			 */
  val STATE_PAUSED: Double = js.native
  /**
  			 * Audio playback is active.
  			 */
  val STATE_PLAYING: Double = js.native
  /**
  			 * Audio playback is starting.
  			 */
  val STATE_STARTING: Double = js.native
  /**
  			 * Audio playback is stopped.
  			 */
  val STATE_STOPPED: Double = js.native
  /**
  			 * Audio playback is stopping.
  			 */
  val STATE_STOPPING: Double = js.native
  /**
  			 * Player is waiting for audio data from the network.
  			 */
  val STATE_WAITING_FOR_DATA: Double = js.native
  /**
  			 * Player is waiting for audio data to fill the queue.
  			 */
  val STATE_WAITING_FOR_QUEUE: Double = js.native
  /**
  			 * Determines whether the audio should continue playing even when its activity is paused.
  			 */
  var allowBackground: Boolean = js.native
  /**
  			 * Changes the audio-stream-type.
  			 */
  var audioType: Double = js.native
  /**
  			 * Duration of the audio resource.
  			 */
  val duration: Double = js.native
  /**
  			 * Determines whether the audio should loop upon completion.
  			 */
  var looping: Boolean = js.native
  /**
  			 * Indicates if the audio is paused.
  			 */
  var paused: Boolean = js.native
  /**
  			 * Indicates if the audio is playing.
  			 */
  val playing: Boolean = js.native
  /**
  			 * Current playback position of the audio.
  			 */
  var time: Double = js.native
  /**
  			 * URL identifying the audio resource.
  			 */
  var url: String = js.native
  /**
  			 * Volume of the audio from 0.0 (muted) to 1.0 (loudest).
  			 */
  var volume: Double = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  @JSName("addEventListener")
  def addEventListener_change(name: change, callback: js.ThisFunction1[/* this */ this.type, /* event */ SoundChangeEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(
    name: complete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SoundCompleteEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(name: error, callback: js.ThisFunction1[/* this */ this.type, /* event */ SoundErrorEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_interrupted(
    name: interrupted,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SoundInterruptedEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(name: resume, callback: js.ThisFunction1[/* this */ this.type, /* event */ SoundResumeEvent, Unit]): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: SoundChangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_complete(name: complete): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_complete(name: complete, event: SoundCompleteEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_error(name: error): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_error(name: error, event: SoundErrorEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_interrupted(name: interrupted): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_interrupted(name: interrupted, event: SoundInterruptedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resume(name: resume): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_resume(name: resume, event: SoundResumeEvent): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.Media.Sound.audioType> property.
  			 * @deprecated Access <Titanium.Media.Sound.audioType> instead.
  			 */
  def getAudioType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.Sound.duration> property.
  			 * @deprecated Access <Titanium.Media.Sound.duration> instead.
  			 */
  def getDuration(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.Sound.time> property.
  			 * @deprecated Access <Titanium.Media.Sound.time> instead.
  			 */
  def getTime(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.Media.Sound.url> property.
  			 * @deprecated Access <Titanium.Media.Sound.url> instead.
  			 */
  def getUrl(): String = js.native
  /**
  			 * Gets the value of the <Titanium.Media.Sound.volume> property.
  			 * @deprecated Access <Titanium.Media.Sound.volume> instead.
  			 */
  def getVolume(): Double = js.native
  /**
  			 * Returns the value of the [looping](Titanium.Media.Sound.looping) property.
  			 */
  def isLooping(): Boolean = js.native
  /**
  			 * Returns the value of the [paused](Titanium.Media.Sound.paused) property.
  			 */
  def isPaused(): Boolean = js.native
  /**
  			 * Returns the value of the [playing](Titanium.Media.Sound.playing) property.
  			 */
  def isPlaying(): Boolean = js.native
  /**
  			 * Pauses the audio.
  			 */
  def pause(): Unit = js.native
  /**
  			 * Starting playing the sound, or resume playing a paused sound.
  			 */
  def play(): Unit = js.native
  /**
  			 * Releases all internal resources.
  			 */
  def release(): Unit = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  @JSName("removeEventListener")
  def removeEventListener_change(name: change, callback: js.ThisFunction1[/* this */ this.type, /* event */ SoundChangeEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_complete(
    name: complete,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SoundCompleteEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(name: error, callback: js.ThisFunction1[/* this */ this.type, /* event */ SoundErrorEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_interrupted(
    name: interrupted,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SoundInterruptedEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(name: resume, callback: js.ThisFunction1[/* this */ this.type, /* event */ SoundResumeEvent, Unit]): Unit = js.native
  /**
  			 * Resets the audio playback position to the beginning.
  			 */
  def reset(): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.Sound.audioType> property.
  			 * @deprecated Set the value using <Titanium.Media.Sound.audioType> instead.
  			 */
  def setAudioType(audioType: Double): Unit = js.native
  /**
  			 * Sets the value of the [looping](Titanium.Media.Sound.looping) property.
  			 */
  def setLooping(looping: Boolean): Unit = js.native
  /**
  			 * Sets the value of the [paused](Titanium.Media.Sound.paused) property.
  			 */
  def setPaused(paused: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.Sound.time> property.
  			 * @deprecated Set the value using <Titanium.Media.Sound.time> instead.
  			 */
  def setTime(time: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.Sound.url> property.
  			 * @deprecated Set the value using <Titanium.Media.Sound.url> instead.
  			 */
  def setUrl(url: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.Media.Sound.volume> property.
  			 * @deprecated Set the value using <Titanium.Media.Sound.volume> instead.
  			 */
  def setVolume(volume: Double): Unit = js.native
  /**
  			 * Stops playing the audio and resets the playback position to the beginning of the clip.
  			 */
  def stop(): Unit = js.native
}

