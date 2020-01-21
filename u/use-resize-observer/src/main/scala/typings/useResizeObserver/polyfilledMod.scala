package typings.useResizeObserver

import typings.std.HTMLElement
import typings.useResizeObserver.mod.DefaultsWithResizeHandler
import typings.useResizeObserver.mod.DefaultsWithoutResizeHandler
import typings.useResizeObserver.mod.ObserverResultForResizeHandler
import typings.useResizeObserver.mod.ObserverResultWithSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-resize-observer/polyfilled", JSImport.Namespace)
@js.native
object polyfilledMod extends js.Object {
  @js.native
  object default extends js.Object {
    /***
      * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
      * The hook is invoked at least once before the first measurement of actual size by the observer.
      * @return a ref,
      *         and ref.current's width (undefined before the first measurement),
      *         and ref.current's height (undefined before the first measurement).
      */
    def apply(): ObserverResultWithSize[HTMLElement] = js.native
    /***
      * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
      * The hook is invoked at least once before the first measurement of actual size by the observer.
      * @param defaults The onResize callback will be called with new ref.current's width and height as a parameter.
      *         Because of that, the ref.current's width and height are not returned.
      * @return a ref (optionally pass in your own)
      *         The callback function will be called with new ref.current's width and height as a parameter.
      */
    def apply[TElement /* <: HTMLElement */](defaults: DefaultsWithResizeHandler[TElement]): ObserverResultForResizeHandler[TElement] = js.native
    /***
      * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
      * The hook is invoked at least once before the first measurement of actual size by the observer.
      * @return a ref (optionally pass in your own),
      *         and ref.current's width (undefined before the first measurement),
      *         and ref.current's height (undefined before the first measurement).
      */
    def apply[TElement /* <: HTMLElement */](defaults: DefaultsWithoutResizeHandler[TElement]): ObserverResultWithSize[TElement] = js.native
  }
  
}

