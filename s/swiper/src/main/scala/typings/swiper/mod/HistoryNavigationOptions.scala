package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryNavigationOptions extends StObject {
  
  /**
    * Url key for slides
    *
    * @default 'slides'
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Works in addition to hashnav or history to replace current url state with the
    * new one instead of adding it to history
    *
    * @default false
    */
  var replaceState: js.UndefOr[Boolean] = js.native
}
object HistoryNavigationOptions {
  
  @scala.inline
  def apply(): HistoryNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryNavigationOptions]
  }
  
  @scala.inline
  implicit class HistoryNavigationOptionsMutableBuilder[Self <: HistoryNavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setReplaceState(value: Boolean): Self = StObject.set(x, "replaceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceStateUndefined: Self = StObject.set(x, "replaceState", js.undefined)
  }
}
