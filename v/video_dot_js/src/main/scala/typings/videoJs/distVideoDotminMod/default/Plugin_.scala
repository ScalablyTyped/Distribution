package typings.videoJs.distVideoDotminMod.default

import org.scalablytyped.runtime.StringDictionary
import typings.videoJs.anon.BASEPLUGINNAME
import typings.videoJs.mod.videojs.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plugin_ {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("video.js/dist/video.min", "default.Plugin")
  @js.native
  open class ^ protected ()
    extends StObject
       with Plugin {
    /**
      * Creates an instance of this class.
      *
      * Sub-classes should call `super` to ensure plugins are properly initialized.
      *
      * @param player
      *        A Video.js player instance.
      */
    def this(player: typings.videoJs.mod.videojs.Player) = this()
    def this(player: typings.videoJs.mod.videojs.Player, options: Any) = this()
  }
  
  @JSImport("video.js/dist/video.min", "default.Plugin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The name of the base plugin class as it is registered.
    *
    */
  @JSImport("video.js/dist/video.min", "default.Plugin.BASE_PLUGIN_NAME")
  @js.native
  def BASE_PLUGIN_NAME: String = js.native
  inline def BASE_PLUGIN_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE_PLUGIN_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * De-register a Video.js plugin.
    *
    * @param name
    *        The name of the plugin to be deregistered.
    */
  inline def deregisterPlugin(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deregisterPlugin")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Gets a plugin by name if it exists.
    *
    * @param name
    *           The name of a plugin.
    *
    * @return The plugin (or `undefined`).
    */
  inline def getPlugin(name: String): BASEPLUGINNAME = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(name.asInstanceOf[js.Any]).asInstanceOf[BASEPLUGINNAME]
  
  /**
    * Gets a plugin's version, if available
    *
    * @param name
    *          The name of a plugin.
    *
    * @return The plugin's version or an empty string.
    */
  inline def getPluginVersion(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPluginVersion")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  inline def getPlugins(): StringDictionary[Plugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugins")().asInstanceOf[StringDictionary[Plugin]]
  inline def getPlugins(names: js.Array[String]): StringDictionary[Plugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugins")(names.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Plugin]]
  
  /**
    * Determines if a plugin is a basic plugin (i.e. not a sub-class of `Plugin`).
    *
    * @param plugin
    *          If a string, matches the name of a plugin. If a function, will be
    *          tested directly.
    *
    * @return Whether or not a plugin is a basic plugin.
    */
  inline def isBasic(plugin: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBasic")(plugin.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isBasic(plugin: js.Function0[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBasic")(plugin.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerPlugin[T /* <: BASEPLUGINNAME */](name: String, plugin: T): js.Function0[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(name.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[js.Function0[T]]
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
  inline def registerPlugin[T, K](
    name: String,
    plugin: js.ThisFunction1[/* this */ typings.videoJs.mod.videojs.Player, /* repeated */ K, T]
  ): js.Function1[/* repeated */ K, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(name.asInstanceOf[js.Any], plugin.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ K, T]]
}
