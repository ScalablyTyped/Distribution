package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.colorMod.Color
import typings.three.geometryMod.Geometry
import typings.three.lightMod.Light
import typings.three.lineSegmentsMod.LineSegments
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/helpers/SpotLightHelper", JSImport.Namespace)
@js.native
object spotLightHelperMod extends js.Object {
  
  @js.native
  class SpotLightHelper protected () extends Object3D {
    def this(light: Light) = this()
    def this(light: Light, color: String) = this()
    def this(light: Light, color: Double) = this()
    def this(light: Light, color: Color) = this()
    
    var color: js.UndefOr[Color | String | Double] = js.native
    
    var cone: LineSegments[Geometry | BufferGeometry, Material | js.Array[Material]] = js.native
    
    def dispose(): Unit = js.native
    
    var light: Light = js.native
    
    def update(): Unit = js.native
  }
}
