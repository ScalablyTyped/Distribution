package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefineModelOptions extends StObject {
  
  var local: js.UndefOr[Boolean] = js.undefined
}
object DefineModelOptions {
  
  inline def apply(): DefineModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineModelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefineModelOptions] (val x: Self) extends AnyVal {
    
    inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
  }
}
