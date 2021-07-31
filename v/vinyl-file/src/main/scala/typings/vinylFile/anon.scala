package typings.vinylFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Contents extends StObject {
    
    var contents: js.UndefOr[Boolean] = js.undefined
    
    var deep: js.UndefOr[Boolean] = js.undefined
  }
  object Contents {
    
    @scala.inline
    def apply(): Contents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Contents]
    }
    
    @scala.inline
    implicit class ContentsMutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: Boolean): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      @scala.inline
      def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    }
  }
}
