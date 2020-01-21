package typings.unsplashJs.mod.UnsplashApi

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth extends js.Object {
  def getAuthenticationUrl(): String = js.native
  def getAuthenticationUrl(scopes: js.Array[String]): String = js.native
  def setBearerToken(accessToken: String): Unit = js.native
  def userAuthentication(code: String): js.Promise[Response] = js.native
}

