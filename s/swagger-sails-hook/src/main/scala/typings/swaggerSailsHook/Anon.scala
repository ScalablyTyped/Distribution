package typings.swaggerSailsHook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  /**
  				 * This route will match any routes that aren't bound in the app via a custom route configuration
  				 * or a blueprint.
  				 */
  @JSName("/*")
  def SlashAsterisk(req: js.Any, res: js.Any, next: js.Function0[_]): js.Any
}

object Anon {
  @scala.inline
  def apply(SlashAsterisk: (js.Any, js.Any, js.Function0[_]) => js.Any): Anon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/*")(js.Any.fromFunction3(SlashAsterisk))
    __obj.asInstanceOf[Anon]
  }
}

