package typings.wordpressDataControls

import typings.redux.mod.AnyAction
import typings.wordpressApiFetch.mod.APIFetchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/data-controls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def apiFetch(options: APIFetchOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("apiFetch")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object controls {
    
    @JSImport("@wordpress/data-controls", "controls")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def API_FETCH(action: AnyAction): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("API_FETCH")(action.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
    
    @scala.inline
    def DISPATCH(action: AnyAction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DISPATCH")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def SELECT(action: AnyAction): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("SELECT")(action.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
  
  @scala.inline
  def dispatch(storeKey: String, actionName: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(storeKey.asInstanceOf[js.Any], actionName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def select(storeKey: String, selectorName: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(storeKey.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
