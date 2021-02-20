package typings.typescriptServices.mod.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.TextEdit")
@js.native
class TextEdit protected ()
  extends typings.typescriptServices.TypeScript.Services.TextEdit {
  def this(minChar: Double, limChar: Double, text: String) = this()
}
object TextEdit {
  
  /* static member */
  @JSImport("typescript-services", "Services.TextEdit.createDelete")
  @js.native
  def createDelete(minChar: Double, limChar: Double): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.TextEdit.createInsert")
  @js.native
  def createInsert(pos: Double, text: String): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
  
  /* static member */
  @JSImport("typescript-services", "Services.TextEdit.createReplace")
  @js.native
  def createReplace(minChar: Double, limChar: Double, text: String): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
}
