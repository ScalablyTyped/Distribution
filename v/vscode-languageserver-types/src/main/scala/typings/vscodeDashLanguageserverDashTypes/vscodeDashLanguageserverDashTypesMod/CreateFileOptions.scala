package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFileOptions extends js.Object {
  /**
    * Ignore if exists.
    */
  var ignoreIfExists: js.UndefOr[Boolean] = js.undefined
  /**
    * Overwrite existing file. Overwrite wins over `ignoreIfExists`
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object CreateFileOptions {
  @scala.inline
  def apply(ignoreIfExists: js.UndefOr[Boolean] = js.undefined, overwrite: js.UndefOr[Boolean] = js.undefined): CreateFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreIfExists)) __obj.updateDynamic("ignoreIfExists")(ignoreIfExists.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileOptions]
  }
}

