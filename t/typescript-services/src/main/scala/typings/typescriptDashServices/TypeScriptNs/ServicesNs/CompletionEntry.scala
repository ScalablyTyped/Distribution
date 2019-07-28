package typings.typescriptDashServices.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionEntry extends js.Object {
  var kind: String
  var kindModifiers: String
  var name: String
}

object CompletionEntry {
  @scala.inline
  def apply(kind: String, kindModifiers: String, name: String): CompletionEntry = {
    val __obj = js.Dynamic.literal(kind = kind, kindModifiers = kindModifiers, name = name)
  
    __obj.asInstanceOf[CompletionEntry]
  }
}

