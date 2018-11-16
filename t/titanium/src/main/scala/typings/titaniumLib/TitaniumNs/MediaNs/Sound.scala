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

