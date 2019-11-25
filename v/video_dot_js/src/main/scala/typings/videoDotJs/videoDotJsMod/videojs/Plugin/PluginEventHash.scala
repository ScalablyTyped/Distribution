package typings.videoDotJs.videoDotJsMod.videojs.Plugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginEventHash extends js.Object {
  /**
    * For basic plugins, the return value of the plugin function. For
    * advanced plugins, the plugin instance on which the event is fired.
    */
  var instance: typings.videoDotJs.videoDotJsMod.videojs.Plugin
  /**
    * The name of the plugin.
    */
  var name: String
  /**
    * For basic plugins, the plugin function. For advanced plugins, the
    * plugin class/constructor.
    */
  var plugin: String
}

object PluginEventHash {
  @scala.inline
  def apply(instance: typings.videoDotJs.videoDotJsMod.videojs.Plugin, name: String, plugin: String): PluginEventHash = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginEventHash]
  }
}

