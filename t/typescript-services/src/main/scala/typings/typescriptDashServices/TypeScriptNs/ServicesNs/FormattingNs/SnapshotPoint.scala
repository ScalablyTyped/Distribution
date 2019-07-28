package typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.SnapshotPoint")
@js.native
class SnapshotPoint protected () extends js.Object {
  def this(snapshot: ITextSnapshot, position: Double) = this()
  var position: Double = js.native
  var snapshot: ITextSnapshot = js.native
  def add(offset: Double): SnapshotPoint = js.native
  def getContainingLine(): ITextSnapshotLine = js.native
}

