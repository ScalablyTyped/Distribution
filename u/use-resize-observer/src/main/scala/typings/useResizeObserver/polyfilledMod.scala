package typings.useResizeObserver

import typings.std.HTMLElement
import typings.useResizeObserver.mod.DefaultsWithResizeHandler
import typings.useResizeObserver.mod.DefaultsWithoutResizeHandler
import typings.useResizeObserver.mod.ObserverResultForResizeHandler
import typings.useResizeObserver.mod.ObserverResultWithSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polyfilledMod {
  
  object default {
    
    /***
      * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
      * The hook is invoked at least once before the first measurement of actual size by the observer.
      * @return a ref,
      *         and ref.current's width (undefined before the first measurement),
      *         and ref.current's height (undefined before the first measurement).
      */
    @scala.inline
    def apply(): ObserverResultWithSize[HTMLElement] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ObserverResultWithSize[HTMLElement]]
    /***
      * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
      * The hook is invoked at least once before the first measurement of actual size by the observer.
      * @param defaults The onResize callback will be called with new ref.current's width and height as a parameter.
      *         Because of that, the ref.current's width and height are not returned.
      * @return a ref (optionally pass in your own)
      *         The callback function will be called with new ref.current's width and height as a parameter.
      */
    @scala.inline
    def apply[TElement /* <: HTMLElement */](defaults: DefaultsWithResizeHandler[TElement]): ObserverResultForResizeHandler[TElement] = ^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any]).asInstanceOf[ObserverResultForResizeHandler[TElement]]
    /***
      * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
      * The hook is invoked at least once before the first measurement of actual size by the observer.
      * @return a ref (optionally pass in your own),
      *         and ref.current's width (undefined before the first measurement),
      *         and ref.current's height (undefined before the first measurement).
      */
    @scala.inline
    def apply[TElement /* <: HTMLElement */](defaults: DefaultsWithoutResizeHandler[TElement]): ObserverResultWithSize[TElement] = ^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any]).asInstanceOf[ObserverResultWithSize[TElement]]
    
    @JSImport("use-resize-observer/polyfilled", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
