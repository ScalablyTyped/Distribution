package typings.typescriptServices.global.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.Services.TextEdit")
@js.native
class TextEdit protected ()
  extends typings.typescriptServices.TypeScript.Services.TextEdit {
  def this(minChar: Double, limChar: Double, text: String) = this()
}
object TextEdit {
  
  /* static member */
  @JSGlobal("TypeScript.Services.TextEdit.createDelete")
  @js.native
  def createDelete(minChar: Double, limChar: Double): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Services.TextEdit.createInsert")
  @js.native
  def createInsert(pos: Double, text: String): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
  
  /* static member */
  @JSGlobal("TypeScript.Services.TextEdit.createReplace")
  @js.native
  def createReplace(minChar: Double, limChar: Double, text: String): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
}
