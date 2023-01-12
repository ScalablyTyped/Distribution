package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beatvalue extends StObject {
  
  var beat_value: js.UndefOr[Double] = js.undefined
  
  var num_beats: js.UndefOr[Double] = js.undefined
  
  var resolution: js.UndefOr[Double] = js.undefined
}
object Beatvalue {
  
  inline def apply(): Beatvalue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beatvalue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Beatvalue] (val x: Self) extends AnyVal {
    
    inline def setBeat_value(value: Double): Self = StObject.set(x, "beat_value", value.asInstanceOf[js.Any])
    
    inline def setBeat_valueUndefined: Self = StObject.set(x, "beat_value", js.undefined)
    
    inline def setNum_beats(value: Double): Self = StObject.set(x, "num_beats", value.asInstanceOf[js.Any])
    
    inline def setNum_beatsUndefined: Self = StObject.set(x, "num_beats", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
  }
}
