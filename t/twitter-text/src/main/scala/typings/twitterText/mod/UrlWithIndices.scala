package typings.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlWithIndices extends EntityWithIndices {
  var indices: js.Tuple2[Double, Double]
  var url: String
}

object UrlWithIndices {
  @scala.inline
  def apply(indices: js.Tuple2[Double, Double], url: String): UrlWithIndices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UrlWithIndices]
  }
}

