package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsLightMod.Light
import typings.three.srcLightsSpotLightShadowMod.SpotLightShadow
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.srcTexturesTextureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsSpotLightMod {
  
  @JSImport("three/src/lights/SpotLight", "SpotLight")
  @js.native
  open class SpotLight protected () extends Light[SpotLightShadow] {
    /**
      * Creates a new SpotLight.
      * @param color Hexadecimal color of the light. Default `0xffffff` _(white)_.
      * @param intensity Numeric value of the light's strength/intensity. Expects a `Float`. Default `1`.
      * @param distance Maximum range of the light. Default is 0 (no limit). Expects a `Float`.
      * @param angle Maximum angle of light dispersion from its direction whose upper bound is Math.PI/2.
      * @param penumbra Percent of the {@link SpotLight} cone that is attenuated due to penumbra. Takes values between zero and 1. Expects a `Float`. Default `0`.
      * @param decay The amount the light dims along the distance of the light. Expects a `Float`. Default `2`.
      */
    def this(
      color: js.UndefOr[ColorRepresentation],
      intensity: js.UndefOr[Double],
      distance: js.UndefOr[Double],
      angle: js.UndefOr[Double],
      penumbra: js.UndefOr[Double],
      decay: js.UndefOr[Double]
    ) = this()
    
    /**
      * Maximum extent of the spotlight, in radians, from its direction.
      * @remarks Should be no more than `Math.PI/2`.
      * @remarks Expects a `Float`
      * @defaultValue `Math.PI / 3`
      */
    var angle: Double = js.native
    
    /**
      * The amount the light dims along the distance of the light.
      * In **{@link WebGLRenderer.physicallyCorrectLights | physically correct} rendering mode** — the default value should not be changed.
      * @remarks Expects a `Float`
      * @defaultValue `2`
      */
    var decay: Double = js.native
    
    /**
      * When **Default mode** — When distance is zero, light does not attenuate. When distance is non-zero,
      * light will attenuate linearly from maximum intensity at the light's position down to zero at this distance from the light.
      *
      * When **{@link WebGLRenderer.physicallyCorrectLights | Physically correct} rendering mode** — When distance is zero,
      * light will attenuate according to inverse-square law to infinite distance.
      * When distance is non-zero, light will attenuate according to inverse-square law until near the distance cutoff,
      * where it will then attenuate quickly and smoothly to `0`. Inherently, cutoffs are not physically correct.
      * @remarks Expects a `Float`
      * @defaultValue `0.0`
      */
    var distance: Double = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link SpotLight}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isSpotLight: `true` = js.native
    
    /**
      * A {@link THREE.Texture | Texture} used to modulate the color of the light.
      * The spot light color is mixed with the _RGB_ value of this texture, with a ratio corresponding to its alpha value.
      * The cookie-like masking effect is reproduced using pixel values (0, 0, 0, 1-cookie_value).
      * @remarks **Warning**: {@link SpotLight.map} is disabled if {@link SpotLight.castShadow} is `false`.
      */
    var map: Texture | Null = js.native
    
    /**
      * Percent of the {@link SpotLight} cone that is attenuated due to penumbra.
      * @remarks Takes values between zero and 1.
      * @remarks Expects a `Float`
      * @defaultValue `0.0`
      */
    var penumbra: Double = js.native
    
    /**
      * The light's power.
      * @remarks Changing the power will also change the light's intensity.
      * In **{@link WebGLRenderer.physicallyCorrectLights | physically correct} rendering mode** —  power is the luminous power of the light measured in lumens (lm).
      * @remarks Expects a `Float`
      */
    var power: Double = js.native
    
    /**
      * The {@link SpotLight} points from its {@link SpotLight.position | position} to target.position.
      * @remarks
      * **Note**: For the target's position to be changed to anything other than the default,
      * it must be added to the {@link Scene | scene} using
      *
      * ```typescript
      * scene.add( light.target );
      * ```
      *
      * This is so that the target's {@link Object3D.matrixWorld | matrixWorld} gets automatically updated each frame.
      * It is also possible to set the target to be another object in the scene (anything with a {@link THREE.Object3D.position | position} property), like so:
      * ```typescript
      * const targetObject = new THREE.Object3D();
      * scene.add(targetObject);
      * light.target = targetObject;
      * ```
      * The {@link SpotLight} will now track the target object.
      * @defaultValue `new THREE.Object3D()` _The default position of the target is *(0, 0, 0)*._
      */
    var target: Object3D[Event] = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `SpotLight`
      */
    @JSName("type")
    val type_SpotLight: String | typings.three.threeStrings.SpotLight = js.native
  }
}
