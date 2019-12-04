package typings.atUirouterAngularjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Invocables extends js.Object {
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
  def resolve(invocables: StringDictionary[js.Function]): js.Promise[js.Object] = js.native
  def resolve(invocables: StringDictionary[js.Function], locals: js.Object): js.Promise[js.Object] = js.native
  def resolve(invocables: StringDictionary[js.Function], locals: js.Object, parent: js.Promise[_]): js.Promise[js.Object] = js.native
}

