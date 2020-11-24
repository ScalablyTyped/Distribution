package typings.xmlbuilder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a writer which outputs an XML document.
  */
@js.native
trait XMLWriter extends js.Object {
  
  /** 
    * Writes an attribute. 
    * 
    * @param att - current attribute
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var attribute: js.UndefOr[
    js.Function3[/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  
  /** 
    * Writes a CDATA node.
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var cdata: js.UndefOr[
    js.Function3[/* node */ XMLCData, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
  /** 
    * Writes a comment node. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var comment: js.UndefOr[
    js.Function3[/* node */ XMLComment, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  
  /** 
    * Writes the XML declaration (e.g. `<?xml version="1.0"?>`). 
    * 
    * @param node - XML declaration node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var declaration: js.UndefOr[
    js.Function3[/* node */ XMLDeclaration, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  
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
    js.Function3[/* node */ XMLDocType, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  
  /** 
    * Writes an attribute node (`!ATTLIST`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdAttList: js.UndefOr[
    js.Function3[/* node */ XMLDTDAttList, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  
  /** 
    * Writes an element node (`!ELEMENT`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdElement: js.UndefOr[
    js.Function3[/* node */ XMLDTDElement, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  
  /** 
    * Writes an entity node (`!ENTITY`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdEntity: js.UndefOr[
    js.Function3[/* node */ XMLDTDEntity, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  
  /** 
    * Writes a notation node (`!NOTATION`) inside the DTD. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var dtdNotation: js.UndefOr[
    js.Function3[/* node */ XMLDTDNotation, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  
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
    js.Function3[/* node */ XMLElement, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  
  /** 
    * Writes the newline string. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var endline: js.UndefOr[
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  
  /** 
    * Writes the indentation string for the given level. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var indent: js.UndefOr[
    js.Function3[/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  
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
  ] = js.native
  
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
  ] = js.native
  
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
      _
    ]
  ] = js.native
  
  /** 
    * Writes a raw text node. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var raw: js.UndefOr[
    js.Function3[/* node */ XMLRaw, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
  
  /** 
    * Writes a text node. 
    * 
    * @param node - current node
    * @param options - writer options and state information
    * @param level - current depth of the XML tree
    */
  var text: js.UndefOr[
    js.Function3[/* node */ XMLText, /* options */ WriterOptions, /* level */ Double, _]
  ] = js.native
}
object XMLWriter {
  
  @scala.inline
  def apply(): XMLWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XMLWriter]
  }
  
  @scala.inline
  implicit class XMLWriterOps[Self <: XMLWriter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttribute(value: (/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("attribute", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    
    @scala.inline
    def setCdata(value: (/* node */ XMLCData, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("cdata", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCdata: Self = this.set("cdata", js.undefined)
    
    @scala.inline
    def setCloseAttribute(value: (/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double) => Unit): Self = this.set("closeAttribute", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCloseAttribute: Self = this.set("closeAttribute", js.undefined)
    
    @scala.inline
    def setCloseNode(value: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double) => Unit): Self = this.set("closeNode", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCloseNode: Self = this.set("closeNode", js.undefined)
    
    @scala.inline
    def setComment(value: (/* node */ XMLComment, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("comment", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setDeclaration(value: (/* node */ XMLDeclaration, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("declaration", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDeclaration: Self = this.set("declaration", js.undefined)
    
    @scala.inline
    def setDocType(value: (/* node */ XMLDocType, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("docType", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDocType: Self = this.set("docType", js.undefined)
    
    @scala.inline
    def setDtdAttList(value: (/* node */ XMLDTDAttList, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("dtdAttList", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDtdAttList: Self = this.set("dtdAttList", js.undefined)
    
    @scala.inline
    def setDtdElement(value: (/* node */ XMLDTDElement, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("dtdElement", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDtdElement: Self = this.set("dtdElement", js.undefined)
    
    @scala.inline
    def setDtdEntity(value: (/* node */ XMLDTDEntity, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("dtdEntity", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDtdEntity: Self = this.set("dtdEntity", js.undefined)
    
    @scala.inline
    def setDtdNotation(value: (/* node */ XMLDTDNotation, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("dtdNotation", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteDtdNotation: Self = this.set("dtdNotation", js.undefined)
    
    @scala.inline
    def setElement(value: (/* node */ XMLElement, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("element", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setEndline(value: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("endline", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteEndline: Self = this.set("endline", js.undefined)
    
    @scala.inline
    def setIndent(value: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("indent", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setOpenAttribute(value: (/* att */ XMLAttribute, /* options */ WriterOptions, /* level */ Double) => Unit): Self = this.set("openAttribute", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOpenAttribute: Self = this.set("openAttribute", js.undefined)
    
    @scala.inline
    def setOpenNode(value: (/* node */ XMLNode, /* options */ WriterOptions, /* level */ Double) => Unit): Self = this.set("openNode", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOpenNode: Self = this.set("openNode", js.undefined)
    
    @scala.inline
    def setProcessingInstruction(value: (/* node */ XMLProcessingInstruction, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("processingInstruction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteProcessingInstruction: Self = this.set("processingInstruction", js.undefined)
    
    @scala.inline
    def setRaw(value: (/* node */ XMLRaw, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("raw", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setText(value: (/* node */ XMLText, /* options */ WriterOptions, /* level */ Double) => _): Self = this.set("text", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
