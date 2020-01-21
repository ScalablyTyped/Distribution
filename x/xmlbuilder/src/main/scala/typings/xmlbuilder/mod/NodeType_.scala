package typings.xmlbuilder.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeType_ extends js.Object

/**
  * Defines the type of a node in the XML document.
  */
@JSImport("xmlbuilder", "NodeType")
@js.native
object NodeType_ extends js.Object {
  /**
    * An attribute node
    */
  @js.native
  sealed trait Attribute extends NodeType_
  
  /**
    * An attribute declaraiton node inside DocType
    */
  @js.native
  sealed trait AttributeDeclaration extends NodeType_
  
  /**
    * A CDATA node
    */
  @js.native
  sealed trait CData extends NodeType_
  
  /**
    * A comment node
    */
  @js.native
  sealed trait Comment extends NodeType_
  
  /**
    * An XML declaration node
    */
  @js.native
  sealed trait Declaration extends NodeType_
  
  /**
    * A Doctype node
    */
  @js.native
  sealed trait DocType extends NodeType_
  
  /**
    * A document node
    */
  @js.native
  sealed trait Document extends NodeType_
  
  /**
    * A document fragment node
    */
  @js.native
  sealed trait DocumentFragment extends NodeType_
  
  /**
    * An element node
    */
  @js.native
  sealed trait Element extends NodeType_
  
  /**
    * An element declaration node inside DocType
    */
  @js.native
  sealed trait ElementDeclaration extends NodeType_
  
  /**
    * An entity declaration node inside DocType
    */
  @js.native
  sealed trait EntityDeclaration extends NodeType_
  
  /**
    * An entity reference node inside DocType
    */
  @js.native
  sealed trait EntityReference extends NodeType_
  
  /**
    * A notation declaration node inside DocType
    */
  @js.native
  sealed trait NotationDeclaration extends NodeType_
  
  /**
    * A processing instruction node
    */
  @js.native
  sealed trait ProcessingInstruction extends NodeType_
  
  /**
    * A raw text node
    */
  @js.native
  sealed trait Raw extends NodeType_
  
  /**
    * A text node
    */
  @js.native
  sealed trait Text extends NodeType_
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType_ with Double] = js.native
  /* 2 */ @js.native
  object Attribute extends TopLevel[Attribute with Double]
  
  /* 203 */ @js.native
  object AttributeDeclaration extends TopLevel[AttributeDeclaration with Double]
  
  /* 4 */ @js.native
  object CData extends TopLevel[CData with Double]
  
  /* 8 */ @js.native
  object Comment extends TopLevel[Comment with Double]
  
  /* 201 */ @js.native
  object Declaration extends TopLevel[Declaration with Double]
  
  /* 10 */ @js.native
  object DocType extends TopLevel[DocType with Double]
  
  /* 9 */ @js.native
  object Document extends TopLevel[Document with Double]
  
  /* 11 */ @js.native
  object DocumentFragment extends TopLevel[DocumentFragment with Double]
  
  /* 1 */ @js.native
  object Element extends TopLevel[Element with Double]
  
  /* 204 */ @js.native
  object ElementDeclaration extends TopLevel[ElementDeclaration with Double]
  
  /* 6 */ @js.native
  object EntityDeclaration extends TopLevel[EntityDeclaration with Double]
  
  /* 5 */ @js.native
  object EntityReference extends TopLevel[EntityReference with Double]
  
  /* 12 */ @js.native
  object NotationDeclaration extends TopLevel[NotationDeclaration with Double]
  
  /* 7 */ @js.native
  object ProcessingInstruction extends TopLevel[ProcessingInstruction with Double]
  
  /* 202 */ @js.native
  object Raw extends TopLevel[Raw with Double]
  
  /* 3 */ @js.native
  object Text extends TopLevel[Text with Double]
  
}

