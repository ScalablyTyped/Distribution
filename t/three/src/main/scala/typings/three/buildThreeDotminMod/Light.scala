package typings.three.buildThreeDotminMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("three/build/three.min", "Light")
@js.native
/**
  * Creates a new {@link Light}
  * @remarks
  * **Note** that this is not intended to be called directly (use one of derived classes instead).
  * @param color Hexadecimal color of the light. Default `0xffffff` _(white)_.
  * @param intensity Numeric value of the light's strength/intensity. Expects a `Float`. Default `1`.
  */
open class Light[TShadowSupport /* <: js.UndefOr[
typings.three.srcLightsLightShadowMod.LightShadow[typings.three.srcCamerasCameraMod.Camera]] */] ()
  extends typings.three.srcThreeMod.Light[TShadowSupport] {
  def this(color: ColorRepresentation) = this()
  def this(color: Unit, intensity: Double) = this()
  def this(color: ColorRepresentation, intensity: Double) = this()
}
