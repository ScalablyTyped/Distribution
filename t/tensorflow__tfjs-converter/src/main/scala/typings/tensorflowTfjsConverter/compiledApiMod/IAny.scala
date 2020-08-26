package typings.tensorflowTfjsConverter.compiledApiMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAny extends js.Object {
  /** Any typeUrl */
  var typeUrl: js.UndefOr[String | Null] = js.native
  /** Any value */
  var value: js.UndefOr[Uint8Array | Null] = js.native
}

object IAny {
  @scala.inline
  def apply(): IAny = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAny]
  }
  @scala.inline
  implicit class IAnyOps[Self <: IAny] (val x: Self) extends AnyVal {
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
    def setTypeUrl(value: String): Self = this.set("typeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeUrl: Self = this.set("typeUrl", js.undefined)
    @scala.inline
    def setTypeUrlNull: Self = this.set("typeUrl", null)
    @scala.inline
    def setValue(value: Uint8Array): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

