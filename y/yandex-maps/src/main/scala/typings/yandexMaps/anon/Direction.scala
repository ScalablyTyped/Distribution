package typings.yandexMaps.anon

import typings.yandexMaps.yandexMapsStrings.yandexNumbersignairPanorama
import typings.yandexMaps.yandexMapsStrings.yandexNumbersignpanorama
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Direction extends js.Object {
  var direction: js.UndefOr[js.Array[Double] | String] = js.native
  var layer: js.UndefOr[yandexNumbersignpanorama | yandexNumbersignairPanorama] = js.native
  var span: js.UndefOr[js.Array[Double] | String] = js.native
}

object Direction {
  @scala.inline
  def apply(): Direction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Direction]
  }
  @scala.inline
  implicit class DirectionOps[Self <: Direction] (val x: Self) extends AnyVal {
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
    def setDirectionVarargs(value: Double*): Self = this.set("direction", js.Array(value :_*))
    @scala.inline
    def setDirection(value: js.Array[Double] | String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setLayer(value: yandexNumbersignpanorama | yandexNumbersignairPanorama): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    @scala.inline
    def setSpanVarargs(value: Double*): Self = this.set("span", js.Array(value :_*))
    @scala.inline
    def setSpan(value: js.Array[Double] | String): Self = this.set("span", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpan: Self = this.set("span", js.undefined)
  }
  
}

