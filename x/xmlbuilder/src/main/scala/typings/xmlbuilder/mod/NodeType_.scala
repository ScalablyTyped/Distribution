package typings.xmlbuilder.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeType_ extends js.Object
/**
  * Defines the type of a node in the XML document.
  */
@JSImport("xmlbuilder", "NodeType")
@js.native
object NodeType_ extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType_ with Double] = js.native
  
  /**
    * An attribute node
    */
  @js.native
  sealed trait Attribute extends NodeType_
  /* 2 */ @js.native
  object Attribute extends TopLevel[Attribute with Double]
  
  /**
    * An attribute declaraiton node inside DocType
    */
  @js.native
  sealed trait AttributeDeclaration extends NodeType_
  /* 203 */ @js.native
  object AttributeDeclaration extends TopLevel[AttributeDeclaration with Double]
  
  /**
    * A CDATA node
    */
  @js.native
  sealed trait CData extends NodeType_
  /* 4 */ @js.native
  object CData extends TopLevel[CData with Double]
  
  /**
    * A comment node
    */
  @js.native
  sealed trait Comment extends NodeType_
  /* 8 */ @js.native
  object Comment extends TopLevel[Comment with Double]
  
  /**
    * An XML declaration node
    */
  @js.native
  sealed trait Declaration extends NodeType_
  /* 201 */ @js.native
  object Declaration extends TopLevel[Declaration with Double]
  
  /**
    * A Doctype node
    */
  @js.native
  sealed trait DocType extends NodeType_
  /* 10 */ @js.native
  object DocType extends TopLevel[DocType with Double]
  
  /**
    * A document node
    */
  @js.native
  sealed trait Document extends NodeType_
  /* 9 */ @js.native
  object Document extends TopLevel[Document with Double]
  
  /**
    * A document fragment node
    */
  @js.native
  sealed trait DocumentFragment extends NodeType_
  /* 11 */ @js.native
  object DocumentFragment extends TopLevel[DocumentFragment with Double]
  
  /**
    * An element node
    */
  @js.native
  sealed trait Element extends NodeType_
  /* 1 */ @js.native
  object Element extends TopLevel[Element with Double]
  
  /**
    * An element declaration node inside DocType
    */
  @js.native
  sealed trait ElementDeclaration extends NodeType_
  /* 204 */ @js.native
  object ElementDeclaration extends TopLevel[ElementDeclaration with Double]
  
  /**
    * An entity declaration node inside DocType
    */
  @js.native
  sealed trait EntityDeclaration extends NodeType_
  /* 6 */ @js.native
  object EntityDeclaration extends TopLevel[EntityDeclaration with Double]
  
  /**
    * An entity reference node inside DocType
    */
  @js.native
  sealed trait EntityReference extends NodeType_
  /* 5 */ @js.native
  object EntityReference extends TopLevel[EntityReference with Double]
  
  /**
    * A notation declaration node inside DocType
    */
  @js.native
  sealed trait NotationDeclaration extends NodeType_
  /* 12 */ @js.native
  object NotationDeclaration extends TopLevel[NotationDeclaration with Double]
  
  /**
    * A processing instruction node
    */
  @js.native
  sealed trait ProcessingInstruction extends NodeType_
  /* 7 */ @js.native
  object ProcessingInstruction extends TopLevel[ProcessingInstruction with Double]
  
  /**
    * A raw text node
    */
  @js.native
  sealed trait Raw extends NodeType_
  /* 202 */ @js.native
  object Raw extends TopLevel[Raw with Double]
  
  /**
    * A text node
    */
  @js.native
  sealed trait Text extends NodeType_
  /* 3 */ @js.native
  object Text extends TopLevel[Text with Double]
}
