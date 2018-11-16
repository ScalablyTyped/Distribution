package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "html")
@js.native
object htmlNs extends js.Object {
  @js.native
  class DomParser protected () extends js.Object {
    def this(settings: js.Object, schema: Schema) = this()
    def addAttributeFilter(attributes: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def addNodeFilter(attributes: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def filterNode(node: Node): Node = js.native
    def parse(html: java.lang.String): Node = js.native
    def parse(html: java.lang.String, args: js.Object): Node = js.native
  }
  
  @js.native
  trait Entities extends js.Object {
    def decode(text: java.lang.String): java.lang.String = js.native
    def encodeAllRaw(text: java.lang.String): java.lang.String = js.native
    def encodeNamed(text: java.lang.String): java.lang.String = js.native
    def encodeNamed(text: java.lang.String, attr: scala.Boolean): java.lang.String = js.native
    def encodeNamed(text: java.lang.String, attr: scala.Boolean, entities: js.Object): java.lang.String = js.native
    def encodeNumeric(text: java.lang.String): java.lang.String = js.native
    def encodeNumeric(text: java.lang.String, attr: scala.Boolean): java.lang.String = js.native
    def encodeRaw(text: java.lang.String): java.lang.String = js.native
    def encodeRaw(text: java.lang.String, attr: scala.Boolean): java.lang.String = js.native
    def getEncodeFunc(name: java.lang.String): js.Function0[scala.Unit] = js.native
    def getEncodeFunc(name: java.lang.String, entities: java.lang.String): js.Function0[scala.Unit] = js.native
  }
  
  @js.native
  class Node protected () extends js.Object {
    def this(name: java.lang.String, `type`: scala.Double) = this()
    def append(node: Node): Node = js.native
    def attr(name: java.lang.String): java.lang.String | Node = js.native
    def attr(name: java.lang.String, value: java.lang.String): java.lang.String | Node = js.native
    def create(name: java.lang.String, attrs: js.Object): scala.Unit = js.native
    def empty(): Node = js.native
    def getAll(name: java.lang.String): js.Array[Node] = js.native
    def insert(node: Node, ref_node: Node): Node = js.native
    def insert(node: Node, ref_node: Node, before: scala.Boolean): Node = js.native
    def isEmpty(elements: js.Object): scala.Boolean = js.native
    def remove(): Node = js.native
    def replace(node: Node): Node = js.native
    def unwrap(): scala.Unit = js.native
    def walk(): Node = js.native
    def walk(prev: scala.Boolean): Node = js.native
    def wrap(wrapperNode: Node): Node = js.native
  }
  
  @js.native
  class SaxParser protected () extends js.Object {
    def this(settings: js.Object, schema: Schema) = this()
    def parse(html: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class Schema protected () extends js.Object {
    def this(settings: js.Object) = this()
    def addCustomElements(custom_elements: java.lang.String): scala.Unit = js.native
    def addValidChildren(valid_children: java.lang.String): scala.Unit = js.native
    def addValidElements(valid_elements: java.lang.String): scala.Unit = js.native
    def getBlockElements(): js.Object = js.native
    def getBoolAttrs(): js.Object = js.native
    def getCustomElements(): js.Object = js.native
    def getElementRule(name: java.lang.String): js.Object = js.native
    def getInvalidStyles(): scala.Unit = js.native
    def getMoveCaretBeforeOnEnterElements(): js.Object = js.native
    def getNonEmptyElements(): js.Object = js.native
    def getSelfClosingElements(): js.Object = js.native
    def getShortEndedElements(): js.Object = js.native
    def getSpecialElements(): js.Object = js.native
    def getTextBlockElements(): js.Object = js.native
    def getTextInlineElements(): js.Object = js.native
    def getValidClasses(): scala.Unit = js.native
    def getValidStyles(): scala.Unit = js.native
    def getWhiteSpaceElements(): js.Object = js.native
    def isValid(name: java.lang.String): scala.Boolean = js.native
    def isValid(name: java.lang.String, attr: java.lang.String): scala.Boolean = js.native
    def isValidChild(name: java.lang.String, child: java.lang.String): scala.Boolean = js.native
    def setValidElements(valid_elements: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  class Serializer protected () extends js.Object {
    def this(settings: js.Object, schema: Schema) = this()
    def serialize(node: Node): java.lang.String = js.native
  }
  
  
  trait Styles extends js.Object {
    def parse(css: java.lang.String): js.Object
    def serialize(styles: js.Object, elementName: java.lang.String): java.lang.String
    def toHex(color: java.lang.String): java.lang.String
  }
  
  @js.native
  trait Writer extends js.Object {
    def cdata(text: java.lang.String): scala.Unit = js.native
    def doctype(text: java.lang.String): scala.Unit = js.native
    def end(name: java.lang.String): scala.Unit = js.native
    def getContent(): java.lang.String = js.native
    def pi(name: java.lang.String, text: java.lang.String): scala.Unit = js.native
    def reset(): scala.Unit = js.native
    def start(name: java.lang.String): scala.Unit = js.native
    def start(name: java.lang.String, attrs: js.Array[_]): scala.Unit = js.native
    def start(name: java.lang.String, attrs: js.Array[_], empty: scala.Boolean): scala.Unit = js.native
    def text(text: java.lang.String, raw: scala.Boolean): scala.Unit = js.native
  }
  
}

