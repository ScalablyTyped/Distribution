package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/client", "ResponseError")
@js.native
class ResponseError[D] protected ()
  extends typings.vscodeLanguageserverProtocol.mod.ResponseError[D] {
  def this(code: Double, message: String) = this()
  def this(code: Double, message: String, data: D) = this()
}
