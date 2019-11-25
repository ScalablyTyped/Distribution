package typings.validateDashNpmDashPackageDashName.validateDashNpmDashPackageDashNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  var validForNewPackages: Boolean
  var validForOldPackages: Boolean
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object Result {
  @scala.inline
  def apply(
    validForNewPackages: Boolean,
    validForOldPackages: Boolean,
    errors: js.Array[String] = null,
    warnings: js.Array[String] = null
  ): Result = {
    val __obj = js.Dynamic.literal(validForNewPackages = validForNewPackages.asInstanceOf[js.Any], validForOldPackages = validForOldPackages.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

