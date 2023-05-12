package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialsMod.SpriteMaterial
import typings.three.srcMathVector2Mod.Vector2
import typings.three.threeBooleans.`false`
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsSpriteMod {
  
  @JSImport("three/src/objects/Sprite", "Sprite")
  @js.native
  /**
    * Creates a new Sprite.
    * @param material An instance of {@link THREE.SpriteMaterial | SpriteMaterial}. Default {@link THREE.SpriteMaterial | `new SpriteMaterial()`}, _with white color_.
    */
  open class Sprite () extends Object3D[Event] {
    def this(material: SpriteMaterial) = this()
    
    /**
      * Whether the object gets rendered into shadow map.
      * No effect in {@link Sprite}.
      * @ignore
      * @hidden
      * @defaultValue `false`
      */
    @JSName("castShadow")
    var castShadow_Sprite: `false` = js.native
    
    /**
      * The sprite's anchor point, and the point around which the {@link Sprite} rotates.
      * A value of (0.5, 0.5) corresponds to the midpoint of the sprite.
      * A value of (0, 0) corresponds to the lower left corner of the sprite.
      * @defaultValue {@link THREE.Vector2 | `new Vector2(0.5, 0.5)`}.
      */
    var center: Vector2 = js.native
    
    var geometry: BufferGeometry[NormalBufferAttributes] = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link Sprite}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isSprite: `true` = js.native
    
    /**
      * An instance of {@link THREE.SpriteMaterial | SpriteMaterial}, defining the object's appearance.
      * @defaultValue {@link THREE.SpriteMaterial | `new SpriteMaterial()`}, _with white color_.
      */
    var material: SpriteMaterial = js.native
    
    /**
      * @override
      * @defaultValue `Sprite`
      */
    @JSName("type")
    val type_Sprite: String | typings.three.threeStrings.Sprite = js.native
  }
}
