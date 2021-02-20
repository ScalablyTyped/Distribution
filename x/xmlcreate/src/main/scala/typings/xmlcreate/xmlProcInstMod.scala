package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlProcInstMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlProcInst", JSImport.Default)
  @js.native
  class default[Parent] protected () extends XmlProcInst[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlProcInstOptions) = this()
  }
  
  @js.native
  trait IXmlProcInstOptions extends StObject {
    
    /**
      * The data of the processing instruction, or undefined if there is no
      * content.
      */
    var content: js.UndefOr[String] = js.native
    
    /**
      * The target of the processing instruction.
      */
    var target: String = js.native
  }
  object IXmlProcInstOptions {
    
    @scala.inline
    def apply(target: String): IXmlProcInstOptions = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlProcInstOptions]
    }
    
    @scala.inline
    implicit class IXmlProcInstOptionsMutableBuilder[Self <: IXmlProcInstOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait XmlProcInst[Parent] extends StObject {
    
    var _content: js.Any = js.native
    
    val _parent: js.Any = js.native
    
    var _target: js.Any = js.native
    
    val _validation: js.Any = js.native
    
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
