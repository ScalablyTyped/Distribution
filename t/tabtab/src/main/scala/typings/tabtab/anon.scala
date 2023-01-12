package typings.tabtab

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<tabtab.tabtab.CompletionItem> */
  trait ReadonlyCompletionItem extends StObject {
    
    val description: js.UndefOr[String] = js.undefined
    
    val name: String
  }
  object ReadonlyCompletionItem {
    
    inline def apply(name: String): ReadonlyCompletionItem = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyCompletionItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyCompletionItem] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
