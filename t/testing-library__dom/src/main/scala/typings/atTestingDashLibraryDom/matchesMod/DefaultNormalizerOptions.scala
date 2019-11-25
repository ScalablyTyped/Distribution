package typings.atTestingDashLibraryDom.matchesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultNormalizerOptions extends js.Object {
  var collapseWhitespace: js.UndefOr[Boolean] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
}

object DefaultNormalizerOptions {
  @scala.inline
  def apply(collapseWhitespace: js.UndefOr[Boolean] = js.undefined, trim: js.UndefOr[Boolean] = js.undefined): DefaultNormalizerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseWhitespace)) __obj.updateDynamic("collapseWhitespace")(collapseWhitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultNormalizerOptions]
  }
}

