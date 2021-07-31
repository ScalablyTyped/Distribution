package typings.winjs.WinJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPromise[T] extends StObject {
  
  def cancel(): Unit = js.native
  
  def done[U](): Unit = js.native
  def done[U](onComplete: js.Function1[/* value */ T, js.Any]): Unit = js.native
  def done[U](onComplete: js.Function1[/* value */ T, js.Any], onError: js.Function1[/* error */ js.Any, js.Any]): Unit = js.native
  def done[U](
    onComplete: js.Function1[/* value */ T, js.Any],
    onError: js.Function1[/* error */ js.Any, js.Any],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def done[U](
    onComplete: js.Function1[/* value */ T, js.Any],
    onError: Unit,
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def done[U](onComplete: Unit, onError: js.Function1[/* error */ js.Any, js.Any]): Unit = js.native
  def done[U](
    onComplete: Unit,
    onError: js.Function1[/* error */ js.Any, js.Any],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def done[U](onComplete: Unit, onError: Unit, onProgress: js.Function1[/* progress */ js.Any, Unit]): Unit = js.native
  
  def `then`[U](): IPromise[U] = js.native
  def `then`[U](onComplete: js.Function1[/* value */ T, IPromise[U] | U | Unit]): IPromise[U] = js.native
  def `then`[U](
    onComplete: js.Function1[/* value */ T, IPromise[U] | U | Unit],
    onError: js.Function1[/* error */ js.Any, IPromise[U] | U | Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    onComplete: js.Function1[/* value */ T, IPromise[U] | U | Unit],
    onError: js.Function1[/* error */ js.Any, IPromise[U] | U | Unit],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    onComplete: js.Function1[/* value */ T, IPromise[U] | U | Unit],
    onError: Unit,
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](onComplete: Unit, onError: js.Function1[/* error */ js.Any, IPromise[U] | U | Unit]): IPromise[U] = js.native
  def `then`[U](
    onComplete: Unit,
    onError: js.Function1[/* error */ js.Any, IPromise[U] | U | Unit],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](onComplete: Unit, onError: Unit, onProgress: js.Function1[/* progress */ js.Any, Unit]): IPromise[U] = js.native
}
