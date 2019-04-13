package typings
package umzugLib.umzugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONStorageOptions extends Storage {
  /**
    * The path to the json storage.
    * Defaults to process.cwd() + '/umzug.json';
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object JSONStorageOptions {
  @scala.inline
  def apply(
    executed: () => js.Promise[js.Array[java.lang.String]],
    logMigration: java.lang.String => js.Promise[scala.Unit],
    unlogMigration: java.lang.String => js.Promise[scala.Unit],
    path: java.lang.String = null
  ): JSONStorageOptions = {
    val __obj = js.Dynamic.literal(executed = js.Any.fromFunction0(executed), logMigration = js.Any.fromFunction1(logMigration), unlogMigration = js.Any.fromFunction1(unlogMigration))
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[JSONStorageOptions]
  }
}

