package typings.xmlCore

import typings.std.BufferSource
import typings.std.Date
import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.std.Uint8Array
import typings.xmlCore.errorMod.XE
import typings.xmlCore.typesMod.AssocArray
import typings.xmlCore.typesMod.IConverter
import typings.xmlCore.typesMod.XmlAttributeType
import typings.xmlCore.typesMod.XmlBufferEncoding
import typings.xmlCore.typesMod.XmlChildElementType
import typings.xmlCore.typesMod.XmlContentType
import typings.xmlCore.typesMod.XmlElementType
import typings.xmlCore.utilsMod.SelectNodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Collection[I] ()
    extends typings.xmlCore.collectionMod.Collection[I] {
    def this(items: js.Array[I]) = this()
  }
  
  @js.native
  class Convert ()
    extends typings.xmlCore.convertMod.Convert
  
  @js.native
  class NamespaceManager ()
    extends typings.xmlCore.namespaceManagerMod.NamespaceManager
  
  @js.native
  class XmlCollection[I /* <: typings.xmlCore.xmlObjectMod.XmlObject */] ()
    extends typings.xmlCore.xmlCollectionMod.XmlCollection[I]
  
  @js.native
  class XmlError protected ()
    extends typings.xmlCore.errorMod.XmlError {
    def this(code: XE, args: js.Any*) = this()
  }
  
  @js.native
  class XmlObject ()
    extends typings.xmlCore.xmlObjectMod.XmlObject
  
  val APPLICATION_XML: /* "application/xml" */ String = js.native
  val DEFAULT_NAMESPACE_URI: /* "" */ String = js.native
  val DEFAULT_PREFIX: /* "" */ String = js.native
  val Select: SelectNodes = js.native
  val XmlBase64Converter: IConverter[Uint8Array] = js.native
  val XmlBooleanConverter: IConverter[Boolean] = js.native
  val XmlNumberConverter: IConverter[Double] = js.native
  def Parse(xmlString: String): Document = js.native
  def SelectNamespaces(node: Element): AssocArray[String] = js.native
  def SelectSingleNode(node: Node, path: String): Node | Null = js.native
  def Stringify(target: Node): String = js.native
  def XmlAttribute[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def XmlAttribute[T](params: XmlAttributeType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def XmlChildElement[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  def XmlChildElement[T](params: XmlChildElementType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  def XmlContent[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def XmlContent[T](params: XmlContentType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def XmlElement(params: XmlElementType): js.Function1[/* target */ js.Function, Unit] = js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  def isDocument(obj: js.Any): /* is std.Document */ Boolean = js.native
  def isElement(obj: js.Any): /* is std.Element */ Boolean = js.native
  /* static members */
  @js.native
  object Convert extends js.Object {
    /* protected */ def Base64Padding(base64: String): String = js.native
    def FromBase64(base64Text: String): Uint8Array = js.native
    def FromBase64Url(base64url: String): Uint8Array = js.native
    def FromBinary(text: String): Uint8Array = js.native
    /**
      * Converts Date to string
      *
      * @static
      * @param {Date} dateTime
      * @returns {string}
      *
      * @memberOf Convert
      */
    def FromDateTime(dateTime: Date): String = js.native
    /**
      * Converts HEX string to buffer
      *
      * @static
      * @param {string} hexString
      * @returns {Uint8Array}
      *
      * @memberOf Convert
      */
    def FromHex(hexString: String): Uint8Array = js.native
    def FromString(str: String): Uint8Array = js.native
    def FromString(str: String, enc: XmlBufferEncoding): Uint8Array = js.native
    def FromUtf8String(text: String): Uint8Array = js.native
    def ToBase64(buf: Uint8Array): String = js.native
    def ToBase64Url(data: Uint8Array): String = js.native
    def ToBinary(buffer: Uint8Array): String = js.native
    /**
      * Converts string to Date
      *
      * @static
      * @param {string} dateTime
      * @returns {Date}
      *
      * @memberOf Convert
      */
    def ToDateTime(dateTime: String): Date = js.native
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    def ToHex(buffer: Uint8Array): String = js.native
    def ToString(buffer: BufferSource): String = js.native
    def ToString(buffer: BufferSource, enc: XmlBufferEncoding): String = js.native
    def ToUtf8String(buffer: Uint8Array): String = js.native
  }
  
  @js.native
  object XE extends js.Object {
    /* 16 */ val ALGORITHM_NOT_SUPPORTED: typings.xmlCore.errorMod.XE.ALGORITHM_NOT_SUPPORTED with Double = js.native
    /* 17 */ val ALGORITHM_WRONG_NAME: typings.xmlCore.errorMod.XE.ALGORITHM_WRONG_NAME with Double = js.native
    /* 11 */ val ATTRIBUTE_MISSING: typings.xmlCore.errorMod.XE.ATTRIBUTE_MISSING with Double = js.native
    /* 4 */ val COLLECTION_LIMIT: typings.xmlCore.errorMod.XE.COLLECTION_LIMIT with Double = js.native
    /* 12 */ val CONTENT_MISSING: typings.xmlCore.errorMod.XE.CONTENT_MISSING with Double = js.native
    /* 8 */ val CONVERTER_UNSUPPORTED: typings.xmlCore.errorMod.XE.CONVERTER_UNSUPPORTED with Double = js.native
    /* 13 */ val CRYPTOGRAPHIC: typings.xmlCore.errorMod.XE.CRYPTOGRAPHIC with Double = js.native
    /* 14 */ val CRYPTOGRAPHIC_NO_MODULE: typings.xmlCore.errorMod.XE.CRYPTOGRAPHIC_NO_MODULE with Double = js.native
    /* 15 */ val CRYPTOGRAPHIC_UNKNOWN_TRANSFORM: typings.xmlCore.errorMod.XE.CRYPTOGRAPHIC_UNKNOWN_TRANSFORM with Double = js.native
    /* 3 */ val DECORATOR_NULL_PARAM: typings.xmlCore.errorMod.XE.DECORATOR_NULL_PARAM with Double = js.native
    /* 9 */ val ELEMENT_MALFORMED: typings.xmlCore.errorMod.XE.ELEMENT_MALFORMED with Double = js.native
    /* 10 */ val ELEMENT_MISSING: typings.xmlCore.errorMod.XE.ELEMENT_MISSING with Double = js.native
    /* 5 */ val METHOD_NOT_IMPLEMENTED: typings.xmlCore.errorMod.XE.METHOD_NOT_IMPLEMENTED with Double = js.native
    /* 6 */ val METHOD_NOT_SUPPORTED: typings.xmlCore.errorMod.XE.METHOD_NOT_SUPPORTED with Double = js.native
    /* 0 */ val NONE: typings.xmlCore.errorMod.XE.NONE with Double = js.native
    /* 2 */ val NULL_PARAM: typings.xmlCore.errorMod.XE.NULL_PARAM with Double = js.native
    /* 1 */ val NULL_REFERENCE: typings.xmlCore.errorMod.XE.NULL_REFERENCE with Double = js.native
    /* 7 */ val PARAM_REQUIRED: typings.xmlCore.errorMod.XE.PARAM_REQUIRED with Double = js.native
    /* 18 */ val XML_EXCEPTION: typings.xmlCore.errorMod.XE.XML_EXCEPTION with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.xmlCore.errorMod.XE with Double] = js.native
  }
  
  /* static members */
  @js.native
  object XmlCollection extends js.Object {
    var parser: js.Any = js.native
  }
  
  @js.native
  object XmlNodeType extends js.Object {
    /* 2 */ val Attribute: typings.xmlCore.xmlMod.XmlNodeType.Attribute with Double = js.native
    /* 4 */ val CDATA: typings.xmlCore.xmlMod.XmlNodeType.CDATA with Double = js.native
    /* 8 */ val Comment: typings.xmlCore.xmlMod.XmlNodeType.Comment with Double = js.native
    /* 9 */ val Document: typings.xmlCore.xmlMod.XmlNodeType.Document with Double = js.native
    /* 11 */ val DocumentFragment: typings.xmlCore.xmlMod.XmlNodeType.DocumentFragment with Double = js.native
    /* 10 */ val DocumentType: typings.xmlCore.xmlMod.XmlNodeType.DocumentType with Double = js.native
    /* 1 */ val Element: typings.xmlCore.xmlMod.XmlNodeType.Element with Double = js.native
    /* 15 */ val EndElement: typings.xmlCore.xmlMod.XmlNodeType.EndElement with Double = js.native
    /* 16 */ val EndEntity: typings.xmlCore.xmlMod.XmlNodeType.EndEntity with Double = js.native
    /* 6 */ val Entity: typings.xmlCore.xmlMod.XmlNodeType.Entity with Double = js.native
    /* 5 */ val EntityReference: typings.xmlCore.xmlMod.XmlNodeType.EntityReference with Double = js.native
    /* 0 */ val None: typings.xmlCore.xmlMod.XmlNodeType.None with Double = js.native
    /* 12 */ val Notation: typings.xmlCore.xmlMod.XmlNodeType.Notation with Double = js.native
    /* 7 */ val ProcessingInstruction: typings.xmlCore.xmlMod.XmlNodeType.ProcessingInstruction with Double = js.native
    /* 14 */ val SignificantWhitespace: typings.xmlCore.xmlMod.XmlNodeType.SignificantWhitespace with Double = js.native
    /* 3 */ val Text: typings.xmlCore.xmlMod.XmlNodeType.Text with Double = js.native
    /* 13 */ val Whitespace: typings.xmlCore.xmlMod.XmlNodeType.Whitespace with Double = js.native
    /* 17 */ val XmlDeclaration: typings.xmlCore.xmlMod.XmlNodeType.XmlDeclaration with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.xmlCore.xmlMod.XmlNodeType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object XmlObject extends js.Object {
    var attributes: AssocArray[XmlAttributeType[_]] = js.native
    var elements: AssocArray[XmlChildElementType[_]] = js.native
    var localName: String = js.native
    var namespaceURI: String | Null = js.native
    var prefix: String | Null = js.native
    /**
      * Creates new instance of XmlDocument with given name of root element
      * @param  {string} root Name of root element
      * @param  {string} namespaceUri
      * @param  {string} prefix
      * @returns Document
      */
    def CreateDocument(): Document = js.native
    def CreateDocument(root: String): Document = js.native
    def CreateDocument(root: String, namespaceUri: String): Document = js.native
    def CreateDocument(root: String, namespaceUri: String, prefix: String): Document = js.native
    def CreateDocument(root: String, namespaceUri: Null, prefix: String): Document = js.native
    def GetAttribute(element: Element, attrName: String): String | Null = js.native
    def GetAttribute(element: Element, attrName: String, defaultValue: String): String | Null = js.native
    def GetAttribute(element: Element, attrName: String, defaultValue: String, required: Boolean): String | Null = js.native
    def GetAttribute(element: Element, attrName: String, defaultValue: Null, required: Boolean): String | Null = js.native
    def GetChild(node: Element, localName: String): Element | Null = js.native
    def GetChild(node: Element, localName: String, nameSpace: String): Element | Null = js.native
    def GetChild(node: Element, localName: String, nameSpace: String, required: Boolean): Element | Null = js.native
    def GetChildren(node: Node, localName: String): js.Array[Element] = js.native
    def GetChildren(node: Node, localName: String, nameSpace: String): js.Array[Element] = js.native
    def GetElement(element: Element, name: String): Element = js.native
    def GetElement(element: Element, name: String, required: Boolean): Element = js.native
    def GetElementById(element: Document, idValue: String): Element | Null = js.native
    def GetElementById(element: Element, idValue: String): Element | Null = js.native
    def GetFirstChild(node: Node, localName: String): Element | Null = js.native
    def GetFirstChild(node: Node, localName: String, nameSpace: String): Element | Null = js.native
    def LoadXml[T /* <: typings.xmlCore.xmlObjectMod.XmlObject */](param: String): T = js.native
    def LoadXml[T /* <: typings.xmlCore.xmlObjectMod.XmlObject */](param: Element): T = js.native
  }
  
}

