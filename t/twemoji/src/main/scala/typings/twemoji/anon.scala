package typings.twemoji

import typings.twemoji.mod.ParseCallback
import typings.twemoji.twemojiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<twemoji.twemoji.ParseObject> */
  @js.native
  trait PartialParseObject extends StObject {
    
    var attributes: js.UndefOr[js.Function2[/* icon */ String, /* variant */ String, js.Object]] = js.native
    
    var base: js.UndefOr[String] = js.native
    
    var callback: js.UndefOr[ParseCallback] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var ext: js.UndefOr[String] = js.native
    
    var folder: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[String | Double] = js.native
  }
  object PartialParseObject {
    
    @scala.inline
    def apply(): PartialParseObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialParseObject]
    }
    
    @scala.inline
    implicit class PartialParseObjectMutableBuilder[Self <: PartialParseObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: (/* icon */ String, /* variant */ String) => js.Object): Self = StObject.set(x, "attributes", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setCallback(value: (/* icon */ String, /* options */ js.Object, /* variant */ String) => String | `false`): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      @scala.inline
      def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      @scala.inline
      def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
