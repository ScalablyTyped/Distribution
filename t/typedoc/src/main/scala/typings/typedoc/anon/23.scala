package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludeTags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `23` extends js.Object {
  var name: excludeTags = js.native
}

object `23` {
  @scala.inline
  def apply(name: excludeTags): `23` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  @scala.inline
  implicit class `23Ops`[Self <: `23`] (val x: Self) extends AnyVal {
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
    def setName(value: excludeTags): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

