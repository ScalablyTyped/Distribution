package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomizable extends IEventEmitter {
  var options: IOptionManager = js.native
}

object ICustomizable {
  @scala.inline
  def apply(events: IEventManager, options: IOptionManager): ICustomizable = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomizable]
  }
  @scala.inline
  implicit class ICustomizableOps[Self <: ICustomizable] (val x: Self) extends AnyVal {
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
    def setOptions(value: IOptionManager): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

