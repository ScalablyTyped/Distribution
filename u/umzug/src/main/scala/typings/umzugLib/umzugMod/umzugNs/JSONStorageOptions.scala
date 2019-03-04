package typings
package umzugLib.umzugMod.umzugNs

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
    executed: js.Function0[js.Promise[js.Array[nodeLib.String]]],
    logMigration: js.Function1[java.lang.String, js.Promise[scala.Unit]],
    unlogMigration: js.Function1[java.lang.String, js.Promise[scala.Unit]],
    path: java.lang.String = null
  ): JSONStorageOptions = {
    val __obj = js.Dynamic.literal(executed = executed, logMigration = logMigration, unlogMigration = unlogMigration)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[JSONStorageOptions]
  }
}

