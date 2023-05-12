package typings.three

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcMathColorMod.Color
import typings.three.srcScenesFogMod.FogBase
import typings.three.srcTexturesTextureMod.Texture
import typings.three.srcThreeMod.CubeTexture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcScenesSceneMod {
  
  @JSImport("three/src/scenes/Scene", "Scene")
  @js.native
  /**
    * Create a new {@link Scene} object.
    */
  open class Scene () extends Object3D[Event] {
    
    /**
      * Defines the background of the scene.
      * @remarks Valid inputs are:
      *  - A {@link THREE.Color | Color} for defining a uniform colored background.
      *  - A {@link THREE.Texture | Texture} for defining a (flat) textured background.
      *  - Texture cubes ({@link THREE.CubeTexture | CubeTexture}) or equirectangular textures for defining a skybox.</li>
      * @defaultValue `null`
      */
    var background: Color | Texture | CubeTexture | Null = js.native
    
    /**
      * Sets the blurriness of the background. Only influences environment maps assigned to {@link THREE.Scene.background | Scene.background}.
      * @defaultValue `0`
      * @remarks Expects a `Float` between `0` and `1`.
      */
    var backgroundBlurriness: Double = js.native
    
    /**
      * Attenuates the color of the background. Only applies to background textures.
      * @defaultValue `1`
      * @remarks Expects a `Float`
      */
    var backgroundIntensity: Double = js.native
    
    /**
      * Sets the environment map for all physical materials in the scene.
      * However, it's not possible to overwrite an existing texture assigned to {@link THREE.MeshStandardMaterial.envMap | MeshStandardMaterial.envMap}.
      * @defaultValue `null`
      */
    var environment: Texture | Null = js.native
    
    /**
      * A {@link Fog | fog} instance defining the type of fog that affects everything rendered in the scene.
      * @defaultValue `null`
      */
    var fog: FogBase | Null = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link Scene}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isScene: `true` = js.native
    
    /**
      * Forces everything in the {@link Scene} to be rendered with the defined material.
      * @defaultValue `null`
      */
    var overrideMaterial: Material | Null = js.native
    
    def toJSON(meta: Any): Any = js.native
    
    /**
      * @defaultValue `Scene`
      */
    @JSName("type")
    var type_Scene: typings.three.threeStrings.Scene = js.native
  }
}
