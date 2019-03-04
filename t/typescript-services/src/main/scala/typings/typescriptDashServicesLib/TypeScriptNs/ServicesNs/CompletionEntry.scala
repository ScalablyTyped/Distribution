package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionEntry extends js.Object {
  var kind: java.lang.String
  var kindModifiers: java.lang.String
  var name: java.lang.String
}

object CompletionEntry {
  @scala.inline
  def apply(kind: java.lang.String, kindModifiers: java.lang.String, name: java.lang.String): CompletionEntry = {
    val __obj = js.Dynamic.literal(kind = kind, kindModifiers = kindModifiers, name = name)
  
    __obj.asInstanceOf[CompletionEntry]
  }
}

