package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcThreeMod.AnimationMixer
import typings.three.srcThreeMod.Mesh
import typings.three.srcThreeMod.Object3D
import typings.three.srcThreeMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmMiscMd2characterMod {
  
  @JSImport("three/examples/jsm/misc/MD2Character", "MD2Character")
  @js.native
  open class MD2Character () extends StObject {
    
    var activeAnimation: String | Null = js.native
    
    var animationFPS: Double = js.native
    
    var loadCounter: Double = js.native
    
    def loadParts(config: MD2PartsConfig): Unit = js.native
    
    var meshBody: (Mesh[BufferGeometry, Material | js.Array[Material]]) | Null = js.native
    
    var meshWeapon: (Mesh[BufferGeometry, Material | js.Array[Material]]) | Null = js.native
    
    var mixer: AnimationMixer | Null = js.native
    
    def onLoadComplete(): Unit = js.native
    
    var root: Object3D[Event] = js.native
    
    var scale: Double = js.native
    
    def setAnimation(clipName: String): Unit = js.native
    
    def setPlaybackRate(rate: Double): Unit = js.native
    
    def setSkin(index: Double): Unit = js.native
    
    def setWeapon(index: Double): Unit = js.native
    
    def setWireframe(wireframeEnabled: Boolean): Unit = js.native
    
    var skinsBody: js.Array[Texture] = js.native
    
    var skinsWeapon: js.Array[Texture] = js.native
    
    def syncWeaponAnimation(): Unit = js.native
    
    def update(delta: Double): Unit = js.native
    
    var weapons: js.Array[Mesh[BufferGeometry, Material | js.Array[Material]]] = js.native
  }
  
  trait MD2PartsConfig extends StObject {
    
    var baseUrl: String
    
    var body: String
    
    var skins: js.Array[String]
    
    var weapons: js.Array[js.Tuple2[String, String]]
  }
  object MD2PartsConfig {
    
    inline def apply(
      baseUrl: String,
      body: String,
      skins: js.Array[String],
      weapons: js.Array[js.Tuple2[String, String]]
    ): MD2PartsConfig = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], skins = skins.asInstanceOf[js.Any], weapons = weapons.asInstanceOf[js.Any])
      __obj.asInstanceOf[MD2PartsConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MD2PartsConfig] (val x: Self) extends AnyVal {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setSkins(value: js.Array[String]): Self = StObject.set(x, "skins", value.asInstanceOf[js.Any])
      
      inline def setSkinsVarargs(value: String*): Self = StObject.set(x, "skins", js.Array(value*))
      
      inline def setWeapons(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "weapons", value.asInstanceOf[js.Any])
      
      inline def setWeaponsVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "weapons", js.Array(value*))
    }
  }
}
