package typings.videoJs.videoCoreMod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.ConstructorParameters
import typings.std.Element
import typings.std.InstanceType
import typings.std.Record
import typings.videoJs.mod.videojs.Browser
import typings.videoJs.mod.videojs.Dom
import typings.videoJs.mod.videojs.EventTarget.Event
import typings.videoJs.mod.videojs.EventTarget.EventListener
import typings.videoJs.mod.videojs.Hook.BeforeSetup
import typings.videoJs.mod.videojs.Hook.Setup
import typings.videoJs.mod.videojs.LanguageTranslations
import typings.videoJs.mod.videojs.Log
import typings.videoJs.mod.videojs.Middleware
import typings.videoJs.mod.videojs.PlayerOptions
import typings.videoJs.mod.videojs.ReadyCallback
import typings.videoJs.mod.videojs.TimeRange
import typings.videoJs.mod.videojs.XhrObject
import typings.videoJs.mod.videojs.url.URLObject
import typings.videoJs.videoCoreMod.default.^
import typings.videoJs.videoJsStrings.beforesetup
import typings.videoJs.videoJsStrings.setup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(id: String): typings.videoJs.mod.videojs.Player = ^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any]).asInstanceOf[typings.videoJs.mod.videojs.Player]
inline def apply(id: String, options: Unit, ready: ReadyCallback): typings.videoJs.mod.videojs.Player = (^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any], ready.asInstanceOf[js.Any])).asInstanceOf[typings.videoJs.mod.videojs.Player]
inline def apply(id: String, options: PlayerOptions): typings.videoJs.mod.videojs.Player = (^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.videoJs.mod.videojs.Player]
inline def apply(id: String, options: PlayerOptions, ready: ReadyCallback): typings.videoJs.mod.videojs.Player = (^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any], ready.asInstanceOf[js.Any])).asInstanceOf[typings.videoJs.mod.videojs.Player]
inline def apply(id: Element): typings.videoJs.mod.videojs.Player = ^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any]).asInstanceOf[typings.videoJs.mod.videojs.Player]
inline def apply(id: Element, options: Unit, ready: ReadyCallback): typings.videoJs.mod.videojs.Player = (^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any], ready.asInstanceOf[js.Any])).asInstanceOf[typings.videoJs.mod.videojs.Player]
inline def apply(id: Element, options: PlayerOptions): typings.videoJs.mod.videojs.Player = (^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.videoJs.mod.videojs.Player]
inline def apply(id: Element, options: PlayerOptions, ready: ReadyCallback): typings.videoJs.mod.videojs.Player = (^.asInstanceOf[js.Dynamic].apply(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any], ready.asInstanceOf[js.Any])).asInstanceOf[typings.videoJs.mod.videojs.Player]

/**
  * Whether or not the browser supports touch events. Included for backward
  * compatibility with 4.x, but deprecated. Use `browser.TOUCH_ENABLED`
  * instead going forward.
  *
  * @deprecated since version 5.0
  */
inline def TOUCH_ENABLED: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("TOUCH_ENABLED").asInstanceOf[Boolean]

/**
  * Current software version. Follows semver.
  *
  */
inline def VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[String]

/**
  * Adding languages so that they're available to all players.
  * Example: `addLanguage('es', { 'Hello': 'Hola' });`
  *
  * @param code
  *        The language code or dictionary property
  *
  * @param data
  *        The data values to be translated
  *
  * @return The resulting language dictionary object
  */
