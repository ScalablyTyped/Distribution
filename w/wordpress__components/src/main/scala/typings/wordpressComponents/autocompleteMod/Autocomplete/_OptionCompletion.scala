package typings.wordpressComponents.autocompleteMod.Autocomplete

import typings.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`
import typings.wordpressComponents.wordpressComponentsStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _OptionCompletion extends js.Object
object _OptionCompletion {
  
  @scala.inline
  def Action(action: `insert-at-caret`): _OptionCompletion = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[_OptionCompletion]
  }
  
  @scala.inline
  def Value(action: replace, value: typings.wordpressRichText.mod.Value): _OptionCompletion = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[_OptionCompletion]
  }
}
