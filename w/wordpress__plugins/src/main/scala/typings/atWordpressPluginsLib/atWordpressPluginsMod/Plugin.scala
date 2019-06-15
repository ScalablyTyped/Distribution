package typings
package atWordpressPluginsLib.atWordpressPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends PluginSettings {
  /**
    * A string identifying the plugin. Must be unique across all registered
    * plugins.
    */
  var name: java.lang.String
}

object Plugin {
  @scala.inline
  def apply(
    icon: java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType */ js.Any),
    name: java.lang.String,
    render: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType */ js.Any
  ): Plugin = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name, render = render)
  
    __obj.asInstanceOf[Plugin]
  }
}

