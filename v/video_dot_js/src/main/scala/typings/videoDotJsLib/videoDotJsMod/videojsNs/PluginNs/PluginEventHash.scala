package typings
package videoDotJsLib.videoDotJsMod.videojsNs.PluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginEventHash extends js.Object {
  /**
  			 * For basic plugins, the return value of the plugin function. For
  			 * advanced plugins, the plugin instance on which the event is fired.
  			 */
  var instance: videoDotJsLib.videoDotJsMod.videojsNs.Plugin
  /**
  			 * The name of the plugin.
  			 */
  var name: java.lang.String
  /**
  			 * For basic plugins, the plugin function. For advanced plugins, the
  			 * plugin class/constructor.
  			 */
  var plugin: java.lang.String
}

object PluginEventHash {
  @scala.inline
  def apply(
    instance: videoDotJsLib.videoDotJsMod.videojsNs.Plugin,
    name: java.lang.String,
    plugin: java.lang.String
  ): PluginEventHash = {
    val __obj = js.Dynamic.literal(instance = instance, name = name, plugin = plugin)
  
    __obj.asInstanceOf[PluginEventHash]
  }
}

