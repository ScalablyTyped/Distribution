package typings.videoJs.videoCoreNovttMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object default {
  
  @scala.inline
  def apply(id: js.Any): typings.videoJs.mod.videojs.Player = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("default")(id.asInstanceOf[js.Any]).asInstanceOf[typings.videoJs.mod.videojs.Player]
  @scala.inline
  def apply(id: js.Any, options: js.UndefOr[scala.Nothing], ready: js.Function0[scala.Unit]): typings.videoJs.mod.videojs.Player = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("default")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any], ready.asInstanceOf[js.Any])).asInstanceOf[typings.videoJs.mod.videojs.Player]
  @scala.inline
  def apply(id: js.Any, options: typings.videoJs.mod.videojs.PlayerOptions): typings.videoJs.mod.videojs.Player = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("default")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.videoJs.mod.videojs.Player]
  @scala.inline
  def apply(id: js.Any, options: typings.videoJs.mod.videojs.PlayerOptions, ready: js.Function0[scala.Unit]): typings.videoJs.mod.videojs.Player = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("default")(id.asInstanceOf[js.Any], options.asInstanceOf[js.Any], ready.asInstanceOf[js.Any])).asInstanceOf[typings.videoJs.mod.videojs.Player]
  
  /**
    * Whether or not the browser supports touch events. Included for backward
    * compatibility with 4.x, but deprecated. Use `browser.TOUCH_ENABLED`
    * instead going forward.
    *
    * @deprecated since version 5.0
    */
  @scala.inline
  def TOUCH_ENABLED: scala.Boolean = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("TOUCH_ENABLED").asInstanceOf[scala.Boolean]
  
  /**
    * Current software version. Follows semver.
    *
    */
  @scala.inline
  def VERSION: java.lang.String = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[java.lang.String]
  
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
  @scala.inline
  def addLanguage(code: java.lang.String, data: typings.videoJs.mod.videojs.LanguageTranslations): typings.videoJs.mod.videojs.LanguageTranslations = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("addLanguage")(code.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[typings.videoJs.mod.videojs.LanguageTranslations]
  
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
  @scala.inline
  def bind[F /* <: js.Function0[_] */](context: js.Any, fn: F): F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("bind")(context.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[F]
  @scala.inline
  def bind[F /* <: js.Function0[_] */](context: js.Any, fn: F, uid: scala.Double): F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("bind")(context.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], uid.asInstanceOf[js.Any])).asInstanceOf[F]
  
  /**
    * A suite of browser and device tests from {@link browser}.
    *
    */
  @scala.inline
  def browser: typings.videoJs.mod.videojs.Browser = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("browser").asInstanceOf[typings.videoJs.mod.videojs.Browser]
  
  /**
    * Should create a fake `TimeRange` object which mimics an HTML5 time range instance.
    *
    * @param start
    *        The start of a single range or an array of ranges
    *
    * @param end
    *        The end of a single range.
    */
  @scala.inline
  def createTimeRanges(): typings.videoJs.mod.videojs.TimeRange = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("createTimeRanges")().asInstanceOf[typings.videoJs.mod.videojs.TimeRange]
  @scala.inline
  def createTimeRanges(start: js.UndefOr[scala.Nothing], end: scala.Double): typings.videoJs.mod.videojs.TimeRange = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("createTimeRanges")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.videoJs.mod.videojs.TimeRange]
  @scala.inline
  def createTimeRanges(start: js.Array[typings.videoJs.mod.videojs.TimeRange]): typings.videoJs.mod.videojs.TimeRange = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("createTimeRanges")(start.asInstanceOf[js.Any]).asInstanceOf[typings.videoJs.mod.videojs.TimeRange]
  @scala.inline
  def createTimeRanges(start: js.Array[typings.videoJs.mod.videojs.TimeRange], end: scala.Double): typings.videoJs.mod.videojs.TimeRange = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("createTimeRanges")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.videoJs.mod.videojs.TimeRange]
  @scala.inline
  def createTimeRanges(start: scala.Double): typings.videoJs.mod.videojs.TimeRange = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("createTimeRanges")(start.asInstanceOf[js.Any]).asInstanceOf[typings.videoJs.mod.videojs.TimeRange]
  @scala.inline
  def createTimeRanges(start: scala.Double, end: scala.Double): typings.videoJs.mod.videojs.TimeRange = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("createTimeRanges")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.videoJs.mod.videojs.TimeRange]
  
  @scala.inline
  def dom: typings.videoJs.mod.videojs.Dom = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("dom").asInstanceOf[typings.videoJs.mod.videojs.Dom]
  
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
  @scala.inline
  def formatTime(seconds: scala.Double, guide: scala.Double): java.lang.String = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("formatTime")(seconds.asInstanceOf[js.Any], guide.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  /**
    * Returns an array of all current players.
    *
    * @return An array of all players. The array will be in the order that
    *         `Object.keys` provides, which could potentially vary between
    *         JavaScript engines.
    *
    */
  @scala.inline
  def getAllPlayers(): js.Array[typings.videoJs.mod.videojs.Player] = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("getAllPlayers")().asInstanceOf[js.Array[typings.videoJs.mod.videojs.Player]]
  
  /**
    * Get a component class object by name
    *
    * @borrows Component.getComponent as getComponent
    */
  /* was `typeof Component.getComponent` */
  @scala.inline
  def getComponent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Component.getComponent */ js.Any = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("getComponent").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Component.getComponent */ js.Any]
  
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
  @scala.inline
  def getPlayer(id: java.lang.String): typings.videoJs.mod.videojs.Player = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("getPlayer")(id.asInstanceOf[js.Any]).asInstanceOf[typings.videoJs.mod.videojs.Player]
  
  /**
    * Get an object with the currently created players, keyed by player ID
    *
    * @return    The created players
    */
  @scala.inline
  def getPlayers(): org.scalablytyped.runtime.StringDictionary[typings.videoJs.mod.videojs.Player] = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("getPlayers")().asInstanceOf[org.scalablytyped.runtime.StringDictionary[typings.videoJs.mod.videojs.Player]]
  
  /**
    * Gets a plugin by name if it exists.
    *
    * @param name
    *         The name of a plugin.
    *
    * @return    The plugin (or `undefined`).
    */
  /* was `typeof Plugin.getPlugin` */
  @scala.inline
  def getPlugin: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.getPlugin */ js.Any = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("getPlugin").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.getPlugin */ js.Any]
  
  /**
    * Gets a plugin's version, if available
    *
    * @param name
    *         The name of a plugin.
    *
    * @return    The plugin's version or an empty string.
    */
  /* was `typeof Plugin.getPluginVersion` */
  @scala.inline
  def getPluginVersion: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.getPluginVersion */ js.Any = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("getPluginVersion").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.getPluginVersion */ js.Any]
  
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
  @scala.inline
  def getPlugins: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.getPlugins */ js.Any = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("getPlugins").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.getPlugins */ js.Any]
  
  /**
    * Get a Tech class object by name
    *
    * @borrows Tech.getTech as getTech
    */
  /* was `typeof Tech.getTech` */
  @scala.inline
  def getTech: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Tech.getTech */ js.Any = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("getTech").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Tech.getTech */ js.Any]
  
  /**
    * Add a function hook that will only run once to a specific videojs lifecycle.
    *
    * @param type
    *        the lifecycle to hook the function to.
    *
    * @param fn
    *        The function or array of functions to attach.
    */
  @scala.inline
  def hookOnce(`type`: java.lang.String): scala.Unit = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("hookOnce")(`type`.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def hookOnce(`type`: java.lang.String, fn: js.Array[js.Function0[_]]): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("hookOnce")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def hookOnce(`type`: java.lang.String, fn: js.Function0[_]): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("hookOnce")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def hook_beforesetup(
    `type`: typings.videoJs.videoJsStrings.beforesetup,
    fn: js.Array[typings.videoJs.mod.videojs.Hook.BeforeSetup]
  ): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("hook")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def hook_beforesetup(
    `type`: typings.videoJs.videoJsStrings.beforesetup,
    fn: typings.videoJs.mod.videojs.Hook.BeforeSetup
  ): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("hook")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def hook_setup(`type`: typings.videoJs.videoJsStrings.setup, fn: js.Array[typings.videoJs.mod.videojs.Hook.Setup]): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("hook")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  /**
    * Add a function hook to a specific videojs lifecycle.
    *
    * @param type
    *        the lifecycle to hook the function to.
    *
    * @param fn
    *        The function or array of functions to attach.
    */
  @scala.inline
  def hook_setup(`type`: typings.videoJs.videoJsStrings.setup, fn: typings.videoJs.mod.videojs.Hook.Setup): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("hook")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def hooks(`type`: java.lang.String): scala.Unit = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("hooks")(`type`.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def hooks(`type`: java.lang.String, fn: js.Array[js.Function0[_]]): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("hooks")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def hooks(`type`: java.lang.String, fn: js.Function0[_]): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("hooks")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * Returns whether the url passed is a cross domain request or not.
    *
    * @param url
    *        The url to check.
    *
    * @return    Whether it is a cross domain request or not.
    */
  @scala.inline
  def isCrossOrigin(url: java.lang.String): scala.Boolean = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("isCrossOrigin")(url.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  /**
    * Log messages
    *
    * @borrows log:log as log
    */
  @scala.inline
  def log: typings.videoJs.mod.videojs.Log = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("log").asInstanceOf[typings.videoJs.mod.videojs.Log]
  
  /**
    * Deep-merge one or more options objects, recursively merging **only** plain
    * object properties.
    *
    * @param sources
    *          One or more objects to merge into a new object.
    *
    * @return    A new object that is the merged result of all sources.
    */
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A): A with B with C with D with E with F = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any]).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D, option5: E): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D, option5: E, option6: F): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D, option5: js.UndefOr[scala.Nothing], option6: F): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: js.UndefOr[scala.Nothing], option5: E): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: js.UndefOr[scala.Nothing], option5: E, option6: F): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: B,
    option3: C,
    option4: js.UndefOr[scala.Nothing],
    option5: js.UndefOr[scala.Nothing],
    option6: F
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: js.UndefOr[scala.Nothing], option4: D): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: js.UndefOr[scala.Nothing], option4: D, option5: E): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: js.UndefOr[scala.Nothing], option4: D, option5: E, option6: F): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: B,
    option3: js.UndefOr[scala.Nothing],
    option4: D,
    option5: js.UndefOr[scala.Nothing],
    option6: F
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: B,
    option3: js.UndefOr[scala.Nothing],
    option4: js.UndefOr[scala.Nothing],
    option5: E
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: B,
    option3: js.UndefOr[scala.Nothing],
    option4: js.UndefOr[scala.Nothing],
    option5: E,
    option6: F
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: B,
    option3: js.UndefOr[scala.Nothing],
    option4: js.UndefOr[scala.Nothing],
    option5: js.UndefOr[scala.Nothing],
    option6: F
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: js.UndefOr[scala.Nothing], option3: C): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: js.UndefOr[scala.Nothing], option3: C, option4: D): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: js.UndefOr[scala.Nothing], option3: C, option4: D, option5: E): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: js.UndefOr[scala.Nothing], option3: C, option4: D, option5: E, option6: F): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: js.UndefOr[scala.Nothing],
    option3: C,
    option4: D,
    option5: js.UndefOr[scala.Nothing],
    option6: F
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: js.UndefOr[scala.Nothing],
    option3: C,
    option4: js.UndefOr[scala.Nothing],
    option5: E
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: js.UndefOr[scala.Nothing],
    option3: C,
    option4: js.UndefOr[scala.Nothing],
    option5: E,
    option6: F
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: js.UndefOr[scala.Nothing],
    option3: C,
    option4: js.UndefOr[scala.Nothing],
    option5: js.UndefOr[scala.Nothing],
    option6: F
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](option: A, option2: js.UndefOr[scala.Nothing], option3: js.UndefOr[scala.Nothing], option4: D): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: js.UndefOr[scala.Nothing],
    option3: js.UndefOr[scala.Nothing],
    option4: D,
    option5: E
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: js.UndefOr[scala.Nothing],
    option3: js.UndefOr[scala.Nothing],
    option4: D,
    option5: E,
    option6: F
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: js.UndefOr[scala.Nothing],
    option3: js.UndefOr[scala.Nothing],
    option4: D,
    option5: js.UndefOr[scala.Nothing],
    option6: F
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: js.UndefOr[scala.Nothing],
    option3: js.UndefOr[scala.Nothing],
    option4: js.UndefOr[scala.Nothing],
    option5: E
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: js.UndefOr[scala.Nothing],
    option3: js.UndefOr[scala.Nothing],
    option4: js.UndefOr[scala.Nothing],
    option5: E,
    option6: F
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  @scala.inline
  def mergeOptions[A, B, C, D, E, F](
    option: A,
    option2: js.UndefOr[scala.Nothing],
    option3: js.UndefOr[scala.Nothing],
    option4: js.UndefOr[scala.Nothing],
    option5: js.UndefOr[scala.Nothing],
    option6: F
  ): A with B with C with D with E with F = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("mergeOptions")(option.asInstanceOf[js.Any], option2.asInstanceOf[js.Any], option3.asInstanceOf[js.Any], option4.asInstanceOf[js.Any], option5.asInstanceOf[js.Any], option6.asInstanceOf[js.Any])).asInstanceOf[A with B with C with D with E with F]
  
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
  @scala.inline
  def off(
    elem: typings.std.Element,
    `type`: java.lang.String,
    fn: typings.videoJs.mod.videojs.EventTarget.EventListener
  ): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("off")(elem.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def on(
    elem: typings.std.Element,
    `type`: java.lang.String,
    fn: typings.videoJs.mod.videojs.EventTarget.EventListener
  ): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("on")(elem.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def on(
    elem: typings.std.Element,
    `type`: js.Array[java.lang.String],
    fn: typings.videoJs.mod.videojs.EventTarget.EventListener
  ): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("on")(elem.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def one(
    elem: typings.std.Element,
    `type`: java.lang.String,
    fn: typings.videoJs.mod.videojs.EventTarget.EventListener
  ): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("one")(elem.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def one(
    elem: typings.std.Element,
    `type`: js.Array[java.lang.String],
    fn: typings.videoJs.mod.videojs.EventTarget.EventListener
  ): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("one")(elem.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * The global options object. These are the settings that take effect
    * if no overrides are specified when the player is created.
    *
    */
  @scala.inline
  def options: typings.videoJs.mod.videojs.PlayerOptions = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("options").asInstanceOf[typings.videoJs.mod.videojs.PlayerOptions]
  
  /**
    * Resolve and parse the elements of a URL.
    *
    * @param url
    *         The url to parse
    *
    * @return    An object of url details
    */
  @scala.inline
  def parseUrl(url: java.lang.String): typings.videoJs.mod.videojs.url.URLObject = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("parseUrl")(url.asInstanceOf[js.Any]).asInstanceOf[typings.videoJs.mod.videojs.url.URLObject]
  
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
  @scala.inline
  def plugin: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.registerPlugin */ js.Any = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("plugin").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.registerPlugin */ js.Any]
  
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
  @scala.inline
  def registerComponent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Component.registerComponent */ js.Any = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("registerComponent").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Component.registerComponent */ js.Any]
  
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
  @scala.inline
  def registerPlugin: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.registerPlugin */ js.Any = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("registerPlugin").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Plugin.registerPlugin */ js.Any]
  
  /**
    * Register a Tech so it can referred to by name.
    * This is used in the tech order for the player.
    *
    * @borrows Tech.registerTech as registerTech
    */
  /* was `typeof Tech.registerTech` */
  @scala.inline
  def registerTech: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Tech.registerTech */ js.Any = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("registerTech").asInstanceOf[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Tech.registerTech */ js.Any]
  
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
  @scala.inline
  def removeHook(`type`: java.lang.String, fn: js.Function0[_]): scala.Boolean = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("removeHook")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  /**
    * Resets formatTime to the default implementation.
    */
  @scala.inline
  def resetFormatTime(): scala.Unit = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("resetFormatTime")().asInstanceOf[scala.Unit]
  
  /**
    * Replaces the default formatTime implementation with a custom implementation.
    *
    * @param customImplementation
    *        A function which will be used in place of the default formatTime implementation.
    *        Will receive the current time in seconds and the guide (in seconds) as arguments.
    */
  @scala.inline
  def setFormatTime(
    customImplementation: js.Function2[/* seconds */ scala.Double, /* guide */ scala.Double, java.lang.String]
  ): scala.Unit = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("setFormatTime")(customImplementation.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def trigger(elem: typings.std.Element, event: java.lang.String): js.UndefOr[scala.Boolean] = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(elem.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[scala.Boolean]]
  @scala.inline
  def trigger(elem: typings.std.Element, event: java.lang.String, hash: js.Any): js.UndefOr[scala.Boolean] = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(elem.asInstanceOf[js.Any], event.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[scala.Boolean]]
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
  @scala.inline
  def trigger(elem: typings.std.Element, event: typings.videoJs.mod.videojs.EventTarget.Event): js.UndefOr[scala.Boolean] = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(elem.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[scala.Boolean]]
  @scala.inline
  def trigger(elem: typings.std.Element, event: typings.videoJs.mod.videojs.EventTarget.Event, hash: js.Any): js.UndefOr[scala.Boolean] = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(elem.asInstanceOf[js.Any], event.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[scala.Boolean]]
  
  /**
    * Register a middleware to a source type.
    *
    * @param type A string representing a MIME type.
    * @param middleware A middleware factory that takes a player.
    */
  @scala.inline
  def use(
    `type`: java.lang.String,
    middleware: js.Function1[
      /* player */ typings.videoJs.mod.videojs.Player, 
      typings.videoJs.mod.videojs.Middleware
    ]
  ): scala.Unit = (typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].applyDynamic("use")(`type`.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def xhr: typings.videoJs.mod.videojs.XhrObject = typings.videoJs.videoCoreNovttMod.default.^.asInstanceOf[js.Dynamic].selectDynamic("xhr").asInstanceOf[typings.videoJs.mod.videojs.XhrObject]
}
