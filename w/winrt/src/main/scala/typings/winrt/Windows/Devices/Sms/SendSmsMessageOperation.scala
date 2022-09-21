package typings.winrt.Windows.Devices.Sms

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.anon.CompletedGetResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendSmsMessageOperation
  extends StObject
     with IAsyncAction {
  
  @JSName("done")
  def done_MSendSmsMessageOperation[U](): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](success: js.Function0[Any]): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](success: js.Function0[Any], error: js.Function1[/* error */ Any, Any]): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](
    success: js.Function0[Any],
    error: js.Function1[/* error */ Any, Any],
    progress: js.Function1[/* progress */ Any, Unit]
  ): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](success: js.Function0[Any], error: Unit, progress: js.Function1[/* progress */ Any, Unit]): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](success: Unit, error: js.Function1[/* error */ Any, Any]): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](
    success: Unit,
    error: js.Function1[/* error */ Any, Any],
    progress: js.Function1[/* progress */ Any, Unit]
  ): Unit = js.native
  @JSName("done")
  def done_MSendSmsMessageOperation[U](success: Unit, error: Unit, progress: js.Function1[/* progress */ Any, Unit]): Unit = js.native
  
  var operation: CompletedGetResults = js.native
}
