package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialsMod.SpriteMaterial
import typings.three.srcMathVector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsSpriteMod {
  
  @JSImport("three/src/objects/Sprite", "Sprite")
  @js.native
  open class Sprite () extends Object3D[Event] {
    def this(material: SpriteMaterial) = this()
    
    var center: Vector2 = js.native
    
    var geometry: BufferGeometry = js.native
    
    val isSprite: true = js.native
    
    var material: SpriteMaterial = js.native
    
    @JSName("type")
    var type_Sprite: "Sprite" = js.native
  }
}
