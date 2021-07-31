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
    
    @scala.inline
    def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuickling(value: String): Self = StObject.set(x, "quickling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuicklingUndefined: Self = StObject.set(x, "quickling", js.undefined)
      
      @scala.inline
      def set_default(value: String): Self = StObject.set(x, "_default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_defaultUndefined: Self = StObject.set(x, "_default", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var mode: typings.yogBigpipe.mod.Pagelet.mode
  }
  object Dictkey {
    
    @scala.inline
    def apply(mode: mode): Dictkey = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
}
