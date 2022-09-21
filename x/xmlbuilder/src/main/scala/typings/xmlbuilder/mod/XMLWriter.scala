package typings.xmlbuilder.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a writer which outputs an XML document.
  */
trait XMLWriter extends StObject {
  
  /** 
    * Writes an attribute. 
    * 
    * @param att - current attribute
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var attribute: js.UndefOr[
    js.Function3[/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double, Any]
  ] = js.undefined
  
  /** 
    * Writes a CDATA node.
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var cdata: js.UndefOr[
    js.Function3[/* node */ XMLCData, /* options */ WriterOptions, /* level */ Double, Any]
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
    js.Function3[/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double, Unit]
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
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double, Unit]
  ] = js.undefined
  
  /** 
    * Writes a comment node. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var comment: js.UndefOr[
    js.Function3[/* node */ XMLComment, /* options */ WriterOptions, /* level */ Double, Any]
  ] = js.undefined
  
  /** 
    * Writes the XML declaration (e.g. `<?xml version="1.0"?>`). 
    * 
    * @param node - XML declaration node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var declaration: js.UndefOr[
    js.Function3[/* node */ XMLDeclaration, /* options */ WriterOptions, /* level */ Double, Any]
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
    js.Function3[/* node */ XMLDocType, /* options */ WriterOptions, /* level */ Double, Any]
  ] = js.undefined
  
  /** 
    * Writes an attribute node (`!ATTLIST`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdAttList: js.UndefOr[
    js.Function3[/* node */ XMLDTDAttList, /* options */ WriterOptions, /* level */ Double, Any]
  ] = js.undefined
  
  /** 
    * Writes an element node (`!ELEMENT`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdElement: js.UndefOr[
    js.Function3[/* node */ XMLDTDElement, /* options */ WriterOptions, /* level */ Double, Any]
  ] = js.undefined
  
  /** 
    * Writes an entity node (`!ENTITY`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdEntity: js.UndefOr[
    js.Function3[/* node */ XMLDTDEntity, /* options */ WriterOptions, /* level */ Double, Any]
  ] = js.undefined
  
  /** 
    * Writes a notation node (`!NOTATION`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdNotation: js.UndefOr[
    js.Function3[/* node */ XMLDTDNotation, /* options */ WriterOptions, /* level */ Double, Any]
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
    js.Function3[/* node */ XMLElement, /* options */ WriterOptions, /* level */ Double, Any]
  ] = js.undefined
  
  /** 
    * Writes the newline string. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var endline: js.UndefOr[
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double, Any]
  ] = js.undefined
  
  /** 
    * Writes the indentation string for the given level. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var indent: js.UndefOr[
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double, Any]
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
    js.Function3[/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double, Unit]
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
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double, Unit]
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
      /* level */ Double, 
      Any
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
    js.Function3[/* node */ XMLRaw, /* options */ WriterOptions, /* level */ Double, Any]
  ] = js.undefined
  
  /** 
    * Writes a text node. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var text: js.UndefOr[
    js.Function3[/* node */ XMLText, /* options */ WriterOptions, /* level */ Double, Any]
  ] = js.undefined
}
object XMLWriter {
  
  inline def apply(): XMLWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLWriter]
  }
  
  extension [Self <: XMLWriter](x: Self) {
    
    inline def setAttribute(value: (/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "attribute", js.Any.fromFunction3(value))
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setCdata(value: (/* node */ XMLCData, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "cdata", js.Any.fromFunction3(value))
    
    inline def setCdataUndefined: Self = StObject.set(x, "cdata", js.undefined)
    
    inline def setCloseAttribute(value: (/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double) => Unit): Self = StObject.set(x, "closeAttribute", js.Any.fromFunction3(value))
    
    inline def setCloseAttributeUndefined: Self = StObject.set(x, "closeAttribute", js.undefined)
    
    inline def setCloseNode(value: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double) => Unit): Self = StObject.set(x, "closeNode", js.Any.fromFunction3(value))
    
    inline def setCloseNodeUndefined: Self = StObject.set(x, "closeNode", js.undefined)
    
    inline def setComment(value: (/* node */ XMLComment, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "comment", js.Any.fromFunction3(value))
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDeclaration(value: (/* node */ XMLDeclaration, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "declaration", js.Any.fromFunction3(value))
    
    inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
    
    inline def setDocType(value: (/* node */ XMLDocType, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "docType", js.Any.fromFunction3(value))
    
    inline def setDocTypeUndefined: Self = StObject.set(x, "docType", js.undefined)
    
    inline def setDtdAttList(value: (/* node */ XMLDTDAttList, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "dtdAttList", js.Any.fromFunction3(value))
    
    inline def setDtdAttListUndefined: Self = StObject.set(x, "dtdAttList", js.undefined)
    
    inline def setDtdElement(value: (/* node */ XMLDTDElement, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "dtdElement", js.Any.fromFunction3(value))
    
    inline def setDtdElementUndefined: Self = StObject.set(x, "dtdElement", js.undefined)
    
    inline def setDtdEntity(value: (/* node */ XMLDTDEntity, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "dtdEntity", js.Any.fromFunction3(value))
    
    inline def setDtdEntityUndefined: Self = StObject.set(x, "dtdEntity", js.undefined)
    
    inline def setDtdNotation(value: (/* node */ XMLDTDNotation, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "dtdNotation", js.Any.fromFunction3(value))
    
    inline def setDtdNotationUndefined: Self = StObject.set(x, "dtdNotation", js.undefined)
    
    inline def setElement(value: (/* node */ XMLElement, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "element", js.Any.fromFunction3(value))
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEndline(value: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "endline", js.Any.fromFunction3(value))
    
    inline def setEndlineUndefined: Self = StObject.set(x, "endline", js.undefined)
    
    inline def setIndent(value: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "indent", js.Any.fromFunction3(value))
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    inline def setOpenAttribute(value: (/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double) => Unit): Self = StObject.set(x, "openAttribute", js.Any.fromFunction3(value))
    
    inline def setOpenAttributeUndefined: Self = StObject.set(x, "openAttribute", js.undefined)
    
    inline def setOpenNode(value: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double) => Unit): Self = StObject.set(x, "openNode", js.Any.fromFunction3(value))
    
    inline def setOpenNodeUndefined: Self = StObject.set(x, "openNode", js.undefined)
    
    inline def setProcessingInstruction(
      value: (/* node */ XMLProcessingInstruction, /* options */ WriterOptions, /* level */ Double) => Any
    ): Self = StObject.set(x, "processingInstruction", js.Any.fromFunction3(value))
    
    inline def setProcessingInstructionUndefined: Self = StObject.set(x, "processingInstruction", js.undefined)
    
    inline def setRaw(value: (/* node */ XMLRaw, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "raw", js.Any.fromFunction3(value))
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setText(value: (/* node */ XMLText, /* options */ WriterOptions, /* level */ Double) => Any): Self = StObject.set(x, "text", js.Any.fromFunction3(value))
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
