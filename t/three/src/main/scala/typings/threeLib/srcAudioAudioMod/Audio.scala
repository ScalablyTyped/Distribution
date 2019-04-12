package typings
package threeLib.srcAudioAudioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/audio/Audio", "Audio")
@js.native
class Audio protected ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  def this(listener: threeLib.srcAudioAudioListenerMod.AudioListener) = this()
  var autoplay: scala.Boolean = js.native
  var buffer: scala.Null | Audio = js.native
  var context: stdLib.AudioContext = js.native
  var detune: scala.Double = js.native
  var filters: js.Array[_] = js.native
  var gain: stdLib.GainNode = js.native
  var hasPlaybackControl: scala.Boolean = js.native
  var isPlaying: scala.Boolean = js.native
  var loop: scala.Boolean = js.native
  var offset: scala.Double = js.native
  var playbackRate: scala.Double = js.native
  var source: stdLib.AudioBufferSourceNode = js.native
  var sourceType: java.lang.String = js.native
  var startTime: scala.Double = js.native
  @JSName("type")
  var type_Audio: threeLib.threeLibStrings.Audio = js.native
  def connect(): this.type = js.native
  def disconnect(): this.type = js.native
  def getDetune(): scala.Double = js.native
  def getFilter(): js.Any = js.native
  def getFilters(): js.Array[_] = js.native
  def getLoop(): scala.Boolean = js.native
  def getOutput(): stdLib.GainNode = js.native
  def getPlaybackRate(): scala.Double = js.native
  def getVolume(): scala.Double = js.native
  /**
  	 * @deprecated Use {@link AudioLoader} instead.
  	 */
  def load(file: java.lang.String): Audio = js.native
  def onEnded(): scala.Unit = js.native
  def pause(): this.type = js.native
  def play(): this.type = js.native
  def setBuffer(audioBuffer: AudioBuffer): this.type = js.native
  def setDetune(value: scala.Double): this.type = js.native
  def setFilter(filter: js.Any): this.type = js.native
  def setFilter(value: js.Array[_]): this.type = js.native
  def setLoop(value: scala.Boolean): scala.Unit = js.native
  def setMediaElementSource(mediaElement: stdLib.MediaElementAudioSourceNode): this.type = js.native
  def setNodeSource(audioNode: stdLib.AudioBufferSourceNode): this.type = js.native
  def setPlaybackRate(value: scala.Double): this.type = js.native
  def setVolume(value: scala.Double): this.type = js.native
  def stop(): this.type = js.native
}

