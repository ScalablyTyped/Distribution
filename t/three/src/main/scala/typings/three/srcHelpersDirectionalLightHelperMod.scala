package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsDirectionalLightMod.DirectionalLight
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.ColorRepresentation
import typings.three.srcObjectsLineMod.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersDirectionalLightHelperMod {
  
  @JSImport("three/src/helpers/DirectionalLightHelper", "DirectionalLightHelper")
  @js.native
  open class DirectionalLightHelper protected () extends Object3D[Event] {
    /**
      * Create a new instance of {@link DirectionalLightHelper}
      * @param light The light to be visualized.
      * @param size Dimensions of the plane. Default `1`
      * @param color If this is not the set the helper will take the color of the light. Default `light.color`
      */
    def this(light: DirectionalLight) = this()
    def this(light: DirectionalLight, size: Double) = this()
    def this(light: DirectionalLight, size: Double, color: ColorRepresentation) = this()
    def this(light: DirectionalLight, size: Unit, color: ColorRepresentation) = this()
    
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
      * Reference to the {@link THREE.DirectionalLight | directionalLight} being visualized.
      */
    var light: DirectionalLight = js.native
    
    /**
      * Contains the line mesh showing the location of the directional light.
      */
    var lightPlane: Line[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] = js.native
    
    var targetLine: Line[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]] = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @override
      * @defaultValue `DirectionalLightHelper`
      */
    @JSName("type")
    val type_DirectionalLightHelper: String | typings.three.threeStrings.DirectionalLightHelper = js.native
    
    // TODO: Double check if this need to be exposed or not.
    /**
      * Updates the helper to match the position and direction of the {@link light | DirectionalLight} being visualized.
      */
    def update(): Unit = js.native
  }
}
