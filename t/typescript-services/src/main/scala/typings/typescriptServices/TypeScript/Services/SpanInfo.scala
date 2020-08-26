package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpanInfo extends js.Object {
  var limChar: Double = js.native
  var minChar: Double = js.native
  var text: String = js.native
}

object SpanInfo {
  @scala.inline
  def apply(limChar: Double, minChar: Double, text: String): SpanInfo = {
    val __obj = js.Dynamic.literal(limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpanInfo]
  }
  @scala.inline
  implicit class SpanInfoOps[Self <: SpanInfo] (val x: Self) extends AnyVal {
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
    def setLimChar(value: Double): Self = this.set("limChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinChar(value: Double): Self = this.set("minChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

