package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUnicodeHandling extends js.Object {
  /**
    * Getter/setter for active Unicode version.
    */
  var activeVersion: String
  /**
    * Registered Unicode versions.
    */
  val versions: js.Array[String]
  /**
    * Register a custom Unicode version provider.
    */
  def register(provider: IUnicodeVersionProvider): Unit
}

object IUnicodeHandling {
  @scala.inline
  def apply(activeVersion: String, register: IUnicodeVersionProvider => Unit, versions: js.Array[String]): IUnicodeHandling = {
    val __obj = js.Dynamic.literal(activeVersion = activeVersion.asInstanceOf[js.Any], register = js.Any.fromFunction1(register), versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUnicodeHandling]
  }
}

