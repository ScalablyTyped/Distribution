package typings.webfontloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Monotype extends js.Object {
  var loadAllFonts: js.UndefOr[Boolean] = js.undefined
  var projectId: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object Monotype {
  @scala.inline
  def apply(
    loadAllFonts: js.UndefOr[Boolean] = js.undefined,
    projectId: String = null,
    version: js.UndefOr[Double] = js.undefined
  ): Monotype = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loadAllFonts)) __obj.updateDynamic("loadAllFonts")(loadAllFonts.get.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monotype]
  }
}

