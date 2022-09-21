package typings.videoJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.std.CanPlayTypeResult
import typings.std.Element
import typings.videoJs.mod.videojs.Child
import typings.videoJs.mod.videojs.ClickableComponentOptions
import typings.videoJs.mod.videojs.Component
import typings.videoJs.mod.videojs.Component.ReadyCallback
import typings.videoJs.mod.videojs.ComponentOptions
import typings.videoJs.mod.videojs.MenuButtonOptions
import typings.videoJs.mod.videojs.MenuItemOptions
import typings.videoJs.mod.videojs.MenuOptions
import typings.videoJs.mod.videojs.ModalDialogOptions
import typings.videoJs.mod.videojs.Player
import typings.videoJs.mod.videojs.PlayerOptions
import typings.videoJs.mod.videojs.Plugin
import typings.videoJs.mod.videojs.Tech
import typings.videoJs.mod.videojs.TextTrackMenuItem
import typings.videoJs.mod.videojs.TextTrackMenuItemOptions
import typings.videoJs.mod.videojs.TimeToolTip
import typings.videoJs.videoJsStrings.Button
import typings.videoJs.videoJsStrings.ClickableComponent
import typings.videoJs.videoJsStrings.Menu
import typings.videoJs.videoJsStrings.MenuButton
import typings.videoJs.videoJsStrings.MenuItem
import typings.videoJs.videoJsStrings.ModalDialog
import typings.videoJs.videoJsStrings.MouseTimeDisplay
import typings.videoJs.videoJsStrings.Spacer
import typings.videoJs.videoJsStrings.TimeTooltip
import typings.videoJs.videoJsStrings.button_
import typings.videoJs.videoJsStrings.clickablecomponent_
import typings.videoJs.videoJsStrings.component_
import typings.videoJs.videoJsStrings.hide
import typings.videoJs.videoJsStrings.menu_
import typings.videoJs.videoJsStrings.menubutton_
import typings.videoJs.videoJsStrings.menuitem_
import typings.videoJs.videoJsStrings.modaldialog_
import typings.videoJs.videoJsStrings.mouseTimeDisplay_
import typings.videoJs.videoJsStrings.player_
import typings.videoJs.videoJsStrings.spacer_
import typings.videoJs.videoJsStrings.timeTooltip_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait All extends StObject {
    
    var DEFAULT: String
    
    var all: String
    
    var debug: String
    
    var error: String
    
    var info: String
    
    var off: String
    
    var warn: String
  }
  object All {
    
    inline def apply(
      DEFAULT: String,
      all: String,
      debug: String,
      error: String,
      info: String,
      off: String,
      warn: String
    ): All = {
      val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[All]
    }
    
    extension [Self <: All](x: Self) {
      
      inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setDEFAULT(value: String): Self = StObject.set(x, "DEFAULT", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: String): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setOff(value: String): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: String): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BASEPLUGINNAME
    extends StObject
       with /**
    * Creates an instance of this class.
    *
    * Sub-classes should call `super` to ensure plugins are properly initialized.
    *
    * @param player
    *        A Video.js player instance.
    */
  Instantiable1[/* player */ Player, Plugin]
       with Instantiable2[/* player */ Player, /* options */ Any, Plugin] {
    
    /**
      * The name of the base plugin class as it is registered.
      *
      */
    var BASE_PLUGIN_NAME: String = js.native
    
    /**
      * De-register a Video.js plugin.
      *
      * @param name
      *        The name of the plugin to be deregistered.
      */
    def deregisterPlugin(name: String): Unit = js.native
    
    /**
      * Gets a plugin by name if it exists.
      *
      * @param name
      *           The name of a plugin.
      *
      * @return The plugin (or `undefined`).
      */
    def getPlugin(name: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof Plugin */ js.Any = js.native
    
    /**
      * Gets a plugin's version, if available
      *
      * @param name
      *          The name of a plugin.
      *
      * @return The plugin's version or an empty string.
      */
    def getPluginVersion(name: String): String = js.native
    
    /**
      * Gets an object containing multiple Video.js plugins.
      *
      * @param [names]
      *          If provided, should be an array of plugin names. Defaults to _all_
      *          plugin names.
      *
      * @return An object containing plugin(s) associated with their name(s) or
      *          `undefined` if no matching plugins exist).
      *
      * @check returning type
      */
    def getPlugins(): StringDictionary[Plugin] = js.native
    def getPlugins(names: js.Array[String]): StringDictionary[Plugin] = js.native
    
    /**
      * Determines if a plugin is a basic plugin (i.e. not a sub-class of `Plugin`).
      *
      * @param plugin
      *          If a string, matches the name of a plugin. If a function, will be
      *          tested directly.
      *
      * @return Whether or not a plugin is a basic plugin.
      */
    def isBasic(plugin: String): Boolean = js.native
    def isBasic(plugin: js.Function0[Any]): Boolean = js.native
    
    def registerPlugin[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: typeof Plugin */ js.Any */](name: String, plugin: T): js.Function0[T] = js.native
    /**
      * Register a Video.js plugin.
      *
      * @param name
      *          The name of the plugin to be registered. Must be a string and
      *          must not match an existing plugin or a method on the `Player`
      *          prototype.
      *
      * @param plugin
      *          A sub-class of `Plugin` or a function for basic plugins.
      *
      * @return For advanced plugins, a factory function for that plugin. For
      *          basic plugins, a wrapper function that initializes the plugin.
      */
    def registerPlugin[T, K](name: String, plugin: js.ThisFunction1[/* this */ Player, /* repeated */ K, T]): js.Function1[/* repeated */ K, T] = js.native
  }
  
  @js.native
  trait Call extends StObject {
    
    /**
      * Returns an array containing everything that has been logged to the history.
      *
      * This array is a shallow clone of the internal history record. However, its
      * contents are _not_ cloned; so, mutating objects inside this array will
      * mutate them in history.
      *
      * @return
      */
    def apply(): js.Array[Any] = js.native
    
    /**
      * Clears the internal history tracking, but does not prevent further history
      * tracking.
      */
    def clear(): Unit = js.native
    
    /**
      * Disable history tracking if it is currently enabled.
      */
    def disable(): Unit = js.native
    
    /**
      * Enable history tracking if it is currently disabled.
      */
    def enable(): Unit = js.native
  }
  
  @js.native
  trait CanPlaySource
    extends StObject
       with /**
    * Create an instance of this Tech.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param ready
    *        Callback function to call when the `HTML5` Tech is ready.
    */
  Instantiable0[Tech]
       with Instantiable1[/* options */ Any, Tech]
       with Instantiable2[(/* options */ Any) | (/* options */ Unit), /* ready */ ReadyCallback, Tech] {
    
    /**
      * Check if the tech can support the given source
      * @param srcObj
      *        The source object
      * @param options
      *        The options passed to the tech
      * @return 'probably', 'maybe', or '' (empty string)
      */
    def canPlaySource(srcObj: Any, options: Any): CanPlayTypeResult = js.native
    
    /**
      * Check if the tech can support the given mime-type.
      *
      * The base tech does not support any type, but source handlers might
      * overwrite this.
      *
      * @param type
      *         The mimetype to check for support
      *
      * @return 'probably', 'maybe', or '' (empty string)
      *
      * @see [Spec]{@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLMediaElement/canPlayType}
      */
    def canPlayType(`type`: String): CanPlayTypeResult = js.native
    
    /**
      * Get a `Tech` from the shared list by name.
      *
      * @param name
      *        `camelCase` or `TitleCase` name of the Tech to get
      *
      * @return The `Tech` or undefined if there was no tech with the name requested.
      */
    def getTech(name: String): js.UndefOr[Tech] = js.native
    
    /**
      * Return whether the argument is a Tech or not.
      * Can be passed either a Class like `Html5` or a instance like `player.tech_`
      *
      * @param component
      *        The item to check
      *
      * @return Whether it is a tech or not
      *         - True if it is a tech
      *         - False if it is not
      */
    def isTech(component: Any): Boolean = js.native
    
    /**
      * Registers a `Tech` into a shared list for videojs.
      *
      * @param name
      *        Name of the `Tech` to register.
      *
      * @param tech
      *        The `Tech` class to register.
      */
    def registerTech(name: String, tech: Any): Unit = js.native
    
    /**
      * A functional mixin for techs that want to use the Source Handler pattern.
      * Source handlers are scripts for handling specific formats.
      * The source handler pattern is used for adaptive formats (HLS, DASH) that
      * manually load video data and feed it into a Source Buffer (Media Source Extensions)
      * Example: `Tech.withSourceHandlers.call(MyTech);`
      *
      * @param tech
      *        The tech to add source handler functions to.
      *
      */
    def withSourceHandlers(tech: /* import warning: importer.ImportType#apply Failed type conversion: typeof Tech */ js.Any): Unit = js.native
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[js.Array[Child]] = js.undefined
    
    var name: String
  }
  object Children {
    
    inline def apply(name: String): Children = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: js.Array[Child]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Child*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetComponent
    extends StObject
       with /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param [options.children]
    *        An array of children objects to intialize this component with. Children objects have
    *        a name property that will be used if more than one component of the same type needs to be
    *        added.
    *
    * @param [ready]
    *        Function that gets called when the `Component` is ready.
    */
  Instantiable1[/* player */ Player, Component]
       with Instantiable2[/* player */ Player, /* options */ ComponentOptions, Component]
       with Instantiable3[
          /* player */ Player, 
          (/* options */ ComponentOptions) | (/* options */ Unit), 
          /* ready */ ReadyCallback, 
          Component
        ] {
    
    /**
      * Get a `Component` based on the name it was registered with.
      *
      * @param name
      *        The Name of the component to get.
      *
      * @return The `Component` that got registered under the given name.
      */
    def getComponent(
      name: Button | ClickableComponent | typings.videoJs.videoJsStrings.Component | Menu | MenuButton | MenuItem | ModalDialog | MouseTimeDisplay | typings.videoJs.videoJsStrings.Player | Spacer | TimeTooltip | button_ | clickablecomponent_ | component_ | menu_ | menubutton_ | menuitem_ | modaldialog_ | mouseTimeDisplay_ | player_ | spacer_ | timeTooltip_
    ): /* import warning: importer.ImportType#apply Failed type conversion: typeof Button */ js.Any = js.native
    def getComponent(name: String): /* import warning: importer.ImportType#apply Failed type conversion: typeof Component */ js.Any = js.native
    
    /**
      * Register a `Component` with `videojs` given the name and the component.
      *
      * > NOTE: {@link Tech}s should not be registered as a `Component`. {@link Tech}s
      *         should be registered using {@link Tech.registerTech} or
      *         {@link videojs:videojs.registerTech}.
      *
      * > NOTE: This function can also be seen on videojs as
      *         {@link videojs:videojs.registerComponent}.
      *
      * @param name
      *        The name of the `Component` to register.
      *
      * @param ComponentToRegister
      *        The `Component` class to register.
      *
      * @return The `Component` that was registered.
      */
    def registerComponent(name: String, ComponentToRegister: Any): Any = js.native
  }
  
  @js.native
  trait GetTagSettings
    extends StObject
       with /**
    * An instance of the `Player` class is created when any of the Video.js setup methods
    * are used to initialize a video.
    *
    * After an instance has been created it can be accessed globally in two ways:
    * 1. By calling `videojs('example_video_1');`
    * 2. By using it directly via  `videojs.players.example_video_1;`
    */
  Instantiable1[/* player */ Player, Player]
       with Instantiable2[/* player */ Player, /* options */ PlayerOptions, Player] {
    
    /**
      * Gets tag settings
      *
      * @param tag
      *        The player tag
      * @check
      * @return An object containing all of the settings
      *         for a player tag
      */
    def getTagSettings(tag: Element): Any = js.native
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with /**
    * Creates an instance of this class.
    *
    * @param player
    *         The `Player` that this class should be attached to.
    *
    * @param [options]
    *         The key/value store of player options.
    */
  Instantiable1[/* player */ Player, typings.videoJs.mod.videojs.Button]
       with Instantiable2[
          /* player */ Player, 
          /* options */ ComponentOptions, 
          typings.videoJs.mod.videojs.Button
        ]
  
  @js.native
  trait InstantiableClickableComponent
    extends StObject
       with /**
    * Creates an instance of this class.
    *
    * @param player
    *         The `Player` that this class should be attached to.
    *
    * @param [options]
    *         The key/value store of player options.
    */
  Instantiable1[/* player */ Player, typings.videoJs.mod.videojs.ClickableComponent]
       with Instantiable2[
          /* player */ Player, 
          /* options */ ClickableComponentOptions, 
          typings.videoJs.mod.videojs.ClickableComponent
        ]
  
  @js.native
  trait InstantiableMenu
    extends StObject
       with /**
    * Create an instance of this class.
    *
    * @param player
    *        the player that this component should attach to
    *
    * @param [options]
    *        Object of option names and values
    *
    */
  Instantiable1[/* player */ Player, typings.videoJs.mod.videojs.Menu]
       with Instantiable2[/* player */ Player, /* options */ MenuOptions, typings.videoJs.mod.videojs.Menu]
  
  @js.native
  trait InstantiableMenuButton
    extends StObject
       with /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options={}]
    *        The key/value store of player options.
    */
  Instantiable1[/* player */ Player, typings.videoJs.mod.videojs.MenuButton]
       with Instantiable2[
          /* player */ Player, 
          /* options */ MenuButtonOptions, 
          typings.videoJs.mod.videojs.MenuButton
        ]
  
  @js.native
  trait InstantiableMenuItem
    extends StObject
       with /**
    * Creates an instance of the this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options={}]
    *        The key/value store of player options.
    *
    */
  Instantiable1[/* player */ Player, typings.videoJs.mod.videojs.MenuItem]
       with Instantiable2[
          /* player */ Player, 
          /* options */ MenuItemOptions, 
          typings.videoJs.mod.videojs.MenuItem
        ]
  
  @js.native
  trait InstantiableModalDialog
    extends StObject
       with /**
    * Create an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    */
  Instantiable1[/* player */ Player, typings.videoJs.mod.videojs.ModalDialog]
       with Instantiable2[
          /* player */ Player, 
          /* options */ ModalDialogOptions, 
          typings.videoJs.mod.videojs.ModalDialog
        ]
  
  @js.native
  trait InstantiableMouseTimeDisplay
    extends StObject
       with /**
    * Creates an instance of this class.
    *
    * @param player
    *        The {@link Player} that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    */
  Instantiable1[/* player */ Player, typings.videoJs.mod.videojs.MouseTimeDisplay]
       with Instantiable2[
          /* player */ Player, 
          /* options */ ComponentOptions, 
          typings.videoJs.mod.videojs.MouseTimeDisplay
        ]
  
  @js.native
  trait InstantiableSpacer
    extends StObject
       with /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param [ready]
    *        Function that gets called when the `Component` is ready.
    */
  Instantiable1[/* player */ Player, typings.videoJs.mod.videojs.Spacer]
       with Instantiable2[
          /* player */ Player, 
          /* options */ ComponentOptions, 
          typings.videoJs.mod.videojs.Spacer
        ]
       with Instantiable3[
          /* player */ Player, 
          (/* options */ ComponentOptions) | (/* options */ Unit), 
          /* ready */ ReadyCallback, 
          typings.videoJs.mod.videojs.Spacer
        ]
  
  @js.native
  trait InstantiableTextTrackMenuItem
    extends StObject
       with /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    */
  Instantiable1[/* player */ Player, TextTrackMenuItem]
       with Instantiable2[/* player */ Player, /* options */ TextTrackMenuItemOptions, TextTrackMenuItem]
  
  @js.native
  trait InstantiableTimeToolTip
    extends StObject
       with /**
    * Creates an instance of this class.
    *
    * @param player
    *         The `Player` that this class should be attached to.
    *
    * @param [options]
    *         The key/value store of player options.
    */
  Instantiable1[/* player */ Player, TimeToolTip]
       with Instantiable2[/* player */ Player, /* options */ ComponentOptions, TimeToolTip]
  
  trait LiveTolerance extends StObject {
    
    var liveTolerance: js.UndefOr[Double] = js.undefined
    
    var trackingThreshold: js.UndefOr[Double] = js.undefined
  }
  object LiveTolerance {
    
    inline def apply(): LiveTolerance = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LiveTolerance]
    }
    
    extension [Self <: LiveTolerance](x: Self) {
      
      inline def setLiveTolerance(value: Double): Self = StObject.set(x, "liveTolerance", value.asInstanceOf[js.Any])
      
      inline def setLiveToleranceUndefined: Self = StObject.set(x, "liveTolerance", js.undefined)
      
      inline def setTrackingThreshold(value: Double): Self = StObject.set(x, "trackingThreshold", value.asInstanceOf[js.Any])
      
      inline def setTrackingThresholdUndefined: Self = StObject.set(x, "trackingThreshold", js.undefined)
    }
  }
  
  trait NavigationUI extends StObject {
    
    var navigationUI: hide
  }
  object NavigationUI {
    
    inline def apply(): NavigationUI = {
      val __obj = js.Dynamic.literal(navigationUI = "hide")
      __obj.asInstanceOf[NavigationUI]
    }
    
    extension [Self <: NavigationUI](x: Self) {
      
      inline def setNavigationUI(value: hide): Self = StObject.set(x, "navigationUI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var options: NavigationUI
  }
  object Options {
    
    inline def apply(options: NavigationUI): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: NavigationUI): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<video.js.video.js.videojs.Breakpoint> */
  trait PartialBreakpoint extends StObject {
    
    var huge: js.UndefOr[Double] = js.undefined
    
    var large: js.UndefOr[Double] = js.undefined
    
    var medium: js.UndefOr[Double] = js.undefined
    
    var small: js.UndefOr[Double] = js.undefined
    
    var tiny: js.UndefOr[Double] = js.undefined
    
    var xlarge: js.UndefOr[Double] = js.undefined
    
    var xsmall: js.UndefOr[Double] = js.undefined
  }
  object PartialBreakpoint {
    
    inline def apply(): PartialBreakpoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBreakpoint]
    }
    
    extension [Self <: PartialBreakpoint](x: Self) {
      
      inline def setHuge(value: Double): Self = StObject.set(x, "huge", value.asInstanceOf[js.Any])
      
      inline def setHugeUndefined: Self = StObject.set(x, "huge", js.undefined)
      
      inline def setLarge(value: Double): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setMedium(value: Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      inline def setSmall(value: Double): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      inline def setTiny(value: Double): Self = StObject.set(x, "tiny", value.asInstanceOf[js.Any])
      
      inline def setTinyUndefined: Self = StObject.set(x, "tiny", js.undefined)
      
      inline def setXlarge(value: Double): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
      
      inline def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
      
      inline def setXsmall(value: Double): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
      
      inline def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
    }
  }
  
  @js.native
  trait TypeofComponent
    extends StObject
       with GetComponent
  
  @js.native
  trait TypeofPlayer
    extends StObject
       with GetTagSettings
  
  @js.native
  trait TypeofPlugin
    extends StObject
       with BASEPLUGINNAME
  
  @js.native
  trait TypeofTech
    extends StObject
       with CanPlaySource
}
