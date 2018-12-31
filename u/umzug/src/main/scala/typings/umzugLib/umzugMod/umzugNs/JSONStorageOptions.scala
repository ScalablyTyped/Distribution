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

