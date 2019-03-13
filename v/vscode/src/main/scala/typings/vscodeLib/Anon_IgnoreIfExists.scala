package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreIfExists extends js.Object {
  var ignoreIfExists: js.UndefOr[scala.Boolean] = js.undefined
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IgnoreIfExists {
  @scala.inline
  def apply(
    ignoreIfExists: js.UndefOr[scala.Boolean] = js.undefined,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IgnoreIfExists = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreIfExists)) __obj.updateDynamic("ignoreIfExists")(ignoreIfExists)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    __obj.asInstanceOf[Anon_IgnoreIfExists]
  }
}

