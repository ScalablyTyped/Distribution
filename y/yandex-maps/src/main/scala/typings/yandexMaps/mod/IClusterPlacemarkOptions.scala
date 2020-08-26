package typings.yandexMaps.mod

import typings.yandexMaps.anon.Href
import typings.yandexMaps.yandexMapsStrings.clusterNumbersignballoonAccordion
import typings.yandexMaps.yandexMapsStrings.clusterNumbersignballoonCarousel
import typings.yandexMaps.yandexMapsStrings.clusterNumbersignballoonTwoColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClusterPlacemarkOptions extends js.Object {
  var balloonContentLayout: js.UndefOr[
    clusterNumbersignballoonTwoColumns | clusterNumbersignballoonCarousel | clusterNumbersignballoonAccordion | String | IClassConstructor[ILayout]
  ] = js.native
  var balloonContentLayoutHeight: js.UndefOr[Double] = js.native
  var balloonContentLayoutWidth: js.UndefOr[Double] = js.native
  var balloonItemContentLayout: js.UndefOr[ILayout | String] = js.native
  var balloonPanelContentLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var cursor: js.UndefOr[String] = js.native
  var disableClickZoom: js.UndefOr[Boolean] = js.native
  var hideIconOnBalloonOpen: js.UndefOr[Boolean] = js.native
  var iconColor: js.UndefOr[String] = js.native
  var iconContentLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var iconLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.native
  var iconShape: js.UndefOr[IGeometryJson] = js.native
  var icons: js.UndefOr[js.Array[Href]] = js.native
  var interactivityModel: js.UndefOr[InteractivityModelKey] = js.native
  var numbers: js.UndefOr[js.Array[Double]] = js.native
  var openBalloonOnClick: js.UndefOr[Boolean] = js.native
  var openEmptyHint: js.UndefOr[Boolean] = js.native
  var openHintOnHover: js.UndefOr[Boolean] = js.native
  var zIndexHover: js.UndefOr[Double] = js.native
}

object IClusterPlacemarkOptions {
  @scala.inline
  def apply(): IClusterPlacemarkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClusterPlacemarkOptions]
  }
  @scala.inline
  implicit class IClusterPlacemarkOptionsOps[Self <: IClusterPlacemarkOptions] (val x: Self) extends AnyVal {
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
    def setBalloonContentLayout(
      value: clusterNumbersignballoonTwoColumns | clusterNumbersignballoonCarousel | clusterNumbersignballoonAccordion | String | IClassConstructor[ILayout]
    ): Self = this.set("balloonContentLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBalloonContentLayout: Self = this.set("balloonContentLayout", js.undefined)
    @scala.inline
    def setBalloonContentLayoutHeight(value: Double): Self = this.set("balloonContentLayoutHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBalloonContentLayoutHeight: Self = this.set("balloonContentLayoutHeight", js.undefined)
    @scala.inline
    def setBalloonContentLayoutWidth(value: Double): Self = this.set("balloonContentLayoutWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBalloonContentLayoutWidth: Self = this.set("balloonContentLayoutWidth", js.undefined)
    @scala.inline
    def setBalloonItemContentLayout(value: ILayout | String): Self = this.set("balloonItemContentLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBalloonItemContentLayout: Self = this.set("balloonItemContentLayout", js.undefined)
    @scala.inline
    def setBalloonPanelContentLayout(value: String | IClassConstructor[ILayout]): Self = this.set("balloonPanelContentLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBalloonPanelContentLayout: Self = this.set("balloonPanelContentLayout", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setDisableClickZoom(value: Boolean): Self = this.set("disableClickZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableClickZoom: Self = this.set("disableClickZoom", js.undefined)
    @scala.inline
    def setHideIconOnBalloonOpen(value: Boolean): Self = this.set("hideIconOnBalloonOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideIconOnBalloonOpen: Self = this.set("hideIconOnBalloonOpen", js.undefined)
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    @scala.inline
    def setIconContentLayout(value: String | IClassConstructor[ILayout]): Self = this.set("iconContentLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconContentLayout: Self = this.set("iconContentLayout", js.undefined)
    @scala.inline
    def setIconLayout(value: String | IClassConstructor[ILayout]): Self = this.set("iconLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconLayout: Self = this.set("iconLayout", js.undefined)
    @scala.inline
    def setIconShape(value: IGeometryJson): Self = this.set("iconShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconShape: Self = this.set("iconShape", js.undefined)
    @scala.inline
    def setIconsVarargs(value: Href*): Self = this.set("icons", js.Array(value :_*))
    @scala.inline
    def setIcons(value: js.Array[Href]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setInteractivityModel(value: InteractivityModelKey): Self = this.set("interactivityModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractivityModel: Self = this.set("interactivityModel", js.undefined)
    @scala.inline
    def setNumbersVarargs(value: Double*): Self = this.set("numbers", js.Array(value :_*))
    @scala.inline
    def setNumbers(value: js.Array[Double]): Self = this.set("numbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumbers: Self = this.set("numbers", js.undefined)
    @scala.inline
    def setOpenBalloonOnClick(value: Boolean): Self = this.set("openBalloonOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenBalloonOnClick: Self = this.set("openBalloonOnClick", js.undefined)
    @scala.inline
    def setOpenEmptyHint(value: Boolean): Self = this.set("openEmptyHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenEmptyHint: Self = this.set("openEmptyHint", js.undefined)
    @scala.inline
    def setOpenHintOnHover(value: Boolean): Self = this.set("openHintOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenHintOnHover: Self = this.set("openHintOnHover", js.undefined)
    @scala.inline
    def setZIndexHover(value: Double): Self = this.set("zIndexHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndexHover: Self = this.set("zIndexHover", js.undefined)
  }
  
}

