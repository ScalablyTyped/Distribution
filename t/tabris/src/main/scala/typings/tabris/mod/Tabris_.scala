package typings.tabris.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Symbol
import typings.tabris.AnonHeadless
import typings.tabris.tabrisStrings.symbols
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Tabris")
@js.native
class Tabris_ protected () extends NativeObject {
  /**
    * Fired after a native event has been processed.
    */
  var onFlush: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired before certain native operations to render all modified layoutData objects.
    */
  var onLayout: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when a message is about to be printed to the console.
    */
  var onLog: Listeners[TabrisLogEvent[this.type]] = js.native
  /**
    * Fired after the client bridge has been installed but before `started` has been set to `true`.
    */
  var onStart: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the [*started*](#started) property has changed.
    */
  var onStartedChanged: ChangeListeners[this.type, typings.tabris.tabrisStrings.started] = js.native
  /**
    * Fired when the [*symbols*](#symbols) property has changed.
    */
  var onSymbolsChanged: ChangeListeners[this.type, symbols] = js.native
  /**
    * Indicates that the framework has been fully initialized. This happens before the main application
    * module is parsed and executed, so it is only relevant for framework and plug-in developers.
    */
  val started: Boolean = js.native
  var symbols: StringDictionary[Symbol] = js.native
  /**
    * The version of the tabris module.
    * @constant
    */
  val version: String = js.native
  /**
    * Adds a module to the internal module registry with an id relative to the app directory.
    * @param id
    * @param loaderFunction
    */
  def _defineModule(id: String, loaderFunction: ModuleLoader): Module = js.native
  /**
    * Initializes the framework and triggers the 'start' event.
    * @param client The client bridge provided by the native client.
    * @param options
    */
  def _init(client: js.Any): Unit = js.native
  def _init(client: js.Any, options: AnonHeadless): Unit = js.native
  /**
    * Callback for the native client to issue JavaScript events to the `NativeObject` with the given `cid`.
    * Triggers a flush event afterwards. Errors are caught and logged to the console. Returns true if the
    * event object has a `defaultPrevented` field set to true.
    * @param cid
    * @param eventType
    * @param eventData
    */
  def _notify(cid: String, eventType: String, eventData: js.Object): Boolean = js.native
  /* private */ def _start(client: js.Object): Unit = js.native
  /**
    * Sends all queued native operations to the native client and triggers the 'flush' event.
    */
  def flush(): Unit = js.native
}

