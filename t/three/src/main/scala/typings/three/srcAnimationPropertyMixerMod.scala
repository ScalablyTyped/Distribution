package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/animation/PropertyMixer", JSImport.Namespace)
@js.native
object srcAnimationPropertyMixerMod extends js.Object {
  @js.native
  class PropertyMixer protected () extends js.Object {
    def this(binding: js.Any, typeName: String, valueSize: Double) = this()
    var binding: js.Any = js.native
    var buffer: js.Any = js.native
    var cumulativeWeight: Double = js.native
    var referenceCount: Double = js.native
    var useCount: Double = js.native
    var valueSize: Double = js.native
    def accumulate(accuIndex: Double, weight: Double): Unit = js.native
    @JSName("apply")
    def apply(accuIndex: Double): Unit = js.native
    def restoreOriginalState(): Unit = js.native
    def saveOriginalState(): Unit = js.native
  }
  
}

