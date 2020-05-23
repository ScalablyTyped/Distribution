package typings.xmlrpc.mod

import typings.xmlrpc.anon.Expires
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookies extends js.Object {
  def get(name: String): String = js.native
  def set(name: String, value: String): Unit = js.native
  def set(name: String, value: String, options: Expires): Unit = js.native
}

