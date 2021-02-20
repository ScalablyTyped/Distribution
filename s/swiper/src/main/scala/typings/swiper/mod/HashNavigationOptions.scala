package typings.swiper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashNavigationOptions extends StObject {
  
  /**
    * Works in addition to hashnav to replace current url state with the
    * new one instead of adding it to history
    *
    * @default     false
    */
  var replaceState: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true to enable also navigation through slides (when hashnav
    * is enabled) by browser history or by setting directly hash on document location
    *
    * @default false
    */
  var watchState: js.UndefOr[Boolean] = js.native
}
object HashNavigationOptions {
  
  @scala.inline
  def apply(): HashNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashNavigationOptions]
  }
  
  @scala.inline
  implicit class HashNavigationOptionsMutableBuilder[Self <: HashNavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplaceState(value: Boolean): Self = StObject.set(x, "replaceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceStateUndefined: Self = StObject.set(x, "replaceState", js.undefined)
    
    @scala.inline
    def setWatchState(value: Boolean): Self = StObject.set(x, "watchState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchStateUndefined: Self = StObject.set(x, "watchState", js.undefined)
  }
}
