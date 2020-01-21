package typings.typesettable.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "HtmlContext")
@js.native
class HtmlContext protected ()
  extends typings.typesettable.contextsMod.HtmlContext {
  /**
    * @param element - The CSS font styles applied to `element` will determine the
    * size of text measurements. Also the default text block container.
    * @param className - added to new text blocks
    * @param addTitle - enable title attribute to be added to new text blocks.
    */
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, className: String) = this()
  def this(element: HTMLElement, className: String, addTitle: Boolean) = this()
}

