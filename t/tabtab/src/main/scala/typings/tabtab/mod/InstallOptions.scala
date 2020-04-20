package typings.tabtab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallOptions extends js.Object {
  /** The program that does the completion (can be the same program). */
  val completer: String
  /** The program to complete. */
  val name: String
}

object InstallOptions {
  @scala.inline
  def apply(completer: String, name: String): InstallOptions = {
    val __obj = js.Dynamic.literal(completer = completer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallOptions]
  }
}

