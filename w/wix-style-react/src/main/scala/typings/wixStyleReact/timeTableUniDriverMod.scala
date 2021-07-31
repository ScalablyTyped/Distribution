package typings.wixStyleReact

import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeTableUniDriverMod {
  
  trait TimeTableUniDriver
    extends StObject
       with BaseUniDriver {
    
    def addItemButtonExistsAt(columnIndex: Double): js.Promise[Boolean]
    
    def clickOnAddItemButtonAt(columnIndex: Double): js.Promise[Unit]
    
    def getColumnCount(): js.Promise[Double]
    
    def getItemCountAt(columnIndex: Double): js.Promise[Double]
    
    def getSubtitleAt(columnIndex: Double): js.Promise[String]
    
    def getTitleAt(columnIndex: Double): js.Promise[String]
    
    def isColumnActiveAt(columnIndex: Double): js.Promise[Boolean]
    
    def isColumnDisabledAt(columnIndex: Double): js.Promise[Boolean]
    
    def isColumnDroppableAt(columnIndex: Double): js.Promise[Boolean]
    
    def isItemDisabledAt(columnIndex: Double, itemIndex: Double): js.Promise[Boolean]
    
    def isItemDraggableAt(columnIndex: Double, itemIndex: Double): js.Promise[Boolean]
  }
  object TimeTableUniDriver {
    
    @scala.inline
    def apply(
      addItemButtonExistsAt: Double => js.Promise[Boolean],
      click: () => js.Promise[Unit],
      clickOnAddItemButtonAt: Double => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getColumnCount: () => js.Promise[Double],
      getItemCountAt: Double => js.Promise[Double],
      getSubtitleAt: Double => js.Promise[String],
      getTitleAt: Double => js.Promise[String],
      isColumnActiveAt: Double => js.Promise[Boolean],
      isColumnDisabledAt: Double => js.Promise[Boolean],
      isColumnDroppableAt: Double => js.Promise[Boolean],
      isItemDisabledAt: (Double, Double) => js.Promise[Boolean],
      isItemDraggableAt: (Double, Double) => js.Promise[Boolean]
    ): TimeTableUniDriver = {
      val __obj = js.Dynamic.literal(addItemButtonExistsAt = js.Any.fromFunction1(addItemButtonExistsAt), click = js.Any.fromFunction0(click), clickOnAddItemButtonAt = js.Any.fromFunction1(clickOnAddItemButtonAt), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getColumnCount = js.Any.fromFunction0(getColumnCount), getItemCountAt = js.Any.fromFunction1(getItemCountAt), getSubtitleAt = js.Any.fromFunction1(getSubtitleAt), getTitleAt = js.Any.fromFunction1(getTitleAt), isColumnActiveAt = js.Any.fromFunction1(isColumnActiveAt), isColumnDisabledAt = js.Any.fromFunction1(isColumnDisabledAt), isColumnDroppableAt = js.Any.fromFunction1(isColumnDroppableAt), isItemDisabledAt = js.Any.fromFunction2(isItemDisabledAt), isItemDraggableAt = js.Any.fromFunction2(isItemDraggableAt))
      __obj.asInstanceOf[TimeTableUniDriver]
    }
    
    @scala.inline
    implicit class TimeTableUniDriverMutableBuilder[Self <: TimeTableUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddItemButtonExistsAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "addItemButtonExistsAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickOnAddItemButtonAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickOnAddItemButtonAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetColumnCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getColumnCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetItemCountAt(value: Double => js.Promise[Double]): Self = StObject.set(x, "getItemCountAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSubtitleAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getSubtitleAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTitleAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getTitleAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsColumnActiveAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isColumnActiveAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsColumnDisabledAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isColumnDisabledAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsColumnDroppableAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isColumnDroppableAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsItemDisabledAt(value: (Double, Double) => js.Promise[Boolean]): Self = StObject.set(x, "isItemDisabledAt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsItemDraggableAt(value: (Double, Double) => js.Promise[Boolean]): Self = StObject.set(x, "isItemDraggableAt", js.Any.fromFunction2(value))
    }
  }
}
