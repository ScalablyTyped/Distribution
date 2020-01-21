package typings.xmlrpc.mod

import typings.xmlrpc.AnonExpires
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookies extends js.Object {
  def get(name: String): String = js.native
  def set(name: String, value: String): Unit = js.native
  def set(name: String, value: String, options: AnonExpires): Unit = js.native
}

