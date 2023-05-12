package typings.three

import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsLightShadowMod.LightShadow
import typings.three.srcMathColorMod.Color
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsLightMod {
  
  /* note: abstract class */ @JSImport("three/src/lights/Light", "Light")
  @js.native
  /**
    * Creates a new {@link Light}
    * @remarks
    * **Note** that this is not intended to be called directly (use one of derived classes instead).
    * @param color Hexadecimal color of the light. Default `0xffffff` _(white)_.
    * @param intensity Numeric value of the light's strength/intensity. Expects a `Float`. Default `1`.
    */
  open class Light[TShadowSupport /* <: js.UndefOr[LightShadow[Camera]] */] () extends Object3D[Event] {
    def this(color: ColorRepresentation) = this()
    def this(color: Unit, intensity: Double) = this()
    def this(color: ColorRepresentation, intensity: Double) = this()
    
    /**
      * Color of the light. \
      * @defaultValue `new THREE.Color(0xffffff)` _(white)_.
      */
    var color: Color = js.native
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * The light's intensity, or strength.
      * In {@link THREE.WebGLRenderer.physicallyCorrectLights | physically correct} mode, the units of intensity depend on the type of light.
      * @remarks Expects a `Float`
      * @defaultValue `1`
      */
    var intensity: Double = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link HemisphereLight}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isLight: `true` = js.native
    
    /**
      * A {@link THREE.LightShadow | LightShadow} used to calculate shadows for this light.
      * @remarks Available only on Light's that support shadows.
      */
    var shadow: TShadowSupport = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `Light`
      */
    @JSName("type")
    val type_Light: String | typings.three.threeStrings.Light = js.native
  }
}
