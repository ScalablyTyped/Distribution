package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hit extends js.Object {
  var hit: scala.Double
  var rect: winrtLib.WindowsNs.FoundationNs.Rect
}

object Anon_Hit {
  @scala.inline
  def apply(hit: scala.Double, rect: winrtLib.WindowsNs.FoundationNs.Rect): Anon_Hit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hit")(hit)
    __obj.updateDynamic("rect")(rect)
    __obj.asInstanceOf[Anon_Hit]
  }
}

