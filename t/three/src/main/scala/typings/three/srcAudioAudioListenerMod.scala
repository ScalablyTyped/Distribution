package typings.three

import typings.std.AudioContext
import typings.std.GainNode
import typings.three.srcCoreObject3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/audio/AudioListener", JSImport.Namespace)
@js.native
object srcAudioAudioListenerMod extends js.Object {
  @js.native
  class AudioListener () extends Object3D {
    var context: AudioContext = js.native
    var filter: Null | js.Any = js.native
    var gain: GainNode = js.native
    @JSName("type")
    var type_AudioListener: typings.three.threeStrings.AudioListener = js.native
    def getFilter(): js.Any = js.native
    def getInput(): GainNode = js.native
    def getMasterVolume(): Double = js.native
    def removeFilter(): Unit = js.native
    def setFilter(value: js.Any): Unit = js.native
    def setMasterVolume(value: Double): Unit = js.native
  }
  
}

