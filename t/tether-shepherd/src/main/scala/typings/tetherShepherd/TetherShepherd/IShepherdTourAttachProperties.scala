package typings.tetherShepherd.TetherShepherd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShepherdTourAttachProperties extends js.Object {
  var element: String = js.native
  var on: String = js.native
}

object IShepherdTourAttachProperties {
  @scala.inline
  def apply(element: String, on: String): IShepherdTourAttachProperties = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShepherdTourAttachProperties]
  }
  @scala.inline
  implicit class IShepherdTourAttachPropertiesOps[Self <: IShepherdTourAttachProperties] (val x: Self) extends AnyVal {
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
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setOn(value: String): Self = this.set("on", value.asInstanceOf[js.Any])
  }
  
}

