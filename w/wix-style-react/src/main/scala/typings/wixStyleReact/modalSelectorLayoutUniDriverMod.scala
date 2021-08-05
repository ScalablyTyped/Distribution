package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.buttonUniDriverMod.ButtonUniDriver
import typings.wixStyleReact.checkboxUniDriverMod.CheckboxUniDriver
import typings.wixStyleReact.loaderUniDriverMod.LoaderUniDriver
import typings.wixStyleReact.searchUniDriverMod.SearchUniDriver
import typings.wixStyleReact.selectorUniDriverMod.SelectorUniDriver
import typings.wixStyleReact.textUniDriverMod.TextUniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalSelectorLayoutUniDriverMod {
  
  trait ModalSelectorLayoutUniDriver
    extends StObject
       with BaseUniDriver {
    
    def cancelButtonDriver(): ButtonUniDriver
    
    def clickOnClose(): js.Promise[Unit]
    
    def footerSelector(): CheckboxUniDriver
    
    def getEmptyState(): js.Promise[HTMLElement]
    
    def getNoResultsFoundState(): js.Promise[HTMLElement]
    
    def getSelectorDriverAt(i: Double): SelectorUniDriver
    
    def getTitle(): js.Promise[String]
    
    def listExists(): js.Promise[Boolean]
    
    def mainLoaderDriver(): LoaderUniDriver
    
    def nextPageLoaderDriver(): LoaderUniDriver
    
    def numberOfItemsInList(): js.Promise[Double]
    
    def okButtonDriver(): ButtonUniDriver
    
    def scrollDown(): js.Promise[Boolean]
    
    def searchDriver(): SearchUniDriver
    
    def showsEmptyState(): js.Promise[Boolean]
    
    def showsNoResultsFoundState(): js.Promise[Boolean]
    
    def subtitleTextDriver(): TextUniDriver
  }
  object ModalSelectorLayoutUniDriver {
    
    inline def apply(
      cancelButtonDriver: () => ButtonUniDriver,
      click: () => js.Promise[Unit],
      clickOnClose: () => js.Promise[Unit],
      element: () => js.Promise[js.Any],
      exists: () => js.Promise[Boolean],
      footerSelector: () => CheckboxUniDriver,
      getEmptyState: () => js.Promise[HTMLElement],
      getNoResultsFoundState: () => js.Promise[HTMLElement],
      getSelectorDriverAt: Double => SelectorUniDriver,
      getTitle: () => js.Promise[String],
      listExists: () => js.Promise[Boolean],
      mainLoaderDriver: () => LoaderUniDriver,
      nextPageLoaderDriver: () => LoaderUniDriver,
      numberOfItemsInList: () => js.Promise[Double],
      okButtonDriver: () => ButtonUniDriver,
      scrollDown: () => js.Promise[Boolean],
      searchDriver: () => SearchUniDriver,
      showsEmptyState: () => js.Promise[Boolean],
      showsNoResultsFoundState: () => js.Promise[Boolean],
      subtitleTextDriver: () => TextUniDriver
    ): ModalSelectorLayoutUniDriver = {
      val __obj = js.Dynamic.literal(cancelButtonDriver = js.Any.fromFunction0(cancelButtonDriver), click = js.Any.fromFunction0(click), clickOnClose = js.Any.fromFunction0(clickOnClose), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), footerSelector = js.Any.fromFunction0(footerSelector), getEmptyState = js.Any.fromFunction0(getEmptyState), getNoResultsFoundState = js.Any.fromFunction0(getNoResultsFoundState), getSelectorDriverAt = js.Any.fromFunction1(getSelectorDriverAt), getTitle = js.Any.fromFunction0(getTitle), listExists = js.Any.fromFunction0(listExists), mainLoaderDriver = js.Any.fromFunction0(mainLoaderDriver), nextPageLoaderDriver = js.Any.fromFunction0(nextPageLoaderDriver), numberOfItemsInList = js.Any.fromFunction0(numberOfItemsInList), okButtonDriver = js.Any.fromFunction0(okButtonDriver), scrollDown = js.Any.fromFunction0(scrollDown), searchDriver = js.Any.fromFunction0(searchDriver), showsEmptyState = js.Any.fromFunction0(showsEmptyState), showsNoResultsFoundState = js.Any.fromFunction0(showsNoResultsFoundState), subtitleTextDriver = js.Any.fromFunction0(subtitleTextDriver))
      __obj.asInstanceOf[ModalSelectorLayoutUniDriver]
    }
    
    extension [Self <: ModalSelectorLayoutUniDriver](x: Self) {
      
      inline def setCancelButtonDriver(value: () => ButtonUniDriver): Self = StObject.set(x, "cancelButtonDriver", js.Any.fromFunction0(value))
      
      inline def setClickOnClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnClose", js.Any.fromFunction0(value))
      
      inline def setFooterSelector(value: () => CheckboxUniDriver): Self = StObject.set(x, "footerSelector", js.Any.fromFunction0(value))
      
      inline def setGetEmptyState(value: () => js.Promise[HTMLElement]): Self = StObject.set(x, "getEmptyState", js.Any.fromFunction0(value))
      
      inline def setGetNoResultsFoundState(value: () => js.Promise[HTMLElement]): Self = StObject.set(x, "getNoResultsFoundState", js.Any.fromFunction0(value))
      
      inline def setGetSelectorDriverAt(value: Double => SelectorUniDriver): Self = StObject.set(x, "getSelectorDriverAt", js.Any.fromFunction1(value))
      
      inline def setGetTitle(value: () => js.Promise[String]): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      inline def setListExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "listExists", js.Any.fromFunction0(value))
      
      inline def setMainLoaderDriver(value: () => LoaderUniDriver): Self = StObject.set(x, "mainLoaderDriver", js.Any.fromFunction0(value))
      
      inline def setNextPageLoaderDriver(value: () => LoaderUniDriver): Self = StObject.set(x, "nextPageLoaderDriver", js.Any.fromFunction0(value))
      
      inline def setNumberOfItemsInList(value: () => js.Promise[Double]): Self = StObject.set(x, "numberOfItemsInList", js.Any.fromFunction0(value))
      
      inline def setOkButtonDriver(value: () => ButtonUniDriver): Self = StObject.set(x, "okButtonDriver", js.Any.fromFunction0(value))
      
      inline def setScrollDown(value: () => js.Promise[Boolean]): Self = StObject.set(x, "scrollDown", js.Any.fromFunction0(value))
      
      inline def setSearchDriver(value: () => SearchUniDriver): Self = StObject.set(x, "searchDriver", js.Any.fromFunction0(value))
      
      inline def setShowsEmptyState(value: () => js.Promise[Boolean]): Self = StObject.set(x, "showsEmptyState", js.Any.fromFunction0(value))
      
      inline def setShowsNoResultsFoundState(value: () => js.Promise[Boolean]): Self = StObject.set(x, "showsNoResultsFoundState", js.Any.fromFunction0(value))
      
      inline def setSubtitleTextDriver(value: () => TextUniDriver): Self = StObject.set(x, "subtitleTextDriver", js.Any.fromFunction0(value))
    }
  }
}
