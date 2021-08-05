package typings.wxServerSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewRoot extends StObject {
  
  var newRoot: js.Any
}
object NewRoot {
  
  inline def apply(newRoot: js.Any): NewRoot = {
    val __obj = js.Dynamic.literal(newRoot = newRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewRoot]
  }
  
  extension [Self <: NewRoot](x: Self) {
    
    inline def setNewRoot(value: js.Any): Self = StObject.set(x, "newRoot", value.asInstanceOf[js.Any])
  }
}
