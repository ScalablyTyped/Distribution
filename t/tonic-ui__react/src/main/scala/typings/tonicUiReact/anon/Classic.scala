package typings.tonicUiReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Classic extends StObject {
  
  var classic: Colors
}
object Classic {
  
  inline def apply(classic: Colors): Classic = {
    val __obj = js.Dynamic.literal(classic = classic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Classic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Classic] (val x: Self) extends AnyVal {
    
    inline def setClassic(value: Colors): Self = StObject.set(x, "classic", value.asInstanceOf[js.Any])
  }
}
