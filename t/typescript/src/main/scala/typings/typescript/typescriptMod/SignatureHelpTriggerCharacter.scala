package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typescript.typescriptStrings.`,`
  - typings.typescript.typescriptStrings.`(`
  - typings.typescript.typescriptStrings.`<`
*/
trait SignatureHelpTriggerCharacter extends js.Object

object SignatureHelpTriggerCharacter {
  @scala.inline
  def `(`: typings.typescript.typescriptStrings.`(` = this.cast("(")
  @scala.inline
  def `,`: typings.typescript.typescriptStrings.`,` = this.cast(",")
  @scala.inline
  def `<`: typings.typescript.typescriptStrings.`<` = this.cast("<")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

