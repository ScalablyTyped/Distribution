package typings.yaml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Verbatim extends js.Object {
  var verbatim: String = js.native
}

object Verbatim {
  @scala.inline
  def apply(verbatim: String): Verbatim = {
    val __obj = js.Dynamic.literal(verbatim = verbatim.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verbatim]
  }
  @scala.inline
  implicit class VerbatimOps[Self <: Verbatim] (val x: Self) extends AnyVal {
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
    def setVerbatim(value: String): Self = this.set("verbatim", value.asInstanceOf[js.Any])
  }
  
}

