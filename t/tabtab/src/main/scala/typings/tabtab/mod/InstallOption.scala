package typings.tabtab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallOption extends js.Object {
  var completer: String
  var name: String
}

object InstallOption {
  @scala.inline
  def apply(completer: String, name: String): InstallOption = {
    val __obj = js.Dynamic.literal(completer = completer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InstallOption]
  }
}

