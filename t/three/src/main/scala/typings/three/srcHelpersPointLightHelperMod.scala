package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsPointLightMod.PointLight
import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersPointLightHelperMod {
  
  @JSImport("three/src/helpers/PointLightHelper", "PointLightHelper")
  @js.native
  open class PointLightHelper protected () extends Object3D[Event] {
    /**
      * Create a new instance of {@link PointLightHelper}
      * @param light The light to be visualized.
      * @param sphereSize The size of the sphere helper. Expects a `Float`. Default `1`
      * @param color If this is not the set the helper will take the color of the light.
      */
    def this(light: PointLight) = this()
    def this(light: PointLight, sphereSize: Double) = this()
    def this(light: PointLight, sphereSize: Double, color: ColorRepresentation) = this()
    def this(light: PointLight, sphereSize: Unit, color: ColorRepresentation) = this()
    
    /**
      * The color parameter passed in the constructor.
      * @remarks If this is changed, the helper's color will update the next time {@link update} is called.
      * @defaultValue `undefined`
      */
    var color: js.UndefOr[ColorRepresentation] = js.native
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * The {@link THREE.PointLight | PointLight} that is being visualized.
      */
    var light: PointLight = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @override
      * @defaultValue `PointLightHelper`
      */
    @JSName("type")
    val type_PointLightHelper: String | typings.three.threeStrings.PointLightHelper = js.native
    
    /**
      * Updates the helper to match the position of the {@link THREE..light | .light}.
      */
    def update(): Unit = js.native
  }
}
