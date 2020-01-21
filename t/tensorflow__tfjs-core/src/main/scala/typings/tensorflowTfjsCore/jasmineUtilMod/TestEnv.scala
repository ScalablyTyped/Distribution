package typings.tensorflowTfjsCore.jasmineUtilMod

import typings.tensorflowTfjsCore.environmentMod.Flags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestEnv extends js.Object {
  var backendName: String
  var flags: js.UndefOr[Flags] = js.undefined
  var isDataSync: js.UndefOr[Boolean] = js.undefined
  var name: String
}

object TestEnv {
  @scala.inline
  def apply(
    backendName: String,
    name: String,
    flags: Flags = null,
    isDataSync: js.UndefOr[Boolean] = js.undefined
  ): TestEnv = {
    val __obj = js.Dynamic.literal(backendName = backendName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (!js.isUndefined(isDataSync)) __obj.updateDynamic("isDataSync")(isDataSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEnv]
  }
}

