package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlCdataMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlCdata", JSImport.Default)
  @js.native
  class default[Parent] protected ()
    extends StObject
       with XmlCdata[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCdataOptions) = this()
  }
  
  trait IXmlCdataOptions extends StObject {
    
    /**
      * The character data of the CDATA section.
      */
    var charData: String
    
    /**
      * Whether to replace any invalid characters in the character data of the
      * CDATA section with the Unicode replacement character. By default, this
      * is disabled.
      */
    var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.undefined
  }
  object IXmlCdataOptions {
    
    inline def apply(charData: String): IXmlCdataOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlCdataOptions]
    }
    
    extension [Self <: IXmlCdataOptions](x: Self) {
      
      inline def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInCharData(value: Boolean): Self = StObject.set(x, "replaceInvalidCharsInCharData", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInCharDataUndefined: Self = StObject.set(x, "replaceInvalidCharsInCharData", js.undefined)
    }
  }
  
  @js.native
  trait XmlCdata[Parent] extends StObject {
    
    /* private */ var _charData: js.Any = js.native
    
    /* private */ val _parent: js.Any = js.native
    
    /* private */ val _replaceInvalidCharsInCharData: js.Any = js.native
    
    /* private */ val _validation: js.Any = js.native
    
    /**
      * Gets the character data of this CDATA section.
      */
    def charData: String = js.native
    /**
      * Sets the character data of this CDATA section.
      */
    def charData_=(charData: String): Unit = js.native
    
    /**
      * Returns the parent of this CDATA section.
      */
    def up(): Parent = js.native
  }
}
