package typings.wixStyleReact.anon

import typings.std.ReturnType
import typings.wixStyleReact.commonMod.FocusOptionsPolyfill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exists extends StObject {
  
  def exists(): Boolean
  
  def open(): ReturnType[
    js.Function1[/* options */ js.UndefOr[FocusOptionsPolyfill], FocusOptionsPolyfill]
  ]
}
object Exists {
  
  @scala.inline
  def apply(
    exists: () => Boolean,
    open: () => ReturnType[
      js.Function1[/* options */ js.UndefOr[FocusOptionsPolyfill], FocusOptionsPolyfill]
    ]
  ): Exists = {
    val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Exists]
  }
  
  @scala.inline
  implicit class ExistsMutableBuilder[Self <: Exists] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(
      value: () => ReturnType[
          js.Function1[/* options */ js.UndefOr[FocusOptionsPolyfill], FocusOptionsPolyfill]
        ]
    ): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
