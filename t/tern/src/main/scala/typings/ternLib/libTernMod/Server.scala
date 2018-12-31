package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  /**
    * Add a set of type definitions to the server. If `atFront` is true, they will be added before all other
    * existing definitions. Otherwise, they are added at the back.
    */
  def addDefs(defs: js.Array[Def]): scala.Unit = js.native
  def addDefs(defs: js.Array[Def], atFront: scala.Boolean): scala.Unit = js.native
  /**
    * Register a file with the server. Note that files can also be included in requests. When using this
    * to automatically load a dependency, specify the name of the file (as Tern knows it) as the third
    * argument. That way, the file is counted towards the dependency budget of the root of its dependency graph.
    */
  def addFile(name: java.lang.String): scala.Unit = js.native
  def addFile(name: java.lang.String, text: java.lang.String): scala.Unit = js.native
  def addFile(name: java.lang.String, text: java.lang.String, parent: java.lang.String): scala.Unit = js.native
  /** Unregister a file. */
  def delFile(name: java.lang.String): scala.Unit = js.native
  /**
    * Delete a set of type definitions from the server, by providing the name, taken from
    * `defs[!name]` property from the definitions. If that property is not available in the
    * current type definitions, it can’t be removed.
    */
  def deleteDefs(name: java.lang.String): scala.Unit = js.native
  /** Forces all files to be fetched an analyzed, and then calls the callback function. */
  def flush(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /** Load a server plugin (or don’t do anything, if the plugin is already loaded). */
  def loadPlugin(name: java.lang.String, options: js.Object): scala.Unit = js.native
  /** Unregister an event handler. */
  def off[K /* <: java.lang.String */](
    eventType: K,
    handler: /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.Events[K] */ js.Any
  ): scala.Unit = js.native
  /** Register an event handler for the named type of event. */
  def on[K /* <: java.lang.String */](
    eventType: K,
    handler: /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.Events[K] */ js.Any
  ): scala.Unit = js.native
  /**
    * Perform a request. `doc` is a (parsed) JSON document as described in the protocol documentation.
    * The `callback` function will be called when the request completes. If an `error` occurred,
    * it will be passed as a first argument. Otherwise, the `response` (parsed) JSON object will be passed as second argument.
    *
    * When the server hasn’t been configured to be asynchronous, the callback will be called before request returns.
    */
  def request[Q /* <: Query */, D /* <: Document */](
    doc: D with ternLib.Anon_Query[Q],
    callback: js.Function2[
      /* error */ js.UndefOr[stdLib.Error], 
      /* response */ js.UndefOr[js.Object | QueryResult[Q]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

