package typings.webpackEnv.WebpackModuleApi

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeModule
import typings.node.NodeRequire
import typings.std.RegExp
import typings.webpackEnv.webpackEnvStrings.`lazy-once`
import typings.webpackEnv.webpackEnvStrings.`lazy`
import typings.webpackEnv.webpackEnvStrings.eager
import typings.webpackEnv.webpackEnvStrings.sync
import typings.webpackEnv.webpackEnvStrings.weak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequireFunction extends js.Object {
  /**
    * Multiple requires to the same module result in only one module execution and only one export. Therefore a cache in the runtime exists. Removing values from this cache cause new module execution and a new export. This is only needed in rare cases (for compatibility!).
    */
  var cache: StringDictionary[NodeModule] = js.native
  /**
    * Returns the module id of a dependency. The call is sync. No request to the server is fired. The compiler ensures that the dependency is available.
    *
    * The module id is a number in webpack (in contrast to node.js where it is a string, the filename).
    */
  @JSName("resolve")
  var resolve_Original: typings.webpackEnv.NodeJS.RequireResolve = js.native
  /**
    * Returns the exports from a dependency. The call is sync. No request to the server is fired. The compiler ensures that the dependency is available.
    */
  def apply(path: String): js.Any = js.native
  /**
    * Behaves similar to require.ensure, but the callback is called with the exports of each dependency in the paths array. There is no option to provide a chunk name.
    */
  def apply(paths: js.Array[String], callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  def context(path: String): RequireContext = js.native
  def context(path: String, deep: Boolean): RequireContext = js.native
  def context(path: String, deep: Boolean, filter: RegExp): RequireContext = js.native
  @JSName("context")
  def context_eager(path: String, deep: Boolean, filter: RegExp, mode: eager): RequireContext = js.native
  @JSName("context")
  def context_lazy(path: String, deep: Boolean, filter: RegExp, mode: `lazy`): RequireContext = js.native
  @JSName("context")
  def context_lazyonce(path: String, deep: Boolean, filter: RegExp, mode: `lazy-once`): RequireContext = js.native
  @JSName("context")
  def context_sync(path: String, deep: Boolean, filter: RegExp, mode: sync): RequireContext = js.native
  @JSName("context")
  def context_weak(path: String, deep: Boolean, filter: RegExp, mode: weak): RequireContext = js.native
  /**
    * Download additional dependencies on demand. The paths array lists modules that should be available. When they are, callback is called. If the callback is a function expression, dependencies in that source part are extracted and also loaded on demand. A single request is fired to the server, except if all modules are already available.
    *
    * This creates a chunk. The chunk can be named. If a chunk with this name already exists, the dependencies are merged into that chunk and that chunk is used.
    */
  def ensure(paths: js.Array[String], callback: js.Function1[/* require */ NodeRequire, Unit]): Unit = js.native
  def ensure(
    paths: js.Array[String],
    callback: js.Function1[/* require */ NodeRequire, Unit],
    chunkName: String
  ): Unit = js.native
  def ensure(
    paths: js.Array[String],
    callback: js.Function1[/* require */ NodeRequire, Unit],
    errorCallback: js.Function1[/* error */ js.Any, Unit]
  ): Unit = js.native
  def ensure(
    paths: js.Array[String],
    callback: js.Function1[/* require */ NodeRequire, Unit],
    errorCallback: js.Function1[/* error */ js.Any, Unit],
    chunkName: String
  ): Unit = js.native
  /**
    * Ensures that the dependency is available, but don’t execute it. This can be use for optimizing the position of a module in the chunks.
    */
  def include(path: String): Unit = js.native
  /**
    * Returns the module id of a dependency. The call is sync. No request to the server is fired. The compiler ensures that the dependency is available.
    *
    * The module id is a number in webpack (in contrast to node.js where it is a string, the filename).
    */
  def resolve(id: String): String | Double = js.native
  /**
    * Like require.resolve, but doesn’t include the module into the bundle. It’s a weak dependency.
    */
  def resolveWeak(path: String): Double | String = js.native
}

