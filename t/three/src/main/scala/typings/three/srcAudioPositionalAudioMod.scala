package typings.three

import typings.std.PannerNode
import typings.three.srcAudioAudioListenerMod.AudioListener
import typings.three.srcAudioAudioMod.Audio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/audio/PositionalAudio", JSImport.Namespace)
@js.native
object srcAudioPositionalAudioMod extends js.Object {
  @js.native
  class PositionalAudio protected () extends Audio {
    def this(listener: AudioListener) = this()
    var panner: PannerNode = js.native
    def getDistanceModel(): String = js.native
    def getMaxDistance(): Double = js.native
    def getRefDistance(): Double = js.native
    def getRolloffFactor(): Double = js.native
    def setDirectionalCone(coneInnerAngle: Double, coneOuterAngle: Double, coneOuterGain: Double): this.type = js.native
    def setDistanceModel(value: String): this.type = js.native
    def setMaxDistance(value: Double): this.type = js.native
    def setRefDistance(value: Double): this.type = js.native
    def setRolloffFactor(value: Double): this.type = js.native
  }
  
}

