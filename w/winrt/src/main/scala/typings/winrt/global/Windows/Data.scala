package typings.winrt.global.Windows

import typings.winrt.Windows.Data.Json.IJsonValue
import typings.winrt.Windows.Data.Json.JsonErrorStatus
import typings.winrt.Windows.Data.Json.JsonValueType
import typings.winrt.Windows.Data.Xml.Dom.IXmlNode
import typings.winrt.Windows.Data.Xml.Dom.IXmlText
import typings.winrt.Windows.Data.Xml.Dom.NodeType
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.anon.Result
import typings.winrt.anon.ResultSucceeded
import typings.winrt.anon.Succeeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Data {
  
  object Html {
    
    @JSGlobal("Windows.Data.Html.HtmlUtilities")
    @js.native
    class HtmlUtilities ()
      extends StObject
         with typings.winrt.Windows.Data.Html.HtmlUtilities
    /* static members */
    object HtmlUtilities {
      
      @JSGlobal("Windows.Data.Html.HtmlUtilities")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def convertToText(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToText")(html.asInstanceOf[js.Any]).asInstanceOf[String]
    }
  }
  
  object Json {
    
    @JSGlobal("Windows.Data.Json.JsonArray")
    @js.native
    class JsonArray ()
      extends StObject
         with typings.winrt.Windows.Data.Json.JsonArray {
      
      /* CompleteClass */
      override def first(): IIterator[IJsonValue] = js.native
      
      /* CompleteClass */
      override def getArray(): typings.winrt.Windows.Data.Json.JsonArray = js.native
      
      /* CompleteClass */
      override def getArrayAt(index: Double): typings.winrt.Windows.Data.Json.JsonArray = js.native
      
      /* CompleteClass */
      override def getBoolean(): Boolean = js.native
      
      /* CompleteClass */
      override def getBooleanAt(index: Double): Boolean = js.native
      
      /* CompleteClass */
      override def getNumber(): Double = js.native
      
      /* CompleteClass */
      override def getNumberAt(index: Double): Double = js.native
      
      /* CompleteClass */
      override def getObject(): typings.winrt.Windows.Data.Json.JsonObject = js.native
      
      /* CompleteClass */
      override def getObjectAt(index: Double): typings.winrt.Windows.Data.Json.JsonObject = js.native
      
      /* CompleteClass */
      override def getString(): String = js.native
      
      /* CompleteClass */
      override def getStringAt(index: Double): String = js.native
      
      /* CompleteClass */
      override def stringify(): String = js.native
      
      /* CompleteClass */
      var valueType: JsonValueType = js.native
    }
    /* static members */
    object JsonArray {
      
      @JSGlobal("Windows.Data.Json.JsonArray")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def parse(input: String): typings.winrt.Windows.Data.Json.JsonArray = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Data.Json.JsonArray]
      
      @scala.inline
      def tryParse(input: String): ResultSucceeded = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[ResultSucceeded]
    }
    
    @JSGlobal("Windows.Data.Json.JsonError")
    @js.native
    class JsonError ()
      extends StObject
         with typings.winrt.Windows.Data.Json.JsonError
    /* static members */
    object JsonError {
      
      @JSGlobal("Windows.Data.Json.JsonError")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def getStatus(hresult: Double): JsonErrorStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatus")(hresult.asInstanceOf[js.Any]).asInstanceOf[JsonErrorStatus]
    }
    
    @JSGlobal("Windows.Data.Json.JsonErrorStatus")
    @js.native
    object JsonErrorStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Data.Json.JsonErrorStatus & Double] = js.native
      
      /* 4 */ val implementationLimit: typings.winrt.Windows.Data.Json.JsonErrorStatus.implementationLimit & Double = js.native
      
      /* 2 */ val invalidJsonNumber: typings.winrt.Windows.Data.Json.JsonErrorStatus.invalidJsonNumber & Double = js.native
      
      /* 1 */ val invalidJsonString: typings.winrt.Windows.Data.Json.JsonErrorStatus.invalidJsonString & Double = js.native
      
      /* 3 */ val jsonValueNotFound: typings.winrt.Windows.Data.Json.JsonErrorStatus.jsonValueNotFound & Double = js.native
      
      /* 0 */ val unknown: typings.winrt.Windows.Data.Json.JsonErrorStatus.unknown & Double = js.native
    }
    
    @JSGlobal("Windows.Data.Json.JsonObject")
    @js.native
    class JsonObject ()
      extends StObject
         with typings.winrt.Windows.Data.Json.JsonObject {
      
      /* CompleteClass */
      override def clear(): Unit = js.native
      
      /* CompleteClass */
      override def first(): IIterator[IKeyValuePair[String, IJsonValue]] = js.native
      
      /* CompleteClass */
      override def getArray(): typings.winrt.Windows.Data.Json.JsonArray = js.native
      
      /* CompleteClass */
      override def getBoolean(): Boolean = js.native
      
      /* CompleteClass */
      override def getNamedArray(name: String): typings.winrt.Windows.Data.Json.JsonArray = js.native
      
      /* CompleteClass */
      override def getNamedBoolean(name: String): Boolean = js.native
      
      /* CompleteClass */
      override def getNamedNumber(name: String): Double = js.native
      
      /* CompleteClass */
      override def getNamedObject(name: String): typings.winrt.Windows.Data.Json.JsonObject = js.native
      
      /* CompleteClass */
      override def getNamedString(name: String): String = js.native
      
      /* CompleteClass */
      override def getNamedValue(name: String): typings.winrt.Windows.Data.Json.JsonValue = js.native
      
      /* CompleteClass */
      override def getNumber(): Double = js.native
      
      /* CompleteClass */
      override def getObject(): typings.winrt.Windows.Data.Json.JsonObject = js.native
      
      /* CompleteClass */
      override def getString(): String = js.native
      
      /* CompleteClass */
      override def getView(): IMapView[String, IJsonValue] = js.native
      
      /* CompleteClass */
      override def hasKey(key: String): Boolean = js.native
      
      /* CompleteClass */
      override def insert(key: String, value: IJsonValue): Boolean = js.native
      
      /* CompleteClass */
      override def lookup(key: String): IJsonValue = js.native
      
      /* CompleteClass */
      override def remove(key: String): Unit = js.native
      
      /* CompleteClass */
      override def setNamedValue(name: String, value: IJsonValue): Unit = js.native
      
      /* CompleteClass */
      var size: Double = js.native
      
      /* CompleteClass */
      override def stringify(): String = js.native
      
      /* CompleteClass */
      var valueType: JsonValueType = js.native
    }
    /* static members */
    object JsonObject {
      
      @JSGlobal("Windows.Data.Json.JsonObject")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def parse(input: String): typings.winrt.Windows.Data.Json.JsonObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Data.Json.JsonObject]
      
      @scala.inline
      def tryParse(input: String): Succeeded = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[Succeeded]
    }
    
    @JSGlobal("Windows.Data.Json.JsonValue")
    @js.native
    class JsonValue ()
      extends StObject
         with typings.winrt.Windows.Data.Json.JsonValue {
      
      /* CompleteClass */
      override def getArray(): typings.winrt.Windows.Data.Json.JsonArray = js.native
      
      /* CompleteClass */
      override def getBoolean(): Boolean = js.native
      
      /* CompleteClass */
      override def getNumber(): Double = js.native
      
      /* CompleteClass */
      override def getObject(): typings.winrt.Windows.Data.Json.JsonObject = js.native
      
      /* CompleteClass */
      override def getString(): String = js.native
      
      /* CompleteClass */
      override def stringify(): String = js.native
      
      /* CompleteClass */
      var valueType: JsonValueType = js.native
    }
    /* static members */
    object JsonValue {
      
      @JSGlobal("Windows.Data.Json.JsonValue")
      @js.native
      val ^ : js.Any = js.native
      
      @scala.inline
      def createBooleanValue(input: Boolean): typings.winrt.Windows.Data.Json.JsonValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createBooleanValue")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Data.Json.JsonValue]
      
      @scala.inline
      def createNumberValue(input: Double): typings.winrt.Windows.Data.Json.JsonValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumberValue")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Data.Json.JsonValue]
      
      @scala.inline
      def createStringValue(input: String): typings.winrt.Windows.Data.Json.JsonValue = ^.asInstanceOf[js.Dynamic].applyDynamic("createStringValue")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Data.Json.JsonValue]
      
      @scala.inline
      def parse(input: String): typings.winrt.Windows.Data.Json.JsonValue = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.Data.Json.JsonValue]
      
      @scala.inline
      def tryParse(input: String): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(input.asInstanceOf[js.Any]).asInstanceOf[Result]
    }
    
    @JSGlobal("Windows.Data.Json.JsonValueType")
    @js.native
    object JsonValueType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Data.Json.JsonValueType & Double] = js.native
      
      /* 4 */ val array: typings.winrt.Windows.Data.Json.JsonValueType.array & Double = js.native
      
      /* 1 */ val boolean: typings.winrt.Windows.Data.Json.JsonValueType.boolean & Double = js.native
      
      /* 0 */ val null_ : typings.winrt.Windows.Data.Json.JsonValueType.null_ & Double = js.native
      
      /* 2 */ val number: typings.winrt.Windows.Data.Json.JsonValueType.number & Double = js.native
      
      /* 5 */ val `object`: typings.winrt.Windows.Data.Json.JsonValueType.`object` & Double = js.native
      
      /* 3 */ val string: typings.winrt.Windows.Data.Json.JsonValueType.string & Double = js.native
    }
  }
  
  object Xml {
    
    object Dom {
      
      @JSGlobal("Windows.Data.Xml.Dom.DtdEntity")
      @js.native
      class DtdEntity ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.DtdEntity {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: js.Any = js.native
        
        /* CompleteClass */
        var namespaceUri: js.Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: js.Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var notationName: js.Any = js.native
        
        /* CompleteClass */
        var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: js.Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var publicId: js.Any = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
        
        /* CompleteClass */
        var systemId: js.Any = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.DtdNotation")
      @js.native
      class DtdNotation ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.DtdNotation {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: js.Any = js.native
        
        /* CompleteClass */
        var namespaceUri: js.Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: js.Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: js.Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var publicId: js.Any = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
        
        /* CompleteClass */
        var systemId: js.Any = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.NodeType")
      @js.native
      object NodeType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.winrt.Windows.Data.Xml.Dom.NodeType & Double] = js.native
        
        /* 2 */ val attributeNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.attributeNode & Double = js.native
        
        /* 8 */ val commentNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.commentNode & Double = js.native
        
        /* 4 */ val dataSectionNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.dataSectionNode & Double = js.native
        
        /* 11 */ val documentFragmentNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.documentFragmentNode & Double = js.native
        
        /* 9 */ val documentNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.documentNode & Double = js.native
        
        /* 10 */ val documentTypeNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.documentTypeNode & Double = js.native
        
        /* 1 */ val elementNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.elementNode & Double = js.native
        
        /* 6 */ val entityNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.entityNode & Double = js.native
        
        /* 5 */ val entityReferenceNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.entityReferenceNode & Double = js.native
        
        /* 0 */ val invalid: typings.winrt.Windows.Data.Xml.Dom.NodeType.invalid & Double = js.native
        
        /* 12 */ val notationNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.notationNode & Double = js.native
        
        /* 7 */ val processingInstructionNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.processingInstructionNode & Double = js.native
        
        /* 3 */ val textNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.textNode & Double = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlAttribute")
      @js.native
      class XmlAttribute ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlAttribute {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: js.Any = js.native
        
        /* CompleteClass */
        var name: String = js.native
        
        /* CompleteClass */
        var namespaceUri: js.Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: js.Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: js.Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
        
        /* CompleteClass */
        var specified: Boolean = js.native
        
        /* CompleteClass */
        var value: String = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlCDataSection")
      @js.native
      class XmlCDataSection ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlCDataSection {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def appendData(data: String): Unit = js.native
        
        /* CompleteClass */
        var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var data: String = js.native
        
        /* CompleteClass */
        override def deleteData(offset: Double, count: Double): Unit = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def insertData(offset: Double, data: String): Unit = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var length: Double = js.native
        
        /* CompleteClass */
        var localName: js.Any = js.native
        
        /* CompleteClass */
        var namespaceUri: js.Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: js.Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: js.Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
        
        /* CompleteClass */
        override def splitText(offset: Double): IXmlText = js.native
        
        /* CompleteClass */
        override def substringData(offset: Double, count: Double): String = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlComment")
      @js.native
      class XmlComment ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlComment {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def appendData(data: String): Unit = js.native
        
        /* CompleteClass */
        var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var data: String = js.native
        
        /* CompleteClass */
        override def deleteData(offset: Double, count: Double): Unit = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def insertData(offset: Double, data: String): Unit = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var length: Double = js.native
        
        /* CompleteClass */
        var localName: js.Any = js.native
        
        /* CompleteClass */
        var namespaceUri: js.Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: js.Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: js.Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
        
        /* CompleteClass */
        override def substringData(offset: Double, count: Double): String = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlDocument")
      @js.native
      class XmlDocument ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlDocument {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        override def createAttribute(name: String): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        override def createAttributeNS(namespaceUri: js.Any, qualifiedName: String): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        override def createCDataSection(data: String): typings.winrt.Windows.Data.Xml.Dom.XmlCDataSection = js.native
        
        /* CompleteClass */
        override def createComment(data: String): typings.winrt.Windows.Data.Xml.Dom.XmlComment = js.native
        
        /* CompleteClass */
        override def createDocumentFragment(): typings.winrt.Windows.Data.Xml.Dom.XmlDocumentFragment = js.native
        
        /* CompleteClass */
        override def createElement(tagName: String): typings.winrt.Windows.Data.Xml.Dom.XmlElement = js.native
        
        /* CompleteClass */
        override def createElementNS(namespaceUri: js.Any, qualifiedName: String): typings.winrt.Windows.Data.Xml.Dom.XmlElement = js.native
        
        /* CompleteClass */
        override def createEntityReference(name: String): typings.winrt.Windows.Data.Xml.Dom.XmlEntityReference = js.native
        
        /* CompleteClass */
        override def createProcessingInstruction(target: String, data: String): typings.winrt.Windows.Data.Xml.Dom.XmlProcessingInstruction = js.native
        
        /* CompleteClass */
        override def createTextNode(data: String): typings.winrt.Windows.Data.Xml.Dom.XmlText = js.native
        
        /* CompleteClass */
        var doctype: typings.winrt.Windows.Data.Xml.Dom.XmlDocumentType = js.native
        
        /* CompleteClass */
        var documentElement: typings.winrt.Windows.Data.Xml.Dom.XmlElement = js.native
        
        /* CompleteClass */
        var documentUri: String = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getElementById(elementId: String): typings.winrt.Windows.Data.Xml.Dom.XmlElement = js.native
        
        /* CompleteClass */
        override def getElementsByTagName(tagName: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var implementation: typings.winrt.Windows.Data.Xml.Dom.XmlDomImplementation = js.native
        
        /* CompleteClass */
        override def importNode(node: IXmlNode, deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: js.Any = js.native
        
        /* CompleteClass */
        var namespaceUri: js.Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: js.Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: js.Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
      }
      /* static members */
      object XmlDocument {
        
        @JSGlobal("Windows.Data.Xml.Dom.XmlDocument")
        @js.native
        val ^ : js.Any = js.native
        
        @scala.inline
        def loadFromFileAsync(file: IStorageFile): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFromFileAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument]]
        @scala.inline
        def loadFromFileAsync(file: IStorageFile, loadSettings: typings.winrt.Windows.Data.Xml.Dom.XmlLoadSettings): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFromFileAsync")(file.asInstanceOf[js.Any], loadSettings.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument]]
        
        @scala.inline
        def loadFromUriAsync(uri: Uri): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFromUriAsync")(uri.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument]]
        @scala.inline
        def loadFromUriAsync(uri: Uri, loadSettings: typings.winrt.Windows.Data.Xml.Dom.XmlLoadSettings): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFromUriAsync")(uri.asInstanceOf[js.Any], loadSettings.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument]]
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlDocumentFragment")
      @js.native
      class XmlDocumentFragment ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlDocumentFragment {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: js.Any = js.native
        
        /* CompleteClass */
        var namespaceUri: js.Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: js.Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: js.Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlDocumentType")
      @js.native
      class XmlDocumentType ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlDocumentType {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var entities: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: js.Any = js.native
        
        /* CompleteClass */
        var name: String = js.native
        
        /* CompleteClass */
        var namespaceUri: js.Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: js.Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var notations: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: js.Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlDomImplementation")
      @js.native
      class XmlDomImplementation ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlDomImplementation {
        
        /* CompleteClass */
        override def hasFeature(feature: String, version: js.Any): Boolean = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlElement")
      @js.native
      class XmlElement ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlElement {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getAttribute(attributeName: String): String = js.native
        
        /* CompleteClass */
        override def getAttributeNS(namespaceUri: js.Any, localName: String): String = js.native
        
        /* CompleteClass */
        override def getAttributeNode(attributeName: String): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        override def getAttributeNodeNS(namespaceUri: js.Any, localName: String): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        override def getElementsByTagName(tagName: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: js.Any = js.native
        
        /* CompleteClass */
        var namespaceUri: js.Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: js.Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: js.Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeAttribute(attributeName: String): Unit = js.native
        
        /* CompleteClass */
        override def removeAttributeNS(namespaceUri: js.Any, localName: String): Unit = js.native
        
        /* CompleteClass */
        override def removeAttributeNode(attributeNode: typings.winrt.Windows.Data.Xml.Dom.XmlAttribute): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
        
        /* CompleteClass */
        override def setAttribute(attributeName: String, attributeValue: String): Unit = js.native
        
        /* CompleteClass */
        override def setAttributeNS(namespaceUri: js.Any, qualifiedName: String, value: String): Unit = js.native
        
        /* CompleteClass */
        override def setAttributeNode(newAttribute: typings.winrt.Windows.Data.Xml.Dom.XmlAttribute): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        override def setAttributeNodeNS(newAttribute: typings.winrt.Windows.Data.Xml.Dom.XmlAttribute): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
        
        /* CompleteClass */
        var tagName: String = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlEntityReference")
      @js.native
      class XmlEntityReference ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlEntityReference {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: js.Any = js.native
        
        /* CompleteClass */
        var namespaceUri: js.Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: js.Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: js.Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlLoadSettings")
      @js.native
      class XmlLoadSettings ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlLoadSettings {
        
        /* CompleteClass */
        var elementContentWhiteSpace: Boolean = js.native
        
        /* CompleteClass */
        var maxElementDepth: Double = js.native
        
        /* CompleteClass */
        var prohibitDtd: Boolean = js.native
        
        /* CompleteClass */
        var resolveExternals: Boolean = js.native
        
        /* CompleteClass */
        var validateOnParse: Boolean = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlNamedNodeMap")
      @js.native
      class XmlNamedNodeMap ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap {
        
        /* CompleteClass */
        override def first(): IIterator[IXmlNode] = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlNodeList")
      @js.native
      class XmlNodeList ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlNodeList {
        
        /* CompleteClass */
        override def first(): IIterator[IXmlNode] = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlProcessingInstruction")
      @js.native
      class XmlProcessingInstruction ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlProcessingInstruction {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var data: String = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var localName: js.Any = js.native
        
        /* CompleteClass */
        var namespaceUri: js.Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: js.Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: js.Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
        
        /* CompleteClass */
        var target: String = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlText")
      @js.native
      class XmlText ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Dom.XmlText {
        
        /* CompleteClass */
        override def appendChild(newChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def appendData(data: String): Unit = js.native
        
        /* CompleteClass */
        var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
        
        /* CompleteClass */
        var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def cloneNode(deep: Boolean): IXmlNode = js.native
        
        /* CompleteClass */
        var data: String = js.native
        
        /* CompleteClass */
        override def deleteData(offset: Double, count: Double): Unit = js.native
        
        /* CompleteClass */
        var firstChild: IXmlNode = js.native
        
        /* CompleteClass */
        override def getXml(): String = js.native
        
        /* CompleteClass */
        override def hasChildNodes(): Boolean = js.native
        
        /* CompleteClass */
        var innerText: String = js.native
        
        /* CompleteClass */
        override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def insertData(offset: Double, data: String): Unit = js.native
        
        /* CompleteClass */
        var lastChild: IXmlNode = js.native
        
        /* CompleteClass */
        var length: Double = js.native
        
        /* CompleteClass */
        var localName: js.Any = js.native
        
        /* CompleteClass */
        var namespaceUri: js.Any = js.native
        
        /* CompleteClass */
        var nextSibling: IXmlNode = js.native
        
        /* CompleteClass */
        var nodeName: String = js.native
        
        /* CompleteClass */
        var nodeType: NodeType = js.native
        
        /* CompleteClass */
        var nodeValue: js.Any = js.native
        
        /* CompleteClass */
        override def normalize(): Unit = js.native
        
        /* CompleteClass */
        var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
        
        /* CompleteClass */
        var parentNode: IXmlNode = js.native
        
        /* CompleteClass */
        var prefix: js.Any = js.native
        
        /* CompleteClass */
        var previousSibling: IXmlNode = js.native
        
        /* CompleteClass */
        override def removeChild(childNode: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
        
        /* CompleteClass */
        override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
        
        /* CompleteClass */
        override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
        
        /* CompleteClass */
        override def selectSingleNode(xpath: String): IXmlNode = js.native
        
        /* CompleteClass */
        override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
        
        /* CompleteClass */
        override def splitText(offset: Double): IXmlText = js.native
        
        /* CompleteClass */
        override def substringData(offset: Double, count: Double): String = js.native
      }
    }
    
    object Xsl {
      
      @JSGlobal("Windows.Data.Xml.Xsl.XsltProcessor")
      @js.native
      class XsltProcessor protected ()
        extends StObject
           with typings.winrt.Windows.Data.Xml.Xsl.XsltProcessor {
        def this(document: XmlDocument) = this()
        
        /* CompleteClass */
        override def transformToString(inputNode: IXmlNode): String = js.native
      }
    }
  }
}
