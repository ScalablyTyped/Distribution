package typings.tslint.ruleMod

import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/rule/rule", "Replacement")
@js.native
class Replacement protected () extends js.Object {
  def this(start: Double, length: Double, text: String) = this()
  val end: Double = js.native
  val length: Double = js.native
  val start: Double = js.native
  val text: String = js.native
  @JSName("apply")
  def apply(content: String): String = js.native
  def toJson(): ReplacementJson = js.native
}

/* static members */
@JSImport("tslint/lib/language/rule/rule", "Replacement")
@js.native
object Replacement extends js.Object {
  def appendText(start: Double, text: String): Replacement = js.native
  def applyAll(content: String, replacements: js.Array[Replacement]): String = js.native
  def applyFixes(content: String, fixes: js.Array[Fix]): String = js.native
  def deleteFromTo(start: Double, end: Double): Replacement = js.native
  def deleteText(start: Double, length: Double): Replacement = js.native
  def replaceFromTo(start: Double, end: Double, text: String): Replacement = js.native
  def replaceNode(node: Node, text: String): Replacement = js.native
  def replaceNode(node: Node, text: String, sourceFile: SourceFile): Replacement = js.native
}

