package typings.vueTestUtils.anon

import typings.vueReactivity.mod.ComputedGetter
import typings.vueReactivity.mod.ComputedRef
import typings.vueReactivity.mod.DebuggerOptions
import typings.vueReactivity.mod.WritableComputedOptions
import typings.vueReactivity.mod.WritableComputedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcomputed extends StObject {
  
  def apply[T](getter: ComputedGetter[T]): ComputedRef[T] = js.native
  def apply[T](getter: ComputedGetter[T], debugOptions: DebuggerOptions): ComputedRef[T] = js.native
  def apply[T](options: WritableComputedOptions[T]): WritableComputedRef[T] = js.native
  def apply[T](options: WritableComputedOptions[T], debugOptions: DebuggerOptions): WritableComputedRef[T] = js.native
}
