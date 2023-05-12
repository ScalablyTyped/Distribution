package typings.wordpressDataControls

import typings.wordpressApiFetch.mod.APIFetchOptions
import typings.wordpressData.mod.StoreDescriptor
import typings.wordpressDataControls.anon.Promise
import typings.wordpressDataControls.anon.PromisePromise
import typings.wordpressDataControls.anon.Request
import typings.wordpressDataControls.anon.RequestAPIFetchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/data-controls", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def apiFetch(request: APIFetchOptions): Request = ^.asInstanceOf[js.Dynamic].applyDynamic("apiFetch")(request.asInstanceOf[js.Any]).asInstanceOf[Request]
  
  object controls {
    
    @JSImport("@wordpress/data-controls", "controls")
    @js.native
    val ^ : js.Any = js.native
    
    inline def API_FETCH(param0: RequestAPIFetchOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("API_FETCH")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def AWAIT_PROMISE[T](param0: PromisePromise[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("AWAIT_PROMISE")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  }
  
  inline def dispatch(storeNameOrDescriptor: String, actionName: String, args: Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")((scala.List(storeNameOrDescriptor.asInstanceOf[js.Any], actionName.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Object]
  inline def dispatch(storeNameOrDescriptor: StoreDescriptor, actionName: String, args: Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")((scala.List(storeNameOrDescriptor.asInstanceOf[js.Any], actionName.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Object]
  
  inline def select(storeNameOrDescriptor: String, selectorName: String, args: Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("select")((scala.List(storeNameOrDescriptor.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Object]
  inline def select(storeNameOrDescriptor: StoreDescriptor, selectorName: String, args: Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("select")((scala.List(storeNameOrDescriptor.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Object]
  
  inline def syncSelect(storeNameOrDescriptor: String, selectorName: String, args: Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("syncSelect")((scala.List(storeNameOrDescriptor.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Object]
  inline def syncSelect(storeNameOrDescriptor: StoreDescriptor, selectorName: String, args: Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("syncSelect")((scala.List(storeNameOrDescriptor.asInstanceOf[js.Any], selectorName.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Object]
  
  inline def unstableAwaitPromise[T](promise: js.Promise[T]): Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("__unstableAwaitPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Promise[T]]
}
