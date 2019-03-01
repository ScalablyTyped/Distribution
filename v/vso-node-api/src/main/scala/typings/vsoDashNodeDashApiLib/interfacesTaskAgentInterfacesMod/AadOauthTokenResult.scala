package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AadOauthTokenResult extends js.Object {
  var accessToken: java.lang.String
  var refreshTokenCache: java.lang.String
}

object AadOauthTokenResult {
  @scala.inline
  def apply(accessToken: java.lang.String, refreshTokenCache: java.lang.String): AadOauthTokenResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.updateDynamic("refreshTokenCache")(refreshTokenCache)
    __obj.asInstanceOf[AadOauthTokenResult]
  }
}

