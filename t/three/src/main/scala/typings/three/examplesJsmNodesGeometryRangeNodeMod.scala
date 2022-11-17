package typings.three

import typings.three.srcThreeMod.Color
import typings.three.srcThreeMod.Vector2
import typings.three.srcThreeMod.Vector3
import typings.three.srcThreeMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesGeometryRangeNodeMod {
  
  @JSImport("three/examples/jsm/nodes/geometry/RangeNode", JSImport.Default)
  @js.native
  open class default protected () extends RangeNode {
    def this(min: RangeModeBound, max: RangeModeBound) = this()
  }
  
  type RangeModeBound = Double | Color | Vector2 | Vector3 | Vector4
  
  @js.native
  trait RangeNode
    extends typings.three.examplesJsmNodesCoreNodeMod.default {
    
    def getVectorLength(): Double = js.native
    
    var max: RangeModeBound = js.native
    
    var min: RangeModeBound = js.native
  }
}
