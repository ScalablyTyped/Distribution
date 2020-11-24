package typings.winrtUwp.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeType extends js.Object
/** The type of an IXmlNode, as returned by the NodeType property. */
@JSGlobal("Windows.Data.Xml.Dom.NodeType")
@js.native
object NodeType extends js.Object {
  
  /** The node is an XmlAttribute type. */
  @js.native
  sealed trait attributeNode extends NodeType
  
  /** The node is an XmlComment type. */
  @js.native
  sealed trait commentNode extends NodeType
  
  /** The node is an XmlCDataSection type. */
  @js.native
  sealed trait dataSectionNode extends NodeType
  
  /** The node is an XmlDocumentFragment type. */
  @js.native
  sealed trait documentFragmentNode extends NodeType
  
  /** The node is an XmlDocument type. */
  @js.native
  sealed trait documentNode extends NodeType
  
  /** The node is an XmlDocumentType type. */
  @js.native
  sealed trait documentTypeNode extends NodeType
  
  /** The node is an XmlElement type. */
  @js.native
  sealed trait elementNode extends NodeType
  
  /** The node is an DtdEntity type. */
  @js.native
  sealed trait entityNode extends NodeType
  
  /** The node is an XmlEntityReference object. */
  @js.native
  sealed trait entityReferenceNode extends NodeType
  
  /** Default value. Never used by the API. */
  @js.native
  sealed trait invalid extends NodeType
  
  /** The node is a DtdNotation type. */
  @js.native
  sealed trait notationNode extends NodeType
  
  /** The node is an XmlProcessingInstruction type. */
  @js.native
  sealed trait processingInstructionNode extends NodeType
  
  /** The node is an XmlText type. */
  @js.native
  sealed trait textNode extends NodeType
}
