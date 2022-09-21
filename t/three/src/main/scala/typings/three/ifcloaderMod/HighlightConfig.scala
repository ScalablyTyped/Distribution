package typings.three.ifcloaderMod

import typings.three.eventDispatcherMod.Event
import typings.three.threeMod.Material
import typings.three.threeMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightConfig extends StObject {
  
  var ids: js.Array[Double]
  
  var material: js.UndefOr[Material] = js.undefined
  
  var removePrevious: Boolean
  
  var scene: Object3D[Event]
}
object HighlightConfig {
  
  inline def apply(ids: js.Array[Double], removePrevious: Boolean, scene: Object3D[Event]): HighlightConfig = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], removePrevious = removePrevious.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightConfig]
  }
  
  extension [Self <: HighlightConfig](x: Self) {
    
    inline def setIds(value: js.Array[Double]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: Double*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setMaterial(value: Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setRemovePrevious(value: Boolean): Self = StObject.set(x, "removePrevious", value.asInstanceOf[js.Any])
    
    inline def setScene(value: Object3D[Event]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
  }
}
