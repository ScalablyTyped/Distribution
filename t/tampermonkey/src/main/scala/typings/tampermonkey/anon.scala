package typings.tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Mimetype extends StObject {
    
    var mimetype: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object Mimetype {
    
    @scala.inline
    def apply(): Mimetype = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mimetype]
    }
    
    @scala.inline
    implicit class MimetypeMutableBuilder[Self <: Mimetype] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
