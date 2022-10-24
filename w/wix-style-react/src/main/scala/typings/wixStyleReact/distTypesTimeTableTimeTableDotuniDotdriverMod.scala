package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.distSrcUniDriverFactoryCreateUniDriverFactoryMod.UniDriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimeTableTimeTableDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/TimeTable/TimeTable.uni.driver", "timeTableDriverFactory")
  @js.native
  val timeTableDriverFactory: UniDriverFactory[TimeTableUniDriver] = js.native
  
  trait TimeTableUniDriver
    extends StObject
       with BaseUniDriver {
    
    def addItemButtonExistsAt(columnIndex: Double): js.Promise[Boolean]
    
    def clickActionAt(columnIndex: Double, actionIndex: Double): js.Promise[Unit]
    
    def clickOnAddItemButtonAt(columnIndex: Double): js.Promise[Unit]
    
    def getActionLabelAt(columnIndex: Double, actionIndex: Double): js.Promise[Unit]
    
    def getActionsCount(columnIndex: Double): js.Promise[Double]
    
    def getColumnCount(): js.Promise[Double]
    
    def getItemCountAt(columnIndex: Double): js.Promise[Double]
    
    def getSubtitleAt(columnIndex: Double): js.Promise[String]
    
    def getTitleAt(columnIndex: Double): js.Promise[String]
    
    def hoverColumn(columnIndex: Double): js.Promise[Unit]
    
    def isColumnActiveAt(columnIndex: Double): js.Promise[Boolean]
    
    def isColumnDisabledAt(columnIndex: Double): js.Promise[Boolean]
    
    def isColumnDroppableAt(columnIndex: Double): js.Promise[Boolean]
    
    def isItemDisabledAt(columnIndex: Double, itemIndex: Double): js.Promise[Boolean]
    
    def isItemDraggableAt(columnIndex: Double, itemIndex: Double): js.Promise[Boolean]
  }
  object TimeTableUniDriver {
    
    inline def apply(
      addItemButtonExistsAt: Double => js.Promise[Boolean],
      click: () => js.Promise[Unit],
      clickActionAt: (Double, Double) => js.Promise[Unit],
      clickOnAddItemButtonAt: Double => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getActionLabelAt: (Double, Double) => js.Promise[Unit],
      getActionsCount: Double => js.Promise[Double],
      getColumnCount: () => js.Promise[Double],
      getItemCountAt: Double => js.Promise[Double],
      getSubtitleAt: Double => js.Promise[String],
      getTitleAt: Double => js.Promise[String],
      hoverColumn: Double => js.Promise[Unit],
      isColumnActiveAt: Double => js.Promise[Boolean],
      isColumnDisabledAt: Double => js.Promise[Boolean],
      isColumnDroppableAt: Double => js.Promise[Boolean],
      isItemDisabledAt: (Double, Double) => js.Promise[Boolean],
      isItemDraggableAt: (Double, Double) => js.Promise[Boolean]
    ): TimeTableUniDriver = {
      val __obj = js.Dynamic.literal(addItemButtonExistsAt = js.Any.fromFunction1(addItemButtonExistsAt), click = js.Any.fromFunction0(click), clickActionAt = js.Any.fromFunction2(clickActionAt), clickOnAddItemButtonAt = js.Any.fromFunction1(clickOnAddItemButtonAt), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getActionLabelAt = js.Any.fromFunction2(getActionLabelAt), getActionsCount = js.Any.fromFunction1(getActionsCount), getColumnCount = js.Any.fromFunction0(getColumnCount), getItemCountAt = js.Any.fromFunction1(getItemCountAt), getSubtitleAt = js.Any.fromFunction1(getSubtitleAt), getTitleAt = js.Any.fromFunction1(getTitleAt), hoverColumn = js.Any.fromFunction1(hoverColumn), isColumnActiveAt = js.Any.fromFunction1(isColumnActiveAt), isColumnDisabledAt = js.Any.fromFunction1(isColumnDisabledAt), isColumnDroppableAt = js.Any.fromFunction1(isColumnDroppableAt), isItemDisabledAt = js.Any.fromFunction2(isItemDisabledAt), isItemDraggableAt = js.Any.fromFunction2(isItemDraggableAt))
      __obj.asInstanceOf[TimeTableUniDriver]
    }
    
    extension [Self <: TimeTableUniDriver](x: Self) {
      
      inline def setAddItemButtonExistsAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "addItemButtonExistsAt", js.Any.fromFunction1(value))
      
      inline def setClickActionAt(value: (Double, Double) => js.Promise[Unit]): Self = StObject.set(x, "clickActionAt", js.Any.fromFunction2(value))
      
      inline def setClickOnAddItemButtonAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickOnAddItemButtonAt", js.Any.fromFunction1(value))
      
      inline def setGetActionLabelAt(value: (Double, Double) => js.Promise[Unit]): Self = StObject.set(x, "getActionLabelAt", js.Any.fromFunction2(value))
      
      inline def setGetActionsCount(value: Double => js.Promise[Double]): Self = StObject.set(x, "getActionsCount", js.Any.fromFunction1(value))
      
      inline def setGetColumnCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getColumnCount", js.Any.fromFunction0(value))
      
      inline def setGetItemCountAt(value: Double => js.Promise[Double]): Self = StObject.set(x, "getItemCountAt", js.Any.fromFunction1(value))
      
      inline def setGetSubtitleAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getSubtitleAt", js.Any.fromFunction1(value))
      
      inline def setGetTitleAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getTitleAt", js.Any.fromFunction1(value))
      
      inline def setHoverColumn(value: Double => js.Promise[Unit]): Self = StObject.set(x, "hoverColumn", js.Any.fromFunction1(value))
      
      inline def setIsColumnActiveAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isColumnActiveAt", js.Any.fromFunction1(value))
      
      inline def setIsColumnDisabledAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isColumnDisabledAt", js.Any.fromFunction1(value))
      
      inline def setIsColumnDroppableAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isColumnDroppableAt", js.Any.fromFunction1(value))
      
      inline def setIsItemDisabledAt(value: (Double, Double) => js.Promise[Boolean]): Self = StObject.set(x, "isItemDisabledAt", js.Any.fromFunction2(value))
      
      inline def setIsItemDraggableAt(value: (Double, Double) => js.Promise[Boolean]): Self = StObject.set(x, "isItemDraggableAt", js.Any.fromFunction2(value))
    }
  }
}
