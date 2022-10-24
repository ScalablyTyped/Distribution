package typings.wixStyleReact

import typings.std.ReturnType
import typings.unidriverCore.mod.UniDriver
import typings.wixStyleReact.anon.HasSize
import typings.wixStyleReact.distTypesButtonButtonDotuniDotdriverMod.ButtonUniDriver
import typings.wixStyleReact.distTypesPopoverMenuPopoverMenuDotuniDotdriverMod.PopoverMenuUniDriver
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableActionCellTableActionCellDotuniDotdriverMod {
  
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
    
    def getMoreActionsTooltipText(): js.Promise[String]
    
    def getPrimaryActionButtonDriver(): js.Promise[ReturnType[js.Function1[/* base */ BaseUniDriver, ButtonUniDriver]]]
    
    def getVisibleActionByDataHookTooltipDriver(dataHook: String): js.Promise[
        ReturnType[js.Function2[/* base */ UniDriver[Any], /* body */ UniDriver[Any], HasSize]]
      ]
    
    def getVisibleActionTooltipDriver(action: Double): js.Promise[
        ReturnType[js.Function2[/* base */ UniDriver[Any], /* body */ UniDriver[Any], HasSize]]
      ]
    
    def getVisibleActionsCount(): js.Promise[Double]
    
    def primaryActionButtonPrefixIconExists(): js.Promise[Boolean]
    
    def primaryActionButtonSuffixIconExists(): js.Promise[Boolean]
  }
  object TableActionCellUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickHiddenAction: Double => js.Promise[Unit],
      clickHiddenActionByDataHook: String => js.Promise[Unit],
      clickPopoverMenu: () => js.Promise[Unit],
      clickPrimaryActionButton: () => js.Promise[Unit],
      clickVisibleAction: Double => js.Promise[Unit],
      clickVisibleActionByDataHook: String => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      getHiddenActionsCount: () => js.Promise[Double],
      getHiddenActionsPopoverMenuDriver: () => js.Promise[PopoverMenuUniDriver],
      getIsPrimaryActionButtonDisabled: () => js.Promise[Boolean],
      getMoreActionsTooltipText: () => js.Promise[String],
      getPrimaryActionButtonDriver: () => js.Promise[ReturnType[js.Function1[/* base */ BaseUniDriver, ButtonUniDriver]]],
      getVisibleActionByDataHookTooltipDriver: String => js.Promise[
          ReturnType[js.Function2[/* base */ UniDriver[Any], /* body */ UniDriver[Any], HasSize]]
        ],
      getVisibleActionTooltipDriver: Double => js.Promise[
          ReturnType[js.Function2[/* base */ UniDriver[Any], /* body */ UniDriver[Any], HasSize]]
        ],
      getVisibleActionsCount: () => js.Promise[Double],
      primaryActionButtonPrefixIconExists: () => js.Promise[Boolean],
      primaryActionButtonSuffixIconExists: () => js.Promise[Boolean]
    ): TableActionCellUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickHiddenAction = js.Any.fromFunction1(clickHiddenAction), clickHiddenActionByDataHook = js.Any.fromFunction1(clickHiddenActionByDataHook), clickPopoverMenu = js.Any.fromFunction0(clickPopoverMenu), clickPrimaryActionButton = js.Any.fromFunction0(clickPrimaryActionButton), clickVisibleAction = js.Any.fromFunction1(clickVisibleAction), clickVisibleActionByDataHook = js.Any.fromFunction1(clickVisibleActionByDataHook), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getHiddenActionsCount = js.Any.fromFunction0(getHiddenActionsCount), getHiddenActionsPopoverMenuDriver = js.Any.fromFunction0(getHiddenActionsPopoverMenuDriver), getIsPrimaryActionButtonDisabled = js.Any.fromFunction0(getIsPrimaryActionButtonDisabled), getMoreActionsTooltipText = js.Any.fromFunction0(getMoreActionsTooltipText), getPrimaryActionButtonDriver = js.Any.fromFunction0(getPrimaryActionButtonDriver), getVisibleActionByDataHookTooltipDriver = js.Any.fromFunction1(getVisibleActionByDataHookTooltipDriver), getVisibleActionTooltipDriver = js.Any.fromFunction1(getVisibleActionTooltipDriver), getVisibleActionsCount = js.Any.fromFunction0(getVisibleActionsCount), primaryActionButtonPrefixIconExists = js.Any.fromFunction0(primaryActionButtonPrefixIconExists), primaryActionButtonSuffixIconExists = js.Any.fromFunction0(primaryActionButtonSuffixIconExists))
      __obj.asInstanceOf[TableActionCellUniDriver]
    }
    
    extension [Self <: TableActionCellUniDriver](x: Self) {
      
      inline def setClickHiddenAction(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickHiddenAction", js.Any.fromFunction1(value))
      
      inline def setClickHiddenActionByDataHook(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickHiddenActionByDataHook", js.Any.fromFunction1(value))
      
      inline def setClickPopoverMenu(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickPopoverMenu", js.Any.fromFunction0(value))
      
      inline def setClickPrimaryActionButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickPrimaryActionButton", js.Any.fromFunction0(value))
      
      inline def setClickVisibleAction(value: Double => js.Promise[Unit]): Self = StObject.set(x, "clickVisibleAction", js.Any.fromFunction1(value))
      
      inline def setClickVisibleActionByDataHook(value: String => js.Promise[Unit]): Self = StObject.set(x, "clickVisibleActionByDataHook", js.Any.fromFunction1(value))
      
      inline def setGetHiddenActionsCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getHiddenActionsCount", js.Any.fromFunction0(value))
      
      inline def setGetHiddenActionsPopoverMenuDriver(value: () => js.Promise[PopoverMenuUniDriver]): Self = StObject.set(x, "getHiddenActionsPopoverMenuDriver", js.Any.fromFunction0(value))
      
      inline def setGetIsPrimaryActionButtonDisabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "getIsPrimaryActionButtonDisabled", js.Any.fromFunction0(value))
      
      inline def setGetMoreActionsTooltipText(value: () => js.Promise[String]): Self = StObject.set(x, "getMoreActionsTooltipText", js.Any.fromFunction0(value))
      
      inline def setGetPrimaryActionButtonDriver(value: () => js.Promise[ReturnType[js.Function1[/* base */ BaseUniDriver, ButtonUniDriver]]]): Self = StObject.set(x, "getPrimaryActionButtonDriver", js.Any.fromFunction0(value))
      
      inline def setGetVisibleActionByDataHookTooltipDriver(
        value: String => js.Promise[
              ReturnType[js.Function2[/* base */ UniDriver[Any], /* body */ UniDriver[Any], HasSize]]
            ]
      ): Self = StObject.set(x, "getVisibleActionByDataHookTooltipDriver", js.Any.fromFunction1(value))
      
      inline def setGetVisibleActionTooltipDriver(
        value: Double => js.Promise[
              ReturnType[js.Function2[/* base */ UniDriver[Any], /* body */ UniDriver[Any], HasSize]]
            ]
      ): Self = StObject.set(x, "getVisibleActionTooltipDriver", js.Any.fromFunction1(value))
      
      inline def setGetVisibleActionsCount(value: () => js.Promise[Double]): Self = StObject.set(x, "getVisibleActionsCount", js.Any.fromFunction0(value))
      
      inline def setPrimaryActionButtonPrefixIconExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "primaryActionButtonPrefixIconExists", js.Any.fromFunction0(value))
      
      inline def setPrimaryActionButtonSuffixIconExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "primaryActionButtonSuffixIconExists", js.Any.fromFunction0(value))
    }
  }
}
