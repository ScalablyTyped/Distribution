package typings.xmlcreate

import typings.xmlcreate.libNodesXmlAttributeMod.IXmlAttributeOptions
import typings.xmlcreate.libNodesXmlCdataMod.IXmlCdataOptions
import typings.xmlcreate.libNodesXmlCharDataMod.IXmlCharDataOptions
import typings.xmlcreate.libNodesXmlCharRefMod.IXmlCharRefOptions
import typings.xmlcreate.libNodesXmlCommentMod.IXmlCommentOptions
import typings.xmlcreate.libNodesXmlEntityRefMod.IXmlEntityRefOptions
import typings.xmlcreate.libNodesXmlProcInstMod.IXmlProcInstOptions
import typings.xmlcreate.libOptionsMod.IStringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodesXmlElementMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlElement", JSImport.Default)
  @js.native
  open class default[Parent] protected ()
    extends StObject
       with XmlElement[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlElementOptions) = this()
  }
  
  trait IXmlElementOptions extends StObject {
    
    /**
      * The name of the element.
      */
    var name: String
    
    /**
      * Whether to replace any invalid characters in the name of the element
      * with the Unicode replacement character. By default, this is disabled.
      */
    var replaceInvalidCharsInName: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to use a self-closing tag if this element is empty.
      *
      * For example, use:
      * ```xml
      * <element/>
      * ```
      * instead of:
      * ```xml
      * <element></element>
      * ```
      *
      * By default, this is enabled.
      */
    var useSelfClosingTagIfEmpty: js.UndefOr[Boolean] = js.undefined
  }
  object IXmlElementOptions {
    
    inline def apply(name: String): IXmlElementOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlElementOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IXmlElementOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInName(value: Boolean): Self = StObject.set(x, "replaceInvalidCharsInName", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInNameUndefined: Self = StObject.set(x, "replaceInvalidCharsInName", js.undefined)
      
      inline def setUseSelfClosingTagIfEmpty(value: Boolean): Self = StObject.set(x, "useSelfClosingTagIfEmpty", value.asInstanceOf[js.Any])
      
      inline def setUseSelfClosingTagIfEmptyUndefined: Self = StObject.set(x, "useSelfClosingTagIfEmpty", js.undefined)
    }
  }
  
  @js.native
  trait XmlElement[Parent] extends StObject {
    
    /* private */ val _attributeNames: Any = js.native
    
    /* private */ val _children: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    /* private */ val _parent: Any = js.native
    
    /* private */ val _replaceInvalidCharsInName: Any = js.native
    
    /* private */ val _useSelfClosingTagIfEmpty: Any = js.native
    
    /* private */ val _validation: Any = js.native
    
    /**
      * Returns true if the specified nodes are all character references,
      * entity references, or character data.
      */
    /* private */ var allSameLineNodes: Any = js.native
    
    /**
      * Adds an attribute to this element and returns the new attribute.
      */
    def attribute(options: IXmlAttributeOptions): typings.xmlcreate.libNodesXmlAttributeMod.default[this.type] = js.native
    
    /**
      * Adds a CDATA section to this element and returns the new CDATA section.
      */
    def cdata(options: IXmlCdataOptions): typings.xmlcreate.libNodesXmlCdataMod.default[this.type] = js.native
    
    /**
      * Adds character data to this element and returns the new character data.
      */
    def charData(options: IXmlCharDataOptions): typings.xmlcreate.libNodesXmlCharDataMod.default[this.type] = js.native
    
    /**
      * Adds a character reference to this element and returns the new
      * character reference.
      */
    def charRef(options: IXmlCharRefOptions): typings.xmlcreate.libNodesXmlCharRefMod.default[this.type] = js.native
    
    /**
      * Adds a comment to this element and returns the new comment.
      */
    def comment(options: IXmlCommentOptions): typings.xmlcreate.libNodesXmlCommentMod.default[this.type] = js.native
    
    /**
      * Adds an element to this element and returns the new element.
      */
    def element(options: IXmlElementOptions): XmlElement[this.type] = js.native
    
    /**
      * Adds an entity reference to this element and returns the new entity
      * reference.
      */
    def entityRef(options: IXmlEntityRefOptions): typings.xmlcreate.libNodesXmlEntityRefMod.default[this.type] = js.native
    
    /**
      * Gets the name of this element.
      */
    def name: String = js.native
    /**
      * Sets the name of this element.
      */
    def name_=(name: String): Unit = js.native
    
    /**
      * Returns true if the specified nodes are all character references,
      * entity references, or character data.
      */
    /* private */ var onSameLine: Any = js.native
    
    /**
      * Adds a processing instruction to this element and returns the new
      * processing instruction.
      */
    def procInst(options: IXmlProcInstOptions): typings.xmlcreate.libNodesXmlProcInstMod.default[this.type] = js.native
    
    def toString(options: IStringOptions): String = js.native
    
    /**
      * Returns an XML string representation of this element using the specified
      * options and initial indent.
      */
    /* private */ var toStringWithIndent: Any = js.native
    
    /**
      * Returns the parent of this element.
      */
    def up(): Parent = js.native
  }
}
