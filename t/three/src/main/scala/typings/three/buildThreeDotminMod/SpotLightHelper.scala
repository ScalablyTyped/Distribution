package typings.three.buildThreeDotminMod

import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/build/three.min", "SpotLightHelper")
@js.native
open class SpotLightHelper protected ()
  extends typings.three.srcThreeMod.SpotLightHelper {
  /**
    * Create a new instance of {@link SpotLightHelper}
    * @param light The {@link THREE.SpotLight | SpotLight} to be visualized.
    * @param color If this is not the set the helper will take the color of the light. Default `light.color`
    */
  def this(light: typings.three.srcLightsLightMod.Light[
        js.UndefOr[
          typings.three.srcLightsLightShadowMod.LightShadow[typings.three.srcCamerasCameraMod.Camera]
        ]
      ]) = this()
  def this(
    light: typings.three.srcLightsLightMod.Light[
        js.UndefOr[
          typings.three.srcLightsLightShadowMod.LightShadow[typings.three.srcCamerasCameraMod.Camera]
        ]
      ],
    color: ColorRepresentation
  ) = this()
}
