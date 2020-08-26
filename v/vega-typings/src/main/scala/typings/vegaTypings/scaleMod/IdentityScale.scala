package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityScale
  extends BaseScale
     with Scale {
  var nice: js.UndefOr[Boolean | SignalRef] = js.native
  @JSName("type")
  var type_IdentityScale: identity = js.native
}

object IdentityScale {
  @scala.inline
  def apply(name: String, `type`: identity): IdentityScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityScale]
  }
  @scala.inline
  implicit class IdentityScaleOps[Self <: IdentityScale] (val x: Self) extends AnyVal {
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
    def setType(value: identity): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setNice(value: Boolean | SignalRef): Self = this.set("nice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNice: Self = this.set("nice", js.undefined)
  }
  
}

