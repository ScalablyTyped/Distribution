package typings.vis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var scaleFactor: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Enabled {
  @scala.inline
  def apply(): Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabled]
  }
  @scala.inline
  implicit class EnabledOps[Self <: Enabled] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleFactor: Self = this.set("scaleFactor", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

