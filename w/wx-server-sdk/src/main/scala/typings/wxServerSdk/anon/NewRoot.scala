package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewRoot extends StObject {
  
  var newRoot: Any
}
object NewRoot {
  
  inline def apply(newRoot: Any): NewRoot = {
    val __obj = js.Dynamic.literal(newRoot = newRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewRoot] (val x: Self) extends AnyVal {
    
    inline def setNewRoot(value: Any): Self = StObject.set(x, "newRoot", value.asInstanceOf[js.Any])
  }
}
