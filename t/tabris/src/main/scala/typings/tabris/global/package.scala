package typings.tabris.global

import typings.std.Document
import typings.std.Navigator
import typings.tabris.Console
import typings.tabris.Cordova
import typings.tabris.CordovaPlugins
import typings.tabris.Crypto
import typings.tabris.RequestInit
import typings.tabris.Window
import typings.tabris.anon.ChildrenJSXChildren
import typings.tabris.anon.`12`
import typings.tabris.mod.Device_
import typings.tabris.mod.JSXChildren
import typings.tabris.mod.Module
import typings.tabris.mod.NativeObject
import typings.tabris.mod.Selector
import typings.tabris.mod.Widget
import typings.tabris.mod.WidgetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def _empty(attributes: Null, children: String): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: js.Array[Null | String | Double | Boolean]): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: Boolean): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: Double): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: JSXChildren[Widget[Any]]): WidgetCollection[Widget[Any]] = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[WidgetCollection[Widget[Any]]]
/**
  * A JSX stateless functional component that groups all given widgets in a WidgetCollection
  * @param attributes This parameter needs to be null since <$> does not support any attributes
  * @param children The widgets to be included in the resulting WidgetCollection instance.
  */
inline def _empty(attributes: ChildrenJSXChildren, children: JSXChildren[Widget[Any]]): WidgetCollection[Widget[Any]] = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[WidgetCollection[Widget[Any]]]
/**
  * A JSX stateless functional component that joins any given content in to a single string.
  * @param attributes This parameter needs to be null since <$> does not support any attributes.
  * @param children The content of the resulting string.
  */
inline def _empty(attributes: `12`, children: String): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: `12`, children: js.Array[Null | String | Double | Boolean]): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: `12`, children: Boolean): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: `12`, children: Double): String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
/**
  * Returns the non-disposed `NativeObject` instance (e.g. a widget) associated with the given cid
  * number. The number can be obtained via the [cid](./NativeObject.md#cid) property. Example: If the cid
  * of an object is `'$23'` it can be obtained by `$(23)`. The cid is visible in the log when passing a
  * NativeObject to any log method, e.g. [`console.log(widget)`](./Console.md#logvalues), or
  * [`console.dirxml(widget)`](./Console.md#dirxmlobject). The native object may then be obtained using
  * the developer console or the interactive console feature for the tabris CLI serve command.
  * This feature is meant for debugging purposes only. **Using it in production code is dangerous since
  * it allows interfering with the internals of the framework or encapsulated components.** Also, the
  * `cid` of a NativeObject is not stable, meaning it can change each time the code is executed.
  * @param cidNumber The cid number is the trailing part of the [cid](./NativeObject.md#cid) property string.
  */
inline def _empty(cidNumber: Double): NativeObject = js.Dynamic.global.applyDynamic("$")(cidNumber.asInstanceOf[js.Any]).asInstanceOf[NativeObject]
// $
/**
  * A shortcut to [`tabris.contentView.find()`](./Composite.md#findselector). Returns a collection
  * containing all descendants of contentView that match the given selector. This does *not* include any
  * widgets in the drawer, a popover, or an encapsulated custom component. A custom component is
  * encapsulated if it overrides the `children()` method or uses the `@component` decorator.
  * @param selector A selector expression or a predicate function to filter the results.
  */
inline def _empty[Result /* <: Widget[Any] */](): WidgetCollection[Result] = js.Dynamic.global.applyDynamic("$")().asInstanceOf[WidgetCollection[Result]]
inline def _empty[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result] = js.Dynamic.global.applyDynamic("$")(selector.asInstanceOf[js.Any]).asInstanceOf[WidgetCollection[Result]]

// Timer
/**
  * Cancels the running interval associated with the given ID. When given an invalid ID, nothing happens.
  * @param id The ID that was returned by `setInterval`.
  */
inline def clearInterval(id: Any): Unit = js.Dynamic.global.applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Cancels the running timeout associated with the given ID. When given an invalid ID, nothing happens.
  * @param id The ID that was returned by `setTimeout`.
  */
inline def clearTimeout(id: Any): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def console: Console = js.Dynamic.global.selectDynamic("console").asInstanceOf[Console]
inline def console_=(x: Console): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])

inline def cordova: Cordova = js.Dynamic.global.selectDynamic("cordova").asInstanceOf[Cordova]
inline def cordova_=(x: Cordova): Unit = js.Dynamic.global.updateDynamic("cordova")(x.asInstanceOf[js.Any])

inline def createImageBitmap: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof tabris.ImageBitmap.createImageBitmap */ Any = js.Dynamic.global.selectDynamic("createImageBitmap").asInstanceOf[/* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof tabris.ImageBitmap.createImageBitmap */ Any]
inline def createImageBitmap_=(
  x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof tabris.ImageBitmap.createImageBitmap */ Any
): Unit = js.Dynamic.global.updateDynamic("createImageBitmap")(x.asInstanceOf[js.Any])

