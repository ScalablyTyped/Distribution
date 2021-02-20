package typings.tabtab

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<tabtab.tabtab.CompletionItem> */
  @js.native
  trait ReadonlyCompletionItem extends StObject {
    
    val description: js.UndefOr[String] = js.native
    
    val name: String = js.native
  }
  object ReadonlyCompletionItem {
    
    @scala.inline
    def apply(name: String): ReadonlyCompletionItem = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyCompletionItem]
    }
    
    @scala.inline
    implicit class ReadonlyCompletionItemMutableBuilder[Self <: ReadonlyCompletionItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
