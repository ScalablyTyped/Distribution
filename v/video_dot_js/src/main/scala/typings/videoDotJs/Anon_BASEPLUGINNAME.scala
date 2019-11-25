package typings.videoDotJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.videoDotJs.videoDotJsMod.videojs.Player
import typings.videoDotJs.videoDotJsMod.videojs.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BASEPLUGINNAME
  extends /**
  * Creates an instance of this class.
  *
  * Sub-classes should call `super` to ensure plugins are properly initialized.
  *
  * @param player
  *        A Video.js player instance.
  */
Instantiable1[/* player */ Player, Plugin] {
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
  def isBasic(plugin: js.Function0[_]): Boolean = js.native
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

