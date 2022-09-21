package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertyMixerMod {
  
  @JSImport("three/src/animation/PropertyMixer", "PropertyMixer")
  @js.native
  open class PropertyMixer protected () extends StObject {
    def this(binding: Any, typeName: String, valueSize: Double) = this()
    
    def accumulate(accuIndex: Double, weight: Double): Unit = js.native
    
    def accumulateAdditive(weight: Double): Unit = js.native
    
    @JSName("apply")
    def apply(accuIndex: Double): Unit = js.native
    
    var binding: Any = js.native
    
    var buffer: Any = js.native
    
    var cumulativeWeight: Double = js.native
    
    var cumulativeWeightAdditive: Double = js.native
    
    var referenceCount: Double = js.native
    
    def restoreOriginalState(): Unit = js.native
    
    def saveOriginalState(): Unit = js.native
    
    var useCount: Double = js.native
    
    var valueSize: Double = js.native
  }
}
