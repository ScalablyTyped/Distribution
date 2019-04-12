package typings
package threeLib.srcAudioAudioListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/audio/AudioListener", "AudioListener")
@js.native
class AudioListener ()
  extends threeLib.srcCoreObject3DMod.Object3D {
  var context: stdLib.AudioContext = js.native
  var filter: scala.Null | js.Any = js.native
  var gain: stdLib.GainNode = js.native
  @JSName("type")
  var type_AudioListener: threeLib.threeLibStrings.AudioListener = js.native
  def getFilter(): js.Any = js.native
  def getInput(): stdLib.GainNode = js.native
  def getMasterVolume(): scala.Double = js.native
  def removeFilter(): scala.Unit = js.native
  def setFilter(value: js.Any): scala.Unit = js.native
  def setMasterVolume(value: scala.Double): scala.Unit = js.native
}

