package typings
package videoDotJsLib.videoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  /**
  	 * A representation of a single `AudioTrack`. If it is part of an {@link AudioTrackList}
  	 * only one `AudioTrack` in the list will be enabled at a time.
  	 *
  	 * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#audiotrack}
  	 */
  val AudioTrack: videoDotJsLib.Anon_Options = js.native
  val AudioTrackButton: videoDotJsLib.Anon_OptionsPlayer = js.native
  val AudioTrackMenuItem: videoDotJsLib.Anon_OptionsPlayerAudioTrackMenuItem = js.native
  val BigPlayButton: videoDotJsLib.Anon_OptionsPlayerBigPlayButton = js.native
  val Button: videoDotJsLib.Anon_OptionsPlayerButton = js.native
  val CaptionsButton: videoDotJsLib.Anon_OptionsPlayerReady = js.native
  val CaptionsSettingsMenuItem: videoDotJsLib.Anon_OptionsPlayerCaptionSettingsMenuItem = js.native
  val ChaptersButton: videoDotJsLib.Anon_OptionsPlayerReadyChaptersButton = js.native
  val ChaptersTrackMenuItem: videoDotJsLib.Anon_OptionsPlayerChaptersTrackMenuItem = js.native
  val ClickableComponent: videoDotJsLib.Anon_OptionsPlayerClickableComponent = js.native
  val CloseButton: videoDotJsLib.Anon_OptionsPlayerCloseButton = js.native
  val Component: videoDotJsLib.Anon_ButtonClickableComponentClickablecomponent = js.native
  val ControlBar: videoDotJsLib.Anon_OptionsPlayerControlBar = js.native
  val CurrentTimeDisplay: videoDotJsLib.Anon_OptionsPlayerComponentOptionsCurrentTimeDisplay = js.native
  val CustomControlSpacer: videoDotJsLib.Anon_OptionsPlayerReadyComponentOptionsCustomControlSpacer = js.native
  val DescriptionsButton: videoDotJsLib.Anon_OptionsPlayerReadyDescriptionsButton = js.native
  val DurationDisplay: videoDotJsLib.Anon_OptionsPlayerComponentOptionsDurationDisplay = js.native
  val ErrorDisplay: videoDotJsLib.Anon_OptionsPlayerErrorDisplay = js.native
  val EventTarget: videoDotJsLib.Anon_EventTarget = js.native
  val FullscreenToggle: videoDotJsLib.Anon_OptionsPlayerComponentOptionsFullscreenToggle = js.native
  val HTMLTrackElementList: videoDotJsLib.Anon_Tracks = js.native
  val MediaError: videoDotJsLib.Anon_0 = js.native
  val Menu: videoDotJsLib.Anon_OptionsPlayerMenu = js.native
  val MenuButton: videoDotJsLib.Anon_OptionsPlayerMenuButton = js.native
  val MenuItem: videoDotJsLib.Anon_OptionsPlayerMenuItem = js.native
  val ModalDialog: videoDotJsLib.Anon_OptionsPlayerModalDialog = js.native
  val MouseTimeDisplay: videoDotJsLib.Anon_OptionsPlayerComponentOptions = js.native
  val Player: videoDotJsLib.Anon_GetTagSettings = js.native
  val Plugin: videoDotJsLib.Anon_BASEPLUGINNAMEDeregisterPlugin = js.native
  val ProgressControl: videoDotJsLib.Anon_OptionsPlayerComponentOptionsProgressControl = js.native
  val SeekBar: videoDotJsLib.Anon_OptionsPlayerSeekBar = js.native
  val Slider: videoDotJsLib.Anon_OptionsPlayerSlider = js.native
  val Spacer: videoDotJsLib.Anon_OptionsPlayerReadyComponentOptions = js.native
  /**
  	 * Whether or not the browser supports touch events. Included for backward
  	 * compatibility with 4.x, but deprecated. Use `browser.TOUCH_ENABLED`
  	 * instead going forward.
  	 *
  	 * @deprecated since version 5.0
  	 */
  val TOUCH_ENABLED: scala.Boolean = js.native
  val Tech: videoDotJsLib.Anon_CanPlaySource = js.native
  val TextTrack: videoDotJsLib.Anon_OptionsTextTrack = js.native
  val TextTrackButton: videoDotJsLib.Anon_OptionsPlayerTextTrackButton = js.native
  val TextTrackCueList: videoDotJsLib.Anon_Cues = js.native
  val TextTrackList: videoDotJsLib.Anon_TracksArray = js.native
  val TextTrackMenuItem: videoDotJsLib.Anon_OptionsPlayerTextTrackMenuItem = js.native
  val TextTrackSettings: videoDotJsLib.Anon_OptionsPlayerTextTrackSettings = js.native
  val TimeDisplay: videoDotJsLib.Anon_OptionsPlayerComponentOptionsTimeDisplay = js.native
  val TimeToolTip: videoDotJsLib.Anon_OptionsPlayerComponentOptionsTimeToolTip = js.native
  val Track: videoDotJsLib.Anon_OptionsTrack = js.native
  /**
  	 * The base class for buttons that toggle specific  track types (e.g. subtitles).
  	 */
  val TrackButton: videoDotJsLib.Anon_OptionsPlayerMenuButtonTrackButtonOptions = js.native
  val TrackList: videoDotJsLib.Anon_TracksArrayTrack = js.native
  /**
  	 * Current software version. Follows semver.
  	 *
  	 */
  val VERSION: java.lang.String = js.native
  val VolumeBar: videoDotJsLib.Anon_OptionsPlayerSliderOptions = js.native
  val VolumeControl: videoDotJsLib.Anon_OptionsPlayerVolumeControl = js.native
  val VolumeLevel: videoDotJsLib.Anon_OptionsPlayerReadyComponentOptionsReadyCallback = js.native
  val VolumePanel: videoDotJsLib.Anon_OptionsPlayerVolumePanel = js.native
  /**
  	 * A suite of browser and device tests from {@link browser}.
  	 *
  	 */
  val browser: videoDotJsLib.videoDotJsMod.videojsNs.Browser = js.native
  val dom: videoDotJsLib.videoDotJsMod.videojsNs.Dom = js.native
  /**
  	 * Get a component class object by name
  	 *
  	 * @borrows Component.getComponent as getComponent
  	 */
  val getComponent: videoDotJsLib.Anon_Button = js.native
  /**
  	 * Gets a plugin by name if it exists.
  	 *
  	 * @param name
  	 *         The name of a plugin.
  	 *
  	 * @return	The plugin (or `undefined`).
  	 */
  val getPlugin: videoDotJsLib.Anon_Name = js.native
  /**
  	 * Gets a plugin's version, if available
  	 *
  	 * @param name
  	 *         The name of a plugin.
  	 *
  	 * @return	The plugin's version or an empty string.
  	 */
  val getPluginVersion: videoDotJsLib.Anon_NameString = js.native
  /**
  	 * Gets an object containing multiple Video.js plugins.
  	 *
  	 * @param [names]
  	 *         If provided, should be an array of plugin names. Defaults to _all_
  	 *         plugin names.
  	 *
  	 * @return	An object containing plugin(s) associated with their name(s) or
  	 *         `undefined` if no matching plugins exist).
  	 */
  val getPlugins: videoDotJsLib.Anon_NameNames = js.native
  /**
  	 * Get a Tech class object by name
  	 *
  	 * @borrows Tech.getTech as getTech
  	 */
  val getTech: videoDotJsLib.Anon_NameStringTech = js.native
  /**
  	 * Log messages
  	 *
  	 * @borrows log:log as log
  	 */
  val log: videoDotJsLib.videoDotJsMod.videojsNs.Log = js.native
  /**
  	 * An object that can be returned by a middleware to signify
  	 * that the middleware is being terminated.
  	 */
  val middleware: videoDotJsLib.Anon_TERMINATOR = js.native
  /**
  	 * The global options object. These are the settings that take effect
  	 * if no overrides are specified when the player is created.
  	 *
  	 */
  val options: videoDotJsLib.videoDotJsMod.videojsNs.PlayerOptions = js.native
  /**
  	 * Deprecated method to register a plugin with Video.js
  	 *
  	 * @deprecated
  	 *        plugin() is deprecated; use registerPlugin() instead
  	 *
  	 * @param name
  	 *        The plugin name
  	 *
  	 * @param plugin
  	 *         The plugin sub-class or function
  	 */
  val plugin: videoDotJsLib.Anon_NameOptions = js.native
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
  	 * @return	The newly registered component
  	 */
  val registerComponent: videoDotJsLib.Anon_ComponentToRegister = js.native
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
  	 * @return	For advanced plugins, a factory function for that plugin. For
  	 *         basic plugins, a wrapper function that initializes the plugin.
  	 */
  val registerPlugin: videoDotJsLib.Anon_NameOptions = js.native
  /**
  	 * Register a Tech so it can referred to by name.
  	 * This is used in the tech order for the player.
  	 *
  	 * @borrows Tech.registerTech as registerTech
  	 */
  val registerTech: videoDotJsLib.Anon_NameTech = js.native
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
  val xhr: videoDotJsLib.videoDotJsMod.videojsNs.XhrObject = js.native
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
  def addLanguage(code: java.lang.String, data: videoDotJsLib.videoDotJsMod.videojsNs.LanguageTranslations): videoDotJsLib.videoDotJsMod.videojsNs.LanguageTranslations = js.native
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
  def bind[F /* <: js.Function0[_] */](context: js.Any, fn: F): F = js.native
  def bind[F /* <: js.Function0[_] */](context: js.Any, fn: F, uid: scala.Double): F = js.native
  /**
  	 * Should create a fake `TimeRange` object which mimics an HTML5 time range instance.
  	 *
  	 * @param start
  	 *        The start of a single range or an array of ranges
  	 *
  	 * @param end
  	 *        The end of a single range.
  	 */
  def createTimeRanges(): videoDotJsLib.videoDotJsMod.videojsNs.TimeRange = js.native
  def createTimeRanges(start: js.Array[videoDotJsLib.videoDotJsMod.videojsNs.TimeRange]): videoDotJsLib.videoDotJsMod.videojsNs.TimeRange = js.native
  def createTimeRanges(start: js.Array[videoDotJsLib.videoDotJsMod.videojsNs.TimeRange], end: scala.Double): videoDotJsLib.videoDotJsMod.videojsNs.TimeRange = js.native
  def createTimeRanges(start: scala.Double): videoDotJsLib.videoDotJsMod.videojsNs.TimeRange = js.native
  def createTimeRanges(start: scala.Double, end: scala.Double): videoDotJsLib.videoDotJsMod.videojsNs.TimeRange = js.native
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
  def formatTime(seconds: scala.Double, guide: scala.Double): java.lang.String = js.native
  /**
  	 * Returns an array of all current players.
  	 *
  	 * @return An array of all players. The array will be in the order that
  	 *         `Object.keys` provides, which could potentially vary between
  	 *         JavaScript engines.
  	 *
  	 */
  def getAllPlayers(): js.Array[videoDotJsLib.videoDotJsMod.videojsNs.Player] = js.native
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
  	 * @return	A player instance or `undefined` if there is no player instance
  	 *          matching the argument.
  	 */
  def getPlayer(id: java.lang.String): videoDotJsLib.videoDotJsMod.videojsNs.Player = js.native
  /**
  	 * Get an object with the currently created players, keyed by player ID
  	 *
  	 * @return	The created players
  	 */
  def getPlayers(): org.scalablytyped.runtime.StringDictionary[videoDotJsLib.videoDotJsMod.videojsNs.Player] = js.native
  /**
  	 * Add a function hook that will only run once to a specific videojs lifecycle.
  	 *
  	 * @param type
  	 *        the lifecycle to hook the function to.
  	 *
  	 * @param fn
  	 *        The function or array of functions to attach.
  	 */
  def hookOnce(`type`: java.lang.String): scala.Unit = js.native
  def hookOnce(`type`: java.lang.String, fn: js.Array[js.Function0[_]]): scala.Unit = js.native
  def hookOnce(`type`: java.lang.String, fn: js.Function0[_]): scala.Unit = js.native
  @JSName("hook")
  def hook_beforesetup(
    `type`: videoDotJsLib.videoDotJsLibStrings.beforesetup,
    fn: js.Array[videoDotJsLib.videoDotJsMod.videojsNs.HookNs.BeforeSetup]
  ): scala.Unit = js.native
  @JSName("hook")
  def hook_beforesetup(
    `type`: videoDotJsLib.videoDotJsLibStrings.beforesetup,
    fn: videoDotJsLib.videoDotJsMod.videojsNs.HookNs.BeforeSetup
  ): scala.Unit = js.native
  @JSName("hook")
  def hook_setup(
    `type`: videoDotJsLib.videoDotJsLibStrings.setup,
    fn: js.Array[videoDotJsLib.videoDotJsMod.videojsNs.HookNs.Setup]
  ): scala.Unit = js.native
  /**
  	 * Add a function hook to a specific videojs lifecycle.
  	 *
  	 * @param type
  	 *        the lifecycle to hook the function to.
  	 *
  	 * @param fn
  	 *        The function or array of functions to attach.
  	 */
  @JSName("hook")
  def hook_setup(
    `type`: videoDotJsLib.videoDotJsLibStrings.setup,
    fn: videoDotJsLib.videoDotJsMod.videojsNs.HookNs.Setup
  ): scala.Unit = js.native
  /**
  	 * Get a list of hooks for a specific lifecycle
  	 *
  	 * @param type
  	 *        the lifecycle to get hooks from
  	 *
  	 * @param [fn]
  	 *        Optionally add a hook (or hooks) to the lifecycle that your are getting.
  	 *
  	 * @return	an array of hooks, or an empty array if there are none.
  	 */
  def hooks(`type`: java.lang.String): scala.Unit = js.native
  def hooks(`type`: java.lang.String, fn: js.Array[js.Function0[_]]): scala.Unit = js.native
  def hooks(`type`: java.lang.String, fn: js.Function0[_]): scala.Unit = js.native
  /**
  	 * Returns whether the url passed is a cross domain request or not.
  	 *
  	 * @param url
  	 *        The url to check.
  	 *
  	 * @return	Whether it is a cross domain request or not.
  	 */
  def isCrossOrigin(url: java.lang.String): scala.Boolean = js.native
  /**
  	 * Deep-merge one or more options objects, recursively merging **only** plain
  	 * object properties.
  	 *
  	 * @param sources
  	 *          One or more objects to merge into a new object.
  	 *
  	 * @return	A new object that is the merged result of all sources.
  	 */
  def mergeOptions[A, B, C, D, E, F](option: A): A with B with C with D with E with F = js.native
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B): A with B with C with D with E with F = js.native
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C): A with B with C with D with E with F = js.native
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D): A with B with C with D with E with F = js.native
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D, option5: E): A with B with C with D with E with F = js.native
  def mergeOptions[A, B, C, D, E, F](option: A, option2: B, option3: C, option4: D, option5: E, option6: F): A with B with C with D with E with F = js.native
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
  def off(
    elem: stdLib.Element,
    `type`: java.lang.String,
    fn: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.EventListener
  ): scala.Unit = js.native
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
  def on(
    elem: stdLib.Element,
    `type`: java.lang.String,
    fn: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.EventListener
  ): scala.Unit = js.native
  def on(
    elem: stdLib.Element,
    `type`: js.Array[java.lang.String],
    fn: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.EventListener
  ): scala.Unit = js.native
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
  def one(
    elem: stdLib.Element,
    `type`: java.lang.String,
    fn: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.EventListener
  ): scala.Unit = js.native
  def one(
    elem: stdLib.Element,
    `type`: js.Array[java.lang.String],
    fn: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.EventListener
  ): scala.Unit = js.native
  /**
  	 * Resolve and parse the elements of a URL.
  	 *
  	 * @param url
  	 *         The url to parse
  	 *
  	 * @return	An object of url details
  	 */
  def parseUrl(url: java.lang.String): videoDotJsLib.videoDotJsMod.videojsNs.urlNs.URLObject = js.native
  /**
  	 * Remove a hook from a specific videojs lifecycle.
  	 *
  	 * @param type
  	 *        the lifecycle that the function hooked to
  	 *
  	 * @param fn
  	 *        The hooked function to remove
  	 *
  	 * @return	The function that was removed or undef
  	 */
  def removeHook(`type`: java.lang.String, fn: js.Function0[_]): scala.Boolean = js.native
  /**
  	 * Resets formatTime to the default implementation.
  	 */
  def resetFormatTime(): scala.Unit = js.native
  /**
  	 * Replaces the default formatTime implementation with a custom implementation.
  	 *
  	 * @param customImplementation
  	 *        A function which will be used in place of the default formatTime implementation.
  	 *        Will receive the current time in seconds and the guide (in seconds) as arguments.
  	 */
  def setFormatTime(
    customImplementation: js.Function2[/* seconds */ scala.Double, /* guide */ scala.Double, java.lang.String]
  ): scala.Unit = js.native
  def trigger(elem: stdLib.Element, event: java.lang.String): js.UndefOr[scala.Boolean] = js.native
  def trigger(elem: stdLib.Element, event: java.lang.String, hash: js.Any): js.UndefOr[scala.Boolean] = js.native
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
  	 * @return	- Returns the opposite of `defaultPrevented` if default was prevented
  	 *         - Otherwise returns undefined
  	 */
  def trigger(elem: stdLib.Element, event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): js.UndefOr[scala.Boolean] = js.native
  def trigger(
    elem: stdLib.Element,
    event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event,
    hash: js.Any
  ): js.UndefOr[scala.Boolean] = js.native
  /**
  	 * Register a middleware to a source type.
  	 *
  	 * @param type A string representing a MIME type.
  	 * @param middleware A middleware factory that takes a player.
  	 */
  def use(
    `type`: java.lang.String,
    middleware: js.Function1[
      /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
      videoDotJsLib.videoDotJsMod.videojsNs.Middleware
    ]
  ): scala.Unit = js.native
  @js.native
  object NetworkState extends js.Object {
    /* 0 */ val Empty: videoDotJsLib.videoDotJsMod.videojsNs.NetworkState.Empty with scala.Double = js.native
    /* 1 */ val Idle: videoDotJsLib.videoDotJsMod.videojsNs.NetworkState.Idle with scala.Double = js.native
    /* 2 */ val Loading: videoDotJsLib.videoDotJsMod.videojsNs.NetworkState.Loading with scala.Double = js.native
    /* 3 */ val NoSource: videoDotJsLib.videoDotJsMod.videojsNs.NetworkState.NoSource with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[videoDotJsLib.videoDotJsMod.videojsNs.NetworkState with scala.Double] = js.native
  }
  
  @js.native
  object ReadyState extends js.Object {
    /* 2 */ val HaveCurrentData: videoDotJsLib.videoDotJsMod.videojsNs.ReadyState.HaveCurrentData with scala.Double = js.native
    /* 4 */ val HaveEnoughData: videoDotJsLib.videoDotJsMod.videojsNs.ReadyState.HaveEnoughData with scala.Double = js.native
    /* 3 */ val HaveFutureData: videoDotJsLib.videoDotJsMod.videojsNs.ReadyState.HaveFutureData with scala.Double = js.native
    /* 1 */ val HaveMetadata: videoDotJsLib.videoDotJsMod.videojsNs.ReadyState.HaveMetadata with scala.Double = js.native
    /* 0 */ val HaveNothing: videoDotJsLib.videoDotJsMod.videojsNs.ReadyState.HaveNothing with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[videoDotJsLib.videoDotJsMod.videojsNs.ReadyState with scala.Double] = js.native
  }
  
  /**
  	 * An Object that contains lifecycle hooks as keys which point to an array
  	 * of functions that are run when a lifecycle is triggered
  	 */
  @js.native
  object hooks_
    extends /* type */ org.scalablytyped.runtime.StringDictionary[js.Function0[_]]
  
  type NetworkState = videoDotJsLib.videoDotJsMod.videojsNs.NetworkState
  type ReadyState = videoDotJsLib.videoDotJsMod.videojsNs.ReadyState
}

