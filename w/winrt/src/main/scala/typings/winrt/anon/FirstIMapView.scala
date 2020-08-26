package typings.winrt.anon

import typings.winrt.Windows.ApplicationModel.Resources.Core.ResourceMap
import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstIMapView extends js.Object {
  var first: IMapView[String, ResourceMap] = js.native
  var second: IMapView[String, ResourceMap] = js.native
}

object FirstIMapView {
  @scala.inline
  def apply(first: IMapView[String, ResourceMap], second: IMapView[String, ResourceMap]): FirstIMapView = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstIMapView]
  }
  @scala.inline
  implicit class FirstIMapViewOps[Self <: FirstIMapView] (val x: Self) extends AnyVal {
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
    def setFirst(value: IMapView[String, ResourceMap]): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecond(value: IMapView[String, ResourceMap]): Self = this.set("second", value.asInstanceOf[js.Any])
  }
  
}

