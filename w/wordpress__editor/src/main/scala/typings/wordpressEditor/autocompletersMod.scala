package typings.wordpressEditor

import typings.wordpressApiFetch.mod.Schema.User
import typings.wordpressBlockEditor.mod.EditorInserterItem
import typings.wordpressComponents.autocompleteMod.Autocomplete.Completer
import typings.wordpressEditor.wordpressEditorStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/editor/components/autocompleters", JSImport.Namespace)
@js.native
object autocompletersMod extends js.Object {
  
  val blockAutocompleter: Completer[EditorInserterItem] = js.native
  
  val userAutocompleter: Completer[User[view]] = js.native
}
