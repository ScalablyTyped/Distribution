package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodesXmlCdataMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlCdata", JSImport.Default)
  @js.native
  open class default[Parent] protected ()
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IXmlCdataOptions] (val x: Self) extends AnyVal {
      
      inline def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInCharData(value: Boolean): Self = StObject.set(x, "replaceInvalidCharsInCharData", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInCharDataUndefined: Self = StObject.set(x, "replaceInvalidCharsInCharData", js.undefined)
    }
  }
  
  @js.native
  trait XmlCdata[Parent] extends StObject {
    
    /* private */ var _charData: Any = js.native
    
    /* private */ val _parent: Any = js.native
    
    /* private */ val _replaceInvalidCharsInCharData: Any = js.native
    
    /* private */ val _validation: Any = js.native
    
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
