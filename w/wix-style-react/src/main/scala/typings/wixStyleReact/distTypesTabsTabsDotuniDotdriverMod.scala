package typings.wixStyleReact

import typings.std.Set
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabsTabsDotuniDotdriverMod {
  
  trait TabsUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickTabAt(index: Double): js.Promise[Unit]
    
    def getActiveTabIndex(): js.Promise[Double]
    
    def getDataHook(): js.Promise[String]
    
    def getItemsContainerType(): js.Promise[String]
    
    def getItemsMaxWidths(): js.Promise[js.Array[String]]
    
    def getItemsWidth(): js.Promise[Set[String]]
    
    var getSideContent: js.Promise[js.Array[UniDriver[Any] | Null]]
    
    def getTitles(): js.Promise[js.Array[String]]
    
    def hasDivider(): js.Promise[Boolean]
    
    def isDefaultType(): js.Promise[Boolean]
  }
  object TabsUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickTabAt: Double => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getActiveTabIndex: () => js.Promise[Double],
      getDataHook: () => js.Promise[String],
      getItemsContainerType: () => js.Promise[String],
      getItemsMaxWidths: () => js.Promise[js.Array[String]],
      getItemsWidth: () => js.Promise[Set[String]],
      getSideContent: js.Promise[js.Array[UniDriver[Any] | Null]],
      getTitles: () => js.Promise[js.Array[String]],
      hasDivider: () => js.Promise[Boolean],
      isDefaultType: () => js.Promise[Boolean]
    ): TabsUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickTabAt = js.Any.fromFunction1(clickTabAt), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getActiveTabIndex = js.Any.fromFunction0(getActiveTabIndex), getDataHook = js.Any.fromFunction0(getDataHook), getItemsContainerType = js.Any.fromFunction0(getItemsContainerType), getItemsMaxWidths = js.Any.fromFunction0(getItemsMaxWidths), getItemsWidth = js.Any.fromFunction0(getItemsWidth), getSideContent = getSideContent.asInstanceOf[js.Any], getTitles = js.Any.fromFunction0(getTitles), hasDivider = js.Any.fromFunction0(hasDivider), isDefaultType = js.Any.fromFunction0(isDefaultType))
      __obj.asInstanceOf[TabsUniDriver]
    }
    
    extension [Self <: TabsUniDriver](x: Self) {
      
      inline def setClickTabAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickTabAt", js.Any.fromFunction1(value))
      
      inline def setGetActiveTabIndex(value: () => js.Promise[Double]): Self = StObject.set(x, "getActiveTabIndex", js.Any.fromFunction0(value))
      
      inline def setGetDataHook(value: () => js.Promise[String]): Self = StObject.set(x, "getDataHook", js.Any.fromFunction0(value))
      
      inline def setGetItemsContainerType(value: () => js.Promise[String]): Self = StObject.set(x, "getItemsContainerType", js.Any.fromFunction0(value))
      
      inline def setGetItemsMaxWidths(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getItemsMaxWidths", js.Any.fromFunction0(value))
      
      inline def setGetItemsWidth(value: () => js.Promise[Set[String]]): Self = StObject.set(x, "getItemsWidth", js.Any.fromFunction0(value))
      
      inline def setGetSideContent(value: js.Promise[js.Array[UniDriver[Any] | Null]]): Self = StObject.set(x, "getSideContent", value.asInstanceOf[js.Any])
      
      inline def setGetTitles(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getTitles", js.Any.fromFunction0(value))
      
      inline def setHasDivider(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasDivider", js.Any.fromFunction0(value))
      
      inline def setIsDefaultType(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDefaultType", js.Any.fromFunction0(value))
    }
  }
}
