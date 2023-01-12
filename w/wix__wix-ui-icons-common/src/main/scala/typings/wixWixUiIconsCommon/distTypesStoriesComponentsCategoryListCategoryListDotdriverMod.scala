package typings.wixWixUiIconsCommon

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStoriesComponentsCategoryListCategoryListDotdriverMod {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/stories/components/category-list/CategoryList.driver", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CategoryListDriver {
    def this(baseElement: Element) = this()
    
    /* CompleteClass */
    var baseElement: Element = js.native
    
    /* CompleteClass */
    override def getAmountOfCategoryRows(): Double = js.native
    
    /* CompleteClass */
    override def getAmountOfCategoryTitles(): Double = js.native
    
    /* CompleteClass */
    override def getRowText(index: Double): String | Null = js.native
    
    /* CompleteClass */
    override def search(query: String): Unit = js.native
  }
  
  trait CategoryListDriver extends StObject {
    
    var baseElement: Element
    
    def getAmountOfCategoryRows(): Double
    
    def getAmountOfCategoryTitles(): Double
    
    def getRowText(index: Double): String | Null
    
    def search(query: String): Unit
  }
  object CategoryListDriver {
    
    inline def apply(
      baseElement: Element,
      getAmountOfCategoryRows: () => Double,
      getAmountOfCategoryTitles: () => Double,
      getRowText: Double => String | Null,
      search: String => Unit
    ): CategoryListDriver = {
      val __obj = js.Dynamic.literal(baseElement = baseElement.asInstanceOf[js.Any], getAmountOfCategoryRows = js.Any.fromFunction0(getAmountOfCategoryRows), getAmountOfCategoryTitles = js.Any.fromFunction0(getAmountOfCategoryTitles), getRowText = js.Any.fromFunction1(getRowText), search = js.Any.fromFunction1(search))
      __obj.asInstanceOf[CategoryListDriver]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CategoryListDriver] (val x: Self) extends AnyVal {
      
      inline def setBaseElement(value: Element): Self = StObject.set(x, "baseElement", value.asInstanceOf[js.Any])
      
      inline def setGetAmountOfCategoryRows(value: () => Double): Self = StObject.set(x, "getAmountOfCategoryRows", js.Any.fromFunction0(value))
      
      inline def setGetAmountOfCategoryTitles(value: () => Double): Self = StObject.set(x, "getAmountOfCategoryTitles", js.Any.fromFunction0(value))
      
      inline def setGetRowText(value: Double => String | Null): Self = StObject.set(x, "getRowText", js.Any.fromFunction1(value))
      
      inline def setSearch(value: String => Unit): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    }
  }
}
