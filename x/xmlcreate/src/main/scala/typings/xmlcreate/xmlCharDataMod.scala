package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlCharDataMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlCharData", JSImport.Default)
  @js.native
  open class default[Parent] protected ()
    extends StObject
       with XmlCharData[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCharDataOptions) = this()
  }
  
  trait IXmlCharDataOptions extends StObject {
    
    /**
      * The character data.
      */
    var charData: String
    
    /**
      * Whether to replace any invalid characters in the character data with the
      * Unicode replacement character. By default, this is disabled.
      */
    var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.undefined
  }
  object IXmlCharDataOptions {
    
    inline def apply(charData: String): IXmlCharDataOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlCharDataOptions]
    }
    
    extension [Self <: IXmlCharDataOptions](x: Self) {
      
      inline def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInCharData(value: Boolean): Self = StObject.set(x, "replaceInvalidCharsInCharData", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInCharDataUndefined: Self = StObject.set(x, "replaceInvalidCharsInCharData", js.undefined)
    }
  }
  
  @js.native
  trait XmlCharData[Parent] extends StObject {
    
    /* private */ var _charData: Any = js.native
    
    /* private */ val _parent: Any = js.native
    
    /* private */ val _replaceInvalidCharsInCharData: Any = js.native
    
    /* private */ val _validation: Any = js.native
    
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
