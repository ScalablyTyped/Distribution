package typings
package wallabyjsLib.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyEnvironment extends js.Object {
  var params: js.UndefOr[IWallabyEnvironmentParameters] = js.undefined
  var runner: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var viewportSize: js.UndefOr[IWallabyEnvironmentViewportSize] = js.undefined
}

object IWallabyEnvironment {
  @scala.inline
  def apply(
    params: IWallabyEnvironmentParameters = null,
    runner: java.lang.String = null,
    `type`: java.lang.String = null,
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

