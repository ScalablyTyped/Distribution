package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait First[K, V] extends js.Object {
  /** One half of the original map. */ var first: IMapView[K, V] = js.native
  /** The second half of the original map. */ var second: IMapView[K, V] = js.native
}

object First {
  @scala.inline
  def apply[K, V](first: IMapView[K, V], second: IMapView[K, V]): First[K, V] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[First[K, V]]
  }
  @scala.inline
  implicit class FirstOps[Self <: First[_, _], K, V] (val x: Self with (First[K, V])) extends AnyVal {
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
    def setFirst(value: IMapView[K, V]): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecond(value: IMapView[K, V]): Self = this.set("second", value.asInstanceOf[js.Any])
  }
  
}

