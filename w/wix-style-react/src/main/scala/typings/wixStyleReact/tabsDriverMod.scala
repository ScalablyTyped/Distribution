package typings.wixStyleReact

import typings.std.Set
import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsDriverMod {
  
  trait TabsDriver
    extends StObject
       with BaseDriver {
    
    def clickTabAt(index: Double): Unit
    
    def getActiveTabIndex(): Double
    
    def getDataHook(): String
    
    def getItemsContainerType(): String
    
    def getItemsMaxWidths(): js.Array[String]
    
    def getItemsWidth(): Set[String]
    
    var getSideContent: js.Array[UniDriver[js.Any] | Null]
    
    def getTitles(): js.Array[String]
    
    def hasDivider(): Boolean
    
    def isDefaultType(): Boolean
  }
  object TabsDriver {
    
    @scala.inline
    def apply(
      clickTabAt: Double => Unit,
      exists: () => Boolean,
      getActiveTabIndex: () => Double,
      getDataHook: () => String,
      getItemsContainerType: () => String,
      getItemsMaxWidths: () => js.Array[String],
      getItemsWidth: () => Set[String],
      getSideContent: js.Array[UniDriver[js.Any] | Null],
      getTitles: () => js.Array[String],
      hasDivider: () => Boolean,
      isDefaultType: () => Boolean
    ): TabsDriver = {
      val __obj = js.Dynamic.literal(clickTabAt = js.Any.fromFunction1(clickTabAt), exists = js.Any.fromFunction0(exists), getActiveTabIndex = js.Any.fromFunction0(getActiveTabIndex), getDataHook = js.Any.fromFunction0(getDataHook), getItemsContainerType = js.Any.fromFunction0(getItemsContainerType), getItemsMaxWidths = js.Any.fromFunction0(getItemsMaxWidths), getItemsWidth = js.Any.fromFunction0(getItemsWidth), getSideContent = getSideContent.asInstanceOf[js.Any], getTitles = js.Any.fromFunction0(getTitles), hasDivider = js.Any.fromFunction0(hasDivider), isDefaultType = js.Any.fromFunction0(isDefaultType))
      __obj.asInstanceOf[TabsDriver]
    }
    
    @scala.inline
    implicit class TabsDriverMutableBuilder[Self <: TabsDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickTabAt(value: Double => Unit): Self = StObject.set(x, "clickTabAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetActiveTabIndex(value: () => Double): Self = StObject.set(x, "getActiveTabIndex", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDataHook(value: () => String): Self = StObject.set(x, "getDataHook", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetItemsContainerType(value: () => String): Self = StObject.set(x, "getItemsContainerType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetItemsMaxWidths(value: () => js.Array[String]): Self = StObject.set(x, "getItemsMaxWidths", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetItemsWidth(value: () => Set[String]): Self = StObject.set(x, "getItemsWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSideContent(value: js.Array[UniDriver[js.Any] | Null]): Self = StObject.set(x, "getSideContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetSideContentVarargs(value: (UniDriver[js.Any] | Null)*): Self = StObject.set(x, "getSideContent", js.Array(value :_*))
      
      @scala.inline
      def setGetTitles(value: () => js.Array[String]): Self = StObject.set(x, "getTitles", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasDivider(value: () => Boolean): Self = StObject.set(x, "hasDivider", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDefaultType(value: () => Boolean): Self = StObject.set(x, "isDefaultType", js.Any.fromFunction0(value))
    }
  }
}
