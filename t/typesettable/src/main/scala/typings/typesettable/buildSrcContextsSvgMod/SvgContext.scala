package typings.typesettable.buildSrcContextsSvgMod

import typings.std.Element
import typings.std.SVGElement
import typings.typesettable.Anon_Line
import typings.typesettable.buildSrcContextsMod.ITypesetterContext
import typings.typesettable.buildSrcWritersWriterMod.ITransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts/svg", "SvgContext")
@js.native
class SvgContext protected () extends ITypesetterContext[SVGElement] {
  def this(element: SVGElement) = this()
  def this(element: SVGElement, className: String) = this()
  def this(element: SVGElement, className: String, addTitleElement: Boolean) = this()
  var addTitleElement: js.Any = js.native
  var className: js.Any = js.native
  var element: js.Any = js.native
  def createPen(text: String, transform: ITransform, element: Element): Anon_Line = js.native
  /* private */ def createSvgLinePen(textBlockGroup: js.Any): js.Any = js.native
  /* private */ def getTextElements(element: js.Any): js.Any = js.native
  def setAddTitleElement(addTitleElement: Boolean): Unit = js.native
}

/* static members */
@JSImport("typesettable/build/src/contexts/svg", "SvgContext")
@js.native
object SvgContext extends js.Object {
  var AnchorMap: js.Any = js.native
}

