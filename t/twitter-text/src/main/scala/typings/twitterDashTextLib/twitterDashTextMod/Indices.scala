package typings
package twitterDashTextLib.twitterDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indices extends js.Object {
  var indices: js.Tuple2[scala.Double, scala.Double]
}

object Indices {
  @scala.inline
  def apply(indices: js.Tuple2[scala.Double, scala.Double]): Indices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("indices")(indices)
    __obj.asInstanceOf[Indices]
  }
}

