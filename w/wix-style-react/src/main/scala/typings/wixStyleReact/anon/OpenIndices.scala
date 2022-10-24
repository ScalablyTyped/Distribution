package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenIndices extends StObject {
  
  var openIndices: Any
}
object OpenIndices {
  
  inline def apply(openIndices: Any): OpenIndices = {
    val __obj = js.Dynamic.literal(openIndices = openIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenIndices]
  }
  
  extension [Self <: OpenIndices](x: Self) {
    
    inline def setOpenIndices(value: Any): Self = StObject.set(x, "openIndices", value.asInstanceOf[js.Any])
  }
}
