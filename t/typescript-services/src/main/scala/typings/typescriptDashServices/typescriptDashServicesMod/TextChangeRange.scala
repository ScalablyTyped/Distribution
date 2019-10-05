package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TextChangeRange")
@js.native
class TextChangeRange protected ()
  extends typings.typescriptDashServices.TypeScript.TextChangeRange {
  def this(span: typings.typescriptDashServices.TypeScript.TextSpan, newLength: Double) = this()
}

/* static members */
@JSImport("typescript-services", "TextChangeRange")
@js.native
object TextChangeRange extends js.Object {
  var unchanged: typings.typescriptDashServices.TypeScript.TextChangeRange = js.native
  def collapseChangesAcrossMultipleVersions(changes: js.Array[typings.typescriptDashServices.TypeScript.TextChangeRange]): typings.typescriptDashServices.TypeScript.TextChangeRange = js.native
  def collapseChangesFromSingleVersion(changes: js.Array[typings.typescriptDashServices.TypeScript.TextChangeRange]): typings.typescriptDashServices.TypeScript.TextChangeRange = js.native
}

