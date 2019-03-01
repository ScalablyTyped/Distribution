package typings
package xmldocLib.xmldocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldoc", "XmlElement")
@js.native
class XmlElement protected () extends XmlNode {
  def this(tag: XmlTag) = this()
  var attr: XmlAttributes = js.native
  var children: js.Array[XmlNode] = js.native
  var column: scala.Double = js.native
  var firstChild: XmlNode | scala.Null = js.native
  var lastChild: XmlNode | scala.Null = js.native
  var line: scala.Double = js.native
  var name: java.lang.String = js.native
  var position: scala.Double = js.native
  var startTagPosition: scala.Double = js.native
  var `type`: xmldocLib.xmldocLibStrings.element = js.native
  var `val`: java.lang.String = js.native
  def childNamed(name: java.lang.String): js.UndefOr[XmlElement] = js.native
  def childWithAttribute(name: java.lang.String): js.UndefOr[XmlElement] = js.native
  def childWithAttribute(name: java.lang.String, value: java.lang.String): js.UndefOr[XmlElement] = js.native
  def childrenNamed(name: java.lang.String): js.Array[XmlElement] = js.native
  def descendantWithPath(path: java.lang.String): js.UndefOr[XmlElement] = js.native
  def eachChild(
    iterator: js.Function3[
      /* child */ this.type, 
      /* index */ scala.Double, 
      /* array */ js.Array[XmlNode], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def eachChild[T](
    iterator: js.ThisFunction3[
      /* this */ T, 
      /* child */ this.type, 
      /* index */ scala.Double, 
      /* array */ js.Array[XmlNode], 
      scala.Unit
    ],
    context: T
  ): scala.Unit = js.native
  def toString(opts: XmlOptions): java.lang.String = js.native
  def toStringWithIndent(indent: java.lang.String): java.lang.String = js.native
  def toStringWithIndent(indent: java.lang.String, opts: XmlOptions): java.lang.String = js.native
  def valueWithPath(path: java.lang.String): js.UndefOr[java.lang.String] = js.native
}

