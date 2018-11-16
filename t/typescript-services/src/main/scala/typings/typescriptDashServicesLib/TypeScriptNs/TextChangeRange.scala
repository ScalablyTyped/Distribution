package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TextChangeRange")
@js.native
class TextChangeRange protected () extends js.Object {
  def this(span: TextSpan, newLength: scala.Double) = this()
  var _newLength: js.Any = js.native
  var _span: js.Any = js.native
  def isUnchanged(): scala.Boolean = js.native
  def newLength(): scala.Double = js.native
  def newSpan(): TextSpan = js.native
  def span(): TextSpan = js.native
}

@JSGlobal("TypeScript.TextChangeRange")
@js.native
object TextChangeRange extends js.Object {
  var unchanged: typescriptDashServicesLib.TypeScriptNs.TextChangeRange = js.native
  def collapseChangesAcrossMultipleVersions(changes: js.Array[typescriptDashServicesLib.TypeScriptNs.TextChangeRange]): typescriptDashServicesLib.TypeScriptNs.TextChangeRange = js.native
  def collapseChangesFromSingleVersion(changes: js.Array[typescriptDashServicesLib.TypeScriptNs.TextChangeRange]): typescriptDashServicesLib.TypeScriptNs.TextChangeRange = js.native
}

