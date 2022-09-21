package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlDtdEntityMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlDtdEntity", JSImport.Default)
  @js.native
  open class default[Parent] protected ()
    extends StObject
       with XmlDtdEntity[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdEntityOptions) = this()
  }
  
  trait IXmlDtdEntityOptions extends StObject {
    
    /**
      * The text of the declaration.
      */
    var charData: String
  }
  object IXmlDtdEntityOptions {
    
    inline def apply(charData: String): IXmlDtdEntityOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlDtdEntityOptions]
    }
    
    extension [Self <: IXmlDtdEntityOptions](x: Self) {
      
      inline def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlDtdEntity[Parent] extends StObject {
    
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
