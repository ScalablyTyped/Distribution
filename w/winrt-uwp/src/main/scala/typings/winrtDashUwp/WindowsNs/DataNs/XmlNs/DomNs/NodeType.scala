package typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 2 */ val attributeNode: typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.NodeType.attributeNode with Double = js.native
  /* 8 */ val commentNode: typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.NodeType.commentNode with Double = js.native
  /* 4 */ val dataSectionNode: typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.NodeType.dataSectionNode with Double = js.native
  /* 11 */ val documentFragmentNode: typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.NodeType.documentFragmentNode with Double = js.native
  /* 9 */ val documentNode: typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.NodeType.documentNode with Double = js.native
  /* 10 */ val documentTypeNode: typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.NodeType.documentTypeNode with Double = js.native
  /* 1 */ val elementNode: typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.NodeType.elementNode with Double = js.native
  /* 6 */ val entityNode: typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.NodeType.entityNode with Double = js.native
  /* 5 */ val entityReferenceNode: typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.NodeType.entityReferenceNode with Double = js.native
  /* 0 */ val invalid: typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.NodeType.invalid with Double = js.native
  /* 12 */ val notationNode: typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.NodeType.notationNode with Double = js.native
  /* 7 */ val processingInstructionNode: typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.NodeType.processingInstructionNode with Double = js.native
  /* 3 */ val textNode: typings.winrtDashUwp.WindowsNs.DataNs.XmlNs.DomNs.NodeType.textNode with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
}

