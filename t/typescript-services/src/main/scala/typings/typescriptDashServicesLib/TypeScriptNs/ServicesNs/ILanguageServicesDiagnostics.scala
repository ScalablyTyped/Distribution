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
  def apply(log: js.Function1[java.lang.String, scala.Unit]): ILanguageServicesDiagnostics = {
    val __obj = js.Dynamic.literal(log = log)
  
    __obj.asInstanceOf[ILanguageServicesDiagnostics]
  }
}

