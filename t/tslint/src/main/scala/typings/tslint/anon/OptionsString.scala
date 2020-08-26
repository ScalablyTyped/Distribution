package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsString extends js.Object {
  var options: String = js.native
}

object OptionsString {
  @scala.inline
  def apply(options: String): OptionsString = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsString]
  }
  @scala.inline
  implicit class OptionsStringOps[Self <: OptionsString] (val x: Self) extends AnyVal {
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
    def setOptions(value: String): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

