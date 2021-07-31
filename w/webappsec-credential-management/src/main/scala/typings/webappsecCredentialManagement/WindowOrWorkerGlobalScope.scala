package typings.webappsecCredentialManagement

import typings.std.Request
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOrWorkerGlobalScope extends StObject {
  
  def fetch(url: String): js.Promise[Response] = js.native
  def fetch(url: String, init: CMRequestInit): js.Promise[Response] = js.native
  def fetch(url: Request): js.Promise[Response] = js.native
  def fetch(url: Request, init: CMRequestInit): js.Promise[Response] = js.native
}
