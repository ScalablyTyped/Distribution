package typings
package twitterDashTextLib.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CashtagWithIndices extends EntityWithIndices {
  var cashtag: java.lang.String
  var indices: js.Tuple2[scala.Double, scala.Double]
}

object CashtagWithIndices {
  @scala.inline
  def apply(cashtag: java.lang.String, indices: js.Tuple2[scala.Double, scala.Double]): CashtagWithIndices = {
    val __obj = js.Dynamic.literal(cashtag = cashtag, indices = indices)
  
    __obj.asInstanceOf[CashtagWithIndices]
  }
}

