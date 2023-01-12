package typings.three.anon

import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcThreeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rotate extends StObject {
  
  var rotate: Object3D[Event]
  
  var scale: Object3D[Event]
  
  var translate: Object3D[Event]
}
object Rotate {
  
  inline def apply(rotate: Object3D[Event], scale: Object3D[Event], translate: Object3D[Event]): Rotate = {
    val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rotate] (val x: Self) extends AnyVal {
    
    inline def setRotate(value: Object3D[Event]): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Object3D[Event]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setTranslate(value: Object3D[Event]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
  }
}
