package typings.winrt.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Data.Xml.Dom.NodeType.attributeNode
import typings.winrt.Windows.Data.Xml.Dom.NodeType.commentNode
import typings.winrt.Windows.Data.Xml.Dom.NodeType.dataSectionNode
import typings.winrt.Windows.Data.Xml.Dom.NodeType.documentFragmentNode
import typings.winrt.Windows.Data.Xml.Dom.NodeType.documentNode
import typings.winrt.Windows.Data.Xml.Dom.NodeType.documentTypeNode
import typings.winrt.Windows.Data.Xml.Dom.NodeType.elementNode
import typings.winrt.Windows.Data.Xml.Dom.NodeType.entityNode
import typings.winrt.Windows.Data.Xml.Dom.NodeType.entityReferenceNode
import typings.winrt.Windows.Data.Xml.Dom.NodeType.invalid
import typings.winrt.Windows.Data.Xml.Dom.NodeType.notationNode
import typings.winrt.Windows.Data.Xml.Dom.NodeType.processingInstructionNode
import typings.winrt.Windows.Data.Xml.Dom.NodeType.textNode
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

