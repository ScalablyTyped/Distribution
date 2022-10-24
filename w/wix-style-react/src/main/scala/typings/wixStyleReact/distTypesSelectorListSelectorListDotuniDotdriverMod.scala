package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import typings.wixUiTestUtils.distSrcUniDriverFactoryCreateUniDriverFactoryMod.UniDriverFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorListSelectorListDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/SelectorList/SelectorList.uni.driver", "selectorListUniDriverFactory")
  @js.native
  val selectorListUniDriverFactory: UniDriverFactory[SelectorListUniDriver] = js.native
  
  trait SelectorListUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickSearchInputClear(): js.Promise[Unit]
    
    def clickToggleAllCheckbox(): js.Promise[Unit]
    
    def enterSearchValue(value: String): js.Promise[Unit]
    
    def focusSearchInput(): js.Promise[Unit]
    
    def getEmptyState(): js.Promise[HTMLElement]
    
    def getNoResultsFoundState(): js.Promise[HTMLElement]
    
    def getSearchValue(): js.Promise[String]
    
    def getToggleAllCheckboxLabel(): js.Promise[String]
    
    def isSelectorCheckedAt(i: Double): js.Promise[Boolean]
    
    def isSelectorDisabledAt(i: Double): js.Promise[Boolean]
    
    def isSelectorIsIndeterminateAt(i: Double): js.Promise[Boolean]
    
    def isToggleAllCheckboxChecked(): js.Promise[Boolean]
    
    def listExists(): js.Promise[Boolean]
    
    def mainLoaderExists(): js.Promise[Boolean]
    
    def nextPageLoaderExists(): js.Promise[Boolean]
    
    def numberOfItemsInList(): js.Promise[Double]
    
    def scrollDown(): js.Promise[Boolean]
    
    def searchInputExists(): js.Promise[Boolean]
    
    def showsEmptyState(): js.Promise[Boolean]
    
    def showsNoResultsFoundState(): js.Promise[Boolean]
    
    def toggleAllCheckboxExists(): js.Promise[Boolean]
    
    def toggleSelectorAt(i: Double): js.Promise[Unit]
  }
  object SelectorListUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickSearchInputClear: () => js.Promise[Unit],
      clickToggleAllCheckbox: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      enterSearchValue: String => js.Promise[Unit],
      exists: () => js.Promise[Boolean],
      focusSearchInput: () => js.Promise[Unit],
      getEmptyState: () => js.Promise[HTMLElement],
      getNoResultsFoundState: () => js.Promise[HTMLElement],
      getSearchValue: () => js.Promise[String],
      getToggleAllCheckboxLabel: () => js.Promise[String],
      isSelectorCheckedAt: Double => js.Promise[Boolean],
      isSelectorDisabledAt: Double => js.Promise[Boolean],
      isSelectorIsIndeterminateAt: Double => js.Promise[Boolean],
      isToggleAllCheckboxChecked: () => js.Promise[Boolean],
      listExists: () => js.Promise[Boolean],
      mainLoaderExists: () => js.Promise[Boolean],
      nextPageLoaderExists: () => js.Promise[Boolean],
      numberOfItemsInList: () => js.Promise[Double],
      scrollDown: () => js.Promise[Boolean],
      searchInputExists: () => js.Promise[Boolean],
      showsEmptyState: () => js.Promise[Boolean],
      showsNoResultsFoundState: () => js.Promise[Boolean],
      toggleAllCheckboxExists: () => js.Promise[Boolean],
      toggleSelectorAt: Double => js.Promise[Unit]
    ): SelectorListUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickSearchInputClear = js.Any.fromFunction0(clickSearchInputClear), clickToggleAllCheckbox = js.Any.fromFunction0(clickToggleAllCheckbox), element = js.Any.fromFunction0(element), enterSearchValue = js.Any.fromFunction1(enterSearchValue), exists = js.Any.fromFunction0(exists), focusSearchInput = js.Any.fromFunction0(focusSearchInput), getEmptyState = js.Any.fromFunction0(getEmptyState), getNoResultsFoundState = js.Any.fromFunction0(getNoResultsFoundState), getSearchValue = js.Any.fromFunction0(getSearchValue), getToggleAllCheckboxLabel = js.Any.fromFunction0(getToggleAllCheckboxLabel), isSelectorCheckedAt = js.Any.fromFunction1(isSelectorCheckedAt), isSelectorDisabledAt = js.Any.fromFunction1(isSelectorDisabledAt), isSelectorIsIndeterminateAt = js.Any.fromFunction1(isSelectorIsIndeterminateAt), isToggleAllCheckboxChecked = js.Any.fromFunction0(isToggleAllCheckboxChecked), listExists = js.Any.fromFunction0(listExists), mainLoaderExists = js.Any.fromFunction0(mainLoaderExists), nextPageLoaderExists = js.Any.fromFunction0(nextPageLoaderExists), numberOfItemsInList = js.Any.fromFunction0(numberOfItemsInList), scrollDown = js.Any.fromFunction0(scrollDown), searchInputExists = js.Any.fromFunction0(searchInputExists), showsEmptyState = js.Any.fromFunction0(showsEmptyState), showsNoResultsFoundState = js.Any.fromFunction0(showsNoResultsFoundState), toggleAllCheckboxExists = js.Any.fromFunction0(toggleAllCheckboxExists), toggleSelectorAt = js.Any.fromFunction1(toggleSelectorAt))
      __obj.asInstanceOf[SelectorListUniDriver]
    }
    
    extension [Self <: SelectorListUniDriver](x: Self) {
      
      inline def setClickSearchInputClear(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickSearchInputClear", js.Any.fromFunction0(value))
      
      inline def setClickToggleAllCheckbox(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickToggleAllCheckbox", js.Any.fromFunction0(value))
      
      inline def setEnterSearchValue(value: String => js.Promise[Unit]): Self = StObject.set(x, "enterSearchValue", js.Any.fromFunction1(value))
      
      inline def setFocusSearchInput(value: () => js.Promise[Unit]): Self = StObject.set(x, "focusSearchInput", js.Any.fromFunction0(value))
      
      inline def setGetEmptyState(value: () => js.Promise[HTMLElement]): Self = StObject.set(x, "getEmptyState", js.Any.fromFunction0(value))
      
      inline def setGetNoResultsFoundState(value: () => js.Promise[HTMLElement]): Self = StObject.set(x, "getNoResultsFoundState", js.Any.fromFunction0(value))
      
      inline def setGetSearchValue(value: () => js.Promise[String]): Self = StObject.set(x, "getSearchValue", js.Any.fromFunction0(value))
      
      inline def setGetToggleAllCheckboxLabel(value: () => js.Promise[String]): Self = StObject.set(x, "getToggleAllCheckboxLabel", js.Any.fromFunction0(value))
      
      inline def setIsSelectorCheckedAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isSelectorCheckedAt", js.Any.fromFunction1(value))
      
      inline def setIsSelectorDisabledAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isSelectorDisabledAt", js.Any.fromFunction1(value))
      
      inline def setIsSelectorIsIndeterminateAt(value: Double => js.Promise[Boolean]): Self = StObject.set(x, "isSelectorIsIndeterminateAt", js.Any.fromFunction1(value))
      
      inline def setIsToggleAllCheckboxChecked(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isToggleAllCheckboxChecked", js.Any.fromFunction0(value))
      
      inline def setListExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "listExists", js.Any.fromFunction0(value))
      
      inline def setMainLoaderExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "mainLoaderExists", js.Any.fromFunction0(value))
      
      inline def setNextPageLoaderExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "nextPageLoaderExists", js.Any.fromFunction0(value))
      
      inline def setNumberOfItemsInList(value: () => js.Promise[Double]): Self = StObject.set(x, "numberOfItemsInList", js.Any.fromFunction0(value))
      
      inline def setScrollDown(value: () => js.Promise[Boolean]): Self = StObject.set(x, "scrollDown", js.Any.fromFunction0(value))
      
      inline def setSearchInputExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "searchInputExists", js.Any.fromFunction0(value))
      
      inline def setShowsEmptyState(value: () => js.Promise[Boolean]): Self = StObject.set(x, "showsEmptyState", js.Any.fromFunction0(value))
      
      inline def setShowsNoResultsFoundState(value: () => js.Promise[Boolean]): Self = StObject.set(x, "showsNoResultsFoundState", js.Any.fromFunction0(value))
      
      inline def setToggleAllCheckboxExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "toggleAllCheckboxExists", js.Any.fromFunction0(value))
      
      inline def setToggleSelectorAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "toggleSelectorAt", js.Any.fromFunction1(value))
    }
  }
}
