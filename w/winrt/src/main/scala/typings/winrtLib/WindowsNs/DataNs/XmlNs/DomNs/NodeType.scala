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
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DataNs.XmlNs.DomNs.NodeType with java.lang.String] = js.native
}

