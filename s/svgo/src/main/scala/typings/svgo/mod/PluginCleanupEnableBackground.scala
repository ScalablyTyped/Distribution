package typings.svgo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginCleanupEnableBackground extends PluginConfig {
  var cleanupEnableBackground: Boolean | js.Object = js.native
}

object PluginCleanupEnableBackground {
  @scala.inline
  def apply(cleanupEnableBackground: Boolean | js.Object): PluginCleanupEnableBackground = {
    val __obj = js.Dynamic.literal(cleanupEnableBackground = cleanupEnableBackground.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginCleanupEnableBackground]
  }
  @scala.inline
  implicit class PluginCleanupEnableBackgroundOps[Self <: PluginCleanupEnableBackground] (val x: Self) extends AnyVal {
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
    def setCleanupEnableBackground(value: Boolean | js.Object): Self = this.set("cleanupEnableBackground", value.asInstanceOf[js.Any])
  }
  
}

