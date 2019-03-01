package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFileOptions extends js.Object {
  /**
    * Ignore if exists.
    */
  var ignoreIfExists: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Overwrite existing file. Overwrite wins over `ignoreIfExists`
    */
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateFileOptions {
  @scala.inline
  def apply(
    ignoreIfExists: js.UndefOr[scala.Boolean] = js.undefined,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreIfExists)) __obj.updateDynamic("ignoreIfExists")(ignoreIfExists)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[CreateFileOptions]
  }
}

