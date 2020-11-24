package typings.uirouterCore

import typings.uirouterCore.routerMod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/interface", JSImport.Namespace)
@js.native
object interfaceMod extends js.Object {
  
  @js.native
  trait Disposable extends js.Object {
    
    /** Instructs the Disposable to clean up any resources */
    def dispose(): js.Any = js.native
    def dispose(router: UIRouter): js.Any = js.native
  }
  
  @js.native
  trait UIInjector extends js.Object {
    
    /**
      * Gets a value from the injector.
      *
      * For a given token, returns the value from the injector that matches the token.
      * If the token is for a resolve that has not yet been fetched, this throws an error.
      *
      * #### Example:
      * ```js
      * var myResolve = injector.get('myResolve');
      * ```
      *
      * #### ng1 Example:
      * ```js
      * // Fetch StateService
      * injector.get('$state').go('home');
      * ```
      *
      * #### ng2 Example:
      * ```js
      * import {StateService} from "ui-router-ng2";
      * // Fetch StateService
      * injector.get(StateService).go('home');
      * ```
      *
      * #### Typescript Example:
      * ```js
      * var stringArray = injector.get<string[]>('myStringArray');
      * ```
      *
      * ### `NOWAIT` policy
      *
      * When using [[ResolvePolicy.async]] === `NOWAIT`, the value returned from `get()` is a promise for the result.
      * The promise is not automatically unwrapped.
      *
      * @param token the key for the value to get.  May be a string, a class, or any arbitrary object.
      * @return the Dependency Injection value that matches the token
      */
    def get(token: js.Any): js.Any = js.native
    
    /**
      * Asynchronously gets a value from the injector
      *
      * For a given token, returns a promise for the value from the injector that matches the token.
      * If the token is for a resolve that has not yet been fetched, this triggers the resolve to load.
      *
      * #### Example:
      * ```js
      * return injector.getAsync('myResolve').then(value => {
      *   if (value === 'declined') return false;
      * });
      * ```
      *
      * @param token the key for the value to get.  May be a string or arbitrary object.
      * @return a Promise for the Dependency Injection value that matches the token
      */
    def getAsync(token: js.Any): js.Promise[_] = js.native
    /** Asynchronously gets a value as type `T` (generics parameter) */
    @JSName("getAsync")
    def getAsync_T[T](token: js.Any): js.Promise[T] = js.native
    
    /**
      * Gets a value from the native injector
      *
      * Returns a value from the native injector, bypassing anything in the [[ResolveContext]].
      *
      * Example:
      * ```js
      * let someThing = injector.getNative(SomeToken);
      * ```
      *
      * @param token the key for the value to get.  May be a string or arbitrary object.
      * @return the Dependency Injection value that matches the token
      */
    def getNative(token: js.Any): js.Any = js.native
    @JSName("getNative")
    def getNative_T_T[T](token: js.Any): T = js.native
    
    /** Gets a value as type `T` (generics parameter) */
    @JSName("get")
    def get_T_T[T](token: js.Any): T = js.native
  }
  
  @js.native
  trait UIRouterPlugin extends Disposable {
    
    var name: String = js.native
  }
  
  @js.native
  abstract class UIRouterPluginBase () extends UIRouterPlugin
}
