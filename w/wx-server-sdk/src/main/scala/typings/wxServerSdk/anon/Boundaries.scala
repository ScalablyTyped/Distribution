package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boundaries extends StObject {
  
  var default: js.UndefOr[js.Any] = js.undefined
  
  var boundaries: js.Array[js.Any]
  
  var groupBy: js.Any
  
  var output: js.UndefOr[js.Object] = js.undefined
}
object Boundaries {
  
  inline def apply(boundaries: js.Array[js.Any], groupBy: js.Any): Boundaries = {
    val __obj = js.Dynamic.literal(boundaries = boundaries.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boundaries]
  }
  
  extension [Self <: Boundaries](x: Self) {
    
    inline def setBoundaries(value: js.Array[js.Any]): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
    
    inline def setBoundariesVarargs(value: js.Any*): Self = StObject.set(x, "boundaries", js.Array(value :_*))
    
    inline def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setGroupBy(value: js.Any): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: js.Object): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
