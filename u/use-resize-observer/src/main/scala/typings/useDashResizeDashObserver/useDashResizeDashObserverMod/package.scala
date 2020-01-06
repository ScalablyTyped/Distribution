package typings.useDashResizeDashObserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useDashResizeDashObserverMod {
  import typings.std.HTMLElement

  type DefaultsWithSize[TElement] = DefaultsWithHeightOnly[TElement] with DefaultsWithWidthOnly[TElement]
  /* Rewritten from type alias, can be one of: 
    - typings.useDashResizeDashObserver.useDashResizeDashObserverMod.DefaultsWithoutSize[TElement]
    - typings.useDashResizeDashObserver.useDashResizeDashObserverMod.DefaultsWithHeightOnly[TElement]
    - typings.useDashResizeDashObserver.useDashResizeDashObserverMod.DefaultsWithWidthOnly[TElement]
    - typings.useDashResizeDashObserver.useDashResizeDashObserverMod.DefaultsWithSize[TElement]
  */
  type ObserverDefaults[TElement /* <: HTMLElement */] = _ObserverDefaults[TElement] | DefaultsWithSize[TElement]
  type ObserverResultWithDefaultSize[TElement] = ObserverResultWithDefaultHeightOnly[TElement] with ObserverResultWithDefaultWidthOnly[TElement]
}
