package typings.typescriptServices.mod.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.TextEdit")
@js.native
class TextEdit protected ()
  extends typings.typescriptServices.TypeScript.Services.TextEdit {
  def this(minChar: Double, limChar: Double, text: String) = this()
  /* CompleteClass */
  override var limChar: Double = js.native
  /* CompleteClass */
  override var minChar: Double = js.native
  /* CompleteClass */
  override var text: String = js.native
}

/* static members */
@JSImport("typescript-services", "Services.TextEdit")
@js.native
object TextEdit extends js.Object {
  def createDelete(minChar: Double, limChar: Double): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
  def createInsert(pos: Double, text: String): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
  def createReplace(minChar: Double, limChar: Double, text: String): typings.typescriptServices.TypeScript.Services.TextEdit = js.native
}

