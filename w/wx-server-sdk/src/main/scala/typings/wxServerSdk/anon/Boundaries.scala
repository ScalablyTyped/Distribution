package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boundaries extends StObject {
  
  var default: js.UndefOr[Any] = js.undefined
  
  var boundaries: js.Array[Any]
  
  var groupBy: Any
  
  var output: js.UndefOr[js.Object] = js.undefined
}
object Boundaries {
  
  inline def apply(boundaries: js.Array[Any], groupBy: Any): Boundaries = {
    val __obj = js.Dynamic.literal(boundaries = boundaries.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boundaries]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Boundaries] (val x: Self) extends AnyVal {
    
    inline def setBoundaries(value: js.Array[Any]): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
    
    inline def setBoundariesVarargs(value: Any*): Self = StObject.set(x, "boundaries", js.Array(value*))
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setGroupBy(value: Any): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: js.Object): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
