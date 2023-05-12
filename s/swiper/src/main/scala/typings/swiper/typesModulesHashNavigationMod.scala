package typings.swiper

import typings.swiper.typesSwiperClassMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesModulesHashNavigationMod {
  
  trait HashNavigationEvents extends StObject {
    
    /**
      * Event will be fired on window hash change
      */
    def hashChange(swiper: default): Unit
    
    /**
      * Event will be fired when swiper updates the hash
      */
    def hashSet(swiper: default): Unit
  }
  object HashNavigationEvents {
    
    inline def apply(hashChange: default => Unit, hashSet: default => Unit): HashNavigationEvents = {
      val __obj = js.Dynamic.literal(hashChange = js.Any.fromFunction1(hashChange), hashSet = js.Any.fromFunction1(hashSet))
      __obj.asInstanceOf[HashNavigationEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashNavigationEvents] (val x: Self) extends AnyVal {
      
      inline def setHashChange(value: default => Unit): Self = StObject.set(x, "hashChange", js.Any.fromFunction1(value))
      
      inline def setHashSet(value: default => Unit): Self = StObject.set(x, "hashSet", js.Any.fromFunction1(value))
    }
  }
  
  trait HashNavigationMethods extends StObject
  
  trait HashNavigationOptions extends StObject {
    
    /**
      * Designed to be used with Virtual slides when it is impossible to find slide in DOM by hash (e.g. not yet rendered)
      *
      */
    var getSlideIndex: js.UndefOr[js.Function2[/* swiper */ default, /* hash */ String, Double]] = js.undefined
    
    /**
      * Works in addition to hashnav to replace current url state with the
      * new one instead of adding it to history
      *
      * @default     false
      */
    var replaceState: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to `true` to enable also navigation through slides (when hashnav
      * is enabled) by browser history or by setting directly hash on document location
      *
      * @default false
      */
    var watchState: js.UndefOr[Boolean] = js.undefined
  }
  object HashNavigationOptions {
    
    inline def apply(): HashNavigationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashNavigationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashNavigationOptions] (val x: Self) extends AnyVal {
      
      inline def setGetSlideIndex(value: (/* swiper */ default, /* hash */ String) => Double): Self = StObject.set(x, "getSlideIndex", js.Any.fromFunction2(value))
      
      inline def setGetSlideIndexUndefined: Self = StObject.set(x, "getSlideIndex", js.undefined)
      
      inline def setReplaceState(value: Boolean): Self = StObject.set(x, "replaceState", value.asInstanceOf[js.Any])
      
      inline def setReplaceStateUndefined: Self = StObject.set(x, "replaceState", js.undefined)
      
      inline def setWatchState(value: Boolean): Self = StObject.set(x, "watchState", value.asInstanceOf[js.Any])
      
      inline def setWatchStateUndefined: Self = StObject.set(x, "watchState", js.undefined)
    }
  }
}
