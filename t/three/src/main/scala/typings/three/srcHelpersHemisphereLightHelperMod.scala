package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcLightsHemisphereLightMod.HemisphereLight
import typings.three.srcMaterialsMeshBasicMaterialMod.MeshBasicMaterial
import typings.three.srcMathColorMod.ColorRepresentation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHelpersHemisphereLightHelperMod {
  
  @JSImport("three/src/helpers/HemisphereLightHelper", "HemisphereLightHelper")
  @js.native
  open class HemisphereLightHelper protected () extends Object3D[Event] {
    /**
      *  Create a new instance of {@link HemisphereLightHelper}
      * @param light The light being visualized.
      * @param size Thr sphere size
      * @param color If this is not the set the helper will take the color of the light.
      */
    def this(light: HemisphereLight, size: Double) = this()
    def this(light: HemisphereLight, size: Double, color: ColorRepresentation) = this()
    
    // TODO: Double check if this need to be exposed or not.
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
      * Reference to the HemisphereLight being visualized.
      */
    var light: HemisphereLight = js.native
    
    var material: MeshBasicMaterial = js.native
    
    /**
      * A Read-only _string_ to check if `this` object type.
      * @remarks Sub-classes will update this value.
      * @override
      * @defaultValue `HemisphereLightHelper`
      */
    @JSName("type")
    val type_HemisphereLightHelper: String | typings.three.threeStrings.HemisphereLightHelper = js.native
    
    /**
      * Updates the helper to match the position and direction of the {@link .light | HemisphereLight}.
      */
    def update(): Unit = js.native
  }
}
