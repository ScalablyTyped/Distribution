package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeNodeMod {
  
  @JSImport("three/examples/jsm/nodes/geometry/RangeNode", JSImport.Default)
  @js.native
  open class default protected () extends RangeNode {
    def this(min: RangeModeBound, max: RangeModeBound) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.three.threeMod.Color
    - typings.three.threeMod.Vector2
    - typings.three.threeMod.Vector3
    - typings.three.threeMod.Vector4
  */
  type RangeModeBound = _RangeModeBound | Double
  
  @js.native
  trait RangeNode
    extends typings.three.nodeMod.default {
    
    def getVectorLength(): Double = js.native
    
    var max: RangeModeBound = js.native
    
    var min: RangeModeBound = js.native
  }
  
  trait _RangeModeBound extends StObject
}
