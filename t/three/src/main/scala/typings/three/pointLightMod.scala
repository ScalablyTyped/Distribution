package typings.three

import typings.three.lightMod.Light
import typings.three.pointLightShadowMod.PointLightShadow
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointLightMod {
  
  @JSImport("three/src/lights/PointLight", "PointLight")
  @js.native
  open class PointLight () extends Light {
    def this(color: ColorRepresentation) = this()
    def this(color: Unit, intensity: Double) = this()
    def this(color: ColorRepresentation, intensity: Double) = this()
    def this(color: Unit, intensity: Double, distance: Double) = this()
    def this(color: Unit, intensity: Unit, distance: Double) = this()
    def this(color: ColorRepresentation, intensity: Double, distance: Double) = this()
    def this(color: ColorRepresentation, intensity: Unit, distance: Double) = this()
    def this(color: Unit, intensity: Double, distance: Double, decay: Double) = this()
    def this(color: Unit, intensity: Double, distance: Unit, decay: Double) = this()
    def this(color: Unit, intensity: Unit, distance: Double, decay: Double) = this()
    def this(color: Unit, intensity: Unit, distance: Unit, decay: Double) = this()
    def this(color: ColorRepresentation, intensity: Double, distance: Double, decay: Double) = this()
    def this(color: ColorRepresentation, intensity: Double, distance: Unit, decay: Double) = this()
    def this(color: ColorRepresentation, intensity: Unit, distance: Double, decay: Double) = this()
    def this(color: ColorRepresentation, intensity: Unit, distance: Unit, decay: Double) = this()
    
    /**
      * @default 1
      */
    var decay: Double = js.native
    
    /**
      * If non-zero, light will attenuate linearly from maximum intensity at light position down to zero at distance.
      * @default 0
      */
    var distance: Double = js.native
    
    var power: Double = js.native
    
    /**
      * @default new THREE.PointLightShadow()
      */
    @JSName("shadow")
    var shadow_PointLight: PointLightShadow = js.native
  }
}
