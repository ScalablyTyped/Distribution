package typings.umzug.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpDownMigrationsOptions extends js.Object {
  /**
    * Running specific migrations while ignoring the right order, can be
    * done like this:
    */
  var migrations: js.Array[String]
}

object UpDownMigrationsOptions {
  @scala.inline
  def apply(migrations: js.Array[String]): UpDownMigrationsOptions = {
    val __obj = js.Dynamic.literal(migrations = migrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpDownMigrationsOptions]
  }
}

