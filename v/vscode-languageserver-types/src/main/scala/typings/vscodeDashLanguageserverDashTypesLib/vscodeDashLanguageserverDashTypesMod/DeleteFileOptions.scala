package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileOptions extends js.Object {
  /**
    * Ignore the operation if the file doesn't exist.
    */
  var ignoreIfNotExists: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delete the content recursively if a folder is denoted.
    */
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
}

object DeleteFileOptions {
  @scala.inline
  def apply(
    ignoreIfNotExists: js.UndefOr[scala.Boolean] = js.undefined,
    recursive: js.UndefOr[scala.Boolean] = js.undefined
  ): DeleteFileOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreIfNotExists)) __obj.updateDynamic("ignoreIfNotExists")(ignoreIfNotExists)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[DeleteFileOptions]
  }
}

