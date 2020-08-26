package typings.valerie.Valerie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Contains converters, always singletons.
@js.native
trait ConvertersStatic extends js.Object {
  //TODO: other converters to be added
  var passThrough: IConverter = js.native
}

object ConvertersStatic {
  @scala.inline
  def apply(passThrough: IConverter): ConvertersStatic = {
    val __obj = js.Dynamic.literal(passThrough = passThrough.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertersStatic]
  }
  @scala.inline
  implicit class ConvertersStaticOps[Self <: ConvertersStatic] (val x: Self) extends AnyVal {
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
    def setPassThrough(value: IConverter): Self = this.set("passThrough", value.asInstanceOf[js.Any])
  }
  
}

