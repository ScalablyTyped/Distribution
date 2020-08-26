package typings.yandexMaps.anon

import typings.yandexMaps.mod.IProjection
import typings.yandexMaps.yandexMapsStrings.jumpy
import typings.yandexMaps.yandexMapsStrings.shortestPath
import typings.yandexMaps.yandexMapsStrings.static
import typings.yandexMaps.yandexMapsStrings.straightPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoordRendering extends js.Object {
  var coordRendering: js.UndefOr[shortestPath | straightPath] = js.native
  var geodesic: js.UndefOr[Boolean] = js.native
  var pixelRendering: js.UndefOr[jumpy | static] = js.native
  var projection: js.UndefOr[IProjection] = js.native
  var simplification: js.UndefOr[Boolean] = js.native
}

object CoordRendering {
  @scala.inline
  def apply(): CoordRendering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoordRendering]
  }
  @scala.inline
  implicit class CoordRenderingOps[Self <: CoordRendering] (val x: Self) extends AnyVal {
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
    def setCoordRendering(value: shortestPath | straightPath): Self = this.set("coordRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoordRendering: Self = this.set("coordRendering", js.undefined)
    @scala.inline
    def setGeodesic(value: Boolean): Self = this.set("geodesic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeodesic: Self = this.set("geodesic", js.undefined)
    @scala.inline
    def setPixelRendering(value: jumpy | static): Self = this.set("pixelRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRendering: Self = this.set("pixelRendering", js.undefined)
    @scala.inline
    def setProjection(value: IProjection): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setSimplification(value: Boolean): Self = this.set("simplification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimplification: Self = this.set("simplification", js.undefined)
  }
  
}

