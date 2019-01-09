package typings
package typesettableLib.buildSrcContextsHtmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts/html", "HtmlContext")
@js.native
class HtmlContext protected ()
  extends typesettableLib.buildSrcContextsMod.ITypesetterContext[stdLib.HTMLElement] {
  /**
    * @param element - The CSS font styles applied to `element` will determine the
    * size of text measurements. Also the default text block container.
    * @param className - added to new text blocks
    * @param addTitle - enable title attribute to be added to new text blocks.
    */
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, className: java.lang.String) = this()
  def this(element: stdLib.HTMLElement, className: java.lang.String, addTitle: scala.Boolean) = this()
  var addTitle: js.Any = js.native
  var className: js.Any = js.native
  var element: js.Any = js.native
  /* private */ def createHtmlLinePen(textBlock: js.Any): js.Any = js.native
  def createPen(
    text: java.lang.String,
    transform: typesettableLib.buildSrcWritersWriterMod.ITransform,
    element: stdLib.Element
  ): typesettableLib.Anon_Line = js.native
  def setAddTitle(addTitle: scala.Boolean): scala.Unit = js.native
}

