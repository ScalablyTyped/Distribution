package typings.yandexMaps.mod

import typings.yandexMaps.yandexMapsStrings.auto
import typings.yandexMaps.yandexMapsStrings.masstransit
import typings.yandexMaps.yandexMapsStrings.pedestrian
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMultiRouteParams extends js.Object {
  var avoidTrafficJams: js.UndefOr[Boolean] = js.native
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]] | Null] = js.native
  var requestSendInterval: js.UndefOr[String | Double] = js.native
  var results: js.UndefOr[Double] = js.native
  var reverseGeocoding: js.UndefOr[Boolean] = js.native
  var routingMode: js.UndefOr[auto | masstransit | pedestrian] = js.native
  var searchCoordOrder: js.UndefOr[String] = js.native
  var strictBounds: js.UndefOr[Boolean] = js.native
  var viaIndexes: js.UndefOr[js.Array[Double]] = js.native
}

object IMultiRouteParams {
  @scala.inline
  def apply(): IMultiRouteParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMultiRouteParams]
  }
  @scala.inline
  implicit class IMultiRouteParamsOps[Self <: IMultiRouteParams] (val x: Self) extends AnyVal {
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
    def setAvoidTrafficJams(value: Boolean): Self = this.set("avoidTrafficJams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvoidTrafficJams: Self = this.set("avoidTrafficJams", js.undefined)
    @scala.inline
    def setBoundedByVarargs(value: js.Array[Double]*): Self = this.set("boundedBy", js.Array(value :_*))
    @scala.inline
    def setBoundedBy(value: js.Array[js.Array[Double]]): Self = this.set("boundedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundedBy: Self = this.set("boundedBy", js.undefined)
    @scala.inline
    def setBoundedByNull: Self = this.set("boundedBy", null)
    @scala.inline
    def setRequestSendInterval(value: String | Double): Self = this.set("requestSendInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestSendInterval: Self = this.set("requestSendInterval", js.undefined)
    @scala.inline
    def setResults(value: Double): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setReverseGeocoding(value: Boolean): Self = this.set("reverseGeocoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseGeocoding: Self = this.set("reverseGeocoding", js.undefined)
    @scala.inline
    def setRoutingMode(value: auto | masstransit | pedestrian): Self = this.set("routingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutingMode: Self = this.set("routingMode", js.undefined)
    @scala.inline
    def setSearchCoordOrder(value: String): Self = this.set("searchCoordOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchCoordOrder: Self = this.set("searchCoordOrder", js.undefined)
    @scala.inline
    def setStrictBounds(value: Boolean): Self = this.set("strictBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictBounds: Self = this.set("strictBounds", js.undefined)
    @scala.inline
    def setViaIndexesVarargs(value: Double*): Self = this.set("viaIndexes", js.Array(value :_*))
    @scala.inline
    def setViaIndexes(value: js.Array[Double]): Self = this.set("viaIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViaIndexes: Self = this.set("viaIndexes", js.undefined)
  }
  
}

