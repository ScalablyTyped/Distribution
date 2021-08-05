package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatchOptions extends StObject {
  
  var root: js.UndefOr[Boolean] = js.undefined
}
object DispatchOptions {
  
  inline def apply(): DispatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DispatchOptions]
  }
  
  extension [Self <: DispatchOptions](x: Self) {
    
    inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
