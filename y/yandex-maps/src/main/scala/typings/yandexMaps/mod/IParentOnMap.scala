package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParentOnMap extends js.Object {
  def getMap(): Map_ = js.native
}

object IParentOnMap {
  @scala.inline
  def apply(getMap: () => Map_): IParentOnMap = {
    val __obj = js.Dynamic.literal(getMap = js.Any.fromFunction0(getMap))
    __obj.asInstanceOf[IParentOnMap]
  }
  @scala.inline
  implicit class IParentOnMapOps[Self <: IParentOnMap] (val x: Self) extends AnyVal {
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
    def setGetMap(value: () => Map_): Self = this.set("getMap", js.Any.fromFunction0(value))
  }
  
}

