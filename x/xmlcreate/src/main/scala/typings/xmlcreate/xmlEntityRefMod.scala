package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlEntityRefMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlEntityRef", JSImport.Default)
  @js.native
  class default[Parent] protected () extends XmlEntityRef[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlEntityRefOptions) = this()
  }
  
  @js.native
  trait IXmlEntityRefOptions extends StObject {
    
    /**
      * The name of the entity to be referenced.
      */
    var name: String = js.native
  }
  object IXmlEntityRefOptions {
    
    @scala.inline
    def apply(name: String): IXmlEntityRefOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlEntityRefOptions]
    }
    
    @scala.inline
    implicit class IXmlEntityRefOptionsMutableBuilder[Self <: IXmlEntityRefOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlEntityRef[Parent] extends StObject {
    
    var _name: js.Any = js.native
    
    val _parent: js.Any = js.native
    
    val _validation: js.Any = js.native
    
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
