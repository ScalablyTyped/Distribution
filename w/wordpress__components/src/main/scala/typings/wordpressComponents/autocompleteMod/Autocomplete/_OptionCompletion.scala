package typings.wordpressComponents.autocompleteMod.Autocomplete

import typings.react.mod.ReactNode
import typings.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`
import typings.wordpressComponents.wordpressComponentsStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _OptionCompletion extends js.Object

object _OptionCompletion {
  @scala.inline
  def Action(action: `insert-at-caret`, value: ReactNode = null): _OptionCompletion = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[_OptionCompletion]
  }
  @scala.inline
  def Value(action: replace, value: typings.wordpressRichText.mod.Value): _OptionCompletion = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[_OptionCompletion]
  }
}

