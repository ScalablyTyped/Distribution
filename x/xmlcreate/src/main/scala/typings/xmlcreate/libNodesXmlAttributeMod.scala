package typings.xmlcreate

import typings.xmlcreate.libNodesXmlAttributeTextMod.IXmlAttributeTextOptions
import typings.xmlcreate.libNodesXmlCharRefMod.IXmlCharRefOptions
import typings.xmlcreate.libNodesXmlEntityRefMod.IXmlEntityRefOptions
import typings.xmlcreate.libOptionsMod.IStringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodesXmlAttributeMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlAttribute", JSImport.Default)
  @js.native
  open class default[Parent] protected ()
    extends StObject
       with XmlAttribute[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeOptions) = this()
  }
  
  trait IXmlAttributeOptions extends StObject {
    
    /**
      * The name of the attribute.
      */
    var name: String
    
    /**
      * Whether to replace any invalid characters in the name of the attribute
      * with the Unicode replacement character. By default, this is disabled.
      */
    var replaceInvalidCharsInName: js.UndefOr[Boolean] = js.undefined
  }
  object IXmlAttributeOptions {
    
    inline def apply(name: String): IXmlAttributeOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlAttributeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IXmlAttributeOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInName(value: Boolean): Self = StObject.set(x, "replaceInvalidCharsInName", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInNameUndefined: Self = StObject.set(x, "replaceInvalidCharsInName", js.undefined)
    }
  }
  
  @js.native
  trait XmlAttribute[Parent] extends StObject {
    
    /* private */ val _children: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /* private */ val _parent: Any = js.native
    
    /* private */ val _replaceInvalidCharsInName: Any = js.native
    
    /* private */ val _validation: Any = js.native
    
    /**
      * Adds a character reference to this attribute and returns the new
      * character reference.
      */
    def charRef(options: IXmlCharRefOptions): typings.xmlcreate.libNodesXmlCharRefMod.default[this.type] = js.native
    
    /**
      * Adds an entity reference to this attribute and returns the new entity
      * reference.
      */
    def entityRef(options: IXmlEntityRefOptions): typings.xmlcreate.libNodesXmlEntityRefMod.default[this.type] = js.native
    
    /**
      * Gets the name of this attribute.
      */
    def name: String = js.native
    /**
      * Sets the name of this attribute.
      */
    def name_=(name: String): Unit = js.native
    
    /**
      * Adds attribute text to this attribute and returns the new text.
      */
    def text(options: IXmlAttributeTextOptions): typings.xmlcreate.libNodesXmlAttributeTextMod.default[this.type] = js.native
    
    def toString(options: IStringOptions): String = js.native
    
    /**
      * Returns the parent of this attribute.
      */
    def up(): Parent = js.native
  }
}
