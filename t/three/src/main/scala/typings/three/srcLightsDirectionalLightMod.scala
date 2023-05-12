package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsDirectionalLightShadowMod.DirectionalLightShadow
import typings.three.srcLightsLightMod.Light
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLightsDirectionalLightMod {
  
  @JSImport("three/src/lights/DirectionalLight", "DirectionalLight")
  @js.native
  /**
    * Creates a new {@link DirectionalLight}.
    * @param color Hexadecimal color of the light. Default `0xffffff` _(white)_.
    * @param intensity Numeric value of the light's strength/intensity. Expects a `Float`. Default `1`
    */
  open class DirectionalLight () extends Light[DirectionalLightShadow] {
    def this(color: ColorRepresentation) = this()
    def this(color: Unit, intensity: Double) = this()
    def this(color: ColorRepresentation, intensity: Double) = this()
    
    /**
      * Read-only flag to check if a given object is of type {@link DirectionalLight}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isDirectionalLight: `true` = js.native
    
    /**
      * The {@link DirectionalLight} points from its {@link DirectionalLight.position | position} to target.position.
      * @remarks **Note**: For the target's position to be changed to anything other than the default,
      * it must be added to the {@link THREE.Scene | scene} using
      * ```typescript
      * Scene.add( light.target );
      * ```
      * This is so that the target's {@link THREE.Object3D.matrixWorld | matrixWorld} gets automatically updated each frame.
      *
      * It is also possible to set the target to be another object in the scene (anything with a {@link THREE.Object3D.position | position} property),
      * like so:
      * ```typescript
      * const targetObject = new THREE.Object3D();
      * scene.add(targetObject);
      * light.target = targetObject;
      * ```
      * The {@link DirectionalLight} will now track the target object.
      * @defaultValue `new THREE.Object3D()` at _(0, 0, 0)_
      */
    var target: Object3D[Event] = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @defaultValue `DirectionalLight`
      */
    @JSName("type")
    val type_DirectionalLight: String | typings.three.threeStrings.DirectionalLight = js.native
  }
}
