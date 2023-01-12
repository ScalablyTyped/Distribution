package typings.swiper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesHistoryMod {
  
  trait HistoryEvents extends StObject
  
  trait HistoryMethods extends StObject
  
  trait HistoryOptions extends StObject {
    
    /**
      * Enables History Plugin.
      *
      * @default false
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Keep query parameters when changing browser url.
      *
      * @default false
      */
    var keepQuery: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Url key for slides
      *
      * @default 'slides'
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * Works in addition to hashnav or history to replace current url state with the
      * new one instead of adding it to history
      *
      * @default false
      */
    var replaceState: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Swiper page root, useful to specify when you use Swiper history mode not on root website page.
      * For example can be `https://my-website.com/` or `https://my-website.com/subpage/` or `/subpage/`
      *
      *
      * @default ''
      */
    var root: js.UndefOr[String] = js.undefined
  }
  object HistoryOptions {
    
    inline def apply(): HistoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HistoryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HistoryOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setKeepQuery(value: Boolean): Self = StObject.set(x, "keepQuery", value.asInstanceOf[js.Any])
      
      inline def setKeepQueryUndefined: Self = StObject.set(x, "keepQuery", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setReplaceState(value: Boolean): Self = StObject.set(x, "replaceState", value.asInstanceOf[js.Any])
      
      inline def setReplaceStateUndefined: Self = StObject.set(x, "replaceState", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
