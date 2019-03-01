package typings
package umzugLib.umzugMod.umzugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpToOptions extends js.Object {
  /**
    * It is also possible to pass the name of a migration in order to
    * just run the migrations from the current state to the passed
    * migration name.
    */
  var to: java.lang.String
}

object UpToOptions {
  @scala.inline
  def apply(to: java.lang.String): UpToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[UpToOptions]
  }
}

