package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryNavigationOptions extends StObject {
  
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
}
object HistoryNavigationOptions {
  
  inline def apply(): HistoryNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryNavigationOptions]
  }
  
  extension [Self <: HistoryNavigationOptions](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setReplaceState(value: Boolean): Self = StObject.set(x, "replaceState", value.asInstanceOf[js.Any])
    
    inline def setReplaceStateUndefined: Self = StObject.set(x, "replaceState", js.undefined)
  }
}
