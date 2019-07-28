package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenameFileOptions extends js.Object {
  /**
    * Ignores if target exists.
    */
  var ignoreIfExists: js.UndefOr[Boolean] = js.undefined
  /**
    * Overwrite target if existing. Overwrite wins over `ignoreIfExists`
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
}

object RenameFileOptions {
  @scala.inline
  def apply(ignoreIfExists: js.UndefOr[Boolean] = js.undefined, overwrite: js.UndefOr[Boolean] = js.undefined): RenameFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreIfExists)) __obj.updateDynamic("ignoreIfExists")(ignoreIfExists)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[RenameFileOptions]
  }
}

