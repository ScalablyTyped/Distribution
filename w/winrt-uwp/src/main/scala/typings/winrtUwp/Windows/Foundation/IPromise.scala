package typings.winrtUwp.Windows.Foundation

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPromise[TResult]
  extends StObject
     with PromiseLike[TResult] {
  
  def cancel(): Unit = js.native
  
  def done[U](): Unit = js.native
  def done[U](success: js.Function1[/* value */ TResult, Any]): Unit = js.native
  def done[U](success: js.Function1[/* value */ TResult, Any], error: js.Function1[/* error */ Any, Any]): Unit = js.native
  def done[U](
    success: js.Function1[/* value */ TResult, Any],
    error: js.Function1[/* error */ Any, Any],
    progress: js.Function1[/* progress */ Any, Unit]
  ): Unit = js.native
  def done[U](
    success: js.Function1[/* value */ TResult, Any],
    error: Unit,
    progress: js.Function1[/* progress */ Any, Unit]
  ): Unit = js.native
  def done[U](success: Unit, error: js.Function1[/* error */ Any, Any]): Unit = js.native
  def done[U](
    success: Unit,
    error: js.Function1[/* error */ Any, Any],
    progress: js.Function1[/* progress */ Any, Unit]
  ): Unit = js.native
  def done[U](success: Unit, error: Unit, progress: js.Function1[/* progress */ Any, Unit]): Unit = js.native
  
  def `then`[U](
    success: js.Function1[/* value */ TResult, IPromise[U] | U],
    error: js.Function1[/* error */ Any, IPromise[U] | U],
    progress: js.Function1[/* progress */ Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ TResult, IPromise[U] | U],
    error: Unit,
    progress: js.Function1[/* progress */ Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    success: Unit,
    error: js.Function1[/* error */ Any, IPromise[U] | U],
    progress: js.Function1[/* progress */ Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](success: Unit, error: Unit, progress: js.Function1[/* progress */ Any, Unit]): IPromise[U] = js.native
}
