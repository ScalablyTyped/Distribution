package typings.winjs.WinJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPromise[T] extends StObject {
  
  def cancel(): Unit = js.native
  
  def done[U](): Unit = js.native
  def done[U](
    onComplete: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def done[U](onComplete: js.UndefOr[scala.Nothing], onError: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def done[U](
    onComplete: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, _],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def done[U](onComplete: js.Function1[/* value */ T, _]): Unit = js.native
  def done[U](
    onComplete: js.Function1[/* value */ T, _],
    onError: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  def done[U](onComplete: js.Function1[/* value */ T, _], onError: js.Function1[/* error */ js.Any, _]): Unit = js.native
  def done[U](
    onComplete: js.Function1[/* value */ T, _],
    onError: js.Function1[/* error */ js.Any, _],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): Unit = js.native
  
  def `then`[U](): IPromise[U] = js.native
  def `then`[U](
    onComplete: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    onComplete: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, IPromise[U] | U | Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    onComplete: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ js.Any, IPromise[U] | U | Unit],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](onComplete: js.Function1[/* value */ T, IPromise[U] | U | Unit]): IPromise[U] = js.native
  def `then`[U](
    onComplete: js.Function1[/* value */ T, IPromise[U] | U | Unit],
    onError: js.UndefOr[scala.Nothing],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    onComplete: js.Function1[/* value */ T, IPromise[U] | U | Unit],
    onError: js.Function1[/* error */ js.Any, IPromise[U] | U | Unit]
  ): IPromise[U] = js.native
  def `then`[U](
    onComplete: js.Function1[/* value */ T, IPromise[U] | U | Unit],
    onError: js.Function1[/* error */ js.Any, IPromise[U] | U | Unit],
    onProgress: js.Function1[/* progress */ js.Any, Unit]
  ): IPromise[U] = js.native
}
