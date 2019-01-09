package typings
package typesettableLib.buildSrcContextsSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts/svg", "SvgContext")
@js.native
class SvgContext protected ()
  extends typesettableLib.buildSrcContextsMod.ITypesetterContext[stdLib.SVGElement] {
  def this(element: stdLib.SVGElement) = this()
  def this(element: stdLib.SVGElement, className: java.lang.String) = this()
  def this(element: stdLib.SVGElement, className: java.lang.String, addTitleElement: scala.Boolean) = this()
  var addTitleElement: js.Any = js.native
  var className: js.Any = js.native
  var element: js.Any = js.native
  def createPen(
    text: java.lang.String,
    transform: typesettableLib.buildSrcWritersWriterMod.ITransform,
    element: stdLib.Element
  ): typesettableLib.Anon_Line = js.native
  /* private */ def createSvgLinePen(textBlockGroup: js.Any): js.Any = js.native
  /* private */ def getTextElements(element: js.Any): js.Any = js.native
  def setAddTitleElement(addTitleElement: scala.Boolean): scala.Unit = js.native
}

@JSImport("typesettable/build/src/contexts/svg", "SvgContext")
@js.native
object SvgContext extends js.Object {
  var AnchorMap: js.Any = js.native
}

