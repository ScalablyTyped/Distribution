package typings.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserChoice extends js.Object {
  /**
    * Clears the current user choice of preferred navigator app.
    * @param callback - function to call once operation is complete.
    */
  def clear(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Indicates whether a user choice exists for a preferred navigator app.
    * @param callback - function to pass result to: will receive a boolean argument.
    */
  def exists(callback: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
  /**
    * Returns current user choice of preferred navigator app.
    * @param callback - function to pass result to: will receive a string argument indicating the app, which is a constant in `launchnavigator.APP`.
    */
  def get(callback: js.Function1[/* app */ String, Unit]): Unit = js.native
  /**
    * Sets the current user choice of preferred navigator app.
    * @param app - app to set as preferred choice as a constant in `launchnavigator.APP`.
    * @param callback - function to call once operation is complete.
    */
  def set(app: String, callback: js.Function0[Unit]): Unit = js.native
}

object UserChoice {
  @scala.inline
  def apply(
    clear: js.Function0[Unit] => Unit,
    exists: js.Function1[/* exists */ Boolean, Unit] => Unit,
    get: js.Function1[/* app */ String, Unit] => Unit,
    set: (String, js.Function0[Unit]) => Unit
  ): UserChoice = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), exists = js.Any.fromFunction1(exists), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[UserChoice]
  }
  @scala.inline
  implicit class UserChoiceOps[Self <: UserChoice] (val x: Self) extends AnyVal {
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
    def setExists(value: js.Function1[/* exists */ Boolean, Unit] => Unit): Self = this.set("exists", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: js.Function1[/* app */ String, Unit] => Unit): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (String, js.Function0[Unit]) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
  }
  
}

