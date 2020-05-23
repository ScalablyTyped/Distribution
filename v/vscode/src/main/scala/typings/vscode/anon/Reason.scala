package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reason extends js.Object {
  /**
    * Human readable description of why the code action is currently disabled.
    *
    * This is displayed in the code actions UI.
    */
  val reason: String
}

object Reason {
  @scala.inline
  def apply(reason: String): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
}

