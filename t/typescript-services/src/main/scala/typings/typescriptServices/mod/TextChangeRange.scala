package typings.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "TextChangeRange")
@js.native
class TextChangeRange protected ()
  extends typings.typescriptServices.TypeScript.TextChangeRange {
  def this(span: typings.typescriptServices.TypeScript.TextSpan, newLength: Double) = this()
  /* CompleteClass */
  override var _newLength: js.Any = js.native
  /* CompleteClass */
  override var _span: js.Any = js.native
  /* CompleteClass */
  override def isUnchanged(): Boolean = js.native
  /* CompleteClass */
  override def newLength(): Double = js.native
  /* CompleteClass */
  override def newSpan(): typings.typescriptServices.TypeScript.TextSpan = js.native
  /* CompleteClass */
  override def span(): typings.typescriptServices.TypeScript.TextSpan = js.native
}

/* static members */
@JSImport("typescript-services", "TextChangeRange")
@js.native
object TextChangeRange extends js.Object {
  var unchanged: typings.typescriptServices.TypeScript.TextChangeRange = js.native
  def collapseChangesAcrossMultipleVersions(changes: js.Array[typings.typescriptServices.TypeScript.TextChangeRange]): typings.typescriptServices.TypeScript.TextChangeRange = js.native
  def collapseChangesFromSingleVersion(changes: js.Array[typings.typescriptServices.TypeScript.TextChangeRange]): typings.typescriptServices.TypeScript.TextChangeRange = js.native
}

