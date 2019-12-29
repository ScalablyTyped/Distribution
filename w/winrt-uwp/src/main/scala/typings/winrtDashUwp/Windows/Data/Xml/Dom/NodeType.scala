package typings.winrtDashUwp.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
  /* 2 */ @js.native
  object attributeNode extends TopLevel[attributeNode with Double]
  
  /* 8 */ @js.native
  object commentNode extends TopLevel[commentNode with Double]
  
  /* 4 */ @js.native
  object dataSectionNode extends TopLevel[dataSectionNode with Double]
  
  /* 11 */ @js.native
  object documentFragmentNode extends TopLevel[documentFragmentNode with Double]
  
  /* 9 */ @js.native
  object documentNode extends TopLevel[documentNode with Double]
  
  /* 10 */ @js.native
  object documentTypeNode extends TopLevel[documentTypeNode with Double]
  
  /* 1 */ @js.native
  object elementNode extends TopLevel[elementNode with Double]
  
  /* 6 */ @js.native
  object entityNode extends TopLevel[entityNode with Double]
  
  /* 5 */ @js.native
  object entityReferenceNode extends TopLevel[entityReferenceNode with Double]
  
  /* 0 */ @js.native
  object invalid extends TopLevel[invalid with Double]
  
  /* 12 */ @js.native
  object notationNode extends TopLevel[notationNode with Double]
  
  /* 7 */ @js.native
  object processingInstructionNode extends TopLevel[processingInstructionNode with Double]
  
  /* 3 */ @js.native
  object textNode extends TopLevel[textNode with Double]
  
}

