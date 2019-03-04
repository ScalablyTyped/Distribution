package typings
package webpackbarLib.webpackbarMod.WebpackBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var count: scala.Double
  var time: js.Tuple2[scala.Double, scala.Double]
}

object Stats {
  @scala.inline
  def apply(count: scala.Double, time: js.Tuple2[scala.Double, scala.Double]): Stats = {
    val __obj = js.Dynamic.literal(count = count, time = time)
  
    __obj.asInstanceOf[Stats]
  }
}

