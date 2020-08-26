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
  @scala.inline
  implicit class ActiveUIViewOps[Self <: ActiveUIView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$type(value: String): Self = this.set("$type", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: ViewConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigUpdated(value: ViewConfig => Unit): Self = this.set("configUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def setCreationContext(value: ViewContext): Self = this.set("creationContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setFqn(value: String): Self = this.set("fqn", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

