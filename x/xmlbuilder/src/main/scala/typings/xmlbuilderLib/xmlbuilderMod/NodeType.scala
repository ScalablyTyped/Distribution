package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeType extends js.Object

/**
  * Defines the type of a node in the XML document.
  */
@JSImport("xmlbuilder", "NodeType")
@js.native
object NodeType extends js.Object {
  /**
    * An attribute node
    */
  @js.native
  sealed trait Attribute
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * An attribute declaraiton node inside DocType
    */
  @js.native
  sealed trait AttributeDeclaration
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * A CDATA node
    */
  @js.native
  sealed trait CData
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * A comment node
    */
  @js.native
  sealed trait Comment
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * An XML declaration node
    */
  @js.native
  sealed trait Declaration
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * A Doctype node
    */
  @js.native
  sealed trait DocType
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * A document node
    */
  @js.native
  sealed trait Document
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * A document fragment node
    */
  @js.native
  sealed trait DocumentFragment
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * An element node
    */
  @js.native
  sealed trait Element
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * An element declaration node inside DocType
    */
  @js.native
  sealed trait ElementDeclaration
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * An entity declaration node inside DocType
    */
  @js.native
  sealed trait EntityDeclaration
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * An entity reference node inside DocType
    */
  @js.native
  sealed trait EntityReference
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * A notation declaration node inside DocType
    */
  @js.native
  sealed trait NotationDeclaration
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * A processing instruction node
    */
  @js.native
  sealed trait ProcessingInstruction
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * A raw text node
    */
  @js.native
  sealed trait Raw
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /**
    * A text node
    */
  @js.native
  sealed trait Text
    extends xmlbuilderLib.xmlbuilderMod.NodeType
  
  /* 2 */ val Attribute: Attribute with scala.Double = js.native
  /* 203 */ val AttributeDeclaration: AttributeDeclaration with scala.Double = js.native
  /* 4 */ val CData: CData with scala.Double = js.native
  /* 8 */ val Comment: Comment with scala.Double = js.native
  /* 201 */ val Declaration: Declaration with scala.Double = js.native
  /* 10 */ val DocType: DocType with scala.Double = js.native
  /* 9 */ val Document: Document with scala.Double = js.native
  /* 11 */ val DocumentFragment: DocumentFragment with scala.Double = js.native
  /* 1 */ val Element: Element with scala.Double = js.native
  /* 204 */ val ElementDeclaration: ElementDeclaration with scala.Double = js.native
  /* 6 */ val EntityDeclaration: EntityDeclaration with scala.Double = js.native
  /* 5 */ val EntityReference: EntityReference with scala.Double = js.native
  /* 12 */ val NotationDeclaration: NotationDeclaration with scala.Double = js.native
  /* 7 */ val ProcessingInstruction: ProcessingInstruction with scala.Double = js.native
  /* 202 */ val Raw: Raw with scala.Double = js.native
  /* 3 */ val Text: Text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xmlbuilderLib.xmlbuilderMod.NodeType with scala.Double] = js.native
}

/**
  * Defines the type of a node in the XML document.
  */
@JSImport("xmlbuilder", "nodeType")
@js.native
object nodeType extends js.Object {
  /* 2 */ val Attribute: xmlbuilderLib.xmlbuilderMod.NodeType.Attribute with scala.Double = js.native
  /* 203 */ val AttributeDeclaration: xmlbuilderLib.xmlbuilderMod.NodeType.AttributeDeclaration with scala.Double = js.native
  /* 4 */ val CData: xmlbuilderLib.xmlbuilderMod.NodeType.CData with scala.Double = js.native
  /* 8 */ val Comment: xmlbuilderLib.xmlbuilderMod.NodeType.Comment with scala.Double = js.native
  /* 201 */ val Declaration: xmlbuilderLib.xmlbuilderMod.NodeType.Declaration with scala.Double = js.native
  /* 10 */ val DocType: xmlbuilderLib.xmlbuilderMod.NodeType.DocType with scala.Double = js.native
  /* 9 */ val Document: xmlbuilderLib.xmlbuilderMod.NodeType.Document with scala.Double = js.native
  /* 11 */ val DocumentFragment: xmlbuilderLib.xmlbuilderMod.NodeType.DocumentFragment with scala.Double = js.native
  /* 1 */ val Element: xmlbuilderLib.xmlbuilderMod.NodeType.Element with scala.Double = js.native
  /* 204 */ val ElementDeclaration: xmlbuilderLib.xmlbuilderMod.NodeType.ElementDeclaration with scala.Double = js.native
  /* 6 */ val EntityDeclaration: xmlbuilderLib.xmlbuilderMod.NodeType.EntityDeclaration with scala.Double = js.native
  /* 5 */ val EntityReference: xmlbuilderLib.xmlbuilderMod.NodeType.EntityReference with scala.Double = js.native
  /* 12 */ val NotationDeclaration: xmlbuilderLib.xmlbuilderMod.NodeType.NotationDeclaration with scala.Double = js.native
  /* 7 */ val ProcessingInstruction: xmlbuilderLib.xmlbuilderMod.NodeType.ProcessingInstruction with scala.Double = js.native
  /* 202 */ val Raw: xmlbuilderLib.xmlbuilderMod.NodeType.Raw with scala.Double = js.native
  /* 3 */ val Text: xmlbuilderLib.xmlbuilderMod.NodeType.Text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xmlbuilderLib.xmlbuilderMod.NodeType with scala.Double] = js.native
}

