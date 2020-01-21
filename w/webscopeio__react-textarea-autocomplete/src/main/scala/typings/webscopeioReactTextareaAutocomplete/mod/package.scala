package typings.webscopeioReactTextareaAutocomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.start
    - typings.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.end
    - typings.webscopeioReactTextareaAutocomplete.webscopeioReactTextareaAutocompleteStrings.next
    - scala.Double
  */
  type CaretPositionType = typings.webscopeioReactTextareaAutocomplete.mod._CaretPositionType | scala.Double
  type DataProviderType[TItem] = js.Function1[/* token */ java.lang.String, js.Promise[js.Array[TItem]] | js.Array[TItem]]
  type TriggerType[TItem] = org.scalablytyped.runtime.StringDictionary[typings.webscopeioReactTextareaAutocomplete.mod.SettingType[TItem]]
}
