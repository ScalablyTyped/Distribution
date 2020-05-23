package typings.winrtUwp.Windows.ApplicationModel.AppService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the background task for an app service to get a deferral so that the app service can respond to subsequent requests. */
trait AppServiceDeferral extends js.Object {
  /** Indicates that the content for an asynchronous handler for the AppServiceConnection.RequestReceived event is ready, or that an error occurred. */
  def complete(): Unit
}

object AppServiceDeferral {
  @scala.inline
  def apply(complete: () => Unit): AppServiceDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[AppServiceDeferral]
  }
}

