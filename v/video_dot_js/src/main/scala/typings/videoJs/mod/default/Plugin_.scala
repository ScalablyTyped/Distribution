package typings.videoJs.mod.default

import org.scalablytyped.runtime.StringDictionary
import typings.videoJs.anon.TypeofPlugin
import typings.videoJs.mod.videojs.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plugin_ {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("video.js", "default.Plugin")
  @js.native
  class ^ protected () extends Plugin {
    /**
      * Creates an instance of this class.
      *
      * Sub-classes should call `super` to ensure plugins are properly initialized.
      *
      * @param player
      *        A Video.js player instance.
      */
    def this(player: typings.videoJs.mod.videojs.Player) = this()
    def this(player: typings.videoJs.mod.videojs.Player, options: js.Any) = this()
  }
  
  @JSImport("video.js", "default.Plugin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The name of the base plugin class as it is registered.
    *
    */
  @JSImport("video.js", "default.Plugin.BASE_PLUGIN_NAME")
  @js.native
  def BASE_PLUGIN_NAME: String = js.native
  @scala.inline
  def BASE_PLUGIN_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BASE_PLUGIN_NAME")(x.asInstanceOf[js.Any])
  
  /**
    * De-register a Video.js plugin.
    *
    * @param name
    *        The name of the plugin to be deregistered.
    */
  @JSImport("video.js", "default.Plugin.deregisterPlugin")
  @js.native
  def deregisterPlugin(name: String): Unit = js.native
  
  /**
    * Gets a plugin by name if it exists.
    *
    * @param name
    *           The name of a plugin.
    *
    * @return The plugin (or `undefined`).
    */
  @JSImport("video.js", "default.Plugin.getPlugin")
  @js.native
  def getPlugin(name: String): TypeofPlugin = js.native
  
  /**
    * Gets a plugin's version, if available
    *
    * @param name
    *          The name of a plugin.
    *
    * @return The plugin's version or an empty string.
    */
  @JSImport("video.js", "default.Plugin.getPluginVersion")
  @js.native
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
  @JSImport("video.js", "default.Plugin.getPlugins")
  @js.native
  def getPlugins(): StringDictionary[Plugin] = js.native
  @JSImport("video.js", "default.Plugin.getPlugins")
  @js.native
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
  @JSImport("video.js", "default.Plugin.isBasic")
  @js.native
  def isBasic(plugin: String): Boolean = js.native
  @JSImport("video.js", "default.Plugin.isBasic")
  @js.native
  def isBasic(plugin: js.Function0[_]): Boolean = js.native
  
  @JSImport("video.js", "default.Plugin.registerPlugin")
  @js.native
  def registerPlugin[T /* <: TypeofPlugin */](name: String, plugin: T): js.Function0[T] = js.native
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
  @JSImport("video.js", "default.Plugin.registerPlugin")
  @js.native
  def registerPlugin[T, K](
    name: String,
    plugin: js.ThisFunction1[/* this */ typings.videoJs.mod.videojs.Player, /* repeated */ K, T]
  ): js.Function1[/* repeated */ K, T] = js.native
}
