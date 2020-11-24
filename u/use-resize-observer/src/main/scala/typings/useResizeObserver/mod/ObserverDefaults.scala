package typings.useResizeObserver.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.useResizeObserver.mod.DefaultsWithoutResizeHandler[TElement]
  - typings.useResizeObserver.mod.DefaultsWithResizeHandler[TElement]
*/
trait ObserverDefaults[TElement /* <: HTMLElement */] extends js.Object
object ObserverDefaults {
  
  @scala.inline
  def DefaultsWithoutResizeHandler[TElement /* <: HTMLElement */](): ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserverDefaults[TElement]]
  }
  
  @scala.inline
  def DefaultsWithResizeHandler[TElement /* <: HTMLElement */](onResize: /* newSize */ RefSize => Unit): ObserverDefaults[TElement] = {
    val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
    __obj.asInstanceOf[ObserverDefaults[TElement]]
  }
}
