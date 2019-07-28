package typings.xmlbuilder.xmlbuilderMod

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
  sealed trait Attribute extends NodeType
  
  /**
    * An attribute declaraiton node inside DocType
    */
  @js.native
  sealed trait AttributeDeclaration extends NodeType
  
  /**
    * A CDATA node
    */
  @js.native
  sealed trait CData extends NodeType
  
  /**
    * A comment node
    */
  @js.native
  sealed trait Comment extends NodeType
  
  /**
    * An XML declaration node
    */
  @js.native
  sealed trait Declaration extends NodeType
  
  /**
    * A Doctype node
    */
  @js.native
  sealed trait DocType extends NodeType
  
  /**
    * A document node
    */
  @js.native
  sealed trait Document extends NodeType
  
  /**
    * A document fragment node
    */
  @js.native
  sealed trait DocumentFragment extends NodeType
  
  /**
    * An element node
    */
  @js.native
  sealed trait Element extends NodeType
  
  /**
    * An element declaration node inside DocType
    */
  @js.native
  sealed trait ElementDeclaration extends NodeType
  
  /**
    * An entity declaration node inside DocType
    */
  @js.native
  sealed trait EntityDeclaration extends NodeType
  
  /**
    * An entity reference node inside DocType
    */
  @js.native
  sealed trait EntityReference extends NodeType
  
  /**
    * A notation declaration node inside DocType
    */
  @js.native
  sealed trait NotationDeclaration extends NodeType
  
  /**
    * A processing instruction node
    */
  @js.native
  sealed trait ProcessingInstruction extends NodeType
  
  /**
    * A raw text node
    */
  @js.native
  sealed trait Raw extends NodeType
  
  /**
    * A text node
    */
  @js.native
  sealed trait Text extends NodeType
  
  /* 2 */ val Attribute: typings.xmlbuilder.xmlbuilderMod.NodeType.Attribute with Double = js.native
  /* 203 */ val AttributeDeclaration: typings.xmlbuilder.xmlbuilderMod.NodeType.AttributeDeclaration with Double = js.native
  /* 4 */ val CData: typings.xmlbuilder.xmlbuilderMod.NodeType.CData with Double = js.native
  /* 8 */ val Comment: typings.xmlbuilder.xmlbuilderMod.NodeType.Comment with Double = js.native
  /* 201 */ val Declaration: typings.xmlbuilder.xmlbuilderMod.NodeType.Declaration with Double = js.native
  /* 10 */ val DocType: typings.xmlbuilder.xmlbuilderMod.NodeType.DocType with Double = js.native
  /* 9 */ val Document: typings.xmlbuilder.xmlbuilderMod.NodeType.Document with Double = js.native
  /* 11 */ val DocumentFragment: typings.xmlbuilder.xmlbuilderMod.NodeType.DocumentFragment with Double = js.native
  /* 1 */ val Element: typings.xmlbuilder.xmlbuilderMod.NodeType.Element with Double = js.native
  /* 204 */ val ElementDeclaration: typings.xmlbuilder.xmlbuilderMod.NodeType.ElementDeclaration with Double = js.native
  /* 6 */ val EntityDeclaration: typings.xmlbuilder.xmlbuilderMod.NodeType.EntityDeclaration with Double = js.native
  /* 5 */ val EntityReference: typings.xmlbuilder.xmlbuilderMod.NodeType.EntityReference with Double = js.native
  /* 12 */ val NotationDeclaration: typings.xmlbuilder.xmlbuilderMod.NodeType.NotationDeclaration with Double = js.native
  /* 7 */ val ProcessingInstruction: typings.xmlbuilder.xmlbuilderMod.NodeType.ProcessingInstruction with Double = js.native
  /* 202 */ val Raw: typings.xmlbuilder.xmlbuilderMod.NodeType.Raw with Double = js.native
  /* 3 */ val Text: typings.xmlbuilder.xmlbuilderMod.NodeType.Text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
}

/**
  * Defines the type of a node in the XML document.
  */
@JSImport("xmlbuilder", "nodeType")
@js.native
object nodeType extends js.Object {
  /* 2 */ val Attribute: typings.xmlbuilder.xmlbuilderMod.NodeType.Attribute with Double = js.native
  /* 203 */ val AttributeDeclaration: typings.xmlbuilder.xmlbuilderMod.NodeType.AttributeDeclaration with Double = js.native
  /* 4 */ val CData: typings.xmlbuilder.xmlbuilderMod.NodeType.CData with Double = js.native
  /* 8 */ val Comment: typings.xmlbuilder.xmlbuilderMod.NodeType.Comment with Double = js.native
  /* 201 */ val Declaration: typings.xmlbuilder.xmlbuilderMod.NodeType.Declaration with Double = js.native
  /* 10 */ val DocType: typings.xmlbuilder.xmlbuilderMod.NodeType.DocType with Double = js.native
  /* 9 */ val Document: typings.xmlbuilder.xmlbuilderMod.NodeType.Document with Double = js.native
  /* 11 */ val DocumentFragment: typings.xmlbuilder.xmlbuilderMod.NodeType.DocumentFragment with Double = js.native
  /* 1 */ val Element: typings.xmlbuilder.xmlbuilderMod.NodeType.Element with Double = js.native
  /* 204 */ val ElementDeclaration: typings.xmlbuilder.xmlbuilderMod.NodeType.ElementDeclaration with Double = js.native
  /* 6 */ val EntityDeclaration: typings.xmlbuilder.xmlbuilderMod.NodeType.EntityDeclaration with Double = js.native
  /* 5 */ val EntityReference: typings.xmlbuilder.xmlbuilderMod.NodeType.EntityReference with Double = js.native
  /* 12 */ val NotationDeclaration: typings.xmlbuilder.xmlbuilderMod.NodeType.NotationDeclaration with Double = js.native
  /* 7 */ val ProcessingInstruction: typings.xmlbuilder.xmlbuilderMod.NodeType.ProcessingInstruction with Double = js.native
  /* 202 */ val Raw: typings.xmlbuilder.xmlbuilderMod.NodeType.Raw with Double = js.native
  /* 3 */ val Text: typings.xmlbuilder.xmlbuilderMod.NodeType.Text with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeType with Double] = js.native
}

