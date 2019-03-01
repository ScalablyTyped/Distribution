package typings
package wallabyjsLib.wallabyjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWallabyEnvironmentParameters extends js.Object {
  var env: js.UndefOr[java.lang.String] = js.undefined
  var runner: js.UndefOr[java.lang.String] = js.undefined
}

object IWallabyEnvironmentParameters {
  @scala.inline
  def apply(env: java.lang.String = null, runner: java.lang.String = null): IWallabyEnvironmentParameters = {
    val __obj = js.Dynamic.literal()
    if (env != null) __obj.updateDynamic("env")(env)
    if (runner != null) __obj.updateDynamic("runner")(runner)
    __obj.asInstanceOf[IWallabyEnvironmentParameters]
  }
}

