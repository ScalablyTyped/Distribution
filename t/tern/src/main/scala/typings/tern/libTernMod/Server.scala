package typings.tern.libTernMod

import org.scalablytyped.runtime.TopLevel
import typings.tern.Anon_Query
import typings.tern.libInferMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  val cx: Context = js.native
  val files: js.Array[File] = js.native
  val options: ConstructorOptions = js.native
  val plugins: js.Any = js.native
  /**
    * Add a set of type definitions to the server. If `atFront` is true, they will be added before all other
    * existing definitions. Otherwise, they are added at the back.
    */
  def addDefs(defs: js.Array[Def]): Unit = js.native
  def addDefs(defs: js.Array[Def], atFront: Boolean): Unit = js.native
  /**
    * Register a file with the server. Note that files can also be included in requests. When using this
    * to automatically load a dependency, specify the name of the file (as Tern knows it) as the third
    * argument. That way, the file is counted towards the dependency budget of the root of its dependency graph.
    */
  def addFile(name: String): Unit = js.native
  def addFile(name: String, text: String): Unit = js.native
  def addFile(name: String, text: String, parent: String): Unit = js.native
  /** Unregister a file. */
  def delFile(name: String): Unit = js.native
  /**
    * Delete a set of type definitions from the server, by providing the name, taken from
    * `defs[!name]` property from the definitions. If that property is not available in the
    * current type definitions, it can’t be removed.
    */
  def deleteDefs(name: String): Unit = js.native
  /** Forces all files to be fetched an analyzed, and then calls the callback function. */
  def flush(callback: js.Function0[Unit]): Unit = js.native
  /** Load a server plugin (or don’t do anything, if the plugin is already loaded). */
  def loadPlugin(name: String, options: js.Object): Unit = js.native
  /** Unregister an event handler. */
  def off[K /* <: String */](
    eventType: K,
    handler: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Events[K] */ js.Any
  ): Unit = js.native
  /** Register an event handler for the named type of event. */
  def on[K /* <: String */](
    eventType: K,
    handler: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Events[K] */ js.Any
  ): Unit = js.native
  /**
    * Perform a request. `doc` is a (parsed) JSON document as described in the protocol documentation.
    * The `callback` function will be called when the request completes. If an `error` occurred,
    * it will be passed as a first argument. Otherwise, the `response` (parsed) JSON object will be passed as second argument.
    *
    * When the server hasn’t been configured to be asynchronous, the callback will be called before request returns.
    */
  def request[Q /* <: Query */, D /* <: Document */](
    doc: D with Anon_Query[Q],
    callback: js.Function2[
      /* error */ String | Null, 
      /* response */ js.UndefOr[js.Object | QueryResult[Q]], 
      Unit
    ]
  ): Unit = js.native
  def reset(): Unit = js.native
  def signal(event: String, file: File): Unit = js.native
}

@JSImport("tern/lib/tern", "Server")
@js.native
object Server extends TopLevel[TernConstructor]

