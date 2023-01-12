package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodesXmlDtdParamEntityRefMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlDtdParamEntityRef", JSImport.Default)
  @js.native
  open class default[Parent] protected ()
    extends StObject
       with XmlDtdParamEntityRef[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlDtdParamEntityRefOptions) = this()
  }
  
  trait IXmlDtdParamEntityRefOptions extends StObject {
    
    /**
      * The name of the entity to be referenced.
      */
    var name: String
  }
  object IXmlDtdParamEntityRefOptions {
    
    inline def apply(name: String): IXmlDtdParamEntityRefOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlDtdParamEntityRefOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IXmlDtdParamEntityRefOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlDtdParamEntityRef[Parent] extends StObject {
    
    /* private */ var _name: Any = js.native
    
    /* private */ val _parent: Any = js.native
    
    /* private */ val _validation: Any = js.native
    
    /**
      * Gets the name of this parameter entity reference.
      */
    def name: String = js.native
    /**
      * Sets the name of this parameter entity reference.
      */
    def name_=(name: String): Unit = js.native
    
    /**
      * Returns the parent of this parameter entity reference.
      */
    def up(): Parent = js.native
  }
}
