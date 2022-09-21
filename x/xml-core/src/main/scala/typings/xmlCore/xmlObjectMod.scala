package typings.xmlCore

import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.xmlCore.typesMod.AssocArray
import typings.xmlCore.typesMod.IXmlSerializable
import typings.xmlCore.typesMod.XmlAttributeType
import typings.xmlCore.typesMod.XmlChildElementType
import typings.xmlCore.typesMod.XmlSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlObjectMod {
  
  @JSImport("xml-core/dist/types/xml_object", "XmlObject")
  @js.native
  open class XmlObject ()
    extends StObject
       with IXmlSerializable {
    def this(properties: js.Object) = this()
    
    /* protected */ def CreateDocument(): Document = js.native
    
    /* protected */ def CreateElement(): Element = js.native
    /* protected */ def CreateElement(document: Unit, localName: String): Element = js.native
    /* protected */ def CreateElement(document: Unit, localName: String, namespaceUri: String): Element = js.native
    /* protected */ def CreateElement(document: Unit, localName: String, namespaceUri: String, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Unit, localName: String, namespaceUri: Null, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Unit, localName: String, namespaceUri: Unit, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Unit, localName: Unit, namespaceUri: String): Element = js.native
    /* protected */ def CreateElement(document: Unit, localName: Unit, namespaceUri: String, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Unit, localName: Unit, namespaceUri: Null, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Unit, localName: Unit, namespaceUri: Unit, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Document): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: String, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: Null, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: Unit, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: Unit, namespaceUri: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: Unit, namespaceUri: String, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: Unit, namespaceUri: Null, prefix: String): Element = js.native
    /* protected */ def CreateElement(document: Document, localName: Unit, namespaceUri: Unit, prefix: String): Element = js.native
    
    def Element: js.UndefOr[typings.std.Element | Null] = js.native
    
    def GetAttribute(name: String): String | Null = js.native
    def GetAttribute(name: String, defaultValue: String): String | Null = js.native
    def GetAttribute(name: String, defaultValue: String, required: Boolean): String | Null = js.native
    def GetAttribute(name: String, defaultValue: Null, required: Boolean): String | Null = js.native
    
    def GetChild(localName: String): Element | Null = js.native
    def GetChild(localName: String, required: Boolean): Element | Null = js.native
    
    def GetChildren(localName: String): js.Array[Element] = js.native
    def GetChildren(localName: String, nameSpace: String): js.Array[Element] = js.native
    
    def GetElement(name: String): Element = js.native
    def GetElement(name: String, required: Boolean): Element = js.native
    
    def GetFirstChild(localName: String): Element | Null = js.native
    def GetFirstChild(localName: String, namespace: String): Element | Null = js.native
    
    /* protected */ def GetPrefix(): String = js.native
    
    /* protected */ def GetStatic(): XmlSchema = js.native
    
    def GetXml(hard: Boolean): Element | Null = js.native
    
    def HasChanged(): Boolean = js.native
    
    def IsEmpty(): Boolean = js.native
    
    def LoadXml(param: Element): Unit = js.native
    
    def LocalName: String = js.native
    
    def NamespaceURI: String | Null = js.native
    
    /* protected */ def OnGetXml(element: Element): Unit = js.native
    
    /* protected */ def OnLoadXml(element: Element): Unit = js.native
    
    def Prefix: String | Null = js.native
    def Prefix_=(value: String | Null): Unit = js.native
    
    /**
      * XmlElement
      * undefined - class initialized
      * null - has some changes
      * element - has cached element
      *
      * @protected
      * @type {(Element | null | undefined)}
      * @memberOf XmlObject
      */
    /* protected */ var element: js.UndefOr[Element | Null] = js.native
    
    /* protected */ var localName: js.UndefOr[String] = js.native
    
    /* protected */ var namespaceURI: js.UndefOr[String | Null] = js.native
    
    /* protected */ var prefix: String | Null = js.native
  }
  /* static members */
  object XmlObject {
    
    @JSImport("xml-core/dist/types/xml_object", "XmlObject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates new instance of XmlDocument with given name of root element
      * @param  {string} root Name of root element
      * @param  {string} namespaceUri
      * @param  {string} prefix
      * @returns Document
      */
    inline def CreateDocument(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")().asInstanceOf[Document]
    inline def CreateDocument(root: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any]).asInstanceOf[Document]
    inline def CreateDocument(root: String, namespaceUri: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: String, namespaceUri: String, prefix: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: String, namespaceUri: Null, prefix: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: String, namespaceUri: Unit, prefix: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: Unit, namespaceUri: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: Unit, namespaceUri: String, prefix: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: Unit, namespaceUri: Null, prefix: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Document]
    inline def CreateDocument(root: Unit, namespaceUri: Unit, prefix: String): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDocument")(root.asInstanceOf[js.Any], namespaceUri.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Document]
    
    inline def GetAttribute(element: Element, attrName: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAttribute")(element.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    inline def GetAttribute(element: Element, attrName: String, defaultValue: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAttribute")(element.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    inline def GetAttribute(element: Element, attrName: String, defaultValue: String, required: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAttribute")(element.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    inline def GetAttribute(element: Element, attrName: String, defaultValue: Null, required: Boolean): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetAttribute")(element.asInstanceOf[js.Any], attrName.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[String | Null]
    
    inline def GetChild(node: Element, localName: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChild")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def GetChild(node: Element, localName: String, nameSpace: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChild")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any], nameSpace.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def GetChild(node: Element, localName: String, nameSpace: String, required: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChild")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any], nameSpace.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def GetChild(node: Element, localName: String, nameSpace: Unit, required: Boolean): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChild")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any], nameSpace.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    inline def GetChildren(node: Node, localName: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChildren")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    inline def GetChildren(node: Node, localName: String, nameSpace: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("GetChildren")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any], nameSpace.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    
    inline def GetElement(element: Element, name: String): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("GetElement")(element.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Element]
    inline def GetElement(element: Element, name: String, required: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("GetElement")(element.asInstanceOf[js.Any], name.asInstanceOf[js.Any], required.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    inline def GetElementById(element: Document, idValue: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetElementById")(element.asInstanceOf[js.Any], idValue.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def GetElementById(element: Element, idValue: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetElementById")(element.asInstanceOf[js.Any], idValue.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    inline def GetFirstChild(node: Node, localName: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirstChild")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    inline def GetFirstChild(node: Node, localName: String, nameSpace: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFirstChild")(node.asInstanceOf[js.Any], localName.asInstanceOf[js.Any], nameSpace.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    inline def LoadXml[T /* <: XmlObject */](param: String): T = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadXml")(param.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def LoadXml[T /* <: XmlObject */](param: Element): T = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadXml")(param.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @JSImport("xml-core/dist/types/xml_object", "XmlObject.attributes")
    @js.native
    def attributes: AssocArray[XmlAttributeType[Any]] = js.native
    inline def attributes_=(x: AssocArray[XmlAttributeType[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attributes")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-core/dist/types/xml_object", "XmlObject.elements")
    @js.native
    def elements: AssocArray[XmlChildElementType[Any]] = js.native
    inline def elements_=(x: AssocArray[XmlChildElementType[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elements")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-core/dist/types/xml_object", "XmlObject.localName")
    @js.native
    def localName: String = js.native
    inline def localName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localName")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-core/dist/types/xml_object", "XmlObject.namespaceURI")
    @js.native
    def namespaceURI: String | Null = js.native
    inline def namespaceURI_=(x: String | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(x.asInstanceOf[js.Any])
    
    @JSImport("xml-core/dist/types/xml_object", "XmlObject.prefix")
    @js.native
    def prefix: String | Null = js.native
    inline def prefix_=(x: String | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefix")(x.asInstanceOf[js.Any])
  }
}
