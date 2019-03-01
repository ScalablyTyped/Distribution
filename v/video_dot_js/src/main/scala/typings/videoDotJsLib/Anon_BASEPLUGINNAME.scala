package typings
package videoDotJsLib

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
org.scalablytyped.runtime.Instantiable1[
      /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
      videoDotJsLib.videoDotJsMod.videojsNs.Plugin
    ] {
  /**
  		 * The name of the base plugin class as it is registered.
  		 *
  		 */
  var BASE_PLUGIN_NAME: java.lang.String = js.native
  /**
  		 * De-register a Video.js plugin.
  		 *
  		 * @param name
  		 *        The name of the plugin to be deregistered.
  		 */
  def deregisterPlugin(name: java.lang.String): scala.Unit = js.native
  /**
  		 * Gets a plugin by name if it exists.
  		 *
  		 * @param name
  		 *           The name of a plugin.
  		 *
  		 * @return The plugin (or `undefined`).
  		 */
  def getPlugin(name: java.lang.String): /* import warning: ImportType.apply Failed type conversion: typeof Plugin */ js.Any = js.native
  /**
  		 * Gets a plugin's version, if available
  		 *
  		 * @param name
  		 *          The name of a plugin.
  		 *
  		 * @return The plugin's version or an empty string.
  		 */
  def getPluginVersion(name: java.lang.String): java.lang.String = js.native
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
  def getPlugins(): org.scalablytyped.runtime.StringDictionary[videoDotJsLib.videoDotJsMod.videojsNs.Plugin] = js.native
  def getPlugins(names: js.Array[java.lang.String]): org.scalablytyped.runtime.StringDictionary[videoDotJsLib.videoDotJsMod.videojsNs.Plugin] = js.native
  /**
  		 * Determines if a plugin is a basic plugin (i.e. not a sub-class of `Plugin`).
  		 *
  		 * @param plugin
  		 *          If a string, matches the name of a plugin. If a function, will be
  		 *          tested directly.
  		 *
  		 * @return Whether or not a plugin is a basic plugin.
  		 */
  def isBasic(plugin: java.lang.String): scala.Boolean = js.native
  def isBasic(plugin: js.Function0[_]): scala.Boolean = js.native
  def registerPlugin[T /* <: /* import warning: ImportType.apply Failed type conversion: typeof Plugin */ js.Any */](name: java.lang.String, plugin: T): js.Function0[T] = js.native
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
  def registerPlugin[T, K](
    name: java.lang.String,
    plugin: js.ThisFunction1[/* this */ videoDotJsLib.videoDotJsMod.videojsNs.Player, /* repeated */ K, T]
  ): js.Function1[/* repeated */ K, T] = js.native
}

