package typings.xmlcreate

import typings.xmlcreate.optionsMod.IStringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlDeclMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlDecl", JSImport.Default)
  @js.native
  class default[Parent] protected () extends XmlDecl[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDeclOptions) = this()
  }
  
  @js.native
  trait IXmlDeclOptions extends StObject {
    
    /**
      * The encoding attribute to be included in the declaration. If defined,
      * this value must be a valid encoding. By default, no encoding attribute
      * is included.
      */
    var encoding: js.UndefOr[String] = js.native
    
    /**
      * The value of the standalone attribute to be included in the declaration.
      * If defined, this value must be "yes" or "no". By default, no standalone
      * attribute is included.
      */
    var standalone: js.UndefOr[String] = js.native
    
    /**
      * The XML version to be included in the declaration. If defined, this
      * value must be a valid XML version number. Defaults to "1.0".
      */
    var version: js.UndefOr[String] = js.native
  }
  object IXmlDeclOptions {
    
    @scala.inline
    def apply(): IXmlDeclOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IXmlDeclOptions]
    }
    
    @scala.inline
    implicit class IXmlDeclOptionsMutableBuilder[Self <: IXmlDeclOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setStandalone(value: String): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait XmlDecl[Parent] extends StObject {
    
    var _encoding: js.Any = js.native
    
    val _parent: js.Any = js.native
    
    var _standalone: js.Any = js.native
    
    val _validation: js.Any = js.native
    
    var _version: js.Any = js.native
    
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
