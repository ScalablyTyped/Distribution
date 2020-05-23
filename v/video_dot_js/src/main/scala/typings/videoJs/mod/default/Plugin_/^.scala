package typings.videoJs.mod.default.Plugin_

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.videoJs.anon.TypeofPlugin
import typings.videoJs.mod.videojs.Player
import typings.videoJs.mod.videojs.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "Plugin")
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
  def this(player: Player) = this()
  def this(player: Player, options: js.Any) = this()
}

@JSImport("video.js", "Plugin")
@js.native
object ^
  extends TopLevel[
      (/**
  * Creates an instance of this class.
  *
  * Sub-classes should call `super` to ensure plugins are properly initialized.
  *
  * @param player
  *        A Video.js player instance.
  */
Instantiable1[/* player */ Player, Plugin]) with (Instantiable2[/* player */ Player, /* options */ js.Any, Plugin])
    ] {
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
  def getPlugin(name: String): TypeofPlugin = js.native
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
  def registerPlugin[T, K](name: String, plugin: js.ThisFunction1[/* this */ Player, /* repeated */ K, T]): js.Function1[/* repeated */ K, T] = js.native
}

