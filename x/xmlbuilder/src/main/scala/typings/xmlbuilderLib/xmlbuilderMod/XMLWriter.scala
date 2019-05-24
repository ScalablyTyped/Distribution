package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a writer which outputs an XML document.
  */
trait XMLWriter extends js.Object {
  /** 
    * Writes an attribute. 
    * 
    * @param att - current attribute
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var attribute: js.UndefOr[
    js.Function3[/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
  /** 
    * Writes a CDATA node.
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var cdata: js.UndefOr[
    js.Function3[/* node */ XMLCData, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
  /** 
    * Called right before completing writing an attribute. This function 
    * does not produce any output, but can be used to alter the state of 
    * the writer. 
    * 
    * @param node - current attribute
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var closeAttribute: js.UndefOr[
    js.Function3[
      /* att */ XMLAttribute, 
      /* options */ WriterOptions, 
      /* level */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** 
    * Called right before completing writing a node. This function does not 
    * produce any output, but can be used to alter the state of the writer.
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var closeNode: js.UndefOr[
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ scala.Double, scala.Unit]
  ] = js.undefined
  /** 
    * Writes a comment node. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var comment: js.UndefOr[
    js.Function3[/* node */ XMLComment, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
  /** 
    * Writes the XML declaration (e.g. `<?xml version="1.0"?>`). 
    * 
    * @param node - XML declaration node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var declaration: js.UndefOr[
    js.Function3[/* node */ XMLDeclaration, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
  /** 
    * Writes the DocType node and its children. 
    * 
    * _Note:_ Be careful when overriding this function as this function
    * is also responsible for writing the internal subset of the DTD. 
    * 
    * @param node - DOCTYPE node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var docType: js.UndefOr[
    js.Function3[/* node */ XMLDocType, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
  /** 
    * Writes an attribute node (`!ATTLIST`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdAttList: js.UndefOr[
    js.Function3[/* node */ XMLDTDAttList, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
  /** 
    * Writes an element node (`!ELEMENT`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdElement: js.UndefOr[
    js.Function3[/* node */ XMLDTDElement, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
  /** 
    * Writes an entity node (`!ENTITY`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdEntity: js.UndefOr[
    js.Function3[/* node */ XMLDTDEntity, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
  /** 
    * Writes a notation node (`!NOTATION`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdNotation: js.UndefOr[
    js.Function3[/* node */ XMLDTDNotation, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
  /** 
    * Writes an element node. 
    * 
    * _Note:_ Be careful when overriding this function as this function
    * is also responsible for writing the element attributes and child 
    * nodes.
    * 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var element: js.UndefOr[
    js.Function3[/* node */ XMLElement, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
  /** 
    * Writes the newline string. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var endline: js.UndefOr[
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
  /** 
    * Writes the indentation string for the given level. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var indent: js.UndefOr[
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
  /** 
    * Called right after starting writing an attribute. This function does 
    * not produce any output, but can be used to alter the state of the 
    * writer. 
    * 
    * @param node - current attribute
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var openAttribute: js.UndefOr[
    js.Function3[
      /* att */ XMLAttribute, 
      /* options */ WriterOptions, 
      /* level */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  /** 
    * Called right after starting writing a node. This function does not 
    * produce any output, but can be used to alter the state of the writer. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var openNode: js.UndefOr[
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ scala.Double, scala.Unit]
  ] = js.undefined
  /** 
    * Writes a processing instruction node. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var processingInstruction: js.UndefOr[
    js.Function3[
      /* node */ XMLProcessingInstruction, 
      /* options */ WriterOptions, 
      /* level */ scala.Double, 
      _
    ]
  ] = js.undefined
  /** 
    * Writes a raw text node. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var raw: js.UndefOr[
    js.Function3[/* node */ XMLRaw, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
  /** 
    * Writes a text node. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var text: js.UndefOr[
    js.Function3[/* node */ XMLText, /* options */ WriterOptions, /* level */ scala.Double, _]
  ] = js.undefined
}

object XMLWriter {
  @scala.inline
  def apply(
    attribute: (/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    cdata: (/* node */ XMLCData, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    closeAttribute: (/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ scala.Double) => scala.Unit = null,
    closeNode: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ scala.Double) => scala.Unit = null,
    comment: (/* node */ XMLComment, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    declaration: (/* node */ XMLDeclaration, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    docType: (/* node */ XMLDocType, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    dtdAttList: (/* node */ XMLDTDAttList, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    dtdElement: (/* node */ XMLDTDElement, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    dtdEntity: (/* node */ XMLDTDEntity, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    dtdNotation: (/* node */ XMLDTDNotation, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    element: (/* node */ XMLElement, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    endline: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    indent: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    openAttribute: (/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ scala.Double) => scala.Unit = null,
    openNode: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ scala.Double) => scala.Unit = null,
    processingInstruction: (/* node */ XMLProcessingInstruction, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    raw: (/* node */ XMLRaw, /* options */ WriterOptions, /* level */ scala.Double) => _ = null,
    text: (/* node */ XMLText, /* options */ WriterOptions, /* level */ scala.Double) => _ = null
  ): XMLWriter = {
    val __obj = js.Dynamic.literal()
    if (attribute != null) __obj.updateDynamic("attribute")(js.Any.fromFunction3(attribute))
    if (cdata != null) __obj.updateDynamic("cdata")(js.Any.fromFunction3(cdata))
    if (closeAttribute != null) __obj.updateDynamic("closeAttribute")(js.Any.fromFunction3(closeAttribute))
    if (closeNode != null) __obj.updateDynamic("closeNode")(js.Any.fromFunction3(closeNode))
    if (comment != null) __obj.updateDynamic("comment")(js.Any.fromFunction3(comment))
    if (declaration != null) __obj.updateDynamic("declaration")(js.Any.fromFunction3(declaration))
    if (docType != null) __obj.updateDynamic("docType")(js.Any.fromFunction3(docType))
    if (dtdAttList != null) __obj.updateDynamic("dtdAttList")(js.Any.fromFunction3(dtdAttList))
    if (dtdElement != null) __obj.updateDynamic("dtdElement")(js.Any.fromFunction3(dtdElement))
    if (dtdEntity != null) __obj.updateDynamic("dtdEntity")(js.Any.fromFunction3(dtdEntity))
    if (dtdNotation != null) __obj.updateDynamic("dtdNotation")(js.Any.fromFunction3(dtdNotation))
    if (element != null) __obj.updateDynamic("element")(js.Any.fromFunction3(element))
    if (endline != null) __obj.updateDynamic("endline")(js.Any.fromFunction3(endline))
    if (indent != null) __obj.updateDynamic("indent")(js.Any.fromFunction3(indent))
    if (openAttribute != null) __obj.updateDynamic("openAttribute")(js.Any.fromFunction3(openAttribute))
    if (openNode != null) __obj.updateDynamic("openNode")(js.Any.fromFunction3(openNode))
    if (processingInstruction != null) __obj.updateDynamic("processingInstruction")(js.Any.fromFunction3(processingInstruction))
    if (raw != null) __obj.updateDynamic("raw")(js.Any.fromFunction3(raw))
    if (text != null) __obj.updateDynamic("text")(js.Any.fromFunction3(text))
    __obj.asInstanceOf[XMLWriter]
  }
}

