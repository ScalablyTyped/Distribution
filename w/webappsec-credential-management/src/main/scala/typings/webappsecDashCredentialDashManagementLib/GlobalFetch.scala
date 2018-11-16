package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalFetch extends js.Object {
  // variant for navigator.credentials monkey patching
  def fetch(url: java.lang.String): stdLib.Promise[stdLib.Response] = js.native
  // variant for navigator.credentials monkey patching
  def fetch(url: java.lang.String, init: CMRequestInit): stdLib.Promise[stdLib.Response] = js.native
  // variant for navigator.credentials monkey patching
  def fetch(url: stdLib.Request): stdLib.Promise[stdLib.Response] = js.native
  // variant for navigator.credentials monkey patching
  def fetch(url: stdLib.Request, init: CMRequestInit): stdLib.Promise[stdLib.Response] = js.native
}

