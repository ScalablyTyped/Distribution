package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstSecondIMapViewResourceMap extends js.Object {
  /** One half of the original map. */ var first: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
    java.lang.String, 
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceMap
  ]
  /** The second half of the original map. */ var second: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
    java.lang.String, 
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceMap
  ]
}

object Anon_FirstSecondIMapViewResourceMap {
  @scala.inline
  def apply(
    first: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
      java.lang.String, 
      winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceMap
    ],
    second: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
      java.lang.String, 
      winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceMap
    ]
  ): Anon_FirstSecondIMapViewResourceMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("second")(second)
    __obj.asInstanceOf[Anon_FirstSecondIMapViewResourceMap]
  }
}

