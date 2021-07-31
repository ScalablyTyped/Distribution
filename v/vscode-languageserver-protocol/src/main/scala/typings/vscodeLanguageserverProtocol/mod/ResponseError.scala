package typings.vscodeLanguageserverProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "ResponseError")
@js.native
class ResponseError[D] protected ()
  extends typings.vscodeJsonrpc.mod.ResponseError[D] {
  def this(code: Double, message: String) = this()
  def this(code: Double, message: String, data: D) = this()
}
