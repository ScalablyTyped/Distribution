package typings.vueCompilerDom.mod

import typings.vueCompilerCore.mod.SourceLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-dom", "createDOMCompilerError")
@js.native
object createDOMCompilerError extends js.Object {
  
  def apply(code: DOMErrorCodes): DOMCompilerError = js.native
  def apply(code: DOMErrorCodes, loc: SourceLocation): DOMCompilerError = js.native
}
