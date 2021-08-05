package typings.wixStyleReact

import typings.std.ReturnType
import typings.wixStyleReact.popoverMenuUniDriverMod.PopoverMenuUniDriver
import typings.wixUiCore.anon.GetElementId
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableActionCellDriverMod {
  
  trait TableActionCellDriver[T]
    extends StObject
       with BaseDriver {
    
    def clickHiddenAction(actionIndex: Double): Unit
    
    def clickHiddenActionByDataHook(actionDataHook: String): Unit
    
    def clickPopoverMenu(): Unit
    
    def clickPrimaryActionButton(): Unit
    
    def clickVisibleAction(actionIndex: Double): Unit
    
    def clickVisibleActionByDataHook(actionDataHook: String): Unit
    
    def element(): T
    
    def getHiddenActionsCount(): Double
    
    def getHiddenActionsPopoverMenuDriver(): PopoverMenuUniDriver
    
    def getIsPrimaryActionButtonDisabled(): Boolean
    
    def getVisibleActionByDataHookTooltipDriver(dataHook: String): ReturnType[js.Function1[/* args */ js.Any, GetElementId]]
    
    def getVisibleActionTooltipDriver(action: Double): ReturnType[js.Function1[/* args */ js.Any, GetElementId]]
    
    def getVisibleActionsCount(): Double
  }
  object TableActionCellDriver {
    
    inline def apply[T](
      clickHiddenAction: Double => Unit,
      clickHiddenActionByDataHook: String => Unit,
      clickPopoverMenu: () => Unit,
      clickPrimaryActionButton: () => Unit,
      clickVisibleAction: Double => Unit,
      clickVisibleActionByDataHook: String => Unit,
      element: () => T,
      exists: () => Boolean,
      getHiddenActionsCount: () => Double,
      getHiddenActionsPopoverMenuDriver: () => PopoverMenuUniDriver,
      getIsPrimaryActionButtonDisabled: () => Boolean,
      getVisibleActionByDataHookTooltipDriver: String => ReturnType[js.Function1[/* args */ js.Any, GetElementId]],
      getVisibleActionTooltipDriver: Double => ReturnType[js.Function1[/* args */ js.Any, GetElementId]],
      getVisibleActionsCount: () => Double
    ): TableActionCellDriver[T] = {
      val __obj = js.Dynamic.literal(clickHiddenAction = js.Any.fromFunction1(clickHiddenAction), clickHiddenActionByDataHook = js.Any.fromFunction1(clickHiddenActionByDataHook), clickPopoverMenu = js.Any.fromFunction0(clickPopoverMenu), clickPrimaryActionButton = js.Any.fromFunction0(clickPrimaryActionButton), clickVisibleAction = js.Any.fromFunction1(clickVisibleAction), clickVisibleActionByDataHook = js.Any.fromFunction1(clickVisibleActionByDataHook), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getHiddenActionsCount = js.Any.fromFunction0(getHiddenActionsCount), getHiddenActionsPopoverMenuDriver = js.Any.fromFunction0(getHiddenActionsPopoverMenuDriver), getIsPrimaryActionButtonDisabled = js.Any.fromFunction0(getIsPrimaryActionButtonDisabled), getVisibleActionByDataHookTooltipDriver = js.Any.fromFunction1(getVisibleActionByDataHookTooltipDriver), getVisibleActionTooltipDriver = js.Any.fromFunction1(getVisibleActionTooltipDriver), getVisibleActionsCount = js.Any.fromFunction0(getVisibleActionsCount))
      __obj.asInstanceOf[TableActionCellDriver[T]]
    }
    
    extension [Self <: TableActionCellDriver[?], T](x: Self & TableActionCellDriver[T]) {
      
      inline def setClickHiddenAction(value: Double => Unit): Self = StObject.set(x, "clickHiddenAction", js.Any.fromFunction1(value))
      
      inline def setClickHiddenActionByDataHook(value: String => Unit): Self = StObject.set(x, "clickHiddenActionByDataHook", js.Any.fromFunction1(value))
      
      inline def setClickPopoverMenu(value: () => Unit): Self = StObject.set(x, "clickPopoverMenu", js.Any.fromFunction0(value))
      
      inline def setClickPrimaryActionButton(value: () => Unit): Self = StObject.set(x, "clickPrimaryActionButton", js.Any.fromFunction0(value))
      
      inline def setClickVisibleAction(value: Double => Unit): Self = StObject.set(x, "clickVisibleAction", js.Any.fromFunction1(value))
      
      inline def setClickVisibleActionByDataHook(value: String => Unit): Self = StObject.set(x, "clickVisibleActionByDataHook", js.Any.fromFunction1(value))
      
      inline def setElement(value: () => T): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setGetHiddenActionsCount(value: () => Double): Self = StObject.set(x, "getHiddenActionsCount", js.Any.fromFunction0(value))
      
      inline def setGetHiddenActionsPopoverMenuDriver(value: () => PopoverMenuUniDriver): Self = StObject.set(x, "getHiddenActionsPopoverMenuDriver", js.Any.fromFunction0(value))
      
      inline def setGetIsPrimaryActionButtonDisabled(value: () => Boolean): Self = StObject.set(x, "getIsPrimaryActionButtonDisabled", js.Any.fromFunction0(value))
      
      inline def setGetVisibleActionByDataHookTooltipDriver(value: String => ReturnType[js.Function1[/* args */ js.Any, GetElementId]]): Self = StObject.set(x, "getVisibleActionByDataHookTooltipDriver", js.Any.fromFunction1(value))
      
      inline def setGetVisibleActionTooltipDriver(value: Double => ReturnType[js.Function1[/* args */ js.Any, GetElementId]]): Self = StObject.set(x, "getVisibleActionTooltipDriver", js.Any.fromFunction1(value))
      
      inline def setGetVisibleActionsCount(value: () => Double): Self = StObject.set(x, "getVisibleActionsCount", js.Any.fromFunction0(value))
    }
  }
}
