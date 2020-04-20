package typings.uirouterCore.viewInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveUIView extends js.Object {
  /** type of framework, e.g., "ng1" or "ng2" */
  @JSName("$type")
  var $type: String
  /** The ViewConfig that is currently loaded into the ui-view */
  var config: ViewConfig
  /** The state context in which the ui-view tag was created. */
  var creationContext: ViewContext
  /** The ui-view's fully qualified name */
  var fqn: String
  /** An auto-incremented id */
  var id: Double
  /** The ui-view short name */
  var name: String
  /** A callback that should apply a ViewConfig (or clear the ui-view, if config is undefined) */
  def configUpdated(config: ViewConfig): Unit
}

object ActiveUIView {
  @scala.inline
  def apply(
    $type: String,
    config: ViewConfig,
    configUpdated: ViewConfig => Unit,
    creationContext: ViewContext,
    fqn: String,
    id: Double,
    name: String
  ): ActiveUIView = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configUpdated = js.Any.fromFunction1(configUpdated), creationContext = creationContext.asInstanceOf[js.Any], fqn = fqn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveUIView]
  }
}