inline def addLanguage(code: String, data: LanguageTranslations): LanguageTranslations = (^.asInstanceOf[js.Dynamic].applyDynamic("addLanguage")(code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[LanguageTranslations]

/**
  * Bind (a.k.a proxy or Context). A simple method for changing the context of a function
  * It also stores a unique id on the function so it can be easily removed from events.
  *
  * @param context
  *        The object to bind as scope.
  *
  * @param fn
  *        The function to be bound to a scope.
  *
  * @param [uid]
  *        An optional unique ID for the function to be set
  *
  * @return The new function that will be bound into the context given
  */
inline def bind[F /* <: js.Function0[Any] */](context: Any, fn: F): F = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(context.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[F]
inline def bind[F /* <: js.Function0[Any] */](context: Any, fn: F, uid: Double): F = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(context.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], uid.asInstanceOf[js.Any])).asInstanceOf[F]

/**
  * A suite of browser and device tests from {@link browser}.
  *
  */
inline def browser: Browser = ^.asInstanceOf[js.Dynamic].selectDynamic("browser").asInstanceOf[Browser]

/**
  * Should create a fake `TimeRange` object which mimics an HTML5 time range instance.
  *
  * @param start
  *        The start of a single range or an array of ranges
  *
  * @param end
  *        The end of a single range.
  */
inline def createTimeRanges(): TimeRange = ^.asInstanceOf[js.Dynamic].applyDynamic("createTimeRanges")().asInstanceOf[TimeRange]
inline def createTimeRanges(start: js.Array[TimeRange]): TimeRange = ^.asInstanceOf[js.Dynamic].applyDynamic("createTimeRanges")(start.asInstanceOf[js.Any]).asInstanceOf[TimeRange]
inline def createTimeRanges(start: js.Array[TimeRange], end: Double): TimeRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createTimeRanges")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[TimeRange]
inline def createTimeRanges(start: Double): TimeRange = ^.asInstanceOf[js.Dynamic].applyDynamic("createTimeRanges")(start.asInstanceOf[js.Any]).asInstanceOf[TimeRange]
inline def createTimeRanges(start: Double, end: Double): TimeRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createTimeRanges")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[TimeRange]
inline def createTimeRanges(start: Unit, end: Double): TimeRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createTimeRanges")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[TimeRange]

inline def dom: Dom = ^.asInstanceOf[js.Dynamic].selectDynamic("dom").asInstanceOf[Dom]

/**
  * Used to subclass an existing class by emulating ES subclassing using the extends keyword.
  * @param superClass super component to extend
  * @param [subClassMethods] methods sub class will add to super
  */
inline def extend[TSuper /* <: Instantiable1[/* args (repeated) */ Any, Any] */, TSubClassMethods /* <: Record[
String | js.Symbol, 
js.ThisFunction1[/* this */ InstanceType[TSuper], /* repeated */ Any, Any]] */](superClass: TSuper): Instantiable1[/* args */ ConstructorParameters[TSuper], InstanceType[TSuper] & TSubClassMethods] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(superClass.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* args */ ConstructorParameters[TSuper], InstanceType[TSuper] & TSubClassMethods]]
inline def extend[TSuper /* <: Instantiable1[/* args (repeated) */ Any, Any] */, TSubClassMethods /* <: Record[
String | js.Symbol, 
js.ThisFunction1[/* this */ InstanceType[TSuper], /* repeated */ Any, Any]] */](superClass: TSuper, subClassMethods: TSubClassMethods): Instantiable1[/* args */ ConstructorParameters[TSuper], InstanceType[TSuper] & TSubClassMethods] = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(superClass.asInstanceOf[js.Any], subClassMethods.asInstanceOf[js.Any])).asInstanceOf[Instantiable1[/* args */ ConstructorParameters[TSuper], InstanceType[TSuper] & TSubClassMethods]]

/**
  * Format seconds as a time string, H:MM:SS or M:SS. Supplying a guide (in seconds)
  * will force a number of leading zeros to cover the length of the guide.
  *
  * @param seconds
  *        Number of seconds to be turned into a string
  *
  * @param guide
  *        Number (in seconds) to model the string after
  *
  * @return Time formatted as H:MM:SS or M:SS
  */
inline def formatTime(seconds: Double, guide: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatTime")(seconds.asInstanceOf[js.Any], guide.asInstanceOf[js.Any])).asInstanceOf[String]

/**
  * Returns an array of all current players.
  *
  * @return An array of all players. The array will be in the order that
  *         `Object.keys` provides, which could potentially vary between
  *         JavaScript engines.
  *
  */
inline def getAllPlayers(): js.Array[typings.videoJs.mod.videojs.Player] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllPlayers")().asInstanceOf[js.Array[typings.videoJs.mod.videojs.Player]]

/**
  * Get a component class object by name
  *
  * @borrows Component.getComponent as getComponent
  */
/* was `typeof Component.getComponent` */
inline def getComponent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Component.getComponent */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("getComponent").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Component.getComponent */ Any]

