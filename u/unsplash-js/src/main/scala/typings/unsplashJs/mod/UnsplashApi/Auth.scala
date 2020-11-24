package typings.unsplashJs.mod.UnsplashApi

import typings.std.Response
import typings.unsplashJs.mod.Scopes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth extends js.Object {
  
  def getAuthenticationUrl(): String = js.native
  def getAuthenticationUrl(scopes: js.Array[Scopes]): String = js.native
  
  def setBearerToken(accessToken: String): Unit = js.native
  
  def userAuthentication(code: String): js.Promise[Response] = js.native
}
