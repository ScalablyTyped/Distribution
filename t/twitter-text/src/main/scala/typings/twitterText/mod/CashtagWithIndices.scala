package typings.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CashtagWithIndices extends EntityWithIndices {
  var cashtag: String
  var indices: js.Tuple2[Double, Double]
}

object CashtagWithIndices {
  @scala.inline
  def apply(cashtag: String, indices: js.Tuple2[Double, Double]): CashtagWithIndices = {
    val __obj = js.Dynamic.literal(cashtag = cashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CashtagWithIndices]
  }
}

