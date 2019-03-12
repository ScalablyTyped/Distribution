package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageServicesDiagnostics extends js.Object {
  def log(content: java.lang.String): scala.Unit
}

object ILanguageServicesDiagnostics {
  @scala.inline
  def apply(log: java.lang.String => scala.Unit): ILanguageServicesDiagnostics = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[ILanguageServicesDiagnostics]
  }
}

