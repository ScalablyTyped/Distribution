package typings.swaggerSailsHook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _empty extends js.Object {
  /**
    * This route will match any routes that aren't bound in the app via a custom route configuration
    * or a blueprint.
    */
  @JSName("/*")
  def SlashAsterisk(req: js.Any, res: js.Any, next: js.Function0[_]): js.Any
}

object _empty {
  @scala.inline
  def apply(SlashAsterisk: (js.Any, js.Any, js.Function0[_]) => js.Any): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/*")(js.Any.fromFunction3(SlashAsterisk))
    __obj.asInstanceOf[_empty]
  }
}

