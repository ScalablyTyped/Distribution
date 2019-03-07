package typings
package unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth extends js.Object {
  def getAuthenticationUrl(): java.lang.String = js.native
  def getAuthenticationUrl(scopes: js.Array[java.lang.String]): java.lang.String = js.native
  def setBearerToken(accessToken: java.lang.String): scala.Unit = js.native
  def userAuthentication(code: java.lang.String): js.Promise[stdLib.Response] = js.native
}

