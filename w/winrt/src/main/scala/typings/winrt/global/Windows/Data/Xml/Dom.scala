package typings.winrt.global.Windows.Data.Xml

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Data.Xml.Dom")
@js.native
object Dom extends js.Object {
  
  @js.native
  class DtdEntity ()
    extends typings.winrt.Windows.Data.Xml.Dom.DtdEntity
  
  @js.native
  class DtdNotation ()
    extends typings.winrt.Windows.Data.Xml.Dom.DtdNotation
  
  @js.native
  object NodeType extends js.Object {
    
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
  
  @js.native
  class XmlAttribute ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlAttribute
  
  @js.native
  class XmlCDataSection ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlCDataSection
  
  @js.native
  class XmlComment ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlComment
  
  @js.native
  class XmlDocument ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlDocument
  /* static members */
  @js.native
  object XmlDocument extends js.Object {
    
    def loadFromFileAsync(file: IStorageFile): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
    def loadFromFileAsync(file: IStorageFile, loadSettings: typings.winrt.Windows.Data.Xml.Dom.XmlLoadSettings): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
    
    def loadFromUriAsync(uri: Uri): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
    def loadFromUriAsync(uri: Uri, loadSettings: typings.winrt.Windows.Data.Xml.Dom.XmlLoadSettings): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
  }
  
  @js.native
  class XmlDocumentFragment ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlDocumentFragment
  
  @js.native
  class XmlDocumentType ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlDocumentType
  
  @js.native
  class XmlDomImplementation ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlDomImplementation
  
  @js.native
  class XmlElement ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlElement
  
  @js.native
  class XmlEntityReference ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlEntityReference
  
  @js.native
  class XmlLoadSettings ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlLoadSettings
  
  @js.native
  class XmlNamedNodeMap ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap
  
  @js.native
  class XmlNodeList ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlNodeList
  
  @js.native
  class XmlProcessingInstruction ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlProcessingInstruction
  
  @js.native
  class XmlText ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlText
}
