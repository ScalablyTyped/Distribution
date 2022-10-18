package typings.uirouterCore

import typings.uirouterCore.libRouterMod.UIRouter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfaceMod {
  
  /* note: abstract class */ @JSImport("@uirouter/core/lib/interface", "UIRouterPluginBase")
  @js.native
  open class UIRouterPluginBase ()
    extends StObject
       with UIRouterPlugin
  
  @js.native
  trait Disposable extends StObject {
    
    /** Instructs the Disposable to clean up any resources */
    def dispose(): Any = js.native
    def dispose(router: UIRouter): Any = js.native
  }
  
  @js.native
  trait UIInjector extends StObject {
    
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
    def get(token: Any): Any = js.native
    
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
    def getAsync(token: Any): js.Promise[Any] = js.native
    /** Asynchronously gets a value as type `T` (generics parameter) */
    @JSName("getAsync")
    def getAsync_T[T](token: Any): js.Promise[T] = js.native
    
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
    def getNative(token: Any): Any = js.native
    @JSName("getNative")
    def getNative_T_T[T](token: Any): T = js.native
    
    /** Gets a value as type `T` (generics parameter) */
    @JSName("get")
    def get_T_T[T](token: Any): T = js.native
  }
  
  @js.native
  trait UIRouterPlugin
    extends StObject
       with Disposable {
    
    var name: String = js.native
  }
}
