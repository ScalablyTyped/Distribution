package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlAttributeTextMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlAttributeText", JSImport.Default)
  @js.native
  class default[Parent] protected () extends XmlAttributeText[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlAttributeTextOptions) = this()
  }
  
  @js.native
  trait IXmlAttributeTextOptions extends StObject {
    
    /**
      * The attribute text.
      */
    var charData: String = js.native
    
    /**
      * Whether to replace any invalid characters in the attribute text with the
      * Unicode replacement character. By default, this is disabled.
      */
    var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.native
  }
  object IXmlAttributeTextOptions {
    
    @scala.inline
    def apply(charData: String): IXmlAttributeTextOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlAttributeTextOptions]
    }
    
    @scala.inline
    implicit class IXmlAttributeTextOptionsMutableBuilder[Self <: IXmlAttributeTextOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceInvalidCharsInCharData(value: Boolean): Self = StObject.set(x, "replaceInvalidCharsInCharData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceInvalidCharsInCharDataUndefined: Self = StObject.set(x, "replaceInvalidCharsInCharData", js.undefined)
    }
  }
  
  @js.native
  trait XmlAttributeText[Parent] extends StObject {
    
    var _charData: js.Any = js.native
    
    val _parent: js.Any = js.native
    
    val _replaceInvalidCharsInCharData: js.Any = js.native
    
    val _validation: js.Any = js.native
    
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
