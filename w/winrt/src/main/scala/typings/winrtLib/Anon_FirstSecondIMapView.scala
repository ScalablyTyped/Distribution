package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FirstSecondIMapView extends js.Object {
  var first: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
    java.lang.String, 
    winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.NamedResource
  ]
  var second: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
    java.lang.String, 
    winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.NamedResource
  ]
}

object Anon_FirstSecondIMapView {
  @scala.inline
  def apply(
    first: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
      java.lang.String, 
      winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.NamedResource
    ],
    second: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
      java.lang.String, 
      winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.NamedResource
    ]
  ): Anon_FirstSecondIMapView = {
    val __obj = js.Dynamic.literal(first = first, second = second)
  
    __obj.asInstanceOf[Anon_FirstSecondIMapView]
  }
}

