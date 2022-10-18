package typings.three

import typings.three.srcThreeMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmModifiersTessellateModifierMod {
  
  @JSImport("three/examples/jsm/modifiers/TessellateModifier", "TessellateModifier")
  @js.native
  open class TessellateModifier () extends StObject {
    def this(maxEdgeLength: Double) = this()
    def this(maxEdgeLength: Double, maxIterations: Double) = this()
    def this(maxEdgeLength: Unit, maxIterations: Double) = this()
    
    var maxEdgeLength: Double = js.native
    
    var maxIterations: Double = js.native
    
    def modify[TGeometry /* <: BufferGeometry */](geometry: TGeometry): TGeometry = js.native
  }
}
