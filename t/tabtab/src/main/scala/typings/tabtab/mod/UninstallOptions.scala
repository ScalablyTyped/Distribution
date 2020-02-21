package typings.tabtab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UninstallOptions extends js.Object {
  /** The program to remove completions for. */
  val name: String
}

object UninstallOptions {
  @scala.inline
  def apply(name: String): UninstallOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UninstallOptions]
  }
}

