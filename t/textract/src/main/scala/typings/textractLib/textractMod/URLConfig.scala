package typings
package textractLib.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLConfig extends Config {
  /**
    * Used with fromUrl, if set, rather than using the content-type from the URL request, will use the provided typeOverride.
    */
  var typeOverride: js.UndefOr[java.lang.String] = js.undefined
}

