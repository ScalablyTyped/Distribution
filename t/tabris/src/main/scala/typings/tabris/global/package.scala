package typings.tabris.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def _empty(attributes: scala.Null, children: java.lang.String): java.lang.String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def _empty(
  attributes: scala.Null,
  children: js.Array[scala.Null | java.lang.String | scala.Double | scala.Boolean]
): java.lang.String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def _empty(attributes: scala.Null, children: scala.Boolean): java.lang.String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def _empty(attributes: scala.Null, children: scala.Double): java.lang.String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def _empty(attributes: scala.Null, children: typings.tabris.mod.JSXChildren[typings.tabris.mod.Widget]): typings.tabris.mod.WidgetCollection[typings.tabris.mod.Widget] = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.tabris.mod.WidgetCollection[typings.tabris.mod.Widget]]
/**
  * A JSX stateless functional component that groups all given widgets in a WidgetCollection
  * @param attributes This parameter needs to be null since <$> does not support any attributes
  * @param children The widgets to be included in the resulting WidgetCollection instance.
  */
inline def _empty(
  attributes: typings.tabris.anon.Children,
  children: typings.tabris.mod.JSXChildren[typings.tabris.mod.Widget]
): typings.tabris.mod.WidgetCollection[typings.tabris.mod.Widget] = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.tabris.mod.WidgetCollection[typings.tabris.mod.Widget]]
/**
  * A JSX stateless functional component that joins any given content in to a single string.
  * @param attributes This parameter needs to be null since <$> does not support any attributes.
  * @param children The content of the resulting string.
  */
inline def _empty(attributes: typings.tabris.anon.`0`, children: java.lang.String): java.lang.String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def _empty(
  attributes: typings.tabris.anon.`0`,
  children: js.Array[scala.Null | java.lang.String | scala.Double | scala.Boolean]
): java.lang.String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def _empty(attributes: typings.tabris.anon.`0`, children: scala.Boolean): java.lang.String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
inline def _empty(attributes: typings.tabris.anon.`0`, children: scala.Double): java.lang.String = (js.Dynamic.global.applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
/**
  * Returns the non-disposed `NativeObject` instance (e.g. a widget) associated with the given cid
  * number. The number can be obtained via the [cid](./NativeObject.md#cid) property. Example: If the cid
  * of an object is `'$23'` it can be obtained by `$(23)`. The cid is visible in the log when passing a
  * NativeObject to any log method, e.g. [`console.log(widget)`](./console.md#logvalues), or
  * [`console.dirxml(widget)`](./console.md#dirxmlobject). The native object may then be obtained using
  * the developer console or the interactive console feature for the tabris CLI serve command.
  * This feature is meant for debugging purposes only. **Using it in production code is dangerous since
  * it allows interfering with the internals of the framework or encapsulated components.** Also, the
  * `cid` of a NativeObject is not stable, meaning it can change each time the code is executed.
  * @param cidNumber The cid number is the trailing part of the [cid](./NativeObject.md#cid) property string.
  */
inline def _empty(cidNumber: scala.Double): typings.tabris.mod.NativeObject = js.Dynamic.global.applyDynamic("$")(cidNumber.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.NativeObject]
// $
/**
  * A shortcut to [`tabris.contentView.find()`](./Composite.md#findselector). Returns a collection
  * containing all descendants of contentView that match the given selector. This does *not* include any
  * widgets in the drawer, a popover, or an encapsulated custom component. A custom component is
  * encapsulated if it overrides the `children()` method or uses the `@component` decorator.
  * @param selector A selector expression or a predicate function to filter the results.
  */
inline def _empty[Result /* <: typings.tabris.mod.Widget */](): typings.tabris.mod.WidgetCollection[Result] = js.Dynamic.global.applyDynamic("$")().asInstanceOf[typings.tabris.mod.WidgetCollection[Result]]
inline def _empty[Result /* <: typings.tabris.mod.Widget */](selector: typings.tabris.mod.Selector[typings.tabris.mod.Widget, Result]): typings.tabris.mod.WidgetCollection[Result] = js.Dynamic.global.applyDynamic("$")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.WidgetCollection[Result]]

// Timer
/**
  * Cancels the running interval associated with the given ID. When given an invalid ID, nothing happens.
  * @param id The ID that was returned by `setInterval`.
  */
inline def clearInterval(id: js.Any): scala.Unit = js.Dynamic.global.applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/**
  * Cancels the running timeout associated with the given ID. When given an invalid ID, nothing happens.
  * @param id The ID that was returned by `setTimeout`.
  */
inline def clearTimeout(id: js.Any): scala.Unit = js.Dynamic.global.applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def console: typings.tabris.Console = js.Dynamic.global.selectDynamic("console").asInstanceOf[typings.tabris.Console]
inline def console_=(x: typings.tabris.Console): scala.Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])

inline def cordova: typings.tabris.Cordova = js.Dynamic.global.selectDynamic("cordova").asInstanceOf[typings.tabris.Cordova]
inline def cordova_=(x: typings.tabris.Cordova): scala.Unit = js.Dynamic.global.updateDynamic("cordova")(x.asInstanceOf[js.Any])

inline def createImageBitmap: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof tabris.ImageBitmap.createImageBitmap */ js.Any = js.Dynamic.global.selectDynamic("createImageBitmap").asInstanceOf[/* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof tabris.ImageBitmap.createImageBitmap */ js.Any]
inline def createImageBitmap_=(
  x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof tabris.ImageBitmap.createImageBitmap */ js.Any
): scala.Unit = js.Dynamic.global.updateDynamic("createImageBitmap")(x.asInstanceOf[js.Any])

