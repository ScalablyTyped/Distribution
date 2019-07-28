package typings.tinymce.tinymceMod

import org.scalablytyped.runtime.StringDictionary
import typings.tinymce.tinymceMod.htmlNs.Node
import typings.tinymce.tinymceMod.htmlNs.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "html")
@js.native
object htmlNs extends js.Object {
  @js.native
  class DomParser protected () extends js.Object {
    def this(settings: js.Object, schema: Schema) = this()
    def addAttributeFilter(attributes: String, callback: js.Function0[Unit]): Unit = js.native
    def addNodeFilter(attributes: String, callback: js.Function0[Unit]): Unit = js.native
    def filterNode(node: Node): Node = js.native
    def parse(html: String): Node = js.native
    def parse(html: String, args: js.Object): Node = js.native
  }
  
  @js.native
  trait Entities extends js.Object {
    def decode(text: String): String = js.native
    def encodeAllRaw(text: String): String = js.native
    def encodeNamed(text: String): String = js.native
    def encodeNamed(text: String, attr: Boolean): String = js.native
    def encodeNamed(text: String, attr: Boolean, entities: js.Object): String = js.native
    def encodeNumeric(text: String): String = js.native
    def encodeNumeric(text: String, attr: Boolean): String = js.native
    def encodeRaw(text: String): String = js.native
    def encodeRaw(text: String, attr: Boolean): String = js.native
    def getEncodeFunc(name: String): js.Function0[Unit] = js.native
    def getEncodeFunc(name: String, entities: String): js.Function0[Unit] = js.native
  }
  
  @js.native
  class Node protected () extends js.Object {
    def this(name: String, `type`: Double) = this()
    def append(node: Node): Node = js.native
    def attr(name: String): String | Node = js.native
    def attr(name: String, value: String): String | Node = js.native
    def create(name: String, attrs: js.Object): Unit = js.native
    def empty(): Node = js.native
    def getAll(name: String): js.Array[Node] = js.native
    def insert(node: Node, ref_node: Node): Node = js.native
    def insert(node: Node, ref_node: Node, before: Boolean): Node = js.native
    def isEmpty(elements: js.Object): Boolean = js.native
    def remove(): Node = js.native
    def replace(node: Node): Node = js.native
    def unwrap(): Unit = js.native
    def walk(): Node = js.native
    def walk(prev: Boolean): Node = js.native
    def wrap(wrapperNode: Node): Node = js.native
  }
  
  @js.native
  class SaxParser protected () extends js.Object {
    def this(settings: js.Object, schema: Schema) = this()
    def parse(html: String): Unit = js.native
  }
  
  @js.native
  class Schema protected () extends js.Object {
    def this(settings: js.Object) = this()
    def addCustomElements(custom_elements: String): Unit = js.native
    def addValidChildren(valid_children: String): Unit = js.native
    def addValidElements(valid_elements: String): Unit = js.native
    def getBlockElements(): StringDictionary[js.Object] = js.native
    def getBoolAttrs(): StringDictionary[js.Object] = js.native
    def getCustomElements(): StringDictionary[js.Object] = js.native
    def getElementRule(name: String): js.Object = js.native
    def getInvalidStyles(): Unit = js.native
    def getMoveCaretBeforeOnEnterElements(): StringDictionary[js.Object] = js.native
    def getNonEmptyElements(): StringDictionary[js.Object] = js.native
    def getSelfClosingElements(): StringDictionary[js.Object] = js.native
    def getShortEndedElements(): StringDictionary[js.Object] = js.native
    def getSpecialElements(): StringDictionary[js.Object] = js.native
    def getTextBlockElements(): StringDictionary[js.Object] = js.native
    def getTextInlineElements(): StringDictionary[js.Object] = js.native
    def getValidClasses(): Unit = js.native
    def getValidStyles(): Unit = js.native
    def getWhiteSpaceElements(): StringDictionary[js.Object] = js.native
    def isValid(name: String): Boolean = js.native
    def isValid(name: String, attr: String): Boolean = js.native
    def isValidChild(name: String, child: String): Boolean = js.native
    def setValidElements(valid_elements: String): Unit = js.native
  }
  
  @js.native
  class Serializer protected () extends js.Object {
    def this(settings: js.Object, schema: Schema) = this()
    def serialize(node: Node): String = js.native
  }
  
  trait Styles extends js.Object {
    def parse(css: String): js.Object
    def serialize(styles: js.Object, elementName: String): String
    def toHex(color: String): String
  }
  
  @js.native
  trait Writer extends js.Object {
    def cdata(text: String): Unit = js.native
    def doctype(text: String): Unit = js.native
    def end(name: String): Unit = js.native
    def getContent(): String = js.native
    def pi(name: String, text: String): Unit = js.native
    def reset(): Unit = js.native
    def start(name: String): Unit = js.native
    def start(name: String, attrs: js.Array[_]): Unit = js.native
    def start(name: String, attrs: js.Array[_], empty: Boolean): Unit = js.native
    def text(text: String, raw: Boolean): Unit = js.native
  }
  
}