/**
  * Get a single player based on an ID or DOM element.
  *
  * This is useful if you want to check if an element or ID has an associated
  * Video.js player, but not create one if it doesn't.
  *
  * @param id
  *          An HTML element - `<video>`, `<audio>`, or `<video-js>` -
  *          or a string matching the `id` of such an element.
  *
  * @return    A player instance or `undefined` if there is no player instance
  *          matching the argument.
  */
inline def getPlayer(id: String): js.UndefOr[typings.videoJs.mod.videojs.Player] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlayer")(id.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.videoJs.mod.videojs.Player]]
inline def getPlayer(id: Element): js.UndefOr[typings.videoJs.mod.videojs.Player] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlayer")(id.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.videoJs.mod.videojs.Player]]

/**
  * Get an object with the currently created players, keyed by player ID
  *
  * @return    The created players
  */
inline def getPlayers(): StringDictionary[typings.videoJs.mod.videojs.Player] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlayers")().asInstanceOf[StringDictionary[typings.videoJs.mod.videojs.Player]]

/**
  * Gets a plugin by name if it exists.
  *
  * @param name
  *         The name of a plugin.
  *
  * @return    The plugin (or `undefined`).
  */
/* was `typeof Plugin.getPlugin` */
inline def getPlugin: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.getPlugin */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("getPlugin").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.getPlugin */ Any]

/**
  * Gets a plugin's version, if available
  *
  * @param name
  *         The name of a plugin.
  *
  * @return    The plugin's version or an empty string.
  */
/* was `typeof Plugin.getPluginVersion` */
inline def getPluginVersion: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.getPluginVersion */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("getPluginVersion").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.getPluginVersion */ Any]

/**
  * Gets an object containing multiple Video.js plugins.
  *
  * @param [names]
  *         If provided, should be an array of plugin names. Defaults to _all_
  *         plugin names.
  *
  * @return    An object containing plugin(s) associated with their name(s) or
  *         `undefined` if no matching plugins exist).
  */
/* was `typeof Plugin.getPlugins` */
inline def getPlugins: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.getPlugins */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("getPlugins").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.getPlugins */ Any]

/**
  * Get a Tech class object by name
  *
  * @borrows Tech.getTech as getTech
  */
/* was `typeof Tech.getTech` */
inline def getTech: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Tech.getTech */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("getTech").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Tech.getTech */ Any]

/**
  * Add a function hook that will only run once to a specific videojs lifecycle.
  *
  * @param type
  *        the lifecycle to hook the function to.
  *
  * @param fn
  *        The function or array of functions to attach.
  */
