package typings.wixStyleReact

import typings.std.HTMLElement
import typings.wixStyleReact.buttonLegacyDriverMod.buttonDriverFactory
import typings.wixStyleReact.checkboxDriverMod.CheckboxDriver
import typings.wixStyleReact.loaderDriverMod.LoaderDriver
import typings.wixStyleReact.searchDriverMod.SearchDriver
import typings.wixStyleReact.selectorDriverMod.SelectorDriver
import typings.wixStyleReact.textDriverMod.TextDriver
import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalSelectorLayoutDriverMod {
  
  trait ModalSelectorLayoutDriver
    extends StObject
       with BaseDriver {
    
    def cancelButtonDriver(): buttonDriverFactory
    
    def clickOnClose(): Unit
    
    def footerSelector(): CheckboxDriver
    
    def getEmptyState(): HTMLElement
    
    def getNoResultsFoundState(): HTMLElement
    
    def getSelectorDriverAt(i: Double): SelectorDriver
    
    def getTitle(): String
    
    def listExists(): Boolean
    
    def mainLoaderDriver(): LoaderDriver
    
    def nextPageLoaderDriver(): LoaderDriver
    
    def numberOfItemsInList(): Double
    
    def okButtonDriver(): buttonDriverFactory
    
    def scrollDown(): Boolean
    
    def searchDriver(): SearchDriver
    
    def showsEmptyState(): Boolean
    
    def showsNoResultsFoundState(): Boolean
    
    def subtitleTextDriver(): TextDriver
  }
  object ModalSelectorLayoutDriver {
    
    @scala.inline
    def apply(
      cancelButtonDriver: () => buttonDriverFactory,
      clickOnClose: () => Unit,
      exists: () => Boolean,
      footerSelector: () => CheckboxDriver,
      getEmptyState: () => HTMLElement,
      getNoResultsFoundState: () => HTMLElement,
      getSelectorDriverAt: Double => SelectorDriver,
      getTitle: () => String,
      listExists: () => Boolean,
      mainLoaderDriver: () => LoaderDriver,
      nextPageLoaderDriver: () => LoaderDriver,
      numberOfItemsInList: () => Double,
      okButtonDriver: () => buttonDriverFactory,
      scrollDown: () => Boolean,
      searchDriver: () => SearchDriver,
      showsEmptyState: () => Boolean,
      showsNoResultsFoundState: () => Boolean,
      subtitleTextDriver: () => TextDriver
    ): ModalSelectorLayoutDriver = {
      val __obj = js.Dynamic.literal(cancelButtonDriver = js.Any.fromFunction0(cancelButtonDriver), clickOnClose = js.Any.fromFunction0(clickOnClose), exists = js.Any.fromFunction0(exists), footerSelector = js.Any.fromFunction0(footerSelector), getEmptyState = js.Any.fromFunction0(getEmptyState), getNoResultsFoundState = js.Any.fromFunction0(getNoResultsFoundState), getSelectorDriverAt = js.Any.fromFunction1(getSelectorDriverAt), getTitle = js.Any.fromFunction0(getTitle), listExists = js.Any.fromFunction0(listExists), mainLoaderDriver = js.Any.fromFunction0(mainLoaderDriver), nextPageLoaderDriver = js.Any.fromFunction0(nextPageLoaderDriver), numberOfItemsInList = js.Any.fromFunction0(numberOfItemsInList), okButtonDriver = js.Any.fromFunction0(okButtonDriver), scrollDown = js.Any.fromFunction0(scrollDown), searchDriver = js.Any.fromFunction0(searchDriver), showsEmptyState = js.Any.fromFunction0(showsEmptyState), showsNoResultsFoundState = js.Any.fromFunction0(showsNoResultsFoundState), subtitleTextDriver = js.Any.fromFunction0(subtitleTextDriver))
      __obj.asInstanceOf[ModalSelectorLayoutDriver]
    }
    
    @scala.inline
    implicit class ModalSelectorLayoutDriverMutableBuilder[Self <: ModalSelectorLayoutDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButtonDriver(value: () => buttonDriverFactory): Self = StObject.set(x, "cancelButtonDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClickOnClose(value: () => Unit): Self = StObject.set(x, "clickOnClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFooterSelector(value: () => CheckboxDriver): Self = StObject.set(x, "footerSelector", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEmptyState(value: () => HTMLElement): Self = StObject.set(x, "getEmptyState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNoResultsFoundState(value: () => HTMLElement): Self = StObject.set(x, "getNoResultsFoundState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSelectorDriverAt(value: Double => SelectorDriver): Self = StObject.set(x, "getSelectorDriverAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setListExists(value: () => Boolean): Self = StObject.set(x, "listExists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMainLoaderDriver(value: () => LoaderDriver): Self = StObject.set(x, "mainLoaderDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNextPageLoaderDriver(value: () => LoaderDriver): Self = StObject.set(x, "nextPageLoaderDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNumberOfItemsInList(value: () => Double): Self = StObject.set(x, "numberOfItemsInList", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOkButtonDriver(value: () => buttonDriverFactory): Self = StObject.set(x, "okButtonDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScrollDown(value: () => Boolean): Self = StObject.set(x, "scrollDown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSearchDriver(value: () => SearchDriver): Self = StObject.set(x, "searchDriver", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowsEmptyState(value: () => Boolean): Self = StObject.set(x, "showsEmptyState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowsNoResultsFoundState(value: () => Boolean): Self = StObject.set(x, "showsNoResultsFoundState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubtitleTextDriver(value: () => TextDriver): Self = StObject.set(x, "subtitleTextDriver", js.Any.fromFunction0(value))
    }
  }
}
