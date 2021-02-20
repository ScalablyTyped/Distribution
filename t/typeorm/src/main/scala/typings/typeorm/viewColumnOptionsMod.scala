package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewColumnOptionsMod {
  
  @js.native
  trait ViewColumnOptions extends StObject {
    
    /**
      * Column name in the database.
      */
    var name: js.UndefOr[String] = js.native
  }
  object ViewColumnOptions {
    
    @scala.inline
    def apply(): ViewColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewColumnOptions]
    }
    
    @scala.inline
    implicit class ViewColumnOptionsMutableBuilder[Self <: ViewColumnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
