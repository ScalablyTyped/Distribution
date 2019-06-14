package typings
package winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs

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
  sealed trait attributeNode
    extends winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  /** The node is an XmlComment type. */
  @js.native
  sealed trait commentNode
    extends winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  /** The node is an XmlCDataSection type. */
  @js.native
  sealed trait dataSectionNode
    extends winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  /** The node is an XmlDocumentFragment type. */
  @js.native
  sealed trait documentFragmentNode
    extends winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  /** The node is an XmlDocument type. */
  @js.native
  sealed trait documentNode
    extends winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  /** The node is an XmlDocumentType type. */
  @js.native
  sealed trait documentTypeNode
    extends winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  /** The node is an XmlElement type. */
  @js.native
  sealed trait elementNode
    extends winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  /** The node is an DtdEntity type. */
  @js.native
  sealed trait entityNode
    extends winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  /** The node is an XmlEntityReference object. */
  @js.native
  sealed trait entityReferenceNode
    extends winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  /** Default value. Never used by the API. */
  @js.native
  sealed trait invalid
    extends winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  /** The node is a DtdNotation type. */
  @js.native
  sealed trait notationNode
    extends winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  /** The node is an XmlProcessingInstruction type. */
  @js.native
  sealed trait processingInstructionNode
    extends winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  /** The node is an XmlText type. */
  @js.native
  sealed trait textNode
    extends winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  /* 2 */ val attributeNode: attributeNode with scala.Double = js.native
  /* 8 */ val commentNode: commentNode with scala.Double = js.native
  /* 4 */ val dataSectionNode: dataSectionNode with scala.Double = js.native
  /* 11 */ val documentFragmentNode: documentFragmentNode with scala.Double = js.native
  /* 9 */ val documentNode: documentNode with scala.Double = js.native
  /* 10 */ val documentTypeNode: documentTypeNode with scala.Double = js.native
  /* 1 */ val elementNode: elementNode with scala.Double = js.native
  /* 6 */ val entityNode: entityNode with scala.Double = js.native
  /* 5 */ val entityReferenceNode: entityReferenceNode with scala.Double = js.native
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 12 */ val notationNode: notationNode with scala.Double = js.native
  /* 7 */ val processingInstructionNode: processingInstructionNode with scala.Double = js.native
  /* 3 */ val textNode: textNode with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType with scala.Double] = js.native
}

