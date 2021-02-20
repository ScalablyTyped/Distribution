package typings.wordpressBlocks

import typings.react.mod.global.JSX.Element
import typings.wordpressBlocks.anon.PartialCategory
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoriesMod {
  
  @JSImport("@wordpress/blocks/api/categories", "getCategories")
  @js.native
  def getCategories(): js.Array[Category] = js.native
  
  @JSImport("@wordpress/blocks/api/categories", "setCategories")
  @js.native
  def setCategories(categories: js.Array[Category]): Unit = js.native
  
  @JSImport("@wordpress/blocks/api/categories", "updateCategory")
  @js.native
  def updateCategory(slug: String, category: PartialCategory): Unit = js.native
  
  @js.native
  trait Category extends StObject {
    
    var icon: js.UndefOr[Element | Icon | Null] = js.native
    
    var slug: String = js.native
    
    var title: String = js.native
  }
  object Category {
    
    @scala.inline
    def apply(slug: String, title: String): Category = {
      val __obj = js.Dynamic.literal(slug = slug.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    @scala.inline
    implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: Element | Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
