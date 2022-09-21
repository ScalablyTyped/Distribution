package typings.xtend

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("xtend", JSImport.Namespace)
  @js.native
  val ^ : Xtend = js.native
  
  @js.native
  trait Xtend extends StObject {
    
    def apply(target: js.Object, sources: js.Object*): js.Object = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */](target: T, source: U): T & U = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](target: T, source1: U, source2: V): T & U & V = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */, W /* <: js.Object */](target: T, source1: U, source2: V, source3: W): T & U & V & W = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */, W /* <: js.Object */, Q /* <: js.Object */](target: T, source1: U, source2: V, source3: W, source4: Q): T & U & V & W & Q = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */, W /* <: js.Object */, Q /* <: js.Object */, R /* <: js.Object */](target: T, source1: U, source2: V, source3: W, source4: Q, source5: R): T & U & V & W & Q & R = js.native
  }
  
  type _To = Xtend
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Xtend = ^
}
