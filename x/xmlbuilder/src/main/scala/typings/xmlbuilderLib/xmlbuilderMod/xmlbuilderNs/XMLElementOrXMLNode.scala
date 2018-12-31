package typings
package xmlbuilderLib.xmlbuilderMod.xmlbuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLElementOrXMLNode extends js.Object {
  def a(name: js.Any): XMLElementOrXMLNode = js.native
  def a(name: js.Any, value: js.Any): XMLElementOrXMLNode = js.native
  def att(name: js.Any): XMLElementOrXMLNode = js.native
  def att(name: js.Any, value: js.Any): XMLElementOrXMLNode = js.native
  def attribute(name: js.Any): XMLElementOrXMLNode = js.native
  def attribute(name: js.Any, value: js.Any): XMLElementOrXMLNode = js.native
  def c(value: java.lang.String): XMLElementOrXMLNode = js.native
  def cdata(value: java.lang.String): XMLElementOrXMLNode = js.native
  def com(value: java.lang.String): XMLElementOrXMLNode = js.native
  def comment(value: java.lang.String): XMLElementOrXMLNode = js.native
  def d(value: java.lang.String): XMLElementOrXMLNode = js.native
  def dat(value: java.lang.String): XMLElementOrXMLNode = js.native
  def dec(version: java.lang.String, encoding: java.lang.String, standalone: scala.Boolean): XMLElementOrXMLNode = js.native
  def declaration(version: java.lang.String, encoding: java.lang.String, standalone: scala.Boolean): XMLElementOrXMLNode = js.native
  def doc(): XMLElementOrXMLNode = js.native
  def doctype(pubID: java.lang.String, sysID: java.lang.String): XMLDocType = js.native
  def document(): js.Any = js.native
  def dtd(pubID: java.lang.String, sysID: java.lang.String): XMLDocType = js.native
  def e(name: js.Any): XMLElementOrXMLNode = js.native
  def e(name: js.Any, attributes: js.Object): XMLElementOrXMLNode = js.native
  def e(name: js.Any, attributes: js.Object, text: js.Any): XMLElementOrXMLNode = js.native
  def ele(name: js.Any): XMLElementOrXMLNode = js.native
  def ele(name: js.Any, attributes: js.Object): XMLElementOrXMLNode = js.native
  def ele(name: js.Any, attributes: js.Object, text: js.Any): XMLElementOrXMLNode = js.native
  // XMLNode:
  def element(name: js.Any): XMLElementOrXMLNode = js.native
  def element(name: js.Any, attributes: js.Object): XMLElementOrXMLNode = js.native
  def element(name: js.Any, attributes: js.Object, text: js.Any): XMLElementOrXMLNode = js.native
  def end(): java.lang.String = js.native
  def end(options: XMLEndOptions): java.lang.String = js.native
  def i(array: js.Array[_]): XMLElementOrXMLNode = js.native
  def i(obj: js.Object): XMLElementOrXMLNode = js.native
  def i(target: java.lang.String, value: js.Any): XMLElementOrXMLNode = js.native
  def importDocument(input: XMLElementOrXMLNode): XMLElementOrXMLNode = js.native
  def ins(array: js.Array[_]): XMLElementOrXMLNode = js.native
  def ins(obj: js.Object): XMLElementOrXMLNode = js.native
  def ins(target: java.lang.String, value: js.Any): XMLElementOrXMLNode = js.native
  def insertAfter(name: js.Any): XMLElementOrXMLNode = js.native
  def insertAfter(name: js.Any, attributes: js.Object): XMLElementOrXMLNode = js.native
  def insertAfter(name: js.Any, attributes: js.Object, text: js.Any): XMLElementOrXMLNode = js.native
  def insertBefore(name: js.Any): XMLElementOrXMLNode = js.native
  def insertBefore(name: js.Any, attributes: js.Object): XMLElementOrXMLNode = js.native
  def insertBefore(name: js.Any, attributes: js.Object, text: js.Any): XMLElementOrXMLNode = js.native
  def instruction(array: js.Array[_]): XMLElementOrXMLNode = js.native
  def instruction(obj: js.Object): XMLElementOrXMLNode = js.native
  def instruction(target: java.lang.String, value: js.Any): XMLElementOrXMLNode = js.native
  def n(name: js.Any): XMLElementOrXMLNode = js.native
  def n(name: js.Any, attributes: js.Object): XMLElementOrXMLNode = js.native
  def n(name: js.Any, attributes: js.Object, text: js.Any): XMLElementOrXMLNode = js.native
  def next(): XMLElementOrXMLNode = js.native
  def nod(name: js.Any): XMLElementOrXMLNode = js.native
  def nod(name: js.Any, attributes: js.Object): XMLElementOrXMLNode = js.native
  def nod(name: js.Any, attributes: js.Object, text: js.Any): XMLElementOrXMLNode = js.native
  def node(name: js.Any): XMLElementOrXMLNode = js.native
  def node(name: js.Any, attributes: js.Object): XMLElementOrXMLNode = js.native
  def node(name: js.Any, attributes: js.Object, text: js.Any): XMLElementOrXMLNode = js.native
  def prev(): XMLElementOrXMLNode = js.native
  def r(value: java.lang.String): XMLElementOrXMLNode = js.native
  def raw(value: java.lang.String): XMLElementOrXMLNode = js.native
  def remove(): XMLElementOrXMLNode = js.native
  def removeAttribute(name: java.lang.String): XMLElementOrXMLNode = js.native
  def root(): XMLElementOrXMLNode = js.native
  def t(value: java.lang.String): XMLElementOrXMLNode = js.native
  def text(value: java.lang.String): XMLElementOrXMLNode = js.native
  def toString(options: XMLToStringOptions): java.lang.String = js.native
  def toString(options: XMLToStringOptions, level: stdLib.Number): java.lang.String = js.native
  def txt(value: java.lang.String): XMLElementOrXMLNode = js.native
  def u(): XMLElementOrXMLNode = js.native
  def up(): XMLElementOrXMLNode = js.native
}

