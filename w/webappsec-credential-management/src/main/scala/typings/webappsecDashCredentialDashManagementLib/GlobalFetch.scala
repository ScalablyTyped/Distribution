package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalFetch extends js.Object {
  def fetch(url: java.lang.String): js.Promise[stdLib.Response] = js.native
  def fetch(url: java.lang.String, init: CMRequestInit): js.Promise[stdLib.Response] = js.native
  // variant for navigator.credentials monkey patching
  def fetch(url: stdLib.Request): js.Promise[stdLib.Response] = js.native
  def fetch(url: stdLib.Request, init: CMRequestInit): js.Promise[stdLib.Response] = js.native
}

