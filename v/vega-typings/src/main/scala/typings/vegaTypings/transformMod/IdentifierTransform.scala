package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifierTransform extends _Transforms {
  var as: String | SignalRef = js.native
  var `type`: identifier = js.native
}

object IdentifierTransform {
  @scala.inline
  def apply(as: String | SignalRef, `type`: identifier): IdentifierTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifierTransform]
  }
  @scala.inline
  implicit class IdentifierTransformOps[Self <: IdentifierTransform] (val x: Self) extends AnyVal {
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
    def setAs(value: String | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: identifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

