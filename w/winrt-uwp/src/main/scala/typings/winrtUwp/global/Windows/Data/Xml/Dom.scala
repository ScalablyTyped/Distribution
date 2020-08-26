package typings.winrtUwp.global.Windows.Data.Xml

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides support for the XML Document Object Model (DOM). */
@JSGlobal("Windows.Data.Xml.Dom")
@js.native
object Dom extends js.Object {
  /** Represents a parsed or unparsed entity in the XML document. */
  @js.native
  abstract class DtdEntity ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.DtdEntity
  
  /** Contains a notation declared in the DTD or schema. */
  @js.native
  abstract class DtdNotation ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.DtdNotation
  
  /** Represents an attribute of an XmlElement. Valid and default values for the attribute are defined in a document type definition (DTD) or schema. */
  @js.native
  abstract class XmlAttribute ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlAttribute
  
  /** Represents a CDATA section of an XML document. */
  @js.native
  abstract class XmlCDataSection ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlCDataSection
  
  /** Represents an XML comment. */
  @js.native
  abstract class XmlComment ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlComment
  
  /** Represents the top level of the XML source. This class includes members for retrieving and creating all other XML objects. */
  @js.native
  /** Creates a new instance of the XmlDocument class. */
  class XmlDocument ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
  
  /** Represents a lightweight object that is useful for tree insertion operations. */
  @js.native
  abstract class XmlDocumentFragment ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocumentFragment
  
  /** Contains information associated with the document type. */
  @js.native
  abstract class XmlDocumentType ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocumentType
  
  /** Provides methods that are independent of any particular instance of the document object model. */
  @js.native
  abstract class XmlDomImplementation ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlDomImplementation
  
  /** Encapsulates information specific to XML Element nodes. */
  @js.native
  abstract class XmlElement ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlElement
  
  /** Represents an entity reference node. */
  @js.native
  abstract class XmlEntityReference ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlEntityReference
  
  /** Contains settings that are used during loading and parsing of XML documents. The default settings are chosen for the highest security. This class can be instantiated and is accepted by LoadXml , LoadFromUriAsync , and LoadFromFileAsync . */
  @js.native
  /** Creates a new XmlLoadSettings object. */
  class XmlLoadSettings ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlLoadSettings
  
  /** Encapsulates iteration through the collection of attribute nodes. */
  @js.native
  abstract class XmlNamedNodeMap ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap
  
  /** Describes a collection of nodes. */
  @js.native
  abstract class XmlNodeList ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList
  
  /** Represents a processing instruction, which XML defines to keep processor-specific information in the text of the document. */
  @js.native
  abstract class XmlProcessingInstruction ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlProcessingInstruction
  
  /** Represents the text content of an element. */
  @js.native
  abstract class XmlText ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlText
  
  /** The type of an IXmlNode, as returned by the NodeType property. */
  @js.native
  object NodeType extends js.Object {
    /* 2 */ val attributeNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.attributeNode with Double = js.native
    /* 8 */ val commentNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.commentNode with Double = js.native
    /* 4 */ val dataSectionNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.dataSectionNode with Double = js.native
    /* 11 */ val documentFragmentNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.documentFragmentNode with Double = js.native
    /* 9 */ val documentNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.documentNode with Double = js.native
    /* 10 */ val documentTypeNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.documentTypeNode with Double = js.native
    /* 1 */ val elementNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.elementNode with Double = js.native
    /* 6 */ val entityNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.entityNode with Double = js.native
    /* 5 */ val entityReferenceNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.entityReferenceNode with Double = js.native
    /* 0 */ val invalid: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.invalid with Double = js.native
    /* 12 */ val notationNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.notationNode with Double = js.native
    /* 7 */ val processingInstructionNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.processingInstructionNode with Double = js.native
    /* 3 */ val textNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.textNode with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Data.Xml.Dom.NodeType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object XmlDocument extends js.Object {
    /**
      * Asynchronously loads an XML document from the specified file. The document is parsed using the default parser settings.
      * @param file The file from which to load the document.
      * @return The object that must be used to start the operation.
      */
    def loadFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument] = js.native
    /**
      * Asynchronously loads an XML document from the specified file. The document is parsed using the provided settings.
      * @param file The file from which to load the document.
      * @param loadSettings Settings for customizing parser behavior.
      * @return The object that must be used to start the operation.
      */
    def loadFromFileAsync(file: IStorageFile, loadSettings: typings.winrtUwp.Windows.Data.Xml.Dom.XmlLoadSettings): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument] = js.native
    /**
      * Asynchronously loads an XML document from the specified location. The document is parsed using the default parser settings.
      * @param uri A URL that specifies the location of the XML file.
      * @return The object that must be used to start the operation.
      */
    def loadFromUriAsync(uri: Uri): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument] = js.native
    /**
      * Asynchronously loads an XML document from the specified location. The document is parsed using the provided settings.
      * @param uri A URL that specifies the location of the XML file.
      * @param loadSettings Customizes parser behavior.
      * @return An object that must be used to start the operation.
      */
    def loadFromUriAsync(uri: Uri, loadSettings: typings.winrtUwp.Windows.Data.Xml.Dom.XmlLoadSettings): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument] = js.native
  }
  
}