inline def crypto: Crypto = js.Dynamic.global.selectDynamic("crypto").asInstanceOf[Crypto]
inline def crypto_=(x: Crypto): Unit = js.Dynamic.global.updateDynamic("crypto")(x.asInstanceOf[js.Any])

inline def device: Device_ = js.Dynamic.global.selectDynamic("device").asInstanceOf[Device_]
inline def device_=(x: Device_): Unit = js.Dynamic.global.updateDynamic("device")(x.asInstanceOf[js.Any])

inline def dirname: String = js.Dynamic.global.selectDynamic("__dirname").asInstanceOf[String]
inline def dirname_=(x: String): Unit = js.Dynamic.global.updateDynamic("__dirname")(x.asInstanceOf[js.Any])

inline def document: Document = js.Dynamic.global.selectDynamic("document").asInstanceOf[Document]
inline def document_=(x: Document): Unit = js.Dynamic.global.updateDynamic("document")(x.asInstanceOf[js.Any])

inline def exports: js.Object = js.Dynamic.global.selectDynamic("exports").asInstanceOf[js.Object]
inline def exports_=(x: js.Object): Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])

// fetch
inline def fetch(url: String): js.Promise[typings.tabris.Response] = js.Dynamic.global.applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.Response]]
inline def fetch(url: String, init: RequestInit): js.Promise[typings.tabris.Response] = (js.Dynamic.global.applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.Response]]
inline def fetch(url: typings.tabris.Request): js.Promise[typings.tabris.Response] = js.Dynamic.global.applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.Response]]
inline def fetch(url: typings.tabris.Request, init: RequestInit): js.Promise[typings.tabris.Response] = (js.Dynamic.global.applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.Response]]

inline def filename: String = js.Dynamic.global.selectDynamic("__filename").asInstanceOf[String]
inline def filename_=(x: String): Unit = js.Dynamic.global.updateDynamic("__filename")(x.asInstanceOf[js.Any])

inline def localStorage: typings.tabris.Storage = js.Dynamic.global.selectDynamic("localStorage").asInstanceOf[typings.tabris.Storage]
inline def localStorage_=(x: typings.tabris.Storage): Unit = js.Dynamic.global.updateDynamic("localStorage")(x.asInstanceOf[js.Any])

inline def module: Module = js.Dynamic.global.selectDynamic("module").asInstanceOf[Module]
inline def module_=(x: Module): Unit = js.Dynamic.global.updateDynamic("module")(x.asInstanceOf[js.Any])

inline def navigator: Navigator = js.Dynamic.global.selectDynamic("navigator").asInstanceOf[Navigator]
inline def navigator_=(x: Navigator): Unit = js.Dynamic.global.updateDynamic("navigator")(x.asInstanceOf[js.Any])

inline def plugins: CordovaPlugins = js.Dynamic.global.selectDynamic("plugins").asInstanceOf[CordovaPlugins]
inline def plugins_=(x: CordovaPlugins): Unit = js.Dynamic.global.updateDynamic("plugins")(x.asInstanceOf[js.Any])

inline def require: js.Function1[/* request */ String, js.Object] = js.Dynamic.global.selectDynamic("require").asInstanceOf[js.Function1[/* request */ String, js.Object]]
inline def require_=(x: js.Function1[/* request */ String, js.Object]): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])

inline def secureStorage: typings.tabris.Storage = js.Dynamic.global.selectDynamic("secureStorage").asInstanceOf[typings.tabris.Storage]
inline def secureStorage_=(x: typings.tabris.Storage): Unit = js.Dynamic.global.updateDynamic("secureStorage")(x.asInstanceOf[js.Any])

/**
  * Calls the given function repeatedly, each times waiting the given delay. The actual delay may be
  * slightly longer than the given one.
  * @param callback The function to call.
  * @param delay The delay in milliseconds.
  * @param params One or more values passed on to the callback.
  */
inline def setInterval(callback: js.Function, delay: Double, params: Any*): Any = (js.Dynamic.global.applyDynamic("setInterval")((scala.List(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).`++`(params.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
inline def setInterval(callback: js.Function, delay: Unit, params: Any*): Any = (js.Dynamic.global.applyDynamic("setInterval")((scala.List(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).`++`(params.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]

/**
  * Calls the given function with `param` (and all following parameters) after the specified delay. The
  * actual delay may be slightly longer than the given one.
  * @param callback The function to call.
  * @param delay The delay in milliseconds.
  * @param params One or more values passed on to the callback.
  */
inline def setTimeout(callback: js.Function, delay: Double, params: Any*): Any = (js.Dynamic.global.applyDynamic("setTimeout")((scala.List(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).`++`(params.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
inline def setTimeout(callback: js.Function, delay: Unit, params: Any*): Any = (js.Dynamic.global.applyDynamic("setTimeout")((scala.List(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).`++`(params.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]

inline def window: Window = js.Dynamic.global.selectDynamic("window").asInstanceOf[Window]
inline def window_=(x: Window): Unit = js.Dynamic.global.updateDynamic("window")(x.asInstanceOf[js.Any])
