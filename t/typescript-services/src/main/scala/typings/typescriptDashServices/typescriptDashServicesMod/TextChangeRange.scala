package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TextChangeRange")
@js.native
class TextChangeRange protected ()
  extends typings.typescriptDashServices.TypeScriptNs.TextChangeRange {
  def this(span: typings.typescriptDashServices.TypeScriptNs.TextSpan, newLength: Double) = this()
}

/* static members */
@JSImport("typescript-services", "TextChangeRange")
@js.native
object TextChangeRange extends js.Object {
  var unchanged: typings.typescriptDashServices.TypeScriptNs.TextChangeRange = js.native
  def collapseChangesAcrossMultipleVersions(changes: js.Array[typings.typescriptDashServices.TypeScriptNs.TextChangeRange]): typings.typescriptDashServices.TypeScriptNs.TextChangeRange = js.native
  def collapseChangesFromSingleVersion(changes: js.Array[typings.typescriptDashServices.TypeScriptNs.TextChangeRange]): typings.typescriptDashServices.TypeScriptNs.TextChangeRange = js.native
}

