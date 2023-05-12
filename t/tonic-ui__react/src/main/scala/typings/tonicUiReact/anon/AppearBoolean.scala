package typings.tonicUiReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppearBoolean extends StObject {
  
  var appear: Boolean
}
object AppearBoolean {
  
  inline def apply(appear: Boolean): AppearBoolean = {
    val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppearBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppearBoolean] (val x: Self) extends AnyVal {
    
    inline def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
  }
}
