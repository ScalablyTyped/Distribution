package typings.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatOptions extends js.Object {
  var options: js.UndefOr[
    js.Function2[
      /* options */ js.Object, 
      /* transformPropName */ js.UndefOr[js.Function1[/* name */ String, String]], 
      Unit
    ]
  ] = js.native
  var `type`: Format = js.native
}

object FormatOptions {
  @scala.inline
  def apply(`type`: Format): FormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptions]
  }
  @scala.inline
  implicit class FormatOptionsOps[Self <: FormatOptions] (val x: Self) extends AnyVal {
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
    def setType(value: Format): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(
      value: (/* options */ js.Object, /* transformPropName */ js.UndefOr[js.Function1[/* name */ String, String]]) => Unit
    ): Self = this.set("options", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

