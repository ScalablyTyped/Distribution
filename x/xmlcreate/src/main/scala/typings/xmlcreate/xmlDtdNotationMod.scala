package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlDtdNotationMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlDtdNotation", JSImport.Default)
  @js.native
  class default[Parent] protected ()
    extends StObject
       with XmlDtdNotation[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdNotationOptions) = this()
  }
  
  trait IXmlDtdNotationOptions extends StObject {
    
    /**
      * The text of the declaration.
      */
    var charData: String
  }
  object IXmlDtdNotationOptions {
    
    @scala.inline
    def apply(charData: String): IXmlDtdNotationOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlDtdNotationOptions]
    }
    
    @scala.inline
    implicit class IXmlDtdNotationOptionsMutableBuilder[Self <: IXmlDtdNotationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlDtdNotation[Parent] extends StObject {
    
    var _charData: js.Any = js.native
    
    val _parent: js.Any = js.native
    
    val _validation: js.Any = js.native
    
    /**
      * Gets the text of this notation declaration.
      */
    def charData: String = js.native
    /**
      * Sets the text of this notation declaration.
      */
    def charData_=(charData: String): Unit = js.native
    
    /**
      * Returns the parent of this notation declaration.
      */
    def up(): Parent = js.native
  }
}
