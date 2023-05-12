package typings.wordpressCompose

import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseFixedWindowListMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-fixed-window-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(elementRef: RefObject[HTMLElement], itemHeight: Double, totalItems: Double): js.Tuple2[WPFixedWindowList, js.Function1[/* nextWindow */ WPFixedWindowList, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elementRef.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], totalItems.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[WPFixedWindowList, js.Function1[/* nextWindow */ WPFixedWindowList, Unit]]]
  inline def default(
    elementRef: RefObject[HTMLElement],
    itemHeight: Double,
    totalItems: Double,
    options: WPFixedWindowListOptions
  ): js.Tuple2[WPFixedWindowList, js.Function1[/* nextWindow */ WPFixedWindowList, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elementRef.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], totalItems.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[WPFixedWindowList, js.Function1[/* nextWindow */ WPFixedWindowList, Unit]]]
  
  trait WPFixedWindowList extends StObject {
    
    /**
      * End index of the window
      */
    var end: Double
    
    /**
      * Returns true if item is in the window
      */
    def itemInView(index: Double): Boolean
    
    /**
      * Start index of the window
      */
    var start: Double
    
    /**
      * Items visible in the current viewport
      */
    var visibleItems: Double
  }
  object WPFixedWindowList {
    
    inline def apply(end: Double, itemInView: Double => Boolean, start: Double, visibleItems: Double): WPFixedWindowList = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], itemInView = js.Any.fromFunction1(itemInView), start = start.asInstanceOf[js.Any], visibleItems = visibleItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[WPFixedWindowList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WPFixedWindowList] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setItemInView(value: Double => Boolean): Self = StObject.set(x, "itemInView", js.Any.fromFunction1(value))
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setVisibleItems(value: Double): Self = StObject.set(x, "visibleItems", value.asInstanceOf[js.Any])
    }
  }
  
  trait WPFixedWindowListOptions extends StObject {
    
    /**
      * Initial window size to use on first render before we can calculate the window size.
      */
    var initWindowSize: js.UndefOr[Double] = js.undefined
    
    /**
      * When false avoids calculating the window size
      */
    var useWindowing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Renders windowOverscan number of items before and after the calculated visible window.
      */
    var windowOverscan: js.UndefOr[Double] = js.undefined
  }
  object WPFixedWindowListOptions {
    
    inline def apply(): WPFixedWindowListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WPFixedWindowListOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WPFixedWindowListOptions] (val x: Self) extends AnyVal {
      
      inline def setInitWindowSize(value: Double): Self = StObject.set(x, "initWindowSize", value.asInstanceOf[js.Any])
      
      inline def setInitWindowSizeUndefined: Self = StObject.set(x, "initWindowSize", js.undefined)
      
      inline def setUseWindowing(value: Boolean): Self = StObject.set(x, "useWindowing", value.asInstanceOf[js.Any])
      
      inline def setUseWindowingUndefined: Self = StObject.set(x, "useWindowing", js.undefined)
      
      inline def setWindowOverscan(value: Double): Self = StObject.set(x, "windowOverscan", value.asInstanceOf[js.Any])
      
      inline def setWindowOverscanUndefined: Self = StObject.set(x, "windowOverscan", js.undefined)
    }
  }
}
