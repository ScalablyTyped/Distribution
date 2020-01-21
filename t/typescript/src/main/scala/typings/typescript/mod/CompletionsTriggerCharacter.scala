package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typescript.typescriptStrings.Dot
  - typings.typescript.typescriptStrings.Quotationmark
  - typings.typescript.typescriptStrings.Apostrophe
  - typings.typescript.typescriptStrings.Graveaccent
  - typings.typescript.typescriptStrings.Slash
  - typings.typescript.typescriptStrings.`@`
  - typings.typescript.typescriptStrings.Lessthansign
*/
trait CompletionsTriggerCharacter extends js.Object

object CompletionsTriggerCharacter {
  @scala.inline
  def `@`: typings.typescript.typescriptStrings.`@` = this.cast("@")
  @scala.inline
  def Apostrophe: typings.typescript.typescriptStrings.Apostrophe = this.cast("'")
  @scala.inline
  def Dot: typings.typescript.typescriptStrings.Dot = this.cast(".")
  @scala.inline
  def Graveaccent: typings.typescript.typescriptStrings.Graveaccent = this.cast("`")
  @scala.inline
  def Lessthansign: typings.typescript.typescriptStrings.Lessthansign = this.cast("<")
  @scala.inline
  def Quotationmark: typings.typescript.typescriptStrings.Quotationmark = this.cast("\"")
  @scala.inline
  def Slash: typings.typescript.typescriptStrings.Slash = this.cast("/")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

