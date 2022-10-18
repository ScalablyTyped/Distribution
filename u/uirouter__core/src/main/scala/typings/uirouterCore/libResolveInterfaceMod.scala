package typings.uirouterCore

import typings.uirouterCore.anon.EAGER
import typings.uirouterCore.anon.NOWAIT
import typings.uirouterCore.libStateInterfaceMod.ResolveTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResolveInterfaceMod {
  
  object resolvePolicies {
    
    @JSImport("@uirouter/core/lib/resolve/interface", "resolvePolicies")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@uirouter/core/lib/resolve/interface", "resolvePolicies.async")
    @js.native
    def async: NOWAIT = js.native
    inline def async_=(x: NOWAIT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("async")(x.asInstanceOf[js.Any])
    
    @JSImport("@uirouter/core/lib/resolve/interface", "resolvePolicies.when")
    @js.native
    def when: EAGER = js.native
    inline def when_=(x: EAGER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("when")(x.asInstanceOf[js.Any])
  }
  
  type CustomAsyncPolicy = js.Function1[/* data */ Any, js.Promise[Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.uirouterCore.uirouterCoreStrings.WAIT
    - typings.uirouterCore.uirouterCoreStrings.NOWAIT
    - typings.uirouterCore.libResolveInterfaceMod.CustomAsyncPolicy
  */
  type PolicyAsync = _PolicyAsync | CustomAsyncPolicy
  
  /* Rewritten from type alias, can be one of: 
    - typings.uirouterCore.uirouterCoreStrings.LAZY
    - typings.uirouterCore.uirouterCoreStrings.EAGER
  */
  trait PolicyWhen extends StObject
  object PolicyWhen {
    
    inline def EAGER: typings.uirouterCore.uirouterCoreStrings.EAGER = "EAGER".asInstanceOf[typings.uirouterCore.uirouterCoreStrings.EAGER]
    
    inline def LAZY: typings.uirouterCore.uirouterCoreStrings.LAZY = "LAZY".asInstanceOf[typings.uirouterCore.uirouterCoreStrings.LAZY]
  }
  
  trait ProviderLike
    extends StObject
       with ResolveTypes {
    
    var deps: js.UndefOr[js.Array[Any]] = js.undefined
    
    var provide: Any
    
    var useClass: js.UndefOr[Any] = js.undefined
    
    var useExisting: js.UndefOr[Any] = js.undefined
    
    var useFactory: js.UndefOr[js.Function] = js.undefined
    
    var useValue: js.UndefOr[Any] = js.undefined
  }
  object ProviderLike {
    
    inline def apply(provide: Any): ProviderLike = {
      val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderLike]
    }
    
    extension [Self <: ProviderLike](x: Self) {
      
      inline def setDeps(value: js.Array[Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
      
      inline def setDepsVarargs(value: Any*): Self = StObject.set(x, "deps", js.Array(value*))
      
      inline def setProvide(value: Any): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
      
      inline def setUseClass(value: Any): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
      
      inline def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
      
      inline def setUseExisting(value: Any): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
      
      inline def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
      
      inline def setUseFactory(value: js.Function): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
      
      inline def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
      
      inline def setUseValue(value: Any): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
      
      inline def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
    }
  }
  
  trait ResolvableLiteral
    extends StObject
       with ResolveTypes {
    
    /** Pre-resolved data. */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * The Dependency Injection tokens
      *
      * This is an array of Dependency Injection tokens for the dependencies of the [[resolveFn]].
      *
      * The DI tokens are references to other `Resolvables`, or to other
      * services from the native DI system.
      */
    var deps: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Defines the Resolve Policy
      *
      * A policy that defines when to invoke the resolve,
      * and whether to wait for async and unwrap the data
      */
    var policy: js.UndefOr[ResolvePolicy] = js.undefined
    
    /**
      * A function which fetches the Resolvable's data
      *
      * A function which returns one of:
      *
      * - The resolved value (synchronously)
      * - A promise for the resolved value
      * - An Observable of the resolved value(s)
      *
      * This function will be provided the dependencies listed in [[deps]] as its arguments.
      * The resolve system will asynchronously fetch the dependencies before invoking this function.
      */
    var resolveFn: js.Function
    
    /**
      * A Dependency Injection token
      *
      * This Resolvable's DI token.
      * The Resolvable will be injectable elsewhere using the token.
      */
    var token: Any
  }
  object ResolvableLiteral {
    
    inline def apply(resolveFn: js.Function, token: Any): ResolvableLiteral = {
      val __obj = js.Dynamic.literal(resolveFn = resolveFn.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvableLiteral]
    }
    
    extension [Self <: ResolvableLiteral](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDeps(value: js.Array[Any]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
      
      inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
      
      inline def setDepsVarargs(value: Any*): Self = StObject.set(x, "deps", js.Array(value*))
      
      inline def setPolicy(value: ResolvePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setResolveFn(value: js.Function): Self = StObject.set(x, "resolveFn", value.asInstanceOf[js.Any])
      
      inline def setToken(value: Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolvePolicy extends StObject {
    
    /**
      * Determines the unwrapping behavior of asynchronous resolve values.
      *
      * - `WAIT` (default)
      *   - If a promise is returned from the resolveFn, wait for the promise before proceeding
      *   - The unwrapped value from the promise
      * - `NOWAIT`
      *   - If a promise is returned from the resolve, do not wait for the promise.
      *   - Any other value returned is wrapped in a promise.
      *   - The promise will not be unwrapped.
      *   - The promise itself will be provided when the resolve is injected or bound elsewhere.
      * - {@link CustomAsyncPolicy}
      *   - You can define a custom function that will be called with the resolveFn value.
      *   - This function must return a promise.
      *   - The transition will wait for this promise before proceeding
      *
      *   NOTE: The previous `RXWAIT` policy has become a CustomAsyncPolicy function exported in `@uirouter/rx` package.
      *
      * #### Example:
      * The `Transition` will not wait for the resolve promise(s) from `main` to settle before continuing.
      * Resolves for `main` will be provided to components wrapped in a `Promise`.
      *
      * The `Transition` will wait for the `main.home` resolve promises.
      * Resolved values will be unwrapped before being provided to components.
      * ```js
      * var mainState = {
      *   name: 'main',
      *   resolve: mainResolves, // defined elsewhere
      *   resolvePolicy: { async: 'NOWAIT' },
      * }
      * var homeState = {
      *   name: 'main.home',
      *   resolve: homeResolves, // defined elsewhere
      *   resolvePolicy: { async: 'WAIT' }, // default
      * }
      * ```
      */
    var async: js.UndefOr[PolicyAsync] = js.undefined
    
    /**
      * Defines when a Resolvable is resolved (fetched) during a transition
      *
      * - `LAZY` (default)
      *   - Resolved as the resolve's state is being entered
      * - `EAGER`
      *   - Resolved as the transition is starting
      *
      * #### Example:
      * Resolves for `main` and `main.home` are fetched when each state is entered.
      * All of `main` resolves are processed before fetching `main.home` resolves.
      * ```js
      * var state = {
      *   name: 'main',
      *   resolve: mainResolves, // defined elsewhere
      *   resolvePolicy: { when: 'LAZY' }, // default
      * }
      *
      * var state = {
      *   name: 'main.home',
      *   resolve: homeResolves, // defined elsewhere
      *   resolvePolicy: { when: 'LAZY' }, // default
      * }
      * ```
      *
      * #### Example:
      * Resolves for `main` and `main.home` are fetched at the same time when the transition starts.
      * This happens earlier in the lifecycle than when states are entered.
      * All of the `main` and `main.home` resolves are fetched as soon as possible.
      * ```js
      * var mainState = {
      *   name: 'main',
      *   resolve: mainResolves, // defined elsewhere
      *   resolvePolicy: { when: 'EAGER' },
      * }
      *
      * var homeState = {
      *   name: 'main.home',
      *   resolve: homeResolves, // defined elsewhere
      *   resolvePolicy: { when: 'EAGER' },
      * }
      * ```
      */
    var when: js.UndefOr[PolicyWhen] = js.undefined
  }
  object ResolvePolicy {
    
    inline def apply(): ResolvePolicy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolvePolicy]
    }
    
    extension [Self <: ResolvePolicy](x: Self) {
      
      inline def setAsync(value: PolicyAsync): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncFunction1(value: /* data */ Any => js.Promise[Any]): Self = StObject.set(x, "async", js.Any.fromFunction1(value))
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setWhen(value: PolicyWhen): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
  
  trait _PolicyAsync extends StObject
}
