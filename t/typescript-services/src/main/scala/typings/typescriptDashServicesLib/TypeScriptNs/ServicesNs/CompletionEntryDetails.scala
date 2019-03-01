package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionEntryDetails extends js.Object {
  var docComment: java.lang.String
  var fullSymbolName: java.lang.String
  var kind: java.lang.String
  var kindModifiers: java.lang.String
  var name: java.lang.String
  var `type`: java.lang.String
}

object CompletionEntryDetails {
  @scala.inline
  def apply(
    docComment: java.lang.String,
    fullSymbolName: java.lang.String,
    kind: java.lang.String,
    kindModifiers: java.lang.String,
    name: java.lang.String,
    `type`: java.lang.String
  ): CompletionEntryDetails = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("docComment")(docComment)
    __obj.updateDynamic("fullSymbolName")(fullSymbolName)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("kindModifiers")(kindModifiers)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[CompletionEntryDetails]
  }
}

