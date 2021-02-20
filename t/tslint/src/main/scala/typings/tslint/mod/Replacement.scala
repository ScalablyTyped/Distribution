package typings.tslint.mod

import typings.tslint.ruleMod.Fix
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
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
object Replacement {
  
  @JSImport("tslint", "Replacement.appendText")
  @js.native
  def appendText(start: Double, text: String): typings.tslint.ruleMod.Replacement = js.native
  
  @JSImport("tslint", "Replacement.applyAll")
  @js.native
  def applyAll(content: String, replacements: js.Array[typings.tslint.ruleMod.Replacement]): String = js.native
  
  @JSImport("tslint", "Replacement.applyFixes")
  @js.native
  def applyFixes(content: String, fixes: js.Array[Fix]): String = js.native
  
  @JSImport("tslint", "Replacement.deleteFromTo")
  @js.native
  def deleteFromTo(start: Double, end: Double): typings.tslint.ruleMod.Replacement = js.native
  
  @JSImport("tslint", "Replacement.deleteText")
  @js.native
  def deleteText(start: Double, length: Double): typings.tslint.ruleMod.Replacement = js.native
  
  @JSImport("tslint", "Replacement.replaceFromTo")
  @js.native
  def replaceFromTo(start: Double, end: Double, text: String): typings.tslint.ruleMod.Replacement = js.native
  
  @JSImport("tslint", "Replacement.replaceNode")
  @js.native
  def replaceNode(node: Node, text: String): typings.tslint.ruleMod.Replacement = js.native
  @JSImport("tslint", "Replacement.replaceNode")
  @js.native
  def replaceNode(node: Node, text: String, sourceFile: SourceFile): typings.tslint.ruleMod.Replacement = js.native
}
