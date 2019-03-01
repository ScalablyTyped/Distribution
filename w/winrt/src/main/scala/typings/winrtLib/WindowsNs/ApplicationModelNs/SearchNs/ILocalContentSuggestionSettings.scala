package typings
package winrtLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalContentSuggestionSettings extends js.Object {
  var aqsFilter: java.lang.String
  var enabled: scala.Boolean
  var locations: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.StorageNs.StorageFolder]
  var propertiesToMatch: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
}

object ILocalContentSuggestionSettings {
  @scala.inline
  def apply(
    aqsFilter: java.lang.String,
    enabled: scala.Boolean,
    locations: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[winrtLib.WindowsNs.StorageNs.StorageFolder],
    propertiesToMatch: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  ): ILocalContentSuggestionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aqsFilter")(aqsFilter)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("locations")(locations)
    __obj.updateDynamic("propertiesToMatch")(propertiesToMatch)
    __obj.asInstanceOf[ILocalContentSuggestionSettings]
  }
}

