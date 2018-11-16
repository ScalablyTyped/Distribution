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

