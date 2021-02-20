package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeType_ extends StObject
/**
  * Defines the type of a node in the XML document.
  */
@JSImport("xmlbuilder", "NodeType")
@js.native
object NodeType_ extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType_ with Double] = js.native
  
  /**
    * An attribute node
    */
  @js.native
  sealed trait Attribute extends NodeType_
  /* 2 */ val Attribute: typings.xmlbuilder.mod.NodeType_.Attribute with Double = js.native
  
  /**
    * An attribute declaraiton node inside DocType
    */
  @js.native
  sealed trait AttributeDeclaration extends NodeType_
  /* 203 */ val AttributeDeclaration: typings.xmlbuilder.mod.NodeType_.AttributeDeclaration with Double = js.native
  
  /**
    * A CDATA node
    */
  @js.native
  sealed trait CData extends NodeType_
  /* 4 */ val CData: typings.xmlbuilder.mod.NodeType_.CData with Double = js.native
  
  /**
    * A comment node
    */
  @js.native
  sealed trait Comment extends NodeType_
  /* 8 */ val Comment: typings.xmlbuilder.mod.NodeType_.Comment with Double = js.native
  
  /**
    * An XML declaration node
    */
  @js.native
  sealed trait Declaration extends NodeType_
  /* 201 */ val Declaration: typings.xmlbuilder.mod.NodeType_.Declaration with Double = js.native
  
  /**
    * A Doctype node
    */
  @js.native
  sealed trait DocType extends NodeType_
  /* 10 */ val DocType: typings.xmlbuilder.mod.NodeType_.DocType with Double = js.native
  
  /**
    * A document node
    */
  @js.native
  sealed trait Document extends NodeType_
  /* 9 */ val Document: typings.xmlbuilder.mod.NodeType_.Document with Double = js.native
  
  /**
    * A document fragment node
    */
  @js.native
  sealed trait DocumentFragment extends NodeType_
  /* 11 */ val DocumentFragment: typings.xmlbuilder.mod.NodeType_.DocumentFragment with Double = js.native
  
  /**
    * An element node
    */
  @js.native
  sealed trait Element extends NodeType_
  /* 1 */ val Element: typings.xmlbuilder.mod.NodeType_.Element with Double = js.native
  
  /**
    * An element declaration node inside DocType
    */
  @js.native
  sealed trait ElementDeclaration extends NodeType_
  /* 204 */ val ElementDeclaration: typings.xmlbuilder.mod.NodeType_.ElementDeclaration with Double = js.native
  
  /**
    * An entity declaration node inside DocType
    */
  @js.native
  sealed trait EntityDeclaration extends NodeType_
  /* 6 */ val EntityDeclaration: typings.xmlbuilder.mod.NodeType_.EntityDeclaration with Double = js.native
  
  /**
    * An entity reference node inside DocType
    */
  @js.native
  sealed trait EntityReference extends NodeType_
  /* 5 */ val EntityReference: typings.xmlbuilder.mod.NodeType_.EntityReference with Double = js.native
  
  /**
    * A notation declaration node inside DocType
    */
  @js.native
  sealed trait NotationDeclaration extends NodeType_
  /* 12 */ val NotationDeclaration: typings.xmlbuilder.mod.NodeType_.NotationDeclaration with Double = js.native
  
  /**
    * A processing instruction node
    */
  @js.native
  sealed trait ProcessingInstruction extends NodeType_
  /* 7 */ val ProcessingInstruction: typings.xmlbuilder.mod.NodeType_.ProcessingInstruction with Double = js.native
  
  /**
    * A raw text node
    */
  @js.native
  sealed trait Raw extends NodeType_
  /* 202 */ val Raw: typings.xmlbuilder.mod.NodeType_.Raw with Double = js.native
  
  /**
    * A text node
    */
  @js.native
  sealed trait Text extends NodeType_
  /* 3 */ val Text: typings.xmlbuilder.mod.NodeType_.Text with Double = js.native
}
