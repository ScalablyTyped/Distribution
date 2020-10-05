package typings.three

import typings.three.colorMod.Color
import typings.three.lightMod.Light
import typings.three.threeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/lights/HemisphereLight", JSImport.Namespace)
@js.native
object hemisphereLightMod extends js.Object {
  @js.native
  class HemisphereLight () extends Light {
    def this(skyColor: String) = this()
    def this(skyColor: Double) = this()
    def this(skyColor: Color) = this()
    def this(skyColor: js.UndefOr[scala.Nothing], groundColor: String) = this()
    def this(skyColor: js.UndefOr[scala.Nothing], groundColor: Double) = this()
    def this(skyColor: js.UndefOr[scala.Nothing], groundColor: Color) = this()
    def this(skyColor: String, groundColor: String) = this()
    def this(skyColor: String, groundColor: Double) = this()
    def this(skyColor: String, groundColor: Color) = this()
    def this(skyColor: Double, groundColor: String) = this()
    def this(skyColor: Double, groundColor: Double) = this()
    def this(skyColor: Double, groundColor: Color) = this()
    def this(skyColor: Color, groundColor: String) = this()
    def this(skyColor: Color, groundColor: Double) = this()
    def this(skyColor: Color, groundColor: Color) = this()
    def this(skyColor: js.UndefOr[scala.Nothing], groundColor: js.UndefOr[scala.Nothing], intensity: Double) = this()
    def this(skyColor: js.UndefOr[scala.Nothing], groundColor: String, intensity: Double) = this()
    def this(skyColor: js.UndefOr[scala.Nothing], groundColor: Double, intensity: Double) = this()
    def this(skyColor: js.UndefOr[scala.Nothing], groundColor: Color, intensity: Double) = this()
    def this(skyColor: String, groundColor: js.UndefOr[scala.Nothing], intensity: Double) = this()
    def this(skyColor: String, groundColor: String, intensity: Double) = this()
    def this(skyColor: String, groundColor: Double, intensity: Double) = this()
    def this(skyColor: String, groundColor: Color, intensity: Double) = this()
    def this(skyColor: Double, groundColor: js.UndefOr[scala.Nothing], intensity: Double) = this()
    def this(skyColor: Double, groundColor: String, intensity: Double) = this()
    def this(skyColor: Double, groundColor: Double, intensity: Double) = this()
    def this(skyColor: Double, groundColor: Color, intensity: Double) = this()
    def this(skyColor: Color, groundColor: js.UndefOr[scala.Nothing], intensity: Double) = this()
    def this(skyColor: Color, groundColor: String, intensity: Double) = this()
    def this(skyColor: Color, groundColor: Double, intensity: Double) = this()
    def this(skyColor: Color, groundColor: Color, intensity: Double) = this()
    var groundColor: Color = js.native
    val isHemisphereLight: `true` = js.native
    var skyColor: Color = js.native
  }
  
}

