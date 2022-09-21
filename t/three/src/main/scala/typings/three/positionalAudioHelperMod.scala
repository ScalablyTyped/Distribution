package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.threeMod.Line
import typings.three.threeMod.PositionalAudio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionalAudioHelperMod {
  
  @JSImport("three/examples/jsm/helpers/PositionalAudioHelper", "PositionalAudioHelper")
  @js.native
  open class PositionalAudioHelper protected ()
    extends Line[BufferGeometry, Material | js.Array[Material]] {
    def this(audio: PositionalAudio) = this()
    def this(audio: PositionalAudio, range: Double) = this()
    def this(audio: PositionalAudio, range: Double, divisionsInnerAngle: Double) = this()
    def this(audio: PositionalAudio, range: Unit, divisionsInnerAngle: Double) = this()
    def this(audio: PositionalAudio, range: Double, divisionsInnerAngle: Double, divisionsOuterAngle: Double) = this()
    def this(audio: PositionalAudio, range: Double, divisionsInnerAngle: Unit, divisionsOuterAngle: Double) = this()
    def this(audio: PositionalAudio, range: Unit, divisionsInnerAngle: Double, divisionsOuterAngle: Double) = this()
    def this(audio: PositionalAudio, range: Unit, divisionsInnerAngle: Unit, divisionsOuterAngle: Double) = this()
    
    var audio: PositionalAudio = js.native
    
    def dispose(): Unit = js.native
    
    var divisionsInnerAngle: Double = js.native
    
    var divisionsOuterAngle: Double = js.native
    
    var range: Double = js.native
    
    def update(): Unit = js.native
  }
}
