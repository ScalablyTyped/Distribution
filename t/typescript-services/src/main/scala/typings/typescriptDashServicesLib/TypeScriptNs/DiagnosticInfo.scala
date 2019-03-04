package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagnosticInfo extends js.Object {
  var category: DiagnosticCategory
  var code: scala.Double
  var message: java.lang.String
}

object DiagnosticInfo {
  @scala.inline
  def apply(category: DiagnosticCategory, code: scala.Double, message: java.lang.String): DiagnosticInfo = {
    val __obj = js.Dynamic.literal(category = category, code = code, message = message)
  
    __obj.asInstanceOf[DiagnosticInfo]
  }
}

