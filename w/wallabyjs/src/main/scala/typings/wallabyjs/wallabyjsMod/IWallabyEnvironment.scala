package typings.wallabyjs.wallabyjsMod

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
    if (params != null) __obj.updateDynamic("params")(params)
    if (runner != null) __obj.updateDynamic("runner")(runner)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (viewportSize != null) __obj.updateDynamic("viewportSize")(viewportSize)
    __obj.asInstanceOf[IWallabyEnvironment]
  }
}

