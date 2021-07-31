package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def apply(value: Double): js.UndefOr[NodeType_ & Double] = js.native
  
  /**
    * An attribute node
    */
  @js.native
  sealed trait Attribute
    extends StObject
       with NodeType_
  /* 2 */ val Attribute: typings.xmlbuilder.mod.NodeType_.Attribute & Double = js.native
  
  /**
    * An attribute declaraiton node inside DocType
    */
  @js.native
  sealed trait AttributeDeclaration
    extends StObject
       with NodeType_
  /* 203 */ val AttributeDeclaration: typings.xmlbuilder.mod.NodeType_.AttributeDeclaration & Double = js.native
  
  /**
    * A CDATA node
    */
  @js.native
  sealed trait CData
    extends StObject
       with NodeType_
  /* 4 */ val CData: typings.xmlbuilder.mod.NodeType_.CData & Double = js.native
  
  /**
    * A comment node
    */
  @js.native
  sealed trait Comment
    extends StObject
       with NodeType_
  /* 8 */ val Comment: typings.xmlbuilder.mod.NodeType_.Comment & Double = js.native
  
  /**
    * An XML declaration node
    */
  @js.native
  sealed trait Declaration
    extends StObject
       with NodeType_
  /* 201 */ val Declaration: typings.xmlbuilder.mod.NodeType_.Declaration & Double = js.native
  
  /**
    * A Doctype node
    */
  @js.native
  sealed trait DocType
    extends StObject
       with NodeType_
  /* 10 */ val DocType: typings.xmlbuilder.mod.NodeType_.DocType & Double = js.native
  
  /**
    * A document node
    */
  @js.native
  sealed trait Document
    extends StObject
       with NodeType_
  /* 9 */ val Document: typings.xmlbuilder.mod.NodeType_.Document & Double = js.native
  
  /**
    * A document fragment node
    */
  @js.native
  sealed trait DocumentFragment
    extends StObject
       with NodeType_
  /* 11 */ val DocumentFragment: typings.xmlbuilder.mod.NodeType_.DocumentFragment & Double = js.native
  
  /**
    * An element node
    */
  @js.native
  sealed trait Element
    extends StObject
       with NodeType_
  /* 1 */ val Element: typings.xmlbuilder.mod.NodeType_.Element & Double = js.native
  
  /**
    * An element declaration node inside DocType
    */
  @js.native
  sealed trait ElementDeclaration
    extends StObject
       with NodeType_
  /* 204 */ val ElementDeclaration: typings.xmlbuilder.mod.NodeType_.ElementDeclaration & Double = js.native
  
  /**
    * An entity declaration node inside DocType
    */
  @js.native
  sealed trait EntityDeclaration
    extends StObject
       with NodeType_
  /* 6 */ val EntityDeclaration: typings.xmlbuilder.mod.NodeType_.EntityDeclaration & Double = js.native
  
  /**
    * An entity reference node inside DocType
    */
  @js.native
  sealed trait EntityReference
    extends StObject
       with NodeType_
  /* 5 */ val EntityReference: typings.xmlbuilder.mod.NodeType_.EntityReference & Double = js.native
  
  /**
    * A notation declaration node inside DocType
    */
  @js.native
  sealed trait NotationDeclaration
    extends StObject
       with NodeType_
  /* 12 */ val NotationDeclaration: typings.xmlbuilder.mod.NodeType_.NotationDeclaration & Double = js.native
  
  /**
    * A processing instruction node
    */
  @js.native
  sealed trait ProcessingInstruction
    extends StObject
       with NodeType_
  /* 7 */ val ProcessingInstruction: typings.xmlbuilder.mod.NodeType_.ProcessingInstruction & Double = js.native
  
  /**
    * A raw text node
    */
  @js.native
  sealed trait Raw
    extends StObject
       with NodeType_
  /* 202 */ val Raw: typings.xmlbuilder.mod.NodeType_.Raw & Double = js.native
  
  /**
    * A text node
    */
  @js.native
  sealed trait Text
    extends StObject
       with NodeType_
  /* 3 */ val Text: typings.xmlbuilder.mod.NodeType_.Text & Double = js.native
}
