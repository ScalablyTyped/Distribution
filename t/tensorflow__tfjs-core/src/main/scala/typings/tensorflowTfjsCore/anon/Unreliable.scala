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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Unreliable] (val x: Self) extends AnyVal {
    
    inline def setUnreliable(value: Boolean): Self = StObject.set(x, "unreliable", value.asInstanceOf[js.Any])
  }
}
