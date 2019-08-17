package typings.atWebscopeioReactDashTextareaDashAutocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atWebscopeioReactDashTextareaDashAutocompleteMod {
  import org.scalablytyped.runtime.StringDictionary

  /* Rewritten from type alias, can be one of: 
    - typings.atWebscopeioReactDashTextareaDashAutocomplete.atWebscopeioReactDashTextareaDashAutocompleteStrings.start
    - typings.atWebscopeioReactDashTextareaDashAutocomplete.atWebscopeioReactDashTextareaDashAutocompleteStrings.end
    - typings.atWebscopeioReactDashTextareaDashAutocomplete.atWebscopeioReactDashTextareaDashAutocompleteStrings.next
    - scala.Double
  */
  type CaretPositionType = _CaretPositionType | Double
  type DataProviderType[TItem] = js.Function1[/* token */ String, js.Promise[js.Array[TItem]] | js.Array[TItem]]
  type TriggerType[TItem] = StringDictionary[SettingType[TItem]]
}
