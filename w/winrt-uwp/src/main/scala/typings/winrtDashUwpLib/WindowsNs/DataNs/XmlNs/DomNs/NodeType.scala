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
  
  val attributeNode: attributeNode with java.lang.String = js.native
  val commentNode: commentNode with java.lang.String = js.native
  val dataSectionNode: dataSectionNode with java.lang.String = js.native
  val documentFragmentNode: documentFragmentNode with java.lang.String = js.native
  val documentNode: documentNode with java.lang.String = js.native
  val documentTypeNode: documentTypeNode with java.lang.String = js.native
  val elementNode: elementNode with java.lang.String = js.native
  val entityNode: entityNode with java.lang.String = js.native
  val entityReferenceNode: entityReferenceNode with java.lang.String = js.native
  val invalid: invalid with java.lang.String = js.native
  val notationNode: notationNode with java.lang.String = js.native
  val processingInstructionNode: processingInstructionNode with java.lang.String = js.native
  val textNode: textNode with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType with java.lang.String] = js.native
}

