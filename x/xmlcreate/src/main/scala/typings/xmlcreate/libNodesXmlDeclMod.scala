package typings.xmlcreate

import typings.xmlcreate.libOptionsMod.IStringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodesXmlDeclMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlDecl", JSImport.Default)
  @js.native
  open class default[Parent] protected ()
    extends StObject
       with XmlDecl[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDeclOptions) = this()
  }
  
  trait IXmlDeclOptions extends StObject {
    
    /**
      * The encoding attribute to be included in the declaration. If defined,
      * this value must be a valid encoding. By default, no encoding attribute
      * is included.
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * The value of the standalone attribute to be included in the declaration.
      * If defined, this value must be "yes" or "no". By default, no standalone
      * attribute is included.
      */
    var standalone: js.UndefOr[String] = js.undefined
    
    /**
      * The XML version to be included in the declaration. If defined, this
      * value must be a valid XML version number. Defaults to "1.0".
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object IXmlDeclOptions {
    
    inline def apply(): IXmlDeclOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IXmlDeclOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IXmlDeclOptions] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setStandalone(value: String): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait XmlDecl[Parent] extends StObject {
    
    /* private */ var _encoding: Any = js.native
    
    /* private */ val _parent: Any = js.native
    
    /* private */ var _standalone: Any = js.native
    
    /* private */ val _validation: Any = js.native
    
    /* private */ var _version: Any = js.native
    
    /**
      * Gets the encoding associated with this declaration.
      */
    def encoding: js.UndefOr[String] = js.native
    /**
      * Sets the encoding associated with this declaration.
      */
    def encoding_=(encoding: js.UndefOr[String]): Unit = js.native
    
    /**
      * Gets the value of the standalone attribute associated with this
      * declaration.
      */
    def standalone: js.UndefOr[String] = js.native
    /**
      * Sets the value of the standalone attribute associated with this
      * declaration.
      */
    def standalone_=(standalone: js.UndefOr[String]): Unit = js.native
    
    def toString(options: IStringOptions): String = js.native
    
    /**
      * Returns the parent of this declaration.
      */
    def up(): Parent = js.native
    
    /**
      * Gets the XML version associated with this declaration.
      */
    def version: String = js.native
    /**
      * Sets the XML version associated with this declaration.
      */
    def version_=(version: String): Unit = js.native
  }
}
