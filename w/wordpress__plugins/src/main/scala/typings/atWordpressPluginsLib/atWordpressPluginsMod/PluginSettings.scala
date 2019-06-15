package typings
package atWordpressPluginsLib.atWordpressPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSettings extends js.Object {
  // TODO: if we ever create a package for @wordpress/dashicons, add it here instead of `string`.
  /**
    * An icon to be shown in the UI. It can be a slug of the Dashicon, or an
    * element (or function returning an element) if you choose to render your
    * own SVG.
    */
  var icon: java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType */ js.Any)
  /**
    * A component containing the UI elements to be rendered.
    */
  var render: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType */ js.Any
}

object PluginSettings {
  @scala.inline
  def apply(
    icon: java.lang.String | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType */ js.Any),
    render: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType */ js.Any
  ): PluginSettings = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], render = render)
  
    __obj.asInstanceOf[PluginSettings]
  }
}

