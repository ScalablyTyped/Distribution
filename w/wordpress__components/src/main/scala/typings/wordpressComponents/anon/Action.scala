package typings.wordpressComponents.anon

import typings.react.mod.ReactNode
import typings.wordpressComponents.autocompleteMod.Autocomplete._OptionCompletion
import typings.wordpressComponents.wordpressComponentsStrings.`insert-at-caret`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends _OptionCompletion {
  var action: `insert-at-caret`
  var value: ReactNode
}

object Action {
  @scala.inline
  def apply(action: `insert-at-caret`, value: ReactNode = null): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

