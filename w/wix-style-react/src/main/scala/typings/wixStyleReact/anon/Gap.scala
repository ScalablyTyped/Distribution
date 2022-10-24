package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gap extends StObject {
  
  var gap: Any
}
object Gap {
  
  inline def apply(gap: Any): Gap = {
    val __obj = js.Dynamic.literal(gap = gap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gap]
  }
  
  extension [Self <: Gap](x: Self) {
    
    inline def setGap(value: Any): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
  }
}