inline def crypto: typings.tabris.Crypto = js.Dynamic.global.selectDynamic("crypto").asInstanceOf[typings.tabris.Crypto]
inline def crypto_=(x: typings.tabris.Crypto): scala.Unit = js.Dynamic.global.updateDynamic("crypto")(x.asInstanceOf[js.Any])

inline def device: typings.tabris.mod.Device_ = js.Dynamic.global.selectDynamic("device").asInstanceOf[typings.tabris.mod.Device_]
inline def device_=(x: typings.tabris.mod.Device_): scala.Unit = js.Dynamic.global.updateDynamic("device")(x.asInstanceOf[js.Any])

inline def dirname: java.lang.String = js.Dynamic.global.selectDynamic("__dirname").asInstanceOf[java.lang.String]
inline def dirname_=(x: java.lang.String): scala.Unit = js.Dynamic.global.updateDynamic("__dirname")(x.asInstanceOf[js.Any])

inline def document: typings.std.Document = js.Dynamic.global.selectDynamic("document").asInstanceOf[typings.std.Document]
inline def document_=(x: typings.std.Document): scala.Unit = js.Dynamic.global.updateDynamic("document")(x.asInstanceOf[js.Any])

inline def exports: js.Object = js.Dynamic.global.selectDynamic("exports").asInstanceOf[js.Object]
inline def exports_=(x: js.Object): scala.Unit = js.Dynamic.global.updateDynamic("exports")(x.asInstanceOf[js.Any])

// fetch
inline def fetch(url: java.lang.String): js.Promise[typings.tabris.Response] = js.Dynamic.global.applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.Response]]
inline def fetch(url: java.lang.String, init: typings.tabris.RequestInit): js.Promise[typings.tabris.Response] = (js.Dynamic.global.applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.Response]]
inline def fetch(url: typings.tabris.Request): js.Promise[typings.tabris.Response] = js.Dynamic.global.applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.Response]]
inline def fetch(url: typings.tabris.Request, init: typings.tabris.RequestInit): js.Promise[typings.tabris.Response] = (js.Dynamic.global.applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.Response]]

inline def filename: java.lang.String = js.Dynamic.global.selectDynamic("__filename").asInstanceOf[java.lang.String]
inline def filename_=(x: java.lang.String): scala.Unit = js.Dynamic.global.updateDynamic("__filename")(x.asInstanceOf[js.Any])

inline def localStorage: typings.tabris.Storage = js.Dynamic.global.selectDynamic("localStorage").asInstanceOf[typings.tabris.Storage]
inline def localStorage_=(x: typings.tabris.Storage): scala.Unit = js.Dynamic.global.updateDynamic("localStorage")(x.asInstanceOf[js.Any])

inline def module: typings.tabris.mod.Module = js.Dynamic.global.selectDynamic("module").asInstanceOf[typings.tabris.mod.Module]
inline def module_=(x: typings.tabris.mod.Module): scala.Unit = js.Dynamic.global.updateDynamic("module")(x.asInstanceOf[js.Any])

inline def navigator: typings.std.Navigator = js.Dynamic.global.selectDynamic("navigator").asInstanceOf[typings.std.Navigator]
inline def navigator_=(x: typings.std.Navigator): scala.Unit = js.Dynamic.global.updateDynamic("navigator")(x.asInstanceOf[js.Any])

inline def plugins: typings.tabris.CordovaPlugins = js.Dynamic.global.selectDynamic("plugins").asInstanceOf[typings.tabris.CordovaPlugins]
inline def plugins_=(x: typings.tabris.CordovaPlugins): scala.Unit = js.Dynamic.global.updateDynamic("plugins")(x.asInstanceOf[js.Any])

inline def require: js.Function1[/* request */ java.lang.String, js.Object] = js.Dynamic.global.selectDynamic("require").asInstanceOf[js.Function1[/* request */ java.lang.String, js.Object]]
inline def require_=(x: js.Function1[/* request */ java.lang.String, js.Object]): scala.Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])

inline def secureStorage: typings.tabris.Storage = js.Dynamic.global.selectDynamic("secureStorage").asInstanceOf[typings.tabris.Storage]
inline def secureStorage_=(x: typings.tabris.Storage): scala.Unit = js.Dynamic.global.updateDynamic("secureStorage")(x.asInstanceOf[js.Any])

/**
  * Calls the given function repeatedly, each times waiting the given delay. The actual delay may be
  * slightly longer than the given one.
  * @param callback The function to call.
  * @param delay The delay in milliseconds.
  * @param params One or more values passed on to the callback.
  */
inline def setInterval(callback: js.Function, delay: scala.Double, params: js.Any*): js.Any = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Any]
inline def setInterval(callback: js.Function, delay: scala.Unit, params: js.Any*): js.Any = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Any]

/**
  * Calls the given function with `param` (and all following parameters) after the specified delay. The
  * actual delay may be slightly longer than the given one.
  * @param callback The function to call.
  * @param delay The delay in milliseconds.
  * @param params One or more values passed on to the callback.
  */
inline def setTimeout(callback: js.Function, delay: scala.Double, params: js.Any*): js.Any = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Any]
inline def setTimeout(callback: js.Function, delay: scala.Unit, params: js.Any*): js.Any = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Any]

inline def window: typings.tabris.Window = js.Dynamic.global.selectDynamic("window").asInstanceOf[typings.tabris.Window]
inline def window_=(x: typings.tabris.Window): scala.Unit = js.Dynamic.global.updateDynamic("window")(x.asInstanceOf[js.Any])
