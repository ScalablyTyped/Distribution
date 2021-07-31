package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlDtdElementMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlDtdElement", JSImport.Default)
  @js.native
  class default[Parent] protected ()
    extends StObject
       with XmlDtdElement[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdElementOptions) = this()
  }
  
  trait IXmlDtdElementOptions extends StObject {
    
    /**
      * The text of the declaration.
      */
    var charData: String
  }
  object IXmlDtdElementOptions {
    
    @scala.inline
    def apply(charData: String): IXmlDtdElementOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlDtdElementOptions]
    }
    
    @scala.inline
    implicit class IXmlDtdElementOptionsMutableBuilder[Self <: IXmlDtdElementOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlDtdElement[Parent] extends StObject {
    
    var _charData: js.Any = js.native
    
    val _parent: js.Any = js.native
    
    val _validation: js.Any = js.native
    
    /**
      * Gets the text of this element declaration.
      */
    def charData: String = js.native
    /**
      * Sets the text of this element declaration.
      */
    def charData_=(charData: String): Unit = js.native
    
    /**
      * Returns the parent of this element declaration.
      */
    def up(): Parent = js.native
  }
}
