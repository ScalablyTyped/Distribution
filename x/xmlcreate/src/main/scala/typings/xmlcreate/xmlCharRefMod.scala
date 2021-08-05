package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlCharRefMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlCharRef", JSImport.Default)
  @js.native
  class default[Parent] protected ()
    extends StObject
       with XmlCharRef[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCharRefOptions) = this()
  }
  
  trait IXmlCharRefOptions extends StObject {
    
    /**
      * The character to represent using the reference.
      */
    var char: String
    
    /**
      * Whether to use the hexadecimal or decimal representation for the
      * reference. Defaults to false.
      */
    var hex: js.UndefOr[Boolean] = js.undefined
  }
  object IXmlCharRefOptions {
    
    inline def apply(char: String): IXmlCharRefOptions = {
      val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlCharRefOptions]
    }
    
    extension [Self <: IXmlCharRefOptions](x: Self) {
      
      inline def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setHex(value: Boolean): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
    }
  }
  
  @js.native
  trait XmlCharRef[Parent] extends StObject {
    
    /* private */ var _char: js.Any = js.native
    
    /* private */ var _hex: js.Any = js.native
    
    /* private */ val _parent: js.Any = js.native
    
    /* private */ val _validation: js.Any = js.native
    
    /**
      * Gets the character of this character reference.
      */
    def char: String = js.native
    /**
      * Sets the character of this character reference.
      */
    def char_=(char: String): Unit = js.native
    
    /**
      * Gets whether the decimal or hexadecimal representation should be used
      * for this character reference.
      */
    def hex: Boolean = js.native
    /**
      * Sets whether the decimal or hexadecimal representation should be used
      * for this character reference.
      */
    def hex_=(hex: Boolean): Unit = js.native
    
    /**
      * Returns the parent of this character reference.
      */
    def up(): Parent = js.native
  }
}
