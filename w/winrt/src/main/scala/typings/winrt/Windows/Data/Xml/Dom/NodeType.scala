package typings.winrt.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeType extends StObject
@JSGlobal("Windows.Data.Xml.Dom.NodeType")
@js.native
object NodeType extends StObject {
  
  @js.native
  sealed trait attributeNode
    extends StObject
       with NodeType
  
  @js.native
  sealed trait commentNode
    extends StObject
       with NodeType
  
  @js.native
  sealed trait dataSectionNode
    extends StObject
       with NodeType
  
  @js.native
  sealed trait documentFragmentNode
    extends StObject
       with NodeType
  
  @js.native
  sealed trait documentNode
    extends StObject
       with NodeType
  
  @js.native
  sealed trait documentTypeNode
    extends StObject
       with NodeType
  
  @js.native
  sealed trait elementNode
    extends StObject
       with NodeType
  
  @js.native
  sealed trait entityNode
    extends StObject
       with NodeType
  
  @js.native
  sealed trait entityReferenceNode
    extends StObject
       with NodeType
  
  @js.native
  sealed trait invalid
    extends StObject
       with NodeType
  
  @js.native
  sealed trait notationNode
    extends StObject
       with NodeType
  
  @js.native
  sealed trait processingInstructionNode
    extends StObject
       with NodeType
  
  @js.native
  sealed trait textNode
    extends StObject
       with NodeType
}
