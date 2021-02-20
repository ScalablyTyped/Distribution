package typings.uirouterAngularjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.uirouterAngularjs.interfaceMod.Ng1StateDeclaration
import typings.uirouterCore.commonCommonMod.Obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    /**
      * Asynchronously injects a resolve block.
      *
      * This emulates most of the behavior of the ui-router 0.2.x $resolve.resolve() service API.
      *
      * ### Not bundled by default
      *
      * This API is no longer not part of the standard `@uirouter/angularjs` bundle.
      * For users of the prebuilt bundles, add the `release/resolveService.min.js` UMD bundle.
      * For bundlers (webpack, browserify, etc), add `@uirouter/angularjs/lib/legacy/resolveService`.
      *
      * ---
      *
      * Given an object `invocables`, where keys are strings and values are injectable functions,
      * injects each function, and waits for the resulting promise to resolve.
      * When all resulting promises are resolved, returns the results as an object.
      *
      * #### Example:
      * ```js
      * let invocables = {
      *   foo: [ '$http', ($http) =>
      *            $http.get('/api/foo').then(resp => resp.data) ],
      *   bar: [ 'foo', '$http', (foo, $http) =>
      *            $http.get('/api/bar/' + foo.barId).then(resp => resp.data) ]
      * }
      * $resolve.resolve(invocables)
      *     .then(results => console.log(results.foo, results.bar))
      * // Logs foo and bar:
      * // { id: 123, barId: 456, fooData: 'foo data' }
      * // { id: 456, barData: 'bar data' }
      * ```
      *
      * @param invocables an object which looks like an [[StateDeclaration.resolve]] object; keys are resolve names and values are injectable functions
      * @param locals key/value pre-resolved data (locals)
      * @param parent a promise for a "parent resolve"
      */
    def resolve(invocables: StringDictionary[js.Function]): js.Promise[Obj] = js.native
    def resolve(
      invocables: StringDictionary[js.Function],
      locals: js.UndefOr[scala.Nothing],
      parent: js.Promise[_]
    ): js.Promise[Obj] = js.native
    def resolve(invocables: StringDictionary[js.Function], locals: js.Object): js.Promise[Obj] = js.native
    def resolve(invocables: StringDictionary[js.Function], locals: js.Object, parent: js.Promise[_]): js.Promise[Obj] = js.native
  }
  
  @js.native
  trait Component extends StObject {
    
    var component: js.UndefOr[String] = js.native
    
    var template: js.UndefOr[String] = js.native
  }
  object Component {
    
    @scala.inline
    def apply(): Component = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Component]
    }
    
    @scala.inline
    implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  @js.native
  trait Instantiable extends Instantiable0[Ng1StateDeclaration]
  
  @js.native
  trait Resolve extends StObject {
    
    def resolve(): js.Any = js.native
  }
  object Resolve {
    
    @scala.inline
    def apply(resolve: () => js.Any): Resolve = {
      val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction0(resolve))
      __obj.asInstanceOf[Resolve]
    }
    
    @scala.inline
    implicit class ResolveMutableBuilder[Self <: Resolve] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolve(value: () => js.Any): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
    }
  }
}
