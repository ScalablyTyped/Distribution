package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverwrite extends js.Object {
  var overwrite: Boolean
}

object AnonOverwrite {
  @scala.inline
  def apply(overwrite: Boolean): AnonOverwrite = {
    val __obj = js.Dynamic.literal(overwrite = overwrite.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOverwrite]
  }
}

