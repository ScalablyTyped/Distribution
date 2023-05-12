package typings.vueRuntimeCore.mod

import typings.vueReactivity.mod.Ref_
import typings.vueRuntimeCore.anon.DefaultAny
import typings.vueRuntimeCore.anon.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _defineModel extends StObject {
  
  def apply[T](): Ref_[js.UndefOr[T]] = js.native
  def apply[T](name: String): Ref_[js.UndefOr[T]] = js.native
  def apply[T](name: String, options: DefaultAny & (PropOptions[T, T]) & DefineModelOptions): Ref_[T] = js.native
  def apply[T](name: String, options: (PropOptions[T, T]) & DefineModelOptions): Ref_[js.UndefOr[T]] = js.native
  def apply[T](name: String, options: Required & (PropOptions[T, T]) & DefineModelOptions): Ref_[T] = js.native
  def apply[T](options: (PropOptions[T, T]) & DefineModelOptions): Ref_[js.UndefOr[T]] = js.native
  def apply[T](options: DefaultAny & (PropOptions[T, T]) & DefineModelOptions): Ref_[T] = js.native
  def apply[T](options: Required & (PropOptions[T, T]) & DefineModelOptions): Ref_[T] = js.native
}
