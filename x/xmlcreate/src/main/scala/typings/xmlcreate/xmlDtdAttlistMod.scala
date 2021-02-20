package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlDtdAttlistMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlDtdAttlist", JSImport.Default)
  @js.native
  class default[Parent] protected () extends XmlDtdAttlist[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdAttlistOptions) = this()
  }
  
  @js.native
  trait IXmlDtdAttlistOptions extends StObject {
    
    /**
      * The text of the declaration.
      */
    var charData: String = js.native
  }
  object IXmlDtdAttlistOptions {
    
    @scala.inline
    def apply(charData: String): IXmlDtdAttlistOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlDtdAttlistOptions]
    }
    
    @scala.inline
    implicit class IXmlDtdAttlistOptionsMutableBuilder[Self <: IXmlDtdAttlistOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlDtdAttlist[Parent] extends StObject {
    
    var _charData: js.Any = js.native
    
    val _parent: js.Any = js.native
    
    val _validation: js.Any = js.native
    
    /**
      * Gets the text of this entity declaration.
      */
    def charData: String = js.native
    /**
      * Sets the text of this entity declaration.
      */
    def charData_=(charData: String): Unit = js.native
    
    /**
      * Returns the parent of this entity declaration.
      */
    def up(): Parent = js.native
  }
}
