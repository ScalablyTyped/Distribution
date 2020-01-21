package typings.xmldoc.mod

import typings.xmldoc.xmldocStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldoc", "XmlElement")
@js.native
class XmlElement protected () extends XmlNode {
  def this(tag: XmlTag) = this()
  var attr: XmlAttributes = js.native
  var children: js.Array[XmlNode] = js.native
  var column: Double = js.native
  var firstChild: XmlNode | Null = js.native
  var lastChild: XmlNode | Null = js.native
  var line: Double = js.native
  var name: String = js.native
  var position: Double = js.native
  var startTagPosition: Double = js.native
  var `type`: element = js.native
  var `val`: String = js.native
  def childNamed(name: String): js.UndefOr[XmlElement] = js.native
  def childWithAttribute(name: String): js.UndefOr[XmlElement] = js.native
  def childWithAttribute(name: String, value: String): js.UndefOr[XmlElement] = js.native
  def childrenNamed(name: String): js.Array[XmlElement] = js.native
  def descendantWithPath(path: String): js.UndefOr[XmlElement] = js.native
  def eachChild(
    iterator: js.Function3[/* child */ this.type, /* index */ Double, /* array */ js.Array[XmlNode], Unit]
  ): Unit = js.native
  def eachChild[T](
    iterator: js.ThisFunction3[
      /* this */ T, 
      /* child */ this.type, 
      /* index */ Double, 
      /* array */ js.Array[XmlNode], 
      Unit
    ],
    context: T
  ): Unit = js.native
  def toString(opts: XmlOptions): String = js.native
  def toStringWithIndent(indent: String): String = js.native
  def toStringWithIndent(indent: String, opts: XmlOptions): String = js.native
  def valueWithPath(path: String): js.UndefOr[String] = js.native
}

