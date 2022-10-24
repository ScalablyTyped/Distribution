package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignTo extends StObject {
  
  var alignTo: String
  
  var immediate: Boolean
  
  var index: Double
}
object AlignTo {
  
  inline def apply(alignTo: String, immediate: Boolean, index: Double): AlignTo = {
    val __obj = js.Dynamic.literal(alignTo = alignTo.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignTo]
  }
  
  extension [Self <: AlignTo](x: Self) {
    
    inline def setAlignTo(value: String): Self = StObject.set(x, "alignTo", value.asInstanceOf[js.Any])
    
    inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
