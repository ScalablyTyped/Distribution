package typings.winrt.global.Windows

import typings.winrt.Windows.Data.Json.JsonErrorStatus
import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.anon.Result
import typings.winrt.anon.ResultSucceeded
import typings.winrt.anon.Succeeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Data {
  
  object Html {
    
    @JSGlobal("Windows.Data.Html.HtmlUtilities")
    @js.native
    class HtmlUtilities ()
      extends typings.winrt.Windows.Data.Html.HtmlUtilities
    /* static members */
    object HtmlUtilities {
      
      @JSGlobal("Windows.Data.Html.HtmlUtilities.convertToText")
      @js.native
      def convertToText(html: String): String = js.native
    }
  }
  
  object Json {
    
    @JSGlobal("Windows.Data.Json.JsonArray")
    @js.native
    class JsonArray ()
      extends typings.winrt.Windows.Data.Json.JsonArray
    /* static members */
    object JsonArray {
      
      @JSGlobal("Windows.Data.Json.JsonArray.parse")
      @js.native
      def parse(input: String): typings.winrt.Windows.Data.Json.JsonArray = js.native
      
      @JSGlobal("Windows.Data.Json.JsonArray.tryParse")
      @js.native
      def tryParse(input: String): ResultSucceeded = js.native
    }
    
    @JSGlobal("Windows.Data.Json.JsonError")
    @js.native
    class JsonError ()
      extends typings.winrt.Windows.Data.Json.JsonError
    /* static members */
    object JsonError {
      
      @JSGlobal("Windows.Data.Json.JsonError.getStatus")
      @js.native
      def getStatus(hresult: Double): JsonErrorStatus = js.native
    }
    
    @JSGlobal("Windows.Data.Json.JsonErrorStatus")
    @js.native
    object JsonErrorStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Data.Json.JsonErrorStatus with Double] = js.native
      
      /* 4 */ val implementationLimit: typings.winrt.Windows.Data.Json.JsonErrorStatus.implementationLimit with Double = js.native
      
      /* 2 */ val invalidJsonNumber: typings.winrt.Windows.Data.Json.JsonErrorStatus.invalidJsonNumber with Double = js.native
      
      /* 1 */ val invalidJsonString: typings.winrt.Windows.Data.Json.JsonErrorStatus.invalidJsonString with Double = js.native
      
      /* 3 */ val jsonValueNotFound: typings.winrt.Windows.Data.Json.JsonErrorStatus.jsonValueNotFound with Double = js.native
      
      /* 0 */ val unknown: typings.winrt.Windows.Data.Json.JsonErrorStatus.unknown with Double = js.native
    }
    
    @JSGlobal("Windows.Data.Json.JsonObject")
    @js.native
    class JsonObject ()
      extends typings.winrt.Windows.Data.Json.JsonObject
    /* static members */
    object JsonObject {
      
      @JSGlobal("Windows.Data.Json.JsonObject.parse")
      @js.native
      def parse(input: String): typings.winrt.Windows.Data.Json.JsonObject = js.native
      
      @JSGlobal("Windows.Data.Json.JsonObject.tryParse")
      @js.native
      def tryParse(input: String): Succeeded = js.native
    }
    
    @JSGlobal("Windows.Data.Json.JsonValue")
    @js.native
    class JsonValue ()
      extends typings.winrt.Windows.Data.Json.JsonValue
    /* static members */
    object JsonValue {
      
      @JSGlobal("Windows.Data.Json.JsonValue.createBooleanValue")
      @js.native
      def createBooleanValue(input: Boolean): typings.winrt.Windows.Data.Json.JsonValue = js.native
      
      @JSGlobal("Windows.Data.Json.JsonValue.createNumberValue")
      @js.native
      def createNumberValue(input: Double): typings.winrt.Windows.Data.Json.JsonValue = js.native
      
      @JSGlobal("Windows.Data.Json.JsonValue.createStringValue")
      @js.native
      def createStringValue(input: String): typings.winrt.Windows.Data.Json.JsonValue = js.native
      
      @JSGlobal("Windows.Data.Json.JsonValue.parse")
      @js.native
      def parse(input: String): typings.winrt.Windows.Data.Json.JsonValue = js.native
      
      @JSGlobal("Windows.Data.Json.JsonValue.tryParse")
      @js.native
      def tryParse(input: String): Result = js.native
    }
    
    @JSGlobal("Windows.Data.Json.JsonValueType")
    @js.native
    object JsonValueType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Data.Json.JsonValueType with Double] = js.native
      
      /* 4 */ val array: typings.winrt.Windows.Data.Json.JsonValueType.array with Double = js.native
      
      /* 1 */ val boolean: typings.winrt.Windows.Data.Json.JsonValueType.boolean with Double = js.native
      
      /* 0 */ val null_ : typings.winrt.Windows.Data.Json.JsonValueType.null_ with Double = js.native
      
      /* 2 */ val number: typings.winrt.Windows.Data.Json.JsonValueType.number with Double = js.native
      
      /* 5 */ val `object`: typings.winrt.Windows.Data.Json.JsonValueType.`object` with Double = js.native
      
      /* 3 */ val string: typings.winrt.Windows.Data.Json.JsonValueType.string with Double = js.native
    }
  }
  
  object Xml {
    
    object Dom {
      
      @JSGlobal("Windows.Data.Xml.Dom.DtdEntity")
      @js.native
      class DtdEntity ()
        extends typings.winrt.Windows.Data.Xml.Dom.DtdEntity
      
      @JSGlobal("Windows.Data.Xml.Dom.DtdNotation")
      @js.native
      class DtdNotation ()
        extends typings.winrt.Windows.Data.Xml.Dom.DtdNotation
      
      @JSGlobal("Windows.Data.Xml.Dom.NodeType")
      @js.native
      object NodeType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.winrt.Windows.Data.Xml.Dom.NodeType with Double] = js.native
        
        /* 2 */ val attributeNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.attributeNode with Double = js.native
        
        /* 8 */ val commentNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.commentNode with Double = js.native
        
        /* 4 */ val dataSectionNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.dataSectionNode with Double = js.native
        
        /* 11 */ val documentFragmentNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.documentFragmentNode with Double = js.native
        
        /* 9 */ val documentNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.documentNode with Double = js.native
        
        /* 10 */ val documentTypeNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.documentTypeNode with Double = js.native
        
        /* 1 */ val elementNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.elementNode with Double = js.native
        
        /* 6 */ val entityNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.entityNode with Double = js.native
        
        /* 5 */ val entityReferenceNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.entityReferenceNode with Double = js.native
        
        /* 0 */ val invalid: typings.winrt.Windows.Data.Xml.Dom.NodeType.invalid with Double = js.native
        
        /* 12 */ val notationNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.notationNode with Double = js.native
        
        /* 7 */ val processingInstructionNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.processingInstructionNode with Double = js.native
        
        /* 3 */ val textNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.textNode with Double = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlAttribute")
      @js.native
      class XmlAttribute ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlAttribute
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlCDataSection")
      @js.native
      class XmlCDataSection ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlCDataSection
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlComment")
      @js.native
      class XmlComment ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlComment
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlDocument")
      @js.native
      class XmlDocument ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlDocument
      /* static members */
      object XmlDocument {
        
        @JSGlobal("Windows.Data.Xml.Dom.XmlDocument.loadFromFileAsync")
        @js.native
        def loadFromFileAsync(file: IStorageFile): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
        @JSGlobal("Windows.Data.Xml.Dom.XmlDocument.loadFromFileAsync")
        @js.native
        def loadFromFileAsync(file: IStorageFile, loadSettings: typings.winrt.Windows.Data.Xml.Dom.XmlLoadSettings): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
        
        @JSGlobal("Windows.Data.Xml.Dom.XmlDocument.loadFromUriAsync")
        @js.native
        def loadFromUriAsync(uri: Uri): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
        @JSGlobal("Windows.Data.Xml.Dom.XmlDocument.loadFromUriAsync")
        @js.native
        def loadFromUriAsync(uri: Uri, loadSettings: typings.winrt.Windows.Data.Xml.Dom.XmlLoadSettings): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
      }
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlDocumentFragment")
      @js.native
      class XmlDocumentFragment ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlDocumentFragment
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlDocumentType")
      @js.native
      class XmlDocumentType ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlDocumentType
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlDomImplementation")
      @js.native
      class XmlDomImplementation ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlDomImplementation
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlElement")
      @js.native
      class XmlElement ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlElement
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlEntityReference")
      @js.native
      class XmlEntityReference ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlEntityReference
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlLoadSettings")
      @js.native
      class XmlLoadSettings ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlLoadSettings
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlNamedNodeMap")
      @js.native
      class XmlNamedNodeMap ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlNodeList")
      @js.native
      class XmlNodeList ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlNodeList
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlProcessingInstruction")
      @js.native
      class XmlProcessingInstruction ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlProcessingInstruction
      
      @JSGlobal("Windows.Data.Xml.Dom.XmlText")
      @js.native
      class XmlText ()
        extends typings.winrt.Windows.Data.Xml.Dom.XmlText
    }
    
    object Xsl {
      
      @JSGlobal("Windows.Data.Xml.Xsl.XsltProcessor")
      @js.native
      class XsltProcessor protected ()
        extends typings.winrt.Windows.Data.Xml.Xsl.XsltProcessor {
        def this(document: XmlDocument) = this()
      }
    }
  }
}