inline def hookOnce(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hookOnce")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def hookOnce(`type`: String, fn: js.Array[js.Function0[Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookOnce")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def hookOnce(`type`: String, fn: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hookOnce")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def hook_beforesetup(`type`: beforesetup, fn: js.Array[BeforeSetup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def hook_beforesetup(`type`: beforesetup, fn: BeforeSetup): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def hook_setup(`type`: setup, fn: js.Array[Setup]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
/**
  * Add a function hook to a specific videojs lifecycle.
  *
  * @param type
  *        the lifecycle to hook the function to.
  *
  * @param fn
  *        The function or array of functions to attach.
  */
inline def hook_setup(`type`: setup, fn: Setup): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hook")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Get a list of hooks for a specific lifecycle
  *
  * @param type
  *        the lifecycle to get hooks from
  *
  * @param [fn]
  *        Optionally add a hook (or hooks) to the lifecycle that your are getting.
  *
  * @return    an array of hooks, or an empty array if there are none.
  */
inline def hooks(`type`: String): js.Array[js.Function0[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("hooks")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Function0[Any]]]
inline def hooks(`type`: String, fn: js.Array[js.Function0[Any]]): js.Array[js.Function0[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("hooks")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function0[Any]]]
inline def hooks(`type`: String, fn: js.Function0[Any]): js.Array[js.Function0[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("hooks")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function0[Any]]]

/**
  * Returns whether the url passed is a cross domain request or not.
  *
  * @param url
  *        The url to check.
  *
  * @return    Whether it is a cross domain request or not.
  */
inline def isCrossOrigin(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCrossOrigin")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Log messages
  *
  * @borrows log:log as log
  */
inline def log: Log = ^.asInstanceOf[js.Dynamic].selectDynamic("log").asInstanceOf[Log]

/**
  * Deep-merge one or more options objects, recursively merging **only** plain
  * object properties.
  *
  * @param sources
  *          One or more objects to merge into a new object.
  *
  * @return    A new object that is the merged result of all sources.
  */
inline def mergeOptions[A, B, C, D, E, F](option: A): A & B & C & D & E & F = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any]).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D, option5: E): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D, option5: E, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D, option5: Unit, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: Unit, option5: E): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: Unit, option5: E, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: Unit, option5: Unit, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: Unit, option4: D): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: Unit, option4: D, option5: E): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: Unit, option4: D, option5: E, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: Unit, option4: D, option5: Unit, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: Unit, option4: Unit, option5: E): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: Unit, option4: Unit, option5: E, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: Unit, option4: Unit, option5: Unit, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: C): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: C, option4: D): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: C, option4: D, option5: E): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: C, option4: D, option5: E, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: C, option4: D, option5: Unit, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: C, option4: Unit, option5: E): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: C, option4: Unit, option5: E, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: C, option4: Unit, option5: Unit, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: Unit, option4: D): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: Unit, option4: D, option5: E): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: Unit, option4: D, option5: E, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: Unit, option4: D, option5: Unit, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: Unit, option4: Unit, option5: E): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: Unit, option4: Unit, option5: E, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]
inline def mergeOptions[A, B, C, D, E, F](option: A, option2: Unit, option3: Unit, option4: Unit, option5: Unit, option6: F): A & B & C & D & E & F = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A & B & C & D & E & F]

/**
  * Removes event listeners from an element
  *
  * @param elem
  *        Object to remove listeners from.
  *
  * @param [type]
  *        Type of listener to remove. Don't include to remove all events from element.
  *
  * @param [fn]
  *        Specific listener to remove. Don't include to remove listeners for an event
  *        type.
  */
