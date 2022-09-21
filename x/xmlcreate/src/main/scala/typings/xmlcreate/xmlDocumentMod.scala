package typings.xmlcreate

import typings.xmlcreate.optionsMod.IStringOptions
import typings.xmlcreate.xmlCommentMod.IXmlCommentOptions
import typings.xmlcreate.xmlDeclMod.IXmlDeclOptions
import typings.xmlcreate.xmlDtdMod.IXmlDtdOptions
import typings.xmlcreate.xmlElementMod.IXmlElementOptions
import typings.xmlcreate.xmlProcInstMod.IXmlProcInstOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlDocumentMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlDocument", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with XmlDocument {
    def this(options: IXmlDocumentOptions) = this()
  }
  
  trait IXmlDocumentOptions extends StObject {
    
    /**
      * Whether to throw an exception if basic XML validation fails while
      * building the document.
      */
    var validation: js.UndefOr[Boolean] = js.undefined
  }
  object IXmlDocumentOptions {
    
    inline def apply(): IXmlDocumentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IXmlDocumentOptions]
    }
    
    extension [Self <: IXmlDocumentOptions](x: Self) {
      
      inline def setValidation(value: Boolean): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
      
      inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
    }
  }
  
  @js.native
  trait XmlDocument extends StObject {
    
    /* private */ val _children: Any = js.native
    
    /* private */ val _validation: Any = js.native
    
    /**
      * Adds a comment to this document and returns the new comment.
      */
    def comment(options: IXmlCommentOptions): typings.xmlcreate.xmlCommentMod.default[this.type] = js.native
    
    /**
      * Adds a declaration to this document and returns the new declaration.
      */
    def decl(): typings.xmlcreate.xmlDeclMod.default[this.type] = js.native
    def decl(options: IXmlDeclOptions): typings.xmlcreate.xmlDeclMod.default[this.type] = js.native
    
    /**
      * Adds a document type definition to this document and returns the new
      * document type definition.
      */
    def dtd(options: IXmlDtdOptions): typings.xmlcreate.xmlDtdMod.default[this.type] = js.native
    
    /**
      * Adds the root element to this document and returns the element.
      */
    def element(options: IXmlElementOptions): typings.xmlcreate.xmlElementMod.default[this.type] = js.native
    
    /**
      * Adds a processing instruction to this document and returns the new
      * processing instruction.
      */
    def procInst(options: IXmlProcInstOptions): typings.xmlcreate.xmlProcInstMod.default[this.type] = js.native
    
    def toString(options: IStringOptions): String = js.native
  }
}
