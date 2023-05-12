package typings.wordpressBlocks.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/blocks.@wordpress/blocks/api/categories.Category> */
trait PartialCategory extends StObject {
  
  var icon: js.UndefOr[Element | typings.wordpressComponents.dashiconMod.Dashicon.Icon | Null] = js.undefined
  
  var slug: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object PartialCategory {
  
  inline def apply(): PartialCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCategory] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: Element | typings.wordpressComponents.dashiconMod.Dashicon.Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
    
    inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
