package typings.winrt.Windows.Foundation

import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPromise[T] extends StObject {
  
  var addEventListener: js.UndefOr[
    js.Function3[/* type */ String, /* listener */ js.Function, /* capture */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  def cancel(): Unit = js.native
  
  var dispatchEvent: js.UndefOr[js.Function2[/* type */ String, /* details */ js.Any, Boolean]] = js.native
  
  def done[U](): Unit = js.native
  def done[U](success: js.Function1[/* value */ T, js.Any]): Unit = js.native
  def done[U](success: js.Function1[/* value */ T, js.Any], error: js.Function1[/* error */ js.Any, js.Any]): Unit = js.native
  def done[U](
    success: js.Function1[/* value */ T, js.Any],
    error: js.Function1[/* error */ js.Any, js.Any],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def done[U](
    success: js.Function1[/* value */ T, js.Any],
    error: Unit,
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def done[U](success: Unit, error: js.Function1[/* error */ js.Any, js.Any]): Unit = js.native
  def done[U](
    success: Unit,
    error: js.Function1[/* error */ js.Any, js.Any],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def done[U](success: Unit, error: Unit, progress: js.Function1[/* progress */ js.Any, Unit]): Unit = js.native
  
  var onerror: js.UndefOr[js.Function1[/* eventInfo */ CustomEvent[js.Any], Unit]] = js.native
  
  var removeEventListener: js.UndefOr[
    js.Function3[
      /* eventType */ String, 
      /* listener */ js.Function, 
      /* capture */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
  
  def `then`[U](): IPromise[U] = js.native
  def `then`[U](success: js.Function1[/* value */ T, IPromise[U] | U]): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ T, IPromise[U] | U],
    error: js.Function1[/* error */ js.Any, IPromise[U] | U]
  ): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ T, IPromise[U] | U],
    error: js.Function1[/* error */ js.Any, IPromise[U] | U],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    success: js.Function1[/* value */ T, IPromise[U] | U],
    error: Unit,
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](success: Unit, error: js.Function1[/* error */ js.Any, IPromise[U] | U]): IPromise[U] = js.native
  def `then`[U](
    success: Unit,
    error: js.Function1[/* error */ js.Any, IPromise[U] | U],
    progress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](success: Unit, error: Unit, progress: js.Function1[/* progress */ js.Any, Unit]): IPromise[U] = js.native
}
