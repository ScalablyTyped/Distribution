package typings.webpackValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends js.Object {
  var `loader-enforce-include-or-exclude`: js.UndefOr[Boolean] = js.undefined
  var `loader-prefer-include`: js.UndefOr[Boolean] = js.undefined
  var `no-root-files-node-modules-nameclash`: js.UndefOr[Boolean] = js.undefined
}

object ValidationOptions {
  @scala.inline
  def apply(
    `loader-enforce-include-or-exclude`: js.UndefOr[Boolean] = js.undefined,
    `loader-prefer-include`: js.UndefOr[Boolean] = js.undefined,
    `no-root-files-node-modules-nameclash`: js.UndefOr[Boolean] = js.undefined
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`loader-enforce-include-or-exclude`)) __obj.updateDynamic("loader-enforce-include-or-exclude")(`loader-enforce-include-or-exclude`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`loader-prefer-include`)) __obj.updateDynamic("loader-prefer-include")(`loader-prefer-include`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`no-root-files-node-modules-nameclash`)) __obj.updateDynamic("no-root-files-node-modules-nameclash")(`no-root-files-node-modules-nameclash`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
}

