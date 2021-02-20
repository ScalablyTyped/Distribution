package typings.wordpressDataControls

import typings.redux.mod.AnyAction
import typings.wordpressApiFetch.mod.APIFetchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/data-controls", "apiFetch")
  @js.native
  def apiFetch(options: APIFetchOptions): Unit = js.native
  
  object controls {
    
    @JSImport("@wordpress/data-controls", "controls.API_FETCH")
    @js.native
    def API_FETCH(action: AnyAction): js.Promise[_] = js.native
    
    @JSImport("@wordpress/data-controls", "controls.DISPATCH")
    @js.native
    def DISPATCH(action: AnyAction): Unit = js.native
    
    @JSImport("@wordpress/data-controls", "controls.SELECT")
    @js.native
    def SELECT(action: AnyAction): js.Any = js.native
  }
  
  @JSImport("@wordpress/data-controls", "dispatch")
  @js.native
  def dispatch(storeKey: String, actionName: String, args: js.Any*): Unit = js.native
  
  @JSImport("@wordpress/data-controls", "select")
  @js.native
  def select(storeKey: String, selectorName: String, args: js.Any*): Unit = js.native
}
