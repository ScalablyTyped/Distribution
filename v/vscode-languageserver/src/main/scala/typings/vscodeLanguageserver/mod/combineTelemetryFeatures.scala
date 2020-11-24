package typings.vscodeLanguageserver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver", "combineTelemetryFeatures")
@js.native
object combineTelemetryFeatures extends js.Object {
  
  def apply[O, T](one: TelemetryFeature[O], two: TelemetryFeature[T]): TelemetryFeature[O with T] = js.native
}
