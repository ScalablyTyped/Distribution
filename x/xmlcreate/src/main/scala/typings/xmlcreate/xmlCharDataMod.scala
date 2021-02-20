package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlCharDataMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlCharData", JSImport.Default)
  @js.native
  class default[Parent] protected () extends XmlCharData[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCharDataOptions) = this()
  }
  
  @js.native
  trait IXmlCharDataOptions extends StObject {
    
    /**
      * The character data.
      */
    var charData: String = js.native
    
    /**
      * Whether to replace any invalid characters in the character data with the
      * Unicode replacement character. By default, this is disabled.
      */
    var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.native
  }
  object IXmlCharDataOptions {
    
    @scala.inline
    def apply(charData: String): IXmlCharDataOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlCharDataOptions]
    }
    
    @scala.inline
    implicit class IXmlCharDataOptionsMutableBuilder[Self <: IXmlCharDataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceInvalidCharsInCharData(value: Boolean): Self = StObject.set(x, "replaceInvalidCharsInCharData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceInvalidCharsInCharDataUndefined: Self = StObject.set(x, "replaceInvalidCharsInCharData", js.undefined)
    }
  }
  
  @js.native
  trait XmlCharData[Parent] extends StObject {
    
    var _charData: js.Any = js.native
    
    val _parent: js.Any = js.native
    
    val _replaceInvalidCharsInCharData: js.Any = js.native
    
    val _validation: js.Any = js.native
    
    /**
      * Gets the text of this character data.
      */
    def charData: String = js.native
    /**
      * Sets the text of this character data.
      */
    def charData_=(charData: String): Unit = js.native
    
    /**
      * Returns the parent of this character data.
      */
    def up(): Parent = js.native
  }
}
