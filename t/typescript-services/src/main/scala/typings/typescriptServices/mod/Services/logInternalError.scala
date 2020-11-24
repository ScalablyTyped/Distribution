package typings.typescriptServices.mod.Services

import typings.std.Error
import typings.typescriptServices.TypeScript.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.logInternalError")
@js.native
object logInternalError extends js.Object {
  
  def apply(logger: ILogger, err: Error): Unit = js.native
}