inline def off(elem: Element, `type`: String, fn: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(elem.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Add an event listener to element
  * It stores the handler function in a separate cache object
  * and adds a generic handler to the element's event,
  * along with a unique id (guid) to the element.
  *
  * @param elem
  *        Element or object to bind listeners to
  *
  * @param type
  *        Type of event to bind to.
  *
  * @param fn
  *        Event listener.
  */
inline def on(elem: Element, `type`: String, fn: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(elem.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def on(elem: Element, `type`: js.Array[String], fn: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(elem.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * Trigger a listener only once for an event
  *
  * @param elem
  *        Element or object to bind to.
  *
  * @param type
  *        Name/type of event
  *
  * @param fn
  *        Event Listener function
  */
inline def one(elem: Element, `type`: String, fn: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(elem.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def one(elem: Element, `type`: js.Array[String], fn: EventListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("one")(elem.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * The global options object. These are the settings that take effect
  * if no overrides are specified when the player is created.
  *
  */
inline def options: PlayerOptions = ^.asInstanceOf[js.Dynamic].selectDynamic("options").asInstanceOf[PlayerOptions]

/**
  * Resolve and parse the elements of a URL.
  *
  * @param url
  *         The url to parse
  *
  * @return    An object of url details
  */
inline def parseUrl(url: String): URLObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[URLObject]

/**
  * Register a Video.js plugin.
  *
  * @borrows plugin:registerPlugin as registerPlugin
  *
  * @param name
  *         The name of the plugin to be registered. Must be a string and
  *         must not match an existing plugin or a method on the `Player`
  *         prototype.
  *
  * @param plugin
  *         A sub-class of `Plugin` or a function for basic plugins.
  *
  * @return    For advanced plugins, a factory function for that plugin. For
  *         basic plugins, a wrapper function that initializes the plugin.
  */
/* was `typeof Plugin.registerPlugin` */
inline def plugin: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.registerPlugin */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("plugin").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.registerPlugin */ Any]

/**
  * Register a component so it can referred to by name. Used when adding to other
  * components, either through addChild `component.addChild('myComponent')` or through
  * @default children options  `{ children: ['myComponent'] }`.
  *
  * > NOTE: You could also just initialize the component before adding.
  * `component.addChild(new MyComponent());`
  *
  * @param name
  *        The class name of the component
  *
  * @param comp
  *        The component class
  *
  * @return    The newly registered component
  */
/* was `typeof Component.registerComponent` */
inline def registerComponent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Component.registerComponent */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("registerComponent").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Component.registerComponent */ Any]

/**
  * Register a Video.js plugin.
  *
  * @borrows plugin:registerPlugin as registerPlugin
  *
  * @param name
  *         The name of the plugin to be registered. Must be a string and
  *         must not match an existing plugin or a method on the `Player`
  *         prototype.
  *
  * @param plugin
  *         A sub-class of `Plugin` or a function for basic plugins.
  *
  * @return    For advanced plugins, a factory function for that plugin. For
  *         basic plugins, a wrapper function that initializes the plugin.
  */
/* was `typeof Plugin.registerPlugin` */
inline def registerPlugin: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.registerPlugin */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("registerPlugin").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.registerPlugin */ Any]

/**
  * Register a Tech so it can referred to by name.
  * This is used in the tech order for the player.
  *
  * @borrows Tech.registerTech as registerTech
  */
/* was `typeof Tech.registerTech` */
inline def registerTech: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Tech.registerTech */ Any = ^.asInstanceOf[js.Dynamic].selectDynamic("registerTech").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Tech.registerTech */ Any]

/**
  * Remove a hook from a specific videojs lifecycle.
  *
  * @param type
  *        the lifecycle that the function hooked to
  *
  * @param fn
  *        The hooked function to remove
  *
  * @return    The function that was removed or undef
  */
inline def removeHook(`type`: String, fn: js.Function0[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("removeHook")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Resets formatTime to the default implementation.
  */
inline def resetFormatTime(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetFormatTime")().asInstanceOf[Unit]

/**
  * Replaces the default formatTime implementation with a custom implementation.
  *
  * @param customImplementation
  *        A function which will be used in place of the default formatTime implementation.
  *        Will receive the current time in seconds and the guide (in seconds) as arguments.
  */
inline def setFormatTime(customImplementation: js.Function2[/* seconds */ Double, /* guide */ Double, String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFormatTime")(customImplementation.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def trigger(elem: Element, event: String): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(elem.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
inline def trigger(elem: Element, event: String, hash: Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(elem.asInstanceOf[js.Any], event.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
/**
  * Trigger an event for an element
  *
  * @param elem
  *        Element to trigger an event on
  *
  * @param event
  *        A string (the type) or an event object with a type attribute
  *
  * @param [hash]
  *        data hash to pass along with the event
  *
  * @return    - Returns the opposite of `defaultPrevented` if default was prevented
  *         - Otherwise returns undefined
  */
inline def trigger(elem: Element, event: Event): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(elem.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
inline def trigger(elem: Element, event: Event, hash: Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(elem.asInstanceOf[js.Any], event.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]

/**
  * Register a middleware to a source type.
  *
  * @param type A string representing a MIME type.
  * @param middleware A middleware factory that takes a player.
  */
inline def use(
  `type`: String,
  middleware: js.Function1[/* player */ typings.videoJs.mod.videojs.Player, Middleware]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("use")(`type`.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * A cross-browser XMLHttpRequest wrapper. Here's a simple example:
  *
  * @param options
  *        settings for the request.
  *
  * @return The request object.
  *
  * @see https://github.com/Raynos/xhr
  */
inline def xhr: XhrObject = ^.asInstanceOf[js.Dynamic].selectDynamic("xhr").asInstanceOf[XhrObject]
