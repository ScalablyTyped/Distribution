package typings.winrt.Windows.ApplicationModel.Search

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocalContentSuggestionSettings extends js.Object {
  var aqsFilter: String = js.native
  var enabled: Boolean = js.native
  var locations: IVector[StorageFolder] = js.native
  var propertiesToMatch: IVector[String] = js.native
}

object ILocalContentSuggestionSettings {
  @scala.inline
  def apply(
    aqsFilter: String,
    enabled: Boolean,
    locations: IVector[StorageFolder],
    propertiesToMatch: IVector[String]
  ): ILocalContentSuggestionSettings = {
    val __obj = js.Dynamic.literal(aqsFilter = aqsFilter.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], propertiesToMatch = propertiesToMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalContentSuggestionSettings]
  }
  @scala.inline
  implicit class ILocalContentSuggestionSettingsOps[Self <: ILocalContentSuggestionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAqsFilter(value: String): Self = this.set("aqsFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocations(value: IVector[StorageFolder]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertiesToMatch(value: IVector[String]): Self = this.set("propertiesToMatch", value.asInstanceOf[js.Any])
  }
  
}

