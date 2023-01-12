package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNodesXmlCommentMod {
  
  @JSImport("xmlcreate/lib/nodes/XmlComment", JSImport.Default)
  @js.native
  open class default[Parent] protected ()
    extends StObject
       with XmlComment[Parent] {
    def this(parent: Parent, validation: Boolean, options: IXmlCommentOptions) = this()
  }
  
  trait IXmlCommentOptions extends StObject {
    
    /**
      * The content of the comment.
      */
    var charData: String
    
    /**
      * Whether to replace any invalid characters in the content of the comment
      * with the Unicode replacement character. By default, this is disabled.
      */
    var replaceInvalidCharsInCharData: js.UndefOr[Boolean] = js.undefined
  }
  object IXmlCommentOptions {
    
    inline def apply(charData: String): IXmlCommentOptions = {
      val __obj = js.Dynamic.literal(charData = charData.asInstanceOf[js.Any])
      __obj.asInstanceOf[IXmlCommentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IXmlCommentOptions] (val x: Self) extends AnyVal {
      
      inline def setCharData(value: String): Self = StObject.set(x, "charData", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInCharData(value: Boolean): Self = StObject.set(x, "replaceInvalidCharsInCharData", value.asInstanceOf[js.Any])
      
      inline def setReplaceInvalidCharsInCharDataUndefined: Self = StObject.set(x, "replaceInvalidCharsInCharData", js.undefined)
    }
  }
  
  @js.native
  trait XmlComment[Parent] extends StObject {
    
    /* private */ var _charData: Any = js.native
    
    /* private */ val _parent: Any = js.native
    
    /* private */ val _replaceInvalidCharsInCharData: Any = js.native
    
    /* private */ val _validation: Any = js.native
    
    /**
      * Gets the text of this comment.
      */
    def charData: String = js.native
    /**
      * Sets the text of this comment.
      */
    def charData_=(charData: String): Unit = js.native
    
    /**
      * Returns the parent of this comment.
      */
    def up(): Parent = js.native
  }
}
