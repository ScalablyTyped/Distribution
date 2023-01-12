package typings.uiGrid.mod

import typings.angular.mod.IPromise
import typings.uiGrid.anon.NeedLoadMoreData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object infiniteScroll {
  
  @js.native
  trait IGridInfiniteScrollApi[TEntity] extends StObject {
    
    // Methods
    /**
      * Call this function when you have loaded the additional data requested.
      * You should set scrollUp and scrollDown to indicate whether there are still more pages in each direction.
      *
      * If you call dataLoaded without first calling saveScrollPercentage, then we will scroll the user to the
      * start of the newly loaded data.  This usually makes scrolling smooth, but be jumpy with large
      * infiniteScrollRowsFromEnd values, and on variable speed internet connections.
      * Using saveScrollPercentage as demonstrated in the tutorial should give a smoother scrolling experience
      * for users.
      *
      * See infinite_scroll tutorial for example of usage
      * @param scrollUp if set to false flags that there are no more pages upwards, so don't fire any
      *        more infinite scroll events upward
      * @param scrollDown if set to false flags that there are no more pages downwards, so don't fire
      *        any more infinite scroll events downward
      * @returns a promise that is resolved when the grid scrolling is fully adjusted.
      *          If you're planning to remove pages, you should wait on this promise first, or you'll break the
      *          scroll positioning
      */
    def dataLoaded(scrollUp: Boolean, scrollDown: Boolean): IPromise[Any] = js.native
    
    /**
      * Adjusts the scroll position after you've removed data at the bottom.
      * You should have called saveScrollPercentage before you remove the data,
      * and if you're doing this in response to a needMoreData you should wait
      * until the promise from loadData has resolved before you start removing data
      *
      * @param grid the grid we're working on
      * @param scrollUp flag that there are pages upwards, fire infinite scroll events upward
      * @param scrollDown flag that there are pages downwards, so fire infinite scroll events downward
      * @returns A promise that is resolved when scrolling finishes
      */
    def dataRemovedBottom(grid: IGridInstanceOf[TEntity], scrollUp: Boolean, scrollDown: Boolean): IPromise[Any] = js.native
    /**
      * Adjusts the scroll position after you've removed data at the bottom
      * @param scrollUp flag that there are pages upwards, fire infinite scroll events upward
      * @param scrollDown flag that there are pages downwards, so fire infinite scroll events downward
      * @returns A promise that is resolved when scrolling finishes
      */
    def dataRemovedBottom(scrollUp: Boolean, scrollDown: Boolean): IPromise[Any] = js.native
    
    /**
      * Adjusts the scroll position after you've removed data at the bottom.
      * You should have called saveScrollPercentage before you remove the data,
      * and if you're doing this in response to a needMoreData you should wait
      * until the promise from loadData has resolved before you start removing data
      *
      * @param grid the grid we're working on
      * @param scrollUp flag that there are pages upwards, fire infinite scroll events upward
      * @param scrollDown flag that there are pages downwards, so fire infinite scroll events downward
      * @returns A promise that is resolved when scrolling finishes
      */
    def dataRemovedTop(grid: IGridInstanceOf[TEntity], scrollUp: Boolean, scrollDown: Boolean): IPromise[Any] = js.native
    /**
      * Adjusts the scroll position after you've removed data at the bottom
      * @param scrollUp flag that there are pages upwards, fire infinite scroll events upward
      * @param scrollDown flag that there are pages downwards, so fire infinite scroll events downward
      * @returns A promise that is resolved when scrolling finishes
      */
    def dataRemovedTop(scrollUp: Boolean, scrollDown: Boolean): IPromise[Any] = js.native
    
    // Events
    var on: NeedLoadMoreData = js.native
    
    /**
      * Call this function when you have taken some action that makes the current scroll position invalid.
      * For example, if you're using external sorting and you've resorted then you might reset the scroll,
      * or if you've otherwise substantially changed the data, perhaps you've reused an
      * existing grid for a new data set
      *
      * You must tell us whether there is data upwards or downwards after the reset
      * @param scrollUp flag that there are pages upwards, fire infinite scroll events upward
      * @param scrollDown flag that there are pages downwards, so fire infinite scroll events downward
      * @returns A promise that is resolved when scrolling finishes
      */
    def resetScroll(scrollUp: Boolean, scrollDown: Boolean): IPromise[Any] = js.native
    
    /**
      * Saves the scroll percentage and number of visible rows before you adjust the data,
      * used if you're subsequently going to call dataRemovedTop or dataRemovedBottom
      */
    def saveScrollPercentage(): Unit = js.native
  }
  
  trait IGridOptions extends StObject {
    
    /**
      * Enable infinite scrolling for this grid
      * Defaults to true
      * @default true
      */
    var enableInfiniteScroll: js.UndefOr[Boolean] = js.undefined
  }
  object IGridOptions {
    
    inline def apply(): typings.uiGrid.mod.infiniteScroll.IGridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.uiGrid.mod.infiniteScroll.IGridOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.uiGrid.mod.infiniteScroll.IGridOptions] (val x: Self) extends AnyVal {
      
      inline def setEnableInfiniteScroll(value: Boolean): Self = StObject.set(x, "enableInfiniteScroll", value.asInstanceOf[js.Any])
      
      inline def setEnableInfiniteScrollUndefined: Self = StObject.set(x, "enableInfiniteScroll", js.undefined)
    }
  }
}
