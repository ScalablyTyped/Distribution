package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.colorMod.Color
import typings.three.directionalLightMod.DirectionalLight
import typings.three.geometryMod.Geometry
import typings.three.lineMod.Line
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionalLightHelperMod {
  
  @JSImport("three/src/helpers/DirectionalLightHelper", "DirectionalLightHelper")
  @js.native
  class DirectionalLightHelper protected () extends Object3D {
    /**
    	 * @param light
    	 * @param [size=1]
    	 * @param color
    	 */
    def this(light: DirectionalLight) = this()
    def this(light: DirectionalLight, size: Double) = this()
    def this(light: DirectionalLight, size: js.UndefOr[scala.Nothing], color: String) = this()
    def this(light: DirectionalLight, size: js.UndefOr[scala.Nothing], color: Double) = this()
    def this(light: DirectionalLight, size: js.UndefOr[scala.Nothing], color: Color) = this()
    def this(light: DirectionalLight, size: Double, color: String) = this()
    def this(light: DirectionalLight, size: Double, color: Double) = this()
    def this(light: DirectionalLight, size: Double, color: Color) = this()
    
    /**
    	 * @default undefined
    	 */
    var color: js.UndefOr[Color | String | Double] = js.native
    
    def dispose(): Unit = js.native
    
    var light: DirectionalLight = js.native
    
    var lightPlane: Line[Geometry | BufferGeometry, Material | js.Array[Material]] = js.native
    
    var targetLine: Line[Geometry | BufferGeometry, Material | js.Array[Material]] = js.native
    
    def update(): Unit = js.native
  }
}
