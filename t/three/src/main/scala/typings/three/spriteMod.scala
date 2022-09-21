package typings.three

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.eventDispatcherMod.Event
import typings.three.materialsMaterialsMod.SpriteMaterial
import typings.three.object3DMod.Object3D
import typings.three.threeBooleans.`true`
import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spriteMod {
  
  @JSImport("three/src/objects/Sprite", "Sprite")
  @js.native
  open class Sprite () extends Object3D[Event] {
    def this(material: SpriteMaterial) = this()
    
    var center: Vector2 = js.native
    
    var geometry: BufferGeometry = js.native
    
    val isSprite: `true` = js.native
    
    var material: SpriteMaterial = js.native
    
    @JSName("type")
    var type_Sprite: typings.three.threeStrings.Sprite = js.native
  }
}
