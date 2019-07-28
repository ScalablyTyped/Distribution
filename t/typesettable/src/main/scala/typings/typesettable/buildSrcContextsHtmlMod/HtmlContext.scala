package typings.typesettable.buildSrcContextsHtmlMod

import typings.std.Element
import typings.std.HTMLElement
import typings.typesettable.Anon_Line
import typings.typesettable.buildSrcContextsMod.ITypesetterContext
import typings.typesettable.buildSrcWritersWriterMod.ITransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts/html", "HtmlContext")
@js.native
class HtmlContext protected () extends ITypesetterContext[HTMLElement] {
  /**
    * @param element - The CSS font styles applied to `element` will determine the
    * size of text measurements. Also the default text block container.
    * @param className - added to new text blocks
    * @param addTitle - enable title attribute to be added to new text blocks.
    */
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, className: String) = this()
  def this(element: HTMLElement, className: String, addTitle: Boolean) = this()
  var addTitle: js.Any = js.native
  var className: js.Any = js.native
  var element: js.Any = js.native
  /* private */ def createHtmlLinePen(textBlock: js.Any): js.Any = js.native
  def createPen(text: String, transform: ITransform, element: Element): Anon_Line = js.native
  def setAddTitle(addTitle: Boolean): Unit = js.native
}

