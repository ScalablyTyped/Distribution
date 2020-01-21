package typings.uirouterCore.viewInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveUIView extends js.Object {
  /** type of framework, e.g., "ng1" or "ng2" */
  @JSName("$type")
  var $type: String = js.native
  /** The ViewConfig that is currently loaded into the ui-view */
  var config: ViewConfig = js.native
  /** The state context in which the ui-view tag was created. */
  var creationContext: ViewContext = js.native
  /** The ui-view's fully qualified name */
  var fqn: String = js.native
  /** An auto-incremented id */
  var id: Double = js.native
  /** The ui-view short name */
  var name: String = js.native
  /** A callback that should apply a ViewConfig (or clear the ui-view, if config is undefined) */
  def configUpdated(config: ViewConfig): Unit = js.native
}

