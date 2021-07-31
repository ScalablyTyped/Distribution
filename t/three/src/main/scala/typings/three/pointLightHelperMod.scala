package typings.three

import typings.three.colorMod.Color
import typings.three.object3DMod.Object3D
import typings.three.pointLightMod.PointLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointLightHelperMod {
  
  @JSImport("three/src/helpers/PointLightHelper", "PointLightHelper")
  @js.native
  class PointLightHelper protected () extends Object3D {
    def this(light: PointLight) = this()
    def this(light: PointLight, sphereSize: Double) = this()
    def this(light: PointLight, sphereSize: Double, color: String) = this()
    def this(light: PointLight, sphereSize: Double, color: Double) = this()
    def this(light: PointLight, sphereSize: Double, color: Color) = this()
    def this(light: PointLight, sphereSize: Unit, color: String) = this()
    def this(light: PointLight, sphereSize: Unit, color: Double) = this()
    def this(light: PointLight, sphereSize: Unit, color: Color) = this()
    
    var color: js.UndefOr[Color | String | Double] = js.native
    
    def dispose(): Unit = js.native
    
    var light: PointLight = js.native
    
    def update(): Unit = js.native
  }
}
