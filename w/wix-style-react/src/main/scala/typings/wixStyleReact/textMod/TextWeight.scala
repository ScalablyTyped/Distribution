package typings.wixStyleReact.textMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wixStyleReact.wixStyleReactStrings.thin
  - typings.wixStyleReact.wixStyleReactStrings.normal
  - typings.wixStyleReact.wixStyleReactStrings.bold
*/
trait TextWeight extends js.Object

object TextWeight {
  @scala.inline
  def bold: typings.wixStyleReact.wixStyleReactStrings.bold = this.cast("bold")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typings.wixStyleReact.wixStyleReactStrings.normal = this.cast("normal")
  @scala.inline
  def thin: typings.wixStyleReact.wixStyleReactStrings.thin = this.cast("thin")
}

