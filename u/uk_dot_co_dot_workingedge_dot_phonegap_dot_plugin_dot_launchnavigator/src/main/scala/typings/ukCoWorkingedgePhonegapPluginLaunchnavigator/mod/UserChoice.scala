package typings.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserChoice extends js.Object {
  /**
    * Clears the current user choice of preferred navigator app.
    * @param callback - function to call once operation is complete.
    */
  def clear(callback: js.Function0[Unit]): Unit
  /**
    * Indicates whether a user choice exists for a preferred navigator app.
    * @param callback - function to pass result to: will receive a boolean argument.
    */
  def exists(callback: js.Function1[/* exists */ Boolean, Unit]): Unit
  /**
    * Returns current user choice of preferred navigator app.
    * @param callback - function to pass result to: will receive a string argument indicating the app, which is a constant in `launchnavigator.APP`.
    */
  def get(callback: js.Function1[/* app */ String, Unit]): Unit
  /**
    * Sets the current user choice of preferred navigator app.
    * @param app - app to set as preferred choice as a constant in `launchnavigator.APP`.
    * @param callback - function to call once operation is complete.
    */
  def set(app: String, callback: js.Function0[Unit]): Unit
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
}

