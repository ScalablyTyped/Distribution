package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TextChangeRange")
@js.native
class TextChangeRange protected () extends js.Object {
  def this(span: TextSpan, newLength: Double) = this()
  var _newLength: js.Any = js.native
  var _span: js.Any = js.native
  def isUnchanged(): Boolean = js.native
  def newLength(): Double = js.native
  def newSpan(): TextSpan = js.native
  def span(): TextSpan = js.native
}

/* static members */
@JSGlobal("TypeScript.TextChangeRange")
@js.native
object TextChangeRange extends js.Object {
  var unchanged: TextChangeRange = js.native
  def collapseChangesAcrossMultipleVersions(changes: js.Array[TextChangeRange]): TextChangeRange = js.native
  def collapseChangesFromSingleVersion(changes: js.Array[TextChangeRange]): TextChangeRange = js.native
}

