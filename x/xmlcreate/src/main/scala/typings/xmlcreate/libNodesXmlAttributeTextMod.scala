package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodesXmlAttributeTextMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlAttributeText", JSImport.Default)
  @js.native
  open class default[Parent] protected ()
    extends StObject
       with XmlAttributeText[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeTextOptions) = this()
  }
  
  trait IXmlAttributeTextOptions extends StObject {
    
    /**
      * The attribute text.
      */
    var charData: String
    
    /**
      * Whether to replace any invalid characters in the attribute text with the
      * Unicode replacement character. By default, this is disabled.
      */
    var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.undefined
  }
  object IXmlAttributeTextOptions {
    
    inline def apply(charData: String): IXmlAttributeTextOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlAttributeTextOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IXmlAttributeTextOptions] (val x: Self) extends AnyVal {
      
      inline def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInCharData(value: Boolean): Self = StObject.set(x, "replaceInvalidCharsInCharData", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInCharDataUndefined: Self = StObject.set(x, "replaceInvalidCharsInCharData", js.undefined)
    }
  }
  
  @js.native
  trait XmlAttributeText[Parent] extends StObject {
    
    /* private */ var _charData: Any = js.native
    
    /* private */ val _parent: Any = js.native
    
    /* private */ val _replaceInvalidCharsInCharData: Any = js.native
    
    /* private */ val _validation: Any = js.native
    
    /**
      * Gets this attribute text.
      */
    def charData: String = js.native
    /**
      * Sets this attribute text.
      */
    def charData_=(charData: String): Unit = js.native
    
    /**
      * Returns the parent of this attribute text.
      */
    def up(): Parent = js.native
  }
}
