package typings
package atWebscopeioReactDashTextareaDashAutocompleteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atWebscopeioReactDashTextareaDashAutocompleteMod {
  /* Rewritten from type alias, can be one of: 
    - atWebscopeioReactDashTextareaDashAutocompleteLib.atWebscopeioReactDashTextareaDashAutocompleteLibStrings.start
    - atWebscopeioReactDashTextareaDashAutocompleteLib.atWebscopeioReactDashTextareaDashAutocompleteLibStrings.end
    - atWebscopeioReactDashTextareaDashAutocompleteLib.atWebscopeioReactDashTextareaDashAutocompleteLibStrings.next
    - scala.Double
  */
  type CaretPositionType = _CaretPositionType | scala.Double
  type DataProviderType[TItem] = js.Function1[/* token */ java.lang.String, js.Promise[js.Array[TItem]] | js.Array[TItem]]
}
