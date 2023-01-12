package typings.trimblemapsTrimblemapsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BearingSnap extends StObject {
  
  var bearingSnap: js.UndefOr[Double] = js.undefined
  
  var pitchWithRotate: js.UndefOr[Boolean] = js.undefined
}
object BearingSnap {
  
  inline def apply(): BearingSnap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BearingSnap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BearingSnap] (val x: Self) extends AnyVal {
    
    inline def setBearingSnap(value: Double): Self = StObject.set(x, "bearingSnap", value.asInstanceOf[js.Any])
    
    inline def setBearingSnapUndefined: Self = StObject.set(x, "bearingSnap", js.undefined)
    
    inline def setPitchWithRotate(value: Boolean): Self = StObject.set(x, "pitchWithRotate", value.asInstanceOf[js.Any])
    
    inline def setPitchWithRotateUndefined: Self = StObject.set(x, "pitchWithRotate", js.undefined)
  }
}
