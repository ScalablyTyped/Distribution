package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.TextChangeRange")
@js.native
class TextChangeRange protected ()
  extends typings.typescriptServices.TypeScript.TextChangeRange {
  def this(span: typings.typescriptServices.TypeScript.TextSpan, newLength: Double) = this()
}

/* static members */
@JSGlobal("TypeScript.TextChangeRange")
@js.native
object TextChangeRange extends js.Object {
  var unchanged: typings.typescriptServices.TypeScript.TextChangeRange = js.native
  def collapseChangesAcrossMultipleVersions(changes: js.Array[typings.typescriptServices.TypeScript.TextChangeRange]): typings.typescriptServices.TypeScript.TextChangeRange = js.native
  def collapseChangesFromSingleVersion(changes: js.Array[typings.typescriptServices.TypeScript.TextChangeRange]): typings.typescriptServices.TypeScript.TextChangeRange = js.native
}

