package typings.winrt.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeType extends js.Object

@JSGlobal("Windows.Data.Xml.Dom.NodeType")
@js.native
object NodeType extends js.Object {
  @js.native
  sealed trait attributeNode extends NodeType
  
  @js.native
  sealed trait commentNode extends NodeType
  
  @js.native
  sealed trait dataSectionNode extends NodeType
  
  @js.native
  sealed trait documentFragmentNode extends NodeType
  
  @js.native
  sealed trait documentNode extends NodeType
  
  @js.native
  sealed trait documentTypeNode extends NodeType
  
  @js.native
  sealed trait elementNode extends NodeType
  
  @js.native
  sealed trait entityNode extends NodeType
  
  @js.native
  sealed trait entityReferenceNode extends NodeType
  
  @js.native
  sealed trait invalid extends NodeType
  
  @js.native
  sealed trait notationNode extends NodeType
  
  @js.native
  sealed trait processingInstructionNode extends NodeType
  
  @js.native
  sealed trait textNode extends NodeType
  
  /* 2 */ val attributeNode: typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.NodeType.attributeNode with Double = js.native
  /* 8 */ val commentNode: typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.NodeType.commentNode with Double = js.native
  /* 4 */ val dataSectionNode: typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.NodeType.dataSectionNode with Double = js.native
  /* 11 */ val documentFragmentNode: typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.NodeType.documentFragmentNode with Double = js.native
  /* 9 */ val documentNode: typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.NodeType.documentNode with Double = js.native
  /* 10 */ val documentTypeNode: typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.NodeType.documentTypeNode with Double = js.native
  /* 1 */ val elementNode: typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.NodeType.elementNode with Double = js.native
  /* 6 */ val entityNode: typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.NodeType.entityNode with Double = js.native
  /* 5 */ val entityReferenceNode: typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.NodeType.entityReferenceNode with Double = js.native
  /* 0 */ val invalid: typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.NodeType.invalid with Double = js.native
  /* 12 */ val notationNode: typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.NodeType.notationNode with Double = js.native
  /* 7 */ val processingInstructionNode: typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.NodeType.processingInstructionNode with Double = js.native
  /* 3 */ val textNode: typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.NodeType.textNode with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
}

