package typings.tabris.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.anon.Headless
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Tabris")
@js.native
/**
  * The main object exported by the `tabris` module hosting all the classes and singletons it provides
  * (not listed here). It also provides low-level framework API required for bootstrapping and for some
  * extensions/plug-ins. <b>Caution!</b>: These APIs interact with the internals of the framework. Only
  * use them if you know what you are doing.
  * This object is also available in the global namespace as `tabris`. For technical reasons the
  * low-level API is available in TypeScript only when the object is explicitly imported.
  */
/* private */ open class Tabris_ () extends NativeObject {
  
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
  def _init(client: Any): Unit = js.native
  def _init(client: Any, options: Headless): Unit = js.native
  
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
  
  /**
    * Set this property to a positive number to see the log output from the current worker on a connected
    * [CLI](../tabris-cli.md). Has no effect in the main UI thread.
    * Defines the maximum delay (in milliseconds) between the call of a ${doc:Console} function (e.g.
    * `console.log()`) <em>from inside a ${doc:Worker}</em> and the matching [log event](#log) in the
    * parent thread. Since this interrupts the UI thread smaller values could impact UI responsiveness.
    * The feature is disabled by default (value `-1`), except for debug builds, where the default is
    * `2000`.
    * <b>Note:</b> You do <em>not</em> need to set this property to see the console output on the built-in
    * developer console, this is only for the CLI, or in cases where you record the log events in the UI
    * thread. It also has <em>no</em> effect on the log output of the main thread.
    */
  def logPushInterval: Double = js.native
  def logPushInterval_=(value: Double): Unit = js.native
  
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
    * Indicates that the framework has been fully initialized. This happens before the main application
    * module is parsed and executed, so it is only relevant for framework and plug-in developers.
    * @constant
    */
  val started: Boolean = js.native
  
  /**
    * @constant
    */
  var symbols: StringDictionary[js.Symbol] = js.native
  
  /**
    * The version of the tabris module.
    * @constant
    */
  val version: String = js.native
}
