package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TextChangeRange")
@js.native
class TextChangeRange protected ()
  extends typescriptDashServicesLib.TypeScriptNs.TextChangeRange {
  def this(span: typescriptDashServicesLib.TypeScriptNs.TextSpan, newLength: scala.Double) = this()
}

/* static members */
@JSImport("typescript-services", "TextChangeRange")
@js.native
object TextChangeRange extends js.Object {
  var unchanged: typescriptDashServicesLib.TypeScriptNs.TextChangeRange = js.native
  def collapseChangesAcrossMultipleVersions(changes: js.Array[typescriptDashServicesLib.TypeScriptNs.TextChangeRange]): typescriptDashServicesLib.TypeScriptNs.TextChangeRange = js.native
  def collapseChangesFromSingleVersion(changes: js.Array[typescriptDashServicesLib.TypeScriptNs.TextChangeRange]): typescriptDashServicesLib.TypeScriptNs.TextChangeRange = js.native
}

