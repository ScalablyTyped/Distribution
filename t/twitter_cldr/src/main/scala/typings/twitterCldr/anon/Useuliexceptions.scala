package typings.twitterCldr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Useuliexceptions extends StObject {
  
  var use_uli_exceptions: Boolean
}
object Useuliexceptions {
  
  inline def apply(use_uli_exceptions: Boolean): Useuliexceptions = {
    val __obj = js.Dynamic.literal(use_uli_exceptions = use_uli_exceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Useuliexceptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Useuliexceptions] (val x: Self) extends AnyVal {
    
    inline def setUse_uli_exceptions(value: Boolean): Self = StObject.set(x, "use_uli_exceptions", value.asInstanceOf[js.Any])
  }
}
