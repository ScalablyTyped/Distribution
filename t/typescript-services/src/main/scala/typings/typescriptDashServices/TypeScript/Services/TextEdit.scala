package typings.typescriptDashServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.TextEdit")
@js.native
class TextEdit protected () extends js.Object {
  def this(minChar: Double, limChar: Double, text: String) = this()
  var limChar: Double = js.native
  var minChar: Double = js.native
  var text: String = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.TextEdit")
@js.native
object TextEdit extends js.Object {
  def createDelete(minChar: Double, limChar: Double): TextEdit = js.native
  def createInsert(pos: Double, text: String): TextEdit = js.native
  def createReplace(minChar: Double, limChar: Double, text: String): TextEdit = js.native
}

