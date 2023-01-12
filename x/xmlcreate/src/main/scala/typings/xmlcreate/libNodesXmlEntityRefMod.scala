package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodesXmlEntityRefMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlEntityRef", JSImport.Default)
  @js.native
  open class default[Parent] protected ()
    extends StObject
       with XmlEntityRef[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlEntityRefOptions) = this()
  }
  
  trait IXmlEntityRefOptions extends StObject {
    
    /**
      * The name of the entity to be referenced.
      */
    var name: String
  }
  object IXmlEntityRefOptions {
    
    inline def apply(name: String): IXmlEntityRefOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlEntityRefOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IXmlEntityRefOptions] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlEntityRef[Parent] extends StObject {
    
    /* private */ var _name: Any = js.native
    
    /* private */ val _parent: Any = js.native
    
    /* private */ val _validation: Any = js.native
    
    /**
      * Gets the name of this entity reference.
      */
    def name: String = js.native
    /**
      * Sets the name of this entity reference.
      */
    def name_=(name: String): Unit = js.native
    
    /**
      * Returns the parent of this entity reference.
      */
    def up(): Parent = js.native
  }
}
