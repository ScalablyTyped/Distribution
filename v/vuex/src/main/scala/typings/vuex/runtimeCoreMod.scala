package typings.vuex

import typings.vuex.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeCoreMod {
  
  trait ComponentCustomOptions extends StObject {
    
    var store: js.UndefOr[Store[Any]] = js.undefined
  }
  object ComponentCustomOptions {
    
    inline def apply(): ComponentCustomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentCustomOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentCustomOptions] (val x: Self) extends AnyVal {
      
      inline def setStore(value: Store[Any]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
}
