package typings.typedoc.anon

import typings.typedoc.typedocStrings.excludePrivate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `22` extends js.Object {
  var name: excludePrivate = js.native
}

object `22` {
  @scala.inline
  def apply(name: excludePrivate): `22` = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`]
  }
  @scala.inline
  implicit class `22Ops`[Self <: `22`] (val x: Self) extends AnyVal {
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
    def setName(value: excludePrivate): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

