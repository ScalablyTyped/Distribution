package typings.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserPrompted extends js.Object {
  /**
    * Clears flag which indicates if user has already been prompted whether to remember their choice a preferred navigator app.
    * @param callback - function to call once operation is complete.
    */
  def clear(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Indicates whether user has already been prompted whether to remember their choice a preferred navigator app.
    * @param callback - function to pass result to: will receive a boolean argument.
    */
  def get(callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  /**
    * Sets flag indicating user has already been prompted whether to remember their choice a preferred navigator app.
    * @param callback - function to call once operation is complete.
    */
  def set(callback: js.Function0[Unit]): Unit = js.native
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
  @scala.inline
  implicit class UserPromptedOps[Self <: UserPrompted] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClear(value: js.Function0[Unit] => Unit): Self = this.set("clear", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: js.Function1[/* exists */ Boolean, Unit] => Unit): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: js.Function0[Unit] => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

