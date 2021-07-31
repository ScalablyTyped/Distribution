package typings.wixStyleReact

import typings.std.ReturnType
import typings.wixStyleReact.buttonUniDriverMod.ButtonUniDriver
import typings.wixStyleReact.popoverMenuUniDriverMod.PopoverMenuUniDriver
import typings.wixUiCore.anon.GetElementId
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableActionCellUniDriverMod {
  
  trait TableActionCellUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickHiddenAction(actionIndex: Double): js.Promise[Unit]
    
    def clickHiddenActionByDataHook(actionDataHook: String): js.Promise[Unit]
    
    def clickPopoverMenu(): js.Promise[Unit]
    
    def clickPrimaryActionButton(): js.Promise[Unit]
    
    def clickVisibleAction(actionIndex: Double): js.Promise[Unit]
    
    def clickVisibleActionByDataHook(actionDataHook: String): js.Promise[Unit]
    
    def getHiddenActionsCount(): js.Promise[Double]
    
    def getHiddenActionsPopoverMenuDriver(): js.Promise[PopoverMenuUniDriver]
    
    def getIsPrimaryActionButtonDisabled(): js.Promise[Boolean]
    
    def getPrimaryActionButtonDriver(): js.Promise[ReturnType[js.Function1[/* base */ BaseUniDriver, ButtonUniDriver]]]
    
    def getVisibleActionByDataHookTooltipDriver(dataHook: String): js.Promise[ReturnType[js.Function1[/* args */ js.Any, GetElementId]]]
    
    def getVisibleActionTooltipDriver(action: Double): js.Promise[ReturnType[js.Function1[/* args */ js.Any, GetElementId]]]
    
    def getVisibleActionsCount(): js.Promise[Double]
  }
  object TableActionCellUniDriver {
    
    @scala.inline
    def apply(
      click: () => js.Promise[Unit],
      clickHiddenAction: Double => js.Promise[Unit],
      clickHiddenActionByDataHook: String => js.Promise[Unit],
      clickPopoverMenu: () => js.Promise[Unit],
      clickPrimaryActionButton: () => js.Promise[Unit],
      clickVisibleAction: Double => js.Promise[Unit],
      clickVisibleActionByDataHook: String => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getHiddenActionsCount: () => js.Promise[Double],
      getHiddenActionsPopoverMenuDriver: () => js.Promise[PopoverMenuUniDriver],
      getIsPrimaryActionButtonDisabled: () => js.Promise[Boolean],
      getPrimaryActionButtonDriver: () => js.Promise[ReturnType[js.Function1[/* base */ BaseUniDriver, ButtonUniDriver]]],
      getVisibleActionByDataHookTooltipDriver: String => js.Promise[ReturnType[js.Function1[/* args */ js.Any, GetElementId]]],
      getVisibleActionTooltipDriver: Double => js.Promise[ReturnType[js.Function1[/* args */ js.Any, GetElementId]]],
      getVisibleActionsCount: () => js.Promise[Double]
    ): TableActionCellUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickHiddenAction = js.Any.fromFunction1(clickHiddenAction), clickHiddenActionByDataHook = js.Any.fromFunction1(clickHiddenActionByDataHook), clickPopoverMenu = js.Any.fromFunction0(clickPopoverMenu), clickPrimaryActionButton = js.Any.fromFunction0(clickPrimaryActionButton), clickVisibleAction = js.Any.fromFunction1(clickVisibleAction), clickVisibleActionByDataHook = js.Any.fromFunction1(clickVisibleActionByDataHook), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getHiddenActionsCount = js.Any.fromFunction0(getHiddenActionsCount), getHiddenActionsPopoverMenuDriver = js.Any.fromFunction0(getHiddenActionsPopoverMenuDriver), getIsPrimaryActionButtonDisabled = js.Any.fromFunction0(getIsPrimaryActionButtonDisabled), getPrimaryActionButtonDriver = js.Any.fromFunction0(getPrimaryActionButtonDriver), getVisibleActionByDataHookTooltipDriver = js.Any.fromFunction1(getVisibleActionByDataHookTooltipDriver), getVisibleActionTooltipDriver = js.Any.fromFunction1(getVisibleActionTooltipDriver), getVisibleActionsCount = js.Any.fromFunction0(getVisibleActionsCount))
      __obj.asInstanceOf[TableActionCellUniDriver]
    }
    
    @scala.inline
    implicit class TableActionCellUniDriverMutableBuilder[Self <: TableActionCellUniDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickHiddenAction(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickHiddenAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickHiddenActionByDataHook(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickHiddenActionByDataHook", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickPopoverMenu(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickPopoverMenu", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickPrimaryActionButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickPrimaryActionButton", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickVisibleAction(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickVisibleAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickVisibleActionByDataHook(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickVisibleActionByDataHook", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetHiddenActionsCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getHiddenActionsCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHiddenActionsPopoverMenuDriver(value: () => js.Promise[PopoverMenuUniDriver]): Self = StObject.set(x, "getHiddenActionsPopoverMenuDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIsPrimaryActionButtonDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "getIsPrimaryActionButtonDisabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPrimaryActionButtonDriver(value: () => js.Promise[ReturnType[js.Function1[/* base */ BaseUniDriver, ButtonUniDriver]]]): Self = StObject.set(x, "getPrimaryActionButtonDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVisibleActionByDataHookTooltipDriver(value: String => js.Promise[ReturnType[js.Function1[/* args */ js.Any, GetElementId]]]): Self = StObject.set(x, "getVisibleActionByDataHookTooltipDriver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetVisibleActionTooltipDriver(value: Double => js.Promise[ReturnType[js.Function1[/* args */ js.Any, GetElementId]]]): Self = StObject.set(x, "getVisibleActionTooltipDriver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetVisibleActionsCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getVisibleActionsCount", js.Any.fromFunction0(value))
    }
  }
}
