package typings.winrt.Windows.ApplicationModel.Search

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalContentSuggestionSettings extends js.Object {
  var aqsFilter: String
  var enabled: Boolean
  var locations: IVector[StorageFolder]
  var propertiesToMatch: IVector[String]
}

object ILocalContentSuggestionSettings {
  @scala.inline
  def apply(
    aqsFilter: String,
    enabled: Boolean,
    locations: IVector[StorageFolder],
    propertiesToMatch: IVector[String]
  ): ILocalContentSuggestionSettings = {
    val __obj = js.Dynamic.literal(aqsFilter = aqsFilter, enabled = enabled, locations = locations, propertiesToMatch = propertiesToMatch)
  
    __obj.asInstanceOf[ILocalContentSuggestionSettings]
  }
}

