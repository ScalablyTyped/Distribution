package typings.uifabricStyling.ifabricconfigMod

import typings.uifabricMergeStyles.stylesheetMod.IStyleSheetConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFabricConfig extends js.Object {
  /**
    * An override for where the fonts should be downloaded from.
    */
  var fontBaseUrl: js.UndefOr[String] = js.native
  /**
    * The mergeStyles stylesheet config.
    */
  var mergeStyles: js.UndefOr[IStyleSheetConfig] = js.native
}

object IFabricConfig {
  @scala.inline
  def apply(): IFabricConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFabricConfig]
  }
  @scala.inline
  implicit class IFabricConfigOps[Self <: IFabricConfig] (val x: Self) extends AnyVal {
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
    def setFontBaseUrl(value: String): Self = this.set("fontBaseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontBaseUrl: Self = this.set("fontBaseUrl", js.undefined)
    @scala.inline
    def setMergeStyles(value: IStyleSheetConfig): Self = this.set("mergeStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeStyles: Self = this.set("mergeStyles", js.undefined)
  }
  
}

