package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unreliable extends StObject {
  
  var unreliable: Boolean
}
object Unreliable {
  
  inline def apply(unreliable: Boolean): Unreliable = {
    val __obj = js.Dynamic.literal(unreliable = unreliable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unreliable]
  }
  
  extension [Self <: Unreliable](x: Self) {
    
    inline def setUnreliable(value: Boolean): Self = StObject.set(x, "unreliable", value.asInstanceOf[js.Any])
  }
}
