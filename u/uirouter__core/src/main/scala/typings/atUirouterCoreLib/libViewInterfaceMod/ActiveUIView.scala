package typings
package atUirouterCoreLib.libViewInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveUIView extends js.Object {
  /** type of framework, e.g., "ng1" or "ng2" */
  @JSName("$type")
  var $type: java.lang.String
  /** The ViewConfig that is currently loaded into the ui-view */
  var config: ViewConfig
  /** The state context in which the ui-view tag was created. */
  var creationContext: ViewContext
  /** The ui-view's fully qualified name */
  var fqn: java.lang.String
  /** An auto-incremented id */
  var id: scala.Double
  /** The ui-view short name */
  var name: java.lang.String
  /** A callback that should apply a ViewConfig (or clear the ui-view, if config is undefined) */
  def configUpdated(config: ViewConfig): scala.Unit
}

object ActiveUIView {
  @scala.inline
  def apply(
    $type: java.lang.String,
    config: ViewConfig,
    configUpdated: ViewConfig => scala.Unit,
    creationContext: ViewContext,
    fqn: java.lang.String,
    id: scala.Double,
    name: java.lang.String
  ): ActiveUIView = {
    val __obj = js.Dynamic.literal($type = $type, config = config, configUpdated = js.Any.fromFunction1(configUpdated), creationContext = creationContext, fqn = fqn, id = id, name = name)
  
    __obj.asInstanceOf[ActiveUIView]
  }
}

