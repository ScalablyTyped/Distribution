package typings.wordpressEditor.mod

import org.scalablytyped.runtime.TopLevel
import typings.wordpressApiFetch.mod.Schema.User
import typings.wordpressComponents.autocompleteMod.Autocomplete.Completer
import typings.wordpressEditor.wordpressEditorStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/editor", "userAutocompleter")
@js.native
object userAutocompleter extends TopLevel[Completer[User[view]]]

