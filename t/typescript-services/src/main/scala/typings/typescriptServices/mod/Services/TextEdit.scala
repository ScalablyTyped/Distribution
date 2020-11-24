package typings.typescriptServices.mod.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.TextEdit")
@js.native
class TextEdit protected ()
  extends typings.typescriptServices.TypeScript.Services.TextEdit {
  def this(minChar: Double, limChar: Double, text: String) = this()
}
/* static members */
@JSImport("typescript-services", "Services.TextEdit")
@js.native
object TextEdit extends js.Object {
  
  def createDelete(minChar: Double, limChar: Double): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
  
  def createInsert(pos: Double, text: String): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
  
  def createReplace(minChar: Double, limChar: Double, text: String): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
}
