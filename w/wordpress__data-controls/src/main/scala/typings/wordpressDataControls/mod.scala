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
  
  inline def apiFetch(options: APIFetchOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("apiFetch")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object controls {
    
    @JSImport("@wordpress/data-controls", "controls")
    @js.native
    val ^ : js.Any = js.native
    
    inline def API_FETCH(action: AnyAction): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("API_FETCH")(action.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def DISPATCH(action: AnyAction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DISPATCH")(action.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def SELECT(action: AnyAction): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("SELECT")(action.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  inline def dispatch(storeKey: String, actionName: String, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")((scala.List(storeKey.asInstanceOf[js.Any], actionName.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  inline def select(storeKey: String, selectorName: String, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("select")((scala.List(storeKey.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
}
