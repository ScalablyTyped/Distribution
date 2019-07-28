package typings.toDashMarkdown.toDashMarkdownMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("to-markdown", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Converts HTML to markdown.
    */
  def apply(input: String): String = js.native
  def apply(input: String, options: Options): String = js.native
  /**
    * Returns true / false depending on whether the element is block level.
    */
  def isBlock(node: HTMLElement): Boolean = js.native
  /**
    * Returns true / false depending on whether the element is void.
    */
  def isVoid(node: HTMLElement): Boolean = js.native
  /**
    * Returns the HTML string of an element with its contents converted.
    */
  def outer(node: HTMLElement, content: String): Boolean = js.native
}

