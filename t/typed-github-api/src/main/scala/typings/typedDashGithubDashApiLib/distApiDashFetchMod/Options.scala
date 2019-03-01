package typings
package typedDashGithubDashApiLib.distApiDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typedDashGithubDashApiLib.distGithubDashRefMod.OptionsOrRef {
  var oAuthToken: js.UndefOr[java.lang.String] = js.undefined
  var userAgent: java.lang.String
  var version: js.UndefOr[
    typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.v3 | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`thor-preview`
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    userAgent: java.lang.String,
    oAuthToken: java.lang.String = null,
    version: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.v3 | typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.`thor-preview` = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("userAgent")(userAgent)
    if (oAuthToken != null) __obj.updateDynamic("oAuthToken")(oAuthToken)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

