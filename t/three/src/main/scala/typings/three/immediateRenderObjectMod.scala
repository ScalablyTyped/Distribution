package typings.three

import typings.std.Float32Array
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object immediateRenderObjectMod {
  
  @JSImport("three/src/extras/objects/ImmediateRenderObject", "ImmediateRenderObject")
  @js.native
  class ImmediateRenderObject protected () extends Object3D {
    def this(material: Material) = this()
    
    /**
    	 * @default null
    	 */
    var colorArray: Null | Float32Array = js.native
    
    /**
    	 * @default 0
    	 */
    var count: Double = js.native
    
    /**
    	 * @default false
    	 */
    var hasColors: Boolean = js.native
    
    /**
    	 * @default false
    	 */
    var hasNormals: Boolean = js.native
    
    /**
    	 * @default false
    	 */
    var hasPositions: Boolean = js.native
    
    /**
    	 * @default false
    	 */
    var hasUvs: Boolean = js.native
    
    val isImmediateRenderObject: `true` = js.native
    
    var material: Material = js.native
    
    /**
    	 * @default null
    	 */
    var normalArray: Null | Float32Array = js.native
    
    /**
    	 * @default null
    	 */
    var positionArray: Null | Float32Array = js.native
    
    def render(renderCallback: js.Function): Unit = js.native
    
    /**
    	 * @default null
    	 */
    var uvArray: Null | Float32Array = js.native
  }
}
