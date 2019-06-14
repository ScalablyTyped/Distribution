package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeType extends js.Object

@JSGlobal("Windows.Data.Xml.Dom.NodeType")
@js.native
object NodeType extends js.Object {
  @js.native
  sealed trait attributeNode
    extends winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  @js.native
  sealed trait commentNode
    extends winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  @js.native
  sealed trait dataSectionNode
    extends winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  @js.native
  sealed trait documentFragmentNode
    extends winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  @js.native
  sealed trait documentNode
    extends winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  @js.native
  sealed trait documentTypeNode
    extends winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  @js.native
  sealed trait elementNode
    extends winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  @js.native
  sealed trait entityNode
    extends winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  @js.native
  sealed trait entityReferenceNode
    extends winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  @js.native
  sealed trait invalid
    extends winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  @js.native
  sealed trait notationNode
    extends winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  @js.native
  sealed trait processingInstructionNode
    extends winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
  @js.native
  sealed trait textNode
    extends winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType
  
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
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType with scala.Double] = js.native
}

