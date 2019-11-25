package typings.umzug.umzugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONStorageOptions extends Storage {
  /**
    * The path to the json storage.
    * Defaults to process.cwd() + '/umzug.json';
    */
  var path: js.UndefOr[String] = js.undefined
}

object JSONStorageOptions {
  @scala.inline
  def apply(
    executed: () => js.Promise[js.Array[String]],
    logMigration: String => js.Promise[Unit],
    unlogMigration: String => js.Promise[Unit],
    path: String = null
  ): JSONStorageOptions = {
    val __obj = js.Dynamic.literal(executed = js.Any.fromFunction0(executed), logMigration = js.Any.fromFunction1(logMigration), unlogMigration = js.Any.fromFunction1(unlogMigration))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONStorageOptions]
  }
}

