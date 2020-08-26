package typings.wreck.mod

import typings.wreck.wreckBooleans.`true`
import typings.wreck.wreckStrings.force
import typings.wreck.wreckStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadOptions extends js.Object {
  var gunzip: js.UndefOr[Boolean | force] = js.native
  var json: js.UndefOr[`true` | strict | force] = js.native
  var maxBytes: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object ReadOptions {
  @scala.inline
  def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  @scala.inline
  implicit class ReadOptionsOps[Self <: ReadOptions] (val x: Self) extends AnyVal {
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
    def setGunzip(value: Boolean | force): Self = this.set("gunzip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGunzip: Self = this.set("gunzip", js.undefined)
    @scala.inline
    def setJson(value: `true` | strict | force): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setMaxBytes(value: Double): Self = this.set("maxBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBytes: Self = this.set("maxBytes", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

