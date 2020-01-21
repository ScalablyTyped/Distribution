package typings.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPrompted extends js.Object {
  /**
    * Clears flag which indicates if user has already been prompted whether to remember their choice a preferred navigator app.
    * @param callback - function to call once operation is complete.
    */
  def clear(callback: js.Function0[Unit]): Unit
  /**
    * Indicates whether user has already been prompted whether to remember their choice a preferred navigator app.
    * @param callback - function to pass result to: will receive a boolean argument.
    */
  def get(callback: js.Function1[/* exists */ Boolean, Unit]): Unit
  /**
    * Sets flag indicating user has already been prompted whether to remember their choice a preferred navigator app.
    * @param callback - function to call once operation is complete.
    */
  def set(callback: js.Function0[Unit]): Unit
}

object UserPrompted {
  @scala.inline
  def apply(
    clear: js.Function0[Unit] => Unit,
    get: js.Function1[/* exists */ Boolean, Unit] => Unit,
    set: js.Function0[Unit] => Unit
  ): UserPrompted = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[UserPrompted]
  }
}

