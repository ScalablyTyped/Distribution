package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typescript.typescriptStrings.Rightparenthesis
  - typings.typescript.typescriptStrings.Comma
  - typings.typescript.typescriptStrings.Leftparenthesis
  - typings.typescript.typescriptStrings.Lessthansign
*/
trait SignatureHelpRetriggerCharacter extends js.Object

object SignatureHelpRetriggerCharacter {
  @scala.inline
  def Comma: typings.typescript.typescriptStrings.Comma = this.cast(",")
  @scala.inline
  def Leftparenthesis: typings.typescript.typescriptStrings.Leftparenthesis = this.cast("(")
  @scala.inline
  def Lessthansign: typings.typescript.typescriptStrings.Lessthansign = this.cast("<")
  @scala.inline
  def Rightparenthesis: typings.typescript.typescriptStrings.Rightparenthesis = this.cast(")")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

