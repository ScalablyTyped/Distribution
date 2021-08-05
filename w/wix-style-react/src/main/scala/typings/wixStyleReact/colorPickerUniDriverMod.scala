package typings.wixStyleReact

import typings.unidriverCore.mod.UniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorPickerUniDriverMod {
  
  trait ColorPickerUniDriver
    extends StObject
       with BaseUniDriver {
    
    def cancel(): js.Promise[Unit]
    
    def clickAddColor(): js.Promise[Unit]
    
    def clickOnPreviousColor(): js.Promise[Unit]
    
    def confirm(): js.Promise[Unit]
    
    def getChildren(): UniDriver[js.Any]
    
    def historyCurrentColor(): js.Promise[String]
    
    def historyPanelExists(): js.Promise[Boolean]
    
    def historyPreviousColor(): js.Promise[String]
    
    def selectHsbTab(): js.Promise[Unit]
    
    def selectRgbTab(): js.Promise[Unit]
  }
  object ColorPickerUniDriver {
    
    inline def apply(
      cancel: () => js.Promise[Unit],
      click: () => js.Promise[Unit],
      clickAddColor: () => js.Promise[Unit],
      clickOnPreviousColor: () => js.Promise[Unit],
      confirm: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      getChildren: () => UniDriver[js.Any],
      historyCurrentColor: () => js.Promise[String],
      historyPanelExists: () => js.Promise[Boolean],
      historyPreviousColor: () => js.Promise[String],
      selectHsbTab: () => js.Promise[Unit],
      selectRgbTab: () => js.Promise[Unit]
    ): ColorPickerUniDriver = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), click = js.Any.fromFunction0(click), clickAddColor = js.Any.fromFunction0(clickAddColor), clickOnPreviousColor = js.Any.fromFunction0(clickOnPreviousColor), confirm = js.Any.fromFunction0(confirm), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getChildren = js.Any.fromFunction0(getChildren), historyCurrentColor = js.Any.fromFunction0(historyCurrentColor), historyPanelExists = js.Any.fromFunction0(historyPanelExists), historyPreviousColor = js.Any.fromFunction0(historyPreviousColor), selectHsbTab = js.Any.fromFunction0(selectHsbTab), selectRgbTab = js.Any.fromFunction0(selectRgbTab))
      __obj.asInstanceOf[ColorPickerUniDriver]
    }
    
    extension [Self <: ColorPickerUniDriver](x: Self) {
      
      inline def setCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setClickAddColor(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickAddColor", js.Any.fromFunction0(value))
      
      inline def setClickOnPreviousColor(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnPreviousColor", js.Any.fromFunction0(value))
      
      inline def setConfirm(value: () => js.Promise[Unit]): Self = StObject.set(x, "confirm", js.Any.fromFunction0(value))
      
      inline def setGetChildren(value: () => UniDriver[js.Any]): Self = StObject.set(x, "getChildren", js.Any.fromFunction0(value))
      
      inline def setHistoryCurrentColor(value: () => js.Promise[String]): Self = StObject.set(x, "historyCurrentColor", js.Any.fromFunction0(value))
      
      inline def setHistoryPanelExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "historyPanelExists", js.Any.fromFunction0(value))
      
      inline def setHistoryPreviousColor(value: () => js.Promise[String]): Self = StObject.set(x, "historyPreviousColor", js.Any.fromFunction0(value))
      
      inline def setSelectHsbTab(value: () => js.Promise[Unit]): Self = StObject.set(x, "selectHsbTab", js.Any.fromFunction0(value))
      
      inline def setSelectRgbTab(value: () => js.Promise[Unit]): Self = StObject.set(x, "selectRgbTab", js.Any.fromFunction0(value))
    }
  }
}
