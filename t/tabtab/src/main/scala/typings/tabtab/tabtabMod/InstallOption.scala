package typings.tabtab.tabtabMod

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
    val __obj = js.Dynamic.literal(completer = completer, name = name)
  
    __obj.asInstanceOf[InstallOption]
  }
}

