package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placement extends StObject {
  
  var placement: String
}
object Placement {
  
  inline def apply(placement: String): Placement = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  
  extension [Self <: Placement](x: Self) {
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
  }
}
