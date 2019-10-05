package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticInfo extends js.Object {
  var category: DiagnosticCategory
  var code: Double
  var message: String
}

object DiagnosticInfo {
  @scala.inline
  def apply(category: DiagnosticCategory, code: Double, message: String): DiagnosticInfo = {
    val __obj = js.Dynamic.literal(category = category, code = code, message = message)
  
    __obj.asInstanceOf[DiagnosticInfo]
  }
}

