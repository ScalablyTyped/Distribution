package typings.tslint.mod

import typings.tslint.ruleMod.Fix
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "Replacement")
@js.native
class Replacement protected ()
  extends typings.tslint.ruleMod.Replacement {
  def this(start: Double, length: Double, text: String) = this()
}
/* static members */
@JSImport("tslint", "Replacement")
@js.native
object Replacement extends js.Object {
  
  def appendText(start: Double, text: String): typings.tslint.ruleMod.Replacement = js.native
  
  def applyAll(content: String, replacements: js.Array[typings.tslint.ruleMod.Replacement]): String = js.native
  
  def applyFixes(content: String, fixes: js.Array[Fix]): String = js.native
  
  def deleteFromTo(start: Double, end: Double): typings.tslint.ruleMod.Replacement = js.native
  
  def deleteText(start: Double, length: Double): typings.tslint.ruleMod.Replacement = js.native
  
  def replaceFromTo(start: Double, end: Double, text: String): typings.tslint.ruleMod.Replacement = js.native
  
  def replaceNode(node: Node, text: String): typings.tslint.ruleMod.Replacement = js.native
  def replaceNode(node: Node, text: String, sourceFile: SourceFile): typings.tslint.ruleMod.Replacement = js.native
}
