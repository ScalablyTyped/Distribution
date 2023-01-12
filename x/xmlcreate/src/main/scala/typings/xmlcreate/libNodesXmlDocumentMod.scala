package typings.xmlcreate

import typings.xmlcreate.libNodesXmlCommentMod.IXmlCommentOptions
import typings.xmlcreate.libNodesXmlDeclMod.IXmlDeclOptions
import typings.xmlcreate.libNodesXmlDtdMod.IXmlDtdOptions
import typings.xmlcreate.libNodesXmlElementMod.IXmlElementOptions
import typings.xmlcreate.libNodesXmlProcInstMod.IXmlProcInstOptions
import typings.xmlcreate.libOptionsMod.IStringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodesXmlDocumentMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IXmlDocumentOptions] (val x: Self) extends AnyVal {
      
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
    def comment(options: IXmlCommentOptions): typings.xmlcreate.libNodesXmlCommentMod.default[this.type] = js.native
    
    /**
      * Adds a declaration to this document and returns the new declaration.
      */
    def decl(): typings.xmlcreate.libNodesXmlDeclMod.default[this.type] = js.native
    def decl(options: IXmlDeclOptions): typings.xmlcreate.libNodesXmlDeclMod.default[this.type] = js.native
    
    /**
      * Adds a document type definition to this document and returns the new
      * document type definition.
      */
    def dtd(options: IXmlDtdOptions): typings.xmlcreate.libNodesXmlDtdMod.default[this.type] = js.native
    
    /**
      * Adds the root element to this document and returns the element.
      */
    def element(options: IXmlElementOptions): typings.xmlcreate.libNodesXmlElementMod.default[this.type] = js.native
    
    /**
      * Adds a processing instruction to this document and returns the new
      * processing instruction.
      */
    def procInst(options: IXmlProcInstOptions): typings.xmlcreate.libNodesXmlProcInstMod.default[this.type] = js.native
    
    def toString(options: IStringOptions): String = js.native
  }
}
