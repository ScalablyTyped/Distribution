package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AadOauthTokenResult extends js.Object {
  var accessToken: String
  var refreshTokenCache: String
}

object AadOauthTokenResult {
  @scala.inline
  def apply(accessToken: String, refreshTokenCache: String): AadOauthTokenResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, refreshTokenCache = refreshTokenCache)
  
    __obj.asInstanceOf[AadOauthTokenResult]
  }
}

