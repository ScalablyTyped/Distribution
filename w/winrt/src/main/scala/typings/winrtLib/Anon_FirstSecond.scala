package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstSecond extends js.Object {
  var first: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _]
  var second: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _]
}

object Anon_FirstSecond {
  @scala.inline
  def apply(
    first: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _],
    second: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _]
  ): Anon_FirstSecond = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("second")(second)
    __obj.asInstanceOf[Anon_FirstSecond]
  }
}

