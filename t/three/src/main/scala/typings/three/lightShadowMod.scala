package typings.three

import typings.three.cameraMod.Camera
import typings.three.lightMod.Light
import typings.three.matrix4Mod.Matrix4
import typings.three.vector2Mod.Vector2
import typings.three.vector4Mod.Vector4
import typings.three.webGLRenderListsMod.RenderTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightShadowMod {
  
  @JSImport("three/src/lights/LightShadow", "LightShadow")
  @js.native
  class LightShadow protected () extends StObject {
    def this(camera: Camera) = this()
    
    /**
    	 * @default true
    	 */
    var autoUpdate: Boolean = js.native
    
    /**
    	 * @default 0
    	 */
    var bias: Double = js.native
    
    var camera: Camera = js.native
    
    def clone(recursive: Boolean): this.type = js.native
    
    def copy(source: LightShadow): this.type = js.native
    
    def getFrameExtents(): Vector2 = js.native
    
    def getFrustum(): Double = js.native
    
    def getViewport(viewportIndex: Double): Vector4 = js.native
    
    /**
    	 * @default null
    	 */
    var map: RenderTarget = js.native
    
    /**
    	 * @default null
    	 */
    var mapPass: RenderTarget = js.native
    
    /**
    	 * @default new THREE.Vector2( 512, 512 )
    	 */
    var mapSize: Vector2 = js.native
    
    /**
    	 * @default new THREE.Matrix4()
    	 */
    var matrix: Matrix4 = js.native
    
    /**
    	 * @default false
    	 */
    var needsUpdate: Boolean = js.native
    
    /**
    	 * @default 0
    	 */
    var normalBias: Double = js.native
    
    /**
    	 * @default 1
    	 */
    var radius: Double = js.native
    
    def toJSON(): js.Any = js.native
    
    def updateMatrices(light: Light): Unit = js.native
    def updateMatrices(light: Light, viewportIndex: Double): Unit = js.native
  }
}
