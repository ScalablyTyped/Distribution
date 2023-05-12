package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.Object3D
import typings.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMiscMd2charactercomplexMod {
  
  @JSImport("three/examples/jsm/misc/MD2CharacterComplex", "MD2CharacterComplex")
  @js.native
  open class MD2CharacterComplex () extends StObject {
    
    var activeAnimation: String = js.native
    
    var angularSpeed: Double = js.native
    
    var animationFPS: Double = js.native
    
    var animations: js.Array[js.Object] = js.native
    
    var backAcceleration: Double = js.native
    
    var bodyOrientation: Double = js.native
    
    var controls: Null = js.native
    
    var crouchSpeed: Double = js.native
    
    var currentSkin: Double = js.native
    
    def enableShadows(enable: Boolean): Unit = js.native
    
    var frontAcceleration: Double = js.native
    
    var frontDecceleration: Double = js.native
    
    var loadCounter: Double = js.native
    
    def loadParts(config: js.Object): Unit = js.native
    
    var maxReverseSpeed: Double = js.native
    
    var maxSpeed: Double = js.native
    
    var meshBody: (Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]]) | Null = js.native
    
    var meshWeapon: (Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]]) | Null = js.native
    
    var meshes: js.Array[Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]]] = js.native
    
    var oldAnimation: String = js.native
    
    def onLoadComplete(): Unit = js.native
    
    var root: Object3D[Event] = js.native
    
    var scale: Double = js.native
    
    def setAnimation(animationName: String): Unit = js.native
    
    def setPlaybackRate(rate: Double): Unit = js.native
    
    def setSkin(index: Double): Unit = js.native
    
    def setVisible(enable: Boolean): Unit = js.native
    
    def setWeapon(index: Double): Unit = js.native
    
    def setWireframe(wireframeEnabled: Boolean): Unit = js.native
    
    def shareParts(original: MD2CharacterComplex): Unit = js.native
    
    var skinsBody: js.Array[Texture] = js.native
    
    var skinsWeapon: js.Array[Texture] = js.native
    
    var speed: Double = js.native
    
    var transitionFrames: Double = js.native
    
    def update(delta: Double): Unit = js.native
    
    def updateAnimations(delta: Double): Unit = js.native
    
    def updateBehaviors(): Unit = js.native
    
    def updateMovementModel(delta: Double): Unit = js.native
    
    var walkSpeed: Double = js.native
    
    var weapons: js.Array[Mesh[BufferGeometry[NormalBufferAttributes], Material | js.Array[Material]]] = js.native
  }
}
