package typings
package umzugLib.umzugMod.umzugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpDownMigrationsOptions extends js.Object {
  /**
    * Running specific migrations while ignoring the right order, can be
    * done like this:
    */
  var migrations: js.Array[java.lang.String]
}

object UpDownMigrationsOptions {
  @scala.inline
  def apply(migrations: js.Array[java.lang.String]): UpDownMigrationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("migrations")(migrations)
    __obj.asInstanceOf[UpDownMigrationsOptions]
  }
}

