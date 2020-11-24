package typings.throat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("throat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(size: Double): js.Function1[/* fn */ js.Function0[js.Promise[_]], js.Promise[_]] = js.native
  def apply[TResult, TFn /* <: js.Function1[/* repeated */ js.Any, js.Promise[TResult]] */](fn: TFn, size: Double): TFn = js.native
  def apply[TResult, TFn /* <: js.Function1[/* repeated */ js.Any, js.Promise[TResult]] */](size: Double, fn: TFn): TFn = js.native
}
