package typings
package toDashMarkdownLib.toDashMarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("to-markdown", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Converts HTML to markdown.
    */
  def apply(input: java.lang.String): java.lang.String = js.native
  def apply(input: java.lang.String, options: toDashMarkdownLib.toDashMarkdownMod.toMarkdownNs.Options): java.lang.String = js.native
  /**
    * Returns true / false depending on whether the element is block level.
    */
  def isBlock(node: stdLib.HTMLElement): scala.Boolean = js.native
  /**
    * Returns true / false depending on whether the element is void.
    */
  def isVoid(node: stdLib.HTMLElement): scala.Boolean = js.native
  /**
    * Returns the HTML string of an element with its contents converted.
    */
  def outer(node: stdLib.HTMLElement, content: java.lang.String): scala.Boolean = js.native
}

