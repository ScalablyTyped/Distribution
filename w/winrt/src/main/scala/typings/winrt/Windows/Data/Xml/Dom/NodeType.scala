package typings.winrt.Windows.Data.Xml.Dom

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
  
}

