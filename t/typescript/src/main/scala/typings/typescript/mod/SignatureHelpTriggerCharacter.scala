package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typescript.typescriptStrings.Comma
  - typings.typescript.typescriptStrings.Leftparenthesis
  - typings.typescript.typescriptStrings.Lessthansign
*/
trait SignatureHelpTriggerCharacter extends js.Object

object SignatureHelpTriggerCharacter {
  @scala.inline
  def Comma: typings.typescript.typescriptStrings.Comma = this.cast(",")
  @scala.inline
  def Leftparenthesis: typings.typescript.typescriptStrings.Leftparenthesis = this.cast("(")
  @scala.inline
  def Lessthansign: typings.typescript.typescriptStrings.Lessthansign = this.cast("<")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

