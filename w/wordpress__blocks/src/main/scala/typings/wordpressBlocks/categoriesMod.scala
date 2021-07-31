package typings.wordpressBlocks

import typings.react.mod.global.JSX.Element
import typings.wordpressBlocks.anon.PartialCategory
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoriesMod {
  
  @JSImport("@wordpress/blocks/api/categories", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getCategories(): js.Array[Category] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")().asInstanceOf[js.Array[Category]]
  
  @scala.inline
  def setCategories(categories: js.Array[Category]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCategories")(categories.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def updateCategory(slug: String, category: PartialCategory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateCategory")(slug.asInstanceOf[js.Any], category.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Category extends StObject {
    
    var icon: js.UndefOr[Element | Icon | Null] = js.undefined
    
    var slug: String
    
    var title: String
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
