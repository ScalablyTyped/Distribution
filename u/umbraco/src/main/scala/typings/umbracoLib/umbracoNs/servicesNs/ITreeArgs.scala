package typings
package umbracoLib.umbracoNs.servicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tree args
  */
trait ITreeArgs extends js.Object {
  var cacheKey: js.UndefOr[java.lang.String] = js.undefined
  var section: java.lang.String
}

object ITreeArgs {
  @scala.inline
  def apply(section: java.lang.String, cacheKey: java.lang.String = null): ITreeArgs = {
    val __obj = js.Dynamic.literal(section = section)
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey)
    __obj.asInstanceOf[ITreeArgs]
  }
}

