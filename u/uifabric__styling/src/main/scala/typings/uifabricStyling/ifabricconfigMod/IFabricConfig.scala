package typings.uifabricStyling.ifabricconfigMod

import typings.uifabricMergeStyles.stylesheetMod.IStyleSheetConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFabricConfig extends js.Object {
  /**
    * An override for where the fonts should be downloaded from.
    */
  var fontBaseUrl: js.UndefOr[String] = js.undefined
  /**
    * The mergeStyles stylesheet config.
    */
  var mergeStyles: js.UndefOr[IStyleSheetConfig] = js.undefined
}

object IFabricConfig {
  @scala.inline
  def apply(fontBaseUrl: String = null, mergeStyles: IStyleSheetConfig = null): IFabricConfig = {
    val __obj = js.Dynamic.literal()
    if (fontBaseUrl != null) __obj.updateDynamic("fontBaseUrl")(fontBaseUrl.asInstanceOf[js.Any])
    if (mergeStyles != null) __obj.updateDynamic("mergeStyles")(mergeStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFabricConfig]
  }
}

