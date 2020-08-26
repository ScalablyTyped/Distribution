package typings.typescriptServices.global.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.TextEdit")
@js.native
class TextEdit protected ()
  extends typings.typescriptServices.TypeScript.Services.TextEdit {
  def this(minChar: Double, limChar: Double, text: String) = this()
}

/* static members */
@JSGlobal("TypeScript.Services.TextEdit")
@js.native
object TextEdit extends js.Object {
  def createDelete(minChar: Double, limChar: Double): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
  def createInsert(pos: Double, text: String): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
  def createReplace(minChar: Double, limChar: Double, text: String): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
}

