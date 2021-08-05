package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlProcInstMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlProcInst", JSImport.Default)
  @js.native
  class default[Parent] protected ()
    extends StObject
       with XmlProcInst[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlProcInstOptions) = this()
  }
  
  trait IXmlProcInstOptions extends StObject {
    
    /**
      * The data of the processing instruction, or undefined if there is no
      * content.
      */
    var content: js.UndefOr[String] = js.undefined
    
    /**
      * The target of the processing instruction.
      */
    var target: String
  }
  object IXmlProcInstOptions {
    
    inline def apply(target: String): IXmlProcInstOptions = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlProcInstOptions]
    }
    
    extension [Self <: IXmlProcInstOptions](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlProcInst[Parent] extends StObject {
    
    /* private */ var _content: js.Any = js.native
    
    /* private */ val _parent: js.Any = js.native
    
    /* private */ var _target: js.Any = js.native
    
    /* private */ val _validation: js.Any = js.native
    
    /**
      * Gets the content of this processing instruction.
      */
    def content: js.UndefOr[String] = js.native
    /**
      * Sets the content of this processing instruction.
      */
    def content_=(content: js.UndefOr[String]): Unit = js.native
    
    /**
      * Gets the target of this processing instruction.
      */
    def target: String = js.native
    /**
      * Sets the content of this processing instruction.
      */
    def target_=(target: String): Unit = js.native
    
    /**
      * Returns the parent of this processing instruction.
      */
    def up(): Parent = js.native
  }
}
