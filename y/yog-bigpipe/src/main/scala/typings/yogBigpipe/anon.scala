package typings.yogBigpipe

import org.scalablytyped.runtime.StringDictionary
import typings.yogBigpipe.mod.Pagelet.mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Default extends StObject {
    
    var _default: js.UndefOr[String] = js.undefined
    
    var quickling: js.UndefOr[String] = js.undefined
  }
  object Default {
    
    inline def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setQuickling(value: String): Self = StObject.set(x, "quickling", value.asInstanceOf[js.Any])
      
      inline def setQuicklingUndefined: Self = StObject.set(x, "quickling", js.undefined)
      
      inline def set_default(value: String): Self = StObject.set(x, "_default", value.asInstanceOf[js.Any])
      
      inline def set_defaultUndefined: Self = StObject.set(x, "_default", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var mode: typings.yogBigpipe.mod.Pagelet.mode
  }
  object Dictkey {
    
    inline def apply(mode: mode): Dictkey = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
