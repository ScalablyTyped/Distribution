package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageServicesDiagnostics extends js.Object {
  def log(content: String): Unit
}

object ILanguageServicesDiagnostics {
  @scala.inline
  def apply(log: String => Unit): ILanguageServicesDiagnostics = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[ILanguageServicesDiagnostics]
  }
}

