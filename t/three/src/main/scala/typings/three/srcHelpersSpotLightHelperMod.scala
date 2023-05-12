package typings.three

import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsLightMod.Light
import typings.three.srcLightsLightShadowMod.LightShadow
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.srcObjectsLineSegmentsMod.LineSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersSpotLightHelperMod {
  
  @JSImport("three/src/helpers/SpotLightHelper", "SpotLightHelper")
  @js.native
  open class SpotLightHelper protected () extends Object3D[Event] {
    /**
      * Create a new instance of {@link SpotLightHelper}
      * @param light The {@link THREE.SpotLight | SpotLight} to be visualized.
      * @param color If this is not the set the helper will take the color of the light. Default `light.color`
      */
    def this(light: Light[js.UndefOr[LightShadow[Camera]]]) = this()
    def this(light: Light[js.UndefOr[LightShadow[Camera]]], color: ColorRepresentation) = this()
    
    /**
      * The color parameter passed in the constructor.
      * If this is changed, the helper's color will update the next time {@link SpotLightHelper.update | update} is called.
      * @defaultValue `undefined`
      */
    var color: js.UndefOr[ColorRepresentation] = js.native
    
    /**
      * {@link THREE.LineSegments | LineSegments} used to visualize the light.
      */
    var cone: LineSegments[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] = js.native
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks
      * Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    /**
      * Reference to the {@link THREE.SpotLight | SpotLight} being visualized.
      */
    var light: Light[js.UndefOr[LightShadow[Camera]]] = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @override
      * @defaultValue `SpotLightHelper`
      */
    @JSName("type")
    val type_SpotLightHelper: String | typings.three.threeStrings.SpotLightHelper = js.native
    
    /**
      * Updates the light helper.
      */
    def update(): Unit = js.native
  }
}
