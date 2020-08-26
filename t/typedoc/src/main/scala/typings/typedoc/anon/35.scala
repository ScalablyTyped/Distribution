package typings.typedoc.anon

import typings.typedoc.typedocStrings.externalPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `35` extends js.Object {
  var name: externalPattern = js.native
}

object `35` {
  @scala.inline
  def apply(name: externalPattern): `35` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`35`]
  }
  @scala.inline
  implicit class `35Ops`[Self <: `35`] (val x: Self) extends AnyVal {
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
    def setName(value: externalPattern): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

