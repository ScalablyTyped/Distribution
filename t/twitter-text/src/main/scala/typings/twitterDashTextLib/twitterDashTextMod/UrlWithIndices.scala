package typings
package twitterDashTextLib.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlWithIndices extends EntityWithIndices {
  var indices: js.Tuple2[scala.Double, scala.Double]
  var url: java.lang.String
}

object UrlWithIndices {
  @scala.inline
  def apply(indices: js.Tuple2[scala.Double, scala.Double], url: java.lang.String): UrlWithIndices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("indices")(indices)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[UrlWithIndices]
  }
}

