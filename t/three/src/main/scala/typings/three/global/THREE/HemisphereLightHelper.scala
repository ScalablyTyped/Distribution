package typings.three.global.THREE

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.HemisphereLightHelper")
@js.native
open class HemisphereLightHelper protected ()
  extends typings.three.mod.HemisphereLightHelper {
  /**
    *  Create a new instance of {@link HemisphereLightHelper}
    * @param light The light being visualized.
    * @param size Thr sphere size
    * @param color If this is not the set the helper will take the color of the light.
    */
  def this(light: typings.three.srcLightsHemisphereLightMod.HemisphereLight, size: Double) = this()
  def this(
    light: typings.three.srcLightsHemisphereLightMod.HemisphereLight,
    size: Double,
    color: ColorRepresentation
  ) = this()
}
