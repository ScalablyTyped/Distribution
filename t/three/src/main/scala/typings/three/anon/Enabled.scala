package typings.three.anon

import typings.three.srcThreeMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  var enabled: Boolean
  
  var index: Double
  
  var limitation: js.UndefOr[Vector3] = js.undefined
  
  var rotationMax: js.UndefOr[Vector3] = js.undefined
  
  var rotationMin: js.UndefOr[Vector3] = js.undefined
}
object Enabled {
  
  inline def apply(enabled: Boolean, index: Double): Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLimitation(value: Vector3): Self = StObject.set(x, "limitation", value.asInstanceOf[js.Any])
    
    inline def setLimitationUndefined: Self = StObject.set(x, "limitation", js.undefined)
    
    inline def setRotationMax(value: Vector3): Self = StObject.set(x, "rotationMax", value.asInstanceOf[js.Any])
    
    inline def setRotationMaxUndefined: Self = StObject.set(x, "rotationMax", js.undefined)
    
    inline def setRotationMin(value: Vector3): Self = StObject.set(x, "rotationMin", value.asInstanceOf[js.Any])
    
    inline def setRotationMinUndefined: Self = StObject.set(x, "rotationMin", js.undefined)
  }
}
