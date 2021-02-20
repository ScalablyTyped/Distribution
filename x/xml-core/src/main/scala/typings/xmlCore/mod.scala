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
import typings.xmlCore.typesMod.XmlNamespace
import typings.xmlCore.utilsMod.SelectNodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xml-core", "APPLICATION_XML")
  @js.native
  val APPLICATION_XML: /* "application/xml" */ String = js.native
  
  @JSImport("xml-core", "Collection")
  @js.native
  class Collection[I] ()
    extends typings.xmlCore.collectionMod.Collection[I] {
    def this(items: js.Array[I]) = this()
  }
  
  @JSImport("xml-core", "Convert")
  @js.native
  class Convert ()
    extends typings.xmlCore.convertMod.Convert
  /* static members */
  object Convert {
    
    @JSImport("xml-core", "Convert.Base64Padding")
    @js.native
    def Base64Padding(base64: String): String = js.native
    
    @JSImport("xml-core", "Convert.FromBase64")
    @js.native
    def FromBase64(base64Text: String): Uint8Array = js.native
    
    @JSImport("xml-core", "Convert.FromBase64Url")
    @js.native
    def FromBase64Url(base64url: String): Uint8Array = js.native
    
    @JSImport("xml-core", "Convert.FromBinary")
    @js.native
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
    @JSImport("xml-core", "Convert.FromDateTime")
    @js.native
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
    @JSImport("xml-core", "Convert.FromHex")
    @js.native
    def FromHex(hexString: String): Uint8Array = js.native
    
    @JSImport("xml-core", "Convert.FromString")
    @js.native
    def FromString(str: String): Uint8Array = js.native
    @JSImport("xml-core", "Convert.FromString")
    @js.native
    def FromString(str: String, enc: XmlBufferEncoding): Uint8Array = js.native
    
    @JSImport("xml-core", "Convert.FromUtf8String")
    @js.native
    def FromUtf8String(text: String): Uint8Array = js.native
    
    @JSImport("xml-core", "Convert.ToBase64")
    @js.native
    def ToBase64(buf: Uint8Array): String = js.native
    
    @JSImport("xml-core", "Convert.ToBase64Url")
    @js.native
    def ToBase64Url(data: Uint8Array): String = js.native
    
    @JSImport("xml-core", "Convert.ToBinary")
    @js.native
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
    @JSImport("xml-core", "Convert.ToDateTime")
    @js.native
    def ToDateTime(dateTime: String): Date = js.native
    
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    @JSImport("xml-core", "Convert.ToHex")
    @js.native
    def ToHex(buffer: Uint8Array): String = js.native
    
    @JSImport("xml-core", "Convert.ToString")
    @js.native
    def ToString(buffer: BufferSource): String = js.native
    @JSImport("xml-core", "Convert.ToString")
    @js.native
    def ToString(buffer: BufferSource, enc: XmlBufferEncoding): String = js.native
    
    @JSImport("xml-core", "Convert.ToUtf8String")
    @js.native
    def ToUtf8String(buffer: Uint8Array): String = js.native
  }
  
  @JSImport("xml-core", "DEFAULT_NAMESPACE_URI")
  @js.native
  val DEFAULT_NAMESPACE_URI: /* "" */ String = js.native
  
  @JSImport("xml-core", "DEFAULT_PREFIX")
  @js.native
  val DEFAULT_PREFIX: /* "" */ String = js.native
  
  @JSImport("xml-core", "NamespaceManager")
  @js.native
  class NamespaceManager ()
    extends typings.xmlCore.namespaceManagerMod.NamespaceManager {
    def this(items: js.Array[XmlNamespace]) = this()
  }
  
  @JSImport("xml-core", "Parse")
  @js.native
  def Parse(xmlString: String): Document = js.native
  
  @JSImport("xml-core", "Select")
  @js.native
  val Select: SelectNodes = js.native
  
  @JSImport("xml-core", "SelectNamespaces")
  @js.native
  def SelectNamespaces(node: Element): AssocArray[String] = js.native
  
  @JSImport("xml-core", "SelectSingleNode")
  @js.native
  def SelectSingleNode(node: Node, path: String): Node | Null = js.native
  
  @JSImport("xml-core", "Stringify")
  @js.native
  def Stringify(target: Node): String = js.native
  
  @JSImport("xml-core", "XE")
  @js.native
  object XE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.xmlCore.errorMod.XE with Double] = js.native
    
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
  }
  
  @JSImport("xml-core", "XmlAttribute")
  @js.native
  def XmlAttribute[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  @JSImport("xml-core", "XmlAttribute")
  @js.native
  def XmlAttribute[T](params: XmlAttributeType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("xml-core", "XmlBase64Converter")
  @js.native
  val XmlBase64Converter: IConverter[Uint8Array] = js.native
  
  @JSImport("xml-core", "XmlBooleanConverter")
  @js.native
  val XmlBooleanConverter: IConverter[Boolean] = js.native
  
  @JSImport("xml-core", "XmlChildElement")
  @js.native
  def XmlChildElement[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  @JSImport("xml-core", "XmlChildElement")
  @js.native
  def XmlChildElement[T](params: XmlChildElementType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String | js.Symbol, Unit] = js.native
  
  @JSImport("xml-core", "XmlCollection")
  @js.native
  class XmlCollection[I /* <: typings.xmlCore.xmlObjectMod.XmlObject */] ()
    extends typings.xmlCore.xmlCollectionMod.XmlCollection[I] {
    def this(properties: js.Object) = this()
  }
  /* static members */
  object XmlCollection {
    
    @JSImport("xml-core", "XmlCollection")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xml-core", "XmlCollection.parser")
    @js.native
    def parser: js.Any = js.native
    @scala.inline
    def parser_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parser")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("xml-core", "XmlContent")
  @js.native
  def XmlContent[T](): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  @JSImport("xml-core", "XmlContent")
  @js.native
  def XmlContent[T](params: XmlContentType[T]): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("xml-core", "XmlElement")
  @js.native
  def XmlElement(params: XmlElementType): js.Function1[/* target */ js.Function, Unit] = js.native
  
  @JSImport("xml-core", "XmlError")
  @js.native
  class XmlError protected ()
    extends typings.xmlCore.errorMod.XmlError {
    def this(code: XE, args: js.Any*) = this()
  }
  
  @JSImport("xml-core", "XmlNodeType")
  @js.native
  object XmlNodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.xmlCore.xmlMod.XmlNodeType with Double] = js.native
    
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
  }
  
  @JSImport("xml-core", "XmlNumberConverter")
  @js.native
  val XmlNumberConverter: IConverter[Double] = js.native
  
  @JSImport("xml-core", "XmlObject")
  @js.native
  class XmlObject ()
    extends typings.xmlCore.xmlObjectMod.XmlObject {
    def this(properties: js.Object) = this()
  }
  /* static members */
  object XmlObject {
    
    @JSImport("xml-core", "XmlObject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates new instance of XmlDocument with given name of root element
      * @param  {string} root Name of root element
      * @param  {string} namespaceUri
      * @param  {string} prefix
      * @returns Document
      */
    @JSImport("xml-core", "XmlObject.CreateDocument")
    @js.native
    def CreateDocument(): Document = js.native
    @JSImport("xml-core", "XmlObject.CreateDocument")
    @js.native
    def CreateDocument(root: js.UndefOr[scala.Nothing], namespaceUri: js.UndefOr[scala.Nothing], prefix: String): Document = js.native
    @JSImport("xml-core", "XmlObject.CreateDocument")
    @js.native
    def CreateDocument(root: js.UndefOr[scala.Nothing], namespaceUri: String): Document = js.native
    @JSImport("xml-core", "XmlObject.CreateDocument")
    @js.native
    def CreateDocument(root: js.UndefOr[scala.Nothing], namespaceUri: String, prefix: String): Document = js.native
    @JSImport("xml-core", "XmlObject.CreateDocument")
    @js.native
    def CreateDocument(root: js.UndefOr[scala.Nothing], namespaceUri: Null, prefix: String): Document = js.native
    @JSImport("xml-core", "XmlObject.CreateDocument")
    @js.native
    def CreateDocument(root: String): Document = js.native
    @JSImport("xml-core", "XmlObject.CreateDocument")
    @js.native
    def CreateDocument(root: String, namespaceUri: js.UndefOr[scala.Nothing], prefix: String): Document = js.native
    @JSImport("xml-core", "XmlObject.CreateDocument")
    @js.native
    def CreateDocument(root: String, namespaceUri: String): Document = js.native
    @JSImport("xml-core", "XmlObject.CreateDocument")
    @js.native
    def CreateDocument(root: String, namespaceUri: String, prefix: String): Document = js.native
    @JSImport("xml-core", "XmlObject.CreateDocument")
    @js.native
    def CreateDocument(root: String, namespaceUri: Null, prefix: String): Document = js.native
    
    @JSImport("xml-core", "XmlObject.GetAttribute")
    @js.native
    def GetAttribute(element: Element, attrName: String): String | Null = js.native
    @JSImport("xml-core", "XmlObject.GetAttribute")
    @js.native
    def GetAttribute(element: Element, attrName: String, defaultValue: String): String | Null = js.native
    @JSImport("xml-core", "XmlObject.GetAttribute")
    @js.native
    def GetAttribute(element: Element, attrName: String, defaultValue: String, required: Boolean): String | Null = js.native
    @JSImport("xml-core", "XmlObject.GetAttribute")
    @js.native
    def GetAttribute(element: Element, attrName: String, defaultValue: Null, required: Boolean): String | Null = js.native
    
    @JSImport("xml-core", "XmlObject.GetChild")
    @js.native
    def GetChild(node: Element, localName: String): Element | Null = js.native
    @JSImport("xml-core", "XmlObject.GetChild")
    @js.native
    def GetChild(node: Element, localName: String, nameSpace: js.UndefOr[scala.Nothing], required: Boolean): Element | Null = js.native
    @JSImport("xml-core", "XmlObject.GetChild")
    @js.native
    def GetChild(node: Element, localName: String, nameSpace: String): Element | Null = js.native
    @JSImport("xml-core", "XmlObject.GetChild")
    @js.native
    def GetChild(node: Element, localName: String, nameSpace: String, required: Boolean): Element | Null = js.native
    
    @JSImport("xml-core", "XmlObject.GetChildren")
    @js.native
    def GetChildren(node: Node, localName: String): js.Array[Element] = js.native
    @JSImport("xml-core", "XmlObject.GetChildren")
    @js.native
    def GetChildren(node: Node, localName: String, nameSpace: String): js.Array[Element] = js.native
    
    @JSImport("xml-core", "XmlObject.GetElement")
    @js.native
    def GetElement(element: Element, name: String): Element = js.native
    @JSImport("xml-core", "XmlObject.GetElement")
    @js.native
    def GetElement(element: Element, name: String, required: Boolean): Element = js.native
    
    @JSImport("xml-core", "XmlObject.GetElementById")
    @js.native
    def GetElementById(element: Document, idValue: String): Element | Null = js.native
    @JSImport("xml-core", "XmlObject.GetElementById")
    @js.native
    def GetElementById(element: Element, idValue: String): Element | Null = js.native
    
    @JSImport("xml-core", "XmlObject.GetFirstChild")
    @js.native
    def GetFirstChild(node: Node, localName: String): Element | Null = js.native
    @JSImport("xml-core", "XmlObject.GetFirstChild")
    @js.native
    def GetFirstChild(node: Node, localName: String, nameSpace: String): Element | Null = js.native
    
    @JSImport("xml-core", "XmlObject.LoadXml")
    @js.native
    def LoadXml[T /* <: typings.xmlCore.xmlObjectMod.XmlObject */](param: String): T = js.native
    @JSImport("xml-core", "XmlObject.LoadXml")
    @js.native
    def LoadXml[T /* <: typings.xmlCore.xmlObjectMod.XmlObject */](param: Element): T = js.native
    
    @JSImport("xml-core", "XmlObject.attributes")
    @js.native
    def attributes: AssocArray[XmlAttributeType[js.Any]] = js.native
    @scala.inline
    def attributes_=(x: AssocArray[XmlAttributeType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributes")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-core", "XmlObject.elements")
    @js.native
    def elements: AssocArray[XmlChildElementType[js.Any]] = js.native
    @scala.inline
    def elements_=(x: AssocArray[XmlChildElementType[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elements")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-core", "XmlObject.localName")
    @js.native
    def localName: String = js.native
    @scala.inline
    def localName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localName")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-core", "XmlObject.namespaceURI")
    @js.native
    def namespaceURI: String | Null = js.native
    @scala.inline
    def namespaceURI_=(x: String | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-core", "XmlObject.prefix")
    @js.native
    def prefix: String | Null = js.native
    @scala.inline
    def prefix_=(x: String | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("xml-core", "assign")
  @js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  
  @JSImport("xml-core", "isDocument")
  @js.native
  def isDocument(obj: js.Any): /* is std.Document */ Boolean = js.native
  
  @JSImport("xml-core", "isElement")
  @js.native
  def isElement(obj: js.Any): /* is std.Element */ Boolean = js.native
}
