package typings
package ukDotCoDotWorkingedgeDotPhonegapDotPluginDotLaunchnavigatorLib.ukDotCoDotWorkingedgeDotPhonegapDotPluginDotLaunchnavigatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPrompted extends js.Object {
  /**
    * Clears flag which indicates if user has already been prompted whether to remember their choice a preferred navigator app.
    * @param callback - function to call once operation is complete.
    */
  def clear(callback: js.Function0[scala.Unit]): scala.Unit
  /**
    * Indicates whether user has already been prompted whether to remember their choice a preferred navigator app.
    * @param callback - function to pass result to: will receive a boolean argument.
    */
  def get(callback: js.Function1[/* exists */ scala.Boolean, scala.Unit]): scala.Unit
  /**
    * Sets flag indicating user has already been prompted whether to remember their choice a preferred navigator app.
    * @param callback - function to call once operation is complete.
    */
  def set(callback: js.Function0[scala.Unit]): scala.Unit
}

object UserPrompted {
  @scala.inline
  def apply(
    clear: js.Function1[js.Function0[scala.Unit], scala.Unit],
    get: js.Function1[js.Function1[/* exists */ scala.Boolean, scala.Unit], scala.Unit],
    set: js.Function1[js.Function0[scala.Unit], scala.Unit]
  ): UserPrompted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[UserPrompted]
  }
}

