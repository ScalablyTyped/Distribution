package typings.webpackMerge

import typings.webpackMerge.typesMod.Customize
import typings.webpackMerge.typesMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CustomizeArray extends StObject {
    
    var customizeArray: js.UndefOr[Customize] = js.undefined
    
    var customizeObject: js.UndefOr[Customize] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
  }
  object CustomizeArray {
    
    inline def apply(): CustomizeArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomizeArray]
    }
    
    extension [Self <: CustomizeArray](x: Self) {
      
      inline def setCustomizeArray(value: (/* a */ Any, /* b */ Any, /* key */ Key) => Any): Self = StObject.set(x, "customizeArray", js.Any.fromFunction3(value))
      
      inline def setCustomizeArrayUndefined: Self = StObject.set(x, "customizeArray", js.undefined)
      
      inline def setCustomizeObject(value: (/* a */ Any, /* b */ Any, /* key */ Key) => Any): Self = StObject.set(x, "customizeObject", js.Any.fromFunction3(value))
      
      inline def setCustomizeObjectUndefined: Self = StObject.set(x, "customizeObject", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
}
