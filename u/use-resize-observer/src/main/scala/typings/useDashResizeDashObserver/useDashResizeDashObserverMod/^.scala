package typings.useDashResizeDashObserver.useDashResizeDashObserverMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-resize-observer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /***
    * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
    * The hook is invoked at least once before the first measurement of actual size by the observer.
    * @return a ref,
    *         and ref.current's width (1 before the first measurement),
    *         and ref.current's height (1 before the first measurement).
    */
  def apply(): ObserverResultWithDefaultSize[HTMLElement] = js.native
  /***
    * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
    * The hook is invoked at least once before the first measurement of actual size by the observer.
    * @return a ref (optionally pass in your own),
    *         and ref.current's width (defaultWidth the first measurement),
    *         and height (defaultHeight before the first measurement)".
    */
  def apply[TElement /* <: HTMLElement */](defaults: DefaultsWithSize[TElement]): ObserverResultWithDefaultSize[TElement] = js.native
  /***
    * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
    * The hook is invoked at least once before the first measurement of actual size by the observer.
    * @return a ref (optionally pass in your own),
    *         and ref.current's width (defaultWidth the first measurement),
    *         and height (undefined before the first measurement)".
    */
  def apply[TElement /* <: HTMLElement */](defaults: DefaultsWithWidthOnly[TElement]): ObserverResultWithDefaultWidthOnly[TElement] = js.native
  /***
    * Allows using a ResizeObserver to measure size of an element assigned with ref returned from the hook.
    * The hook is invoked at least once before the first measurement of actual size by the observer.
    * @return a ref (optionally pass in your own),
    *         and ref.current's width (undefined before the first measurement),
    *         and ref.current's height (undefined before the first measurement).
    */
  def apply[TElement /* <: HTMLElement */](defaults: DefaultsWithoutSize[TElement]): ObserverResultWithoutDefaultSize[TElement] = js.native
}

