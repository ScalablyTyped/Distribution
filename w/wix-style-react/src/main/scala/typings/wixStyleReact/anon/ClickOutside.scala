package typings.wixStyleReact.anon

import typings.std.ReturnType
import typings.wixStyleReact.distTypesCommonMod.FocusOptionsPolyfill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickOutside extends StObject {
  
  def clickOutside(): Unit
  
  def exists(): Boolean
  
  def open(): ReturnType[
    js.Function1[/* options */ js.UndefOr[FocusOptionsPolyfill], FocusOptionsPolyfill]
  ]
}
object ClickOutside {
  
  inline def apply(
    clickOutside: () => Unit,
    exists: () => Boolean,
    open: () => ReturnType[
      js.Function1[/* options */ js.UndefOr[FocusOptionsPolyfill], FocusOptionsPolyfill]
    ]
  ): ClickOutside = {
    val __obj = js.Dynamic.literal(clickOutside = js.Any.fromFunction0(clickOutside), exists = js.Any.fromFunction0(exists), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[ClickOutside]
  }
  
  extension [Self <: ClickOutside](x: Self) {
    
    inline def setClickOutside(value: () => Unit): Self = StObject.set(x, "clickOutside", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setOpen(
      value: () => ReturnType[
          js.Function1[/* options */ js.UndefOr[FocusOptionsPolyfill], FocusOptionsPolyfill]
        ]
    ): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
