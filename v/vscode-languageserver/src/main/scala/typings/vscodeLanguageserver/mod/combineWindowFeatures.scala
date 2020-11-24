package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "combineWindowFeatures")
@js.native
object combineWindowFeatures extends js.Object {
  
  def apply[O, T](one: WindowFeature[O], two: WindowFeature[T]): WindowFeature[O with T] = js.native
}
