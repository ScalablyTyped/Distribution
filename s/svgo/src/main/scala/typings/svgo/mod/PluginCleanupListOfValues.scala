package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginCleanupListOfValues extends PluginConfig {
  var cleanupListOfValues: Boolean | js.Object = js.native
}

object PluginCleanupListOfValues {
  @scala.inline
  def apply(cleanupListOfValues: Boolean | js.Object): PluginCleanupListOfValues = {
    val __obj = js.Dynamic.literal(cleanupListOfValues = cleanupListOfValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupListOfValues]
  }
  @scala.inline
  implicit class PluginCleanupListOfValuesOps[Self <: PluginCleanupListOfValues] (val x: Self) extends AnyVal {
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
    def setCleanupListOfValues(value: Boolean | js.Object): Self = this.set("cleanupListOfValues", value.asInstanceOf[js.Any])
  }
  
}

