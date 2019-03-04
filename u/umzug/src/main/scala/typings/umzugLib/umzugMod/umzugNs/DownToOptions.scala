package typings
package umzugLib.umzugMod.umzugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownToOptions extends js.Object {
  /**
    * It is also possible to pass the name of a migration in order to
    * just run the migrations from the current state to the passed
    * migration name. down allows to pass 0 to revert everything.
    */
  var to: java.lang.String | umzugLib.umzugLibNumbers.`0`
}

object DownToOptions {
  @scala.inline
  def apply(to: java.lang.String | umzugLib.umzugLibNumbers.`0`): DownToOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownToOptions]
  }
}

