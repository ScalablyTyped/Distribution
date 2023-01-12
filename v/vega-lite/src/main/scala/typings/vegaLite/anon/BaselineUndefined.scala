package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaselineUndefined extends StObject {
  
  var baseline: Unit
}
object BaselineUndefined {
  
  inline def apply(baseline: Unit): BaselineUndefined = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaselineUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaselineUndefined] (val x: Self) extends AnyVal {
    
    inline def setBaseline(value: Unit): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
  }
}
