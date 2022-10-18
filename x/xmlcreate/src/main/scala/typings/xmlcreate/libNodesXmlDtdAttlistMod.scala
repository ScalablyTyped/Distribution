package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodesXmlDtdAttlistMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlDtdAttlist", JSImport.Default)
  @js.native
  open class default[Parent] protected ()
    extends StObject
       with XmlDtdAttlist[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdAttlistOptions) = this()
  }
  
  trait IXmlDtdAttlistOptions extends StObject {
    
    /**
      * The text of the declaration.
      */
    var charData: String
  }
  object IXmlDtdAttlistOptions {
    
    inline def apply(charData: String): IXmlDtdAttlistOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlDtdAttlistOptions]
    }
    
    extension [Self <: IXmlDtdAttlistOptions](x: Self) {
      
      inline def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlDtdAttlist[Parent] extends StObject {
    
    /* private */ var _charData: Any = js.native
    
    /* private */ val _parent: Any = js.native
    
    /* private */ val _validation: Any = js.native
    
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
