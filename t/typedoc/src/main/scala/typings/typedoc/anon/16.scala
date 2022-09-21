package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  var `16`: String
  
  var `8`: String
}
object `16` {
  
  inline def apply(`16`: String, `8`: String): `16` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("16")(`16`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  extension [Self <: `16`](x: Self) {
    
    inline def set16(value: String): Self = StObject.set(x, "16", value.asInstanceOf[js.Any])
    
    inline def set8(value: String): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
  }
}
