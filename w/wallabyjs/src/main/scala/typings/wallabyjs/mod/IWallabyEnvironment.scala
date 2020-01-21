package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyEnvironment extends js.Object {
  var params: js.UndefOr[IWallabyEnvironmentParameters] = js.undefined
  var runner: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var viewportSize: js.UndefOr[IWallabyEnvironmentViewportSize] = js.undefined
}

object IWallabyEnvironment {
  @scala.inline
  def apply(
    params: IWallabyEnvironmentParameters = null,
    runner: String = null,
    `type`: String = null,
    viewportSize: IWallabyEnvironmentViewportSize = null
  ): IWallabyEnvironment = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (runner != null) __obj.updateDynamic("runner")(runner.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (viewportSize != null) __obj.updateDynamic("viewportSize")(viewportSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWallabyEnvironment]
  }
}

