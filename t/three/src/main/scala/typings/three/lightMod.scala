package typings.three

import typings.three.colorMod.Color
import typings.three.eventDispatcherMod.Event
import typings.three.lightShadowMod.LightShadow
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightMod {
  
  @JSImport("three/src/lights/Light", "Light")
  @js.native
  open class Light () extends Object3D[Event] {
    def this(hex: String) = this()
    def this(hex: Double) = this()
    def this(hex: String, intensity: Double) = this()
    def this(hex: Double, intensity: Double) = this()
    def this(hex: Unit, intensity: Double) = this()
    
    var color: Color = js.native
    
    def dispose(): Unit = js.native
    
    /**
      * @default 1
      */
    var intensity: Double = js.native
    
    val isLight: `true` = js.native
    
    var shadow: LightShadow = js.native
    
    /**
      * @deprecated Use shadow.bias instead.
      */
    var shadowBias: Any = js.native
    
    /**
      * @deprecated Use shadow.camera.bottom instead.
      */
    var shadowCameraBottom: Any = js.native
    
    /**
      * @deprecated Use shadow.camera.far instead.
      */
    var shadowCameraFar: Any = js.native
    
    /**
      * @deprecated Use shadow.camera.fov instead.
      */
    var shadowCameraFov: Any = js.native
    
    /**
      * @deprecated Use shadow.camera.left instead.
      */
    var shadowCameraLeft: Any = js.native
    
    /**
      * @deprecated Use shadow.camera.near instead.
      */
    var shadowCameraNear: Any = js.native
    
    /**
      * @deprecated Use shadow.camera.right instead.
      */
    var shadowCameraRight: Any = js.native
    
    /**
      * @deprecated Use shadow.camera.top instead.
      */
    var shadowCameraTop: Any = js.native
    
    /**
      * @deprecated Use shadow.mapSize.height instead.
      */
    var shadowMapHeight: Any = js.native
    
    /**
      * @deprecated Use shadow.mapSize.width instead.
      */
    var shadowMapWidth: Any = js.native
  }
}
