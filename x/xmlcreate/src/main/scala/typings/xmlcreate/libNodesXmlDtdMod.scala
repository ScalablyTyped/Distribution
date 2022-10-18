package typings.xmlcreate

import typings.xmlcreate.libNodesXmlCommentMod.IXmlCommentOptions
import typings.xmlcreate.libNodesXmlDtdAttlistMod.IXmlDtdAttlistOptions
import typings.xmlcreate.libNodesXmlDtdElementMod.IXmlDtdElementOptions
import typings.xmlcreate.libNodesXmlDtdEntityMod.IXmlDtdEntityOptions
import typings.xmlcreate.libNodesXmlDtdNotationMod.IXmlDtdNotationOptions
import typings.xmlcreate.libNodesXmlDtdParamEntityRefMod.IXmlDtdParamEntityRefOptions
import typings.xmlcreate.libNodesXmlProcInstMod.IXmlProcInstOptions
import typings.xmlcreate.libOptionsMod.IStringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodesXmlDtdMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlDtd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xmlcreate/lib/nodes/XmlDtd", JSImport.Default)
  @js.native
  open class default[Parent] protected ()
    extends StObject
       with XmlDtd[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdOptions) = this()
  }
  
  inline def validatePubId(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePubId")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait IXmlDtdOptions extends StObject {
    
    /**
      * The name of the DTD.
      */
    var name: String
    
    /**
      * The public identifier of the DTD, excluding quotation marks. If a public
      * identifier is provided, a system identifier must be provided as well.
      * By default, no public identifier is included.
      */
    var pubId: js.UndefOr[String] = js.undefined
    
    /**
      * The system identifier of the DTD, excluding quotation marks. By default,
      * no system identifier is included.
      */
    var sysId: js.UndefOr[String] = js.undefined
  }
  object IXmlDtdOptions {
    
    inline def apply(name: String): IXmlDtdOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlDtdOptions]
    }
    
    extension [Self <: IXmlDtdOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPubId(value: String): Self = StObject.set(x, "pubId", value.asInstanceOf[js.Any])
      
      inline def setPubIdUndefined: Self = StObject.set(x, "pubId", js.undefined)
      
      inline def setSysId(value: String): Self = StObject.set(x, "sysId", value.asInstanceOf[js.Any])
      
      inline def setSysIdUndefined: Self = StObject.set(x, "sysId", js.undefined)
    }
  }
  
  @js.native
  trait XmlDtd[Parent] extends StObject {
    
    /* private */ val _children: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /* private */ val _parent: Any = js.native
    
    /* private */ var _pubId: Any = js.native
    
    /* private */ var _sysId: Any = js.native
    
    /* private */ val _validation: Any = js.native
    
    /**
      * Appends the XML string representation of a public or system identifier
      * to an existing string.
      */
    /* private */ var appendId: Any = js.native
    
    /**
      * Adds an attribute-list declaration to this document type declaration
      * and returns the new attribute-list declaration.
      */
    def attlist(options: IXmlDtdAttlistOptions): typings.xmlcreate.libNodesXmlDtdAttlistMod.default[this.type] = js.native
    
    /**
      * Adds a comment to this document type declaration and returns the
      * new comment.
      */
    def comment(options: IXmlCommentOptions): typings.xmlcreate.libNodesXmlCommentMod.default[this.type] = js.native
    
    /**
      * Adds an element declaration to this document type declaration
      * and returns the new element declaration.
      */
    def element(options: IXmlDtdElementOptions): typings.xmlcreate.libNodesXmlDtdElementMod.default[this.type] = js.native
    
    /**
      * Adds an entity declaration to this document type declaration
      * and returns the new entity declaration.
      */
    def entity(options: IXmlDtdEntityOptions): typings.xmlcreate.libNodesXmlDtdEntityMod.default[this.type] = js.native
    
    /**
      * Gets the name of the DTD.
      */
    def name: String = js.native
    /**
      * Sets the name of the DTD.
      */
    def name_=(name: String): Unit = js.native
    
    /**
      * Adds a notation declaration to this document type declaration
      * and returns the new notation declaration.
      */
    def notation(options: IXmlDtdNotationOptions): typings.xmlcreate.libNodesXmlDtdNotationMod.default[this.type] = js.native
    
    /**
      * Adds a parameter entity reference to this document type declaration
      * and returns the new parameter entity reference.
      */
    def paramEntityRef(options: IXmlDtdParamEntityRefOptions): typings.xmlcreate.libNodesXmlDtdParamEntityRefMod.default[this.type] = js.native
    
    /**
      * Adds a processing instruction to this document type declaration
      * and returns the new processing instruction.
      */
    def procInst(options: IXmlProcInstOptions): typings.xmlcreate.libNodesXmlProcInstMod.default[this.type] = js.native
    
    /**
      * Gets the public identifier of the DTD.
      */
    def pubId: js.UndefOr[String] = js.native
    /**
      * Sets the public identifier of the DTD.
      */
    def pubId_=(pubId: js.UndefOr[String]): Unit = js.native
    
    /**
      * Gets the system identifier of the DTD.
      */
    def sysId: js.UndefOr[String] = js.native
    /**
      * Sets the system identifier of the DTD.
      */
    def sysId_=(sysId: js.UndefOr[String]): Unit = js.native
    
    def toString(options: IStringOptions): String = js.native
    
    /**
      * Returns the parent of this attribute.
      */
    def up(): Parent = js.native
  }
}
