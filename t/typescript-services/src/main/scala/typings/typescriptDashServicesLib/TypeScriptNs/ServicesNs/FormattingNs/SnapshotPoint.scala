package typings
package typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.SnapshotPoint")
@js.native
class SnapshotPoint protected () extends js.Object {
  def this(snapshot: ITextSnapshot, position: scala.Double) = this()
  var position: scala.Double = js.native
  var snapshot: ITextSnapshot = js.native
  def add(offset: scala.Double): SnapshotPoint = js.native
  def getContainingLine(): ITextSnapshotLine = js.native
}

