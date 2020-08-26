package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginCleanupNumericValues extends PluginConfig {
  var cleanupNumericValues: Boolean | js.Object = js.native
}

object PluginCleanupNumericValues {
  @scala.inline
  def apply(cleanupNumericValues: Boolean | js.Object): PluginCleanupNumericValues = {
    val __obj = js.Dynamic.literal(cleanupNumericValues = cleanupNumericValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupNumericValues]
  }
  @scala.inline
  implicit class PluginCleanupNumericValuesOps[Self <: PluginCleanupNumericValues] (val x: Self) extends AnyVal {
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
    def setCleanupNumericValues(value: Boolean | js.Object): Self = this.set("cleanupNumericValues", value.asInstanceOf[js.Any])
  }
  
}

