package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "combineTracerFeatures")
@js.native
object combineTracerFeatures extends js.Object {
  
  def apply[O, T](one: TracerFeature[O], two: TracerFeature[T]): TracerFeature[O with T] = js.native
}
