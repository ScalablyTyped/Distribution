package typings.useSidecar.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<use-sidecar.use-sidecar/dist/es5/config.IConfig> */
@js.native
trait PartialIConfig extends js.Object {
  var onError: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.native
}

object PartialIConfig {
  @scala.inline
  def apply(): PartialIConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIConfig]
  }
  @scala.inline
  implicit class PartialIConfigOps[Self <: PartialIConfig] (val x: Self) extends AnyVal {
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
    def setOnError(value: /* e */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
  }
  
}

