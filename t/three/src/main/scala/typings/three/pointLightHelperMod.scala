package typings.three

import typings.three.colorMod.Color
import typings.three.object3DMod.Object3D
import typings.three.pointLightMod.PointLight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/helpers/PointLightHelper", JSImport.Namespace)
@js.native
object pointLightHelperMod extends js.Object {
  
  @js.native
  class PointLightHelper protected () extends Object3D {
    def this(light: PointLight) = this()
    def this(light: PointLight, sphereSize: Double) = this()
    def this(light: PointLight, sphereSize: js.UndefOr[scala.Nothing], color: String) = this()
    def this(light: PointLight, sphereSize: js.UndefOr[scala.Nothing], color: Double) = this()
    def this(light: PointLight, sphereSize: js.UndefOr[scala.Nothing], color: Color) = this()
    def this(light: PointLight, sphereSize: Double, color: String) = this()
    def this(light: PointLight, sphereSize: Double, color: Double) = this()
    def this(light: PointLight, sphereSize: Double, color: Color) = this()
    
    var color: js.UndefOr[Color | String | Double] = js.native
    
    def dispose(): Unit = js.native
    
    var light: PointLight = js.native
    
    def update(): Unit = js.native
  }
}
