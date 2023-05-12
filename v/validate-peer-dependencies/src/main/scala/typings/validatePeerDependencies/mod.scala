package typings.validatePeerDependencies

import typings.std.Map
import typings.validatePeerDependencies.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    Validate peer dependencies for the package rooted at `parentRoot`.
    @example
    ```typescript
    validatePeerDependencies(__dirname);
    ```
    @param parentRoot -
    The directory containing the `package.json` to validate. Typically this
    should be specified via `__dirname`.
    @param [options]
    @param {boolean | Map<unkown,unknown>} options.cache -
    Set to `false` to disabling caching or provide a `Map` to control cache
    sharing. The contents of the map are opaque.
    @param [options.handleFailure] -
    Specify a custom handler for errors. This can be useful to provide better
    errors for your particular context.
    @param [options.resolvePeerDependenciesFrom] -
    The path that should be used as the starting point for resolving
    `peerDependencies` from.
    */
  inline def apply(parentRoot: String): Unit = ^.asInstanceOf[js.Dynamic].apply(parentRoot.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(parentRoot: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].apply(parentRoot.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("validate-peer-dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    Treat `pkg` as being present, overriding whatever is found in `node_modules`.
    This is often useful during development when linking to a library that has peer dependencies.
    */
  inline def assumeProvided(pkg: Name): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assumeProvided")(pkg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
      Set to `false` to disabling caching or provide a `Map` to control cache
      sharing. The contents of the map are opaque.
      */
    var cache: js.UndefOr[Boolean | (Map[Any, Any])] = js.undefined
    
    /**
      Specify a custom handler for errors. This can be useful to provide better
      errors for your particular context.
      */
    var handleFailure: js.UndefOr[js.Function1[/* result */ Any, Unit]] = js.undefined
    
    /**
      The path that should be used as the starting point for resolving
      `peerDependencies` from
      */
    var resolvePeerDependenciesFrom: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean | (Map[Any, Any])): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setHandleFailure(value: /* result */ Any => Unit): Self = StObject.set(x, "handleFailure", js.Any.fromFunction1(value))
      
      inline def setHandleFailureUndefined: Self = StObject.set(x, "handleFailure", js.undefined)
      
      inline def setResolvePeerDependenciesFrom(value: String): Self = StObject.set(x, "resolvePeerDependenciesFrom", value.asInstanceOf[js.Any])
      
      inline def setResolvePeerDependenciesFromUndefined: Self = StObject.set(x, "resolvePeerDependenciesFrom", js.undefined)
    }
  }
}
