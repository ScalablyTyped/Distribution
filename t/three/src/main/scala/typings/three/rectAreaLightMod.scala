package typings.three

import typings.three.lightMod.Light
import typings.three.threeBooleans.`true`
import typings.three.utilsMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectAreaLightMod {
  
  @JSImport("three/src/lights/RectAreaLight", "RectAreaLight")
  @js.native
  open class RectAreaLight () extends Light {
    def this(color: ColorRepresentation) = this()
    def this(color: Unit, intensity: Double) = this()
    def this(color: ColorRepresentation, intensity: Double) = this()
    def this(color: Unit, intensity: Double, width: Double) = this()
    def this(color: Unit, intensity: Unit, width: Double) = this()
    def this(color: ColorRepresentation, intensity: Double, width: Double) = this()
    def this(color: ColorRepresentation, intensity: Unit, width: Double) = this()
    def this(color: Unit, intensity: Double, width: Double, height: Double) = this()
    def this(color: Unit, intensity: Double, width: Unit, height: Double) = this()
    def this(color: Unit, intensity: Unit, width: Double, height: Double) = this()
    def this(color: Unit, intensity: Unit, width: Unit, height: Double) = this()
    def this(color: ColorRepresentation, intensity: Double, width: Double, height: Double) = this()
    def this(color: ColorRepresentation, intensity: Double, width: Unit, height: Double) = this()
    def this(color: ColorRepresentation, intensity: Unit, width: Double, height: Double) = this()
    def this(color: ColorRepresentation, intensity: Unit, width: Unit, height: Double) = this()
    
    /**
      * @default 10
      */
    var height: Double = js.native
    
    val isRectAreaLight: `true` = js.native
    
    var power: Double = js.native
    
    /**
      * @default 10
      */
    var width: Double = js.native
  }
}
