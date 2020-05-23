package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when an option of this dialog is clicked or, under certain circumstances, when this
  * dialog is dismissed.
  */
trait OptionDialogClickEvent extends OptionDialogBaseEvent {
  /**
    * Indicates whether the index returned by the `index` property relates to a button rather
    * than an option item.
    */
  var button: Boolean
  /**
    * Boolean type on Android; Number on iOS.
    * On Android, indicates whether the cancel button was clicked, in which
    * case returns `true`.
    * On iOS, the value of the [cancel](Titanium.UI.OptionDialog.cancel)
    * property is returned, if defined, or `-1` otherwise.
    */
  var cancel: Boolean | Double
  /**
    * Index of the destructive option if defined or `-1` otherwise.
    */
  var destructive: Double
  /**
    * Index of the option that was pressed. See description for result of the dialog being
    * dismissed in some other way.
    */
  var index: Double
}

object OptionDialogClickEvent {
  @scala.inline
  def apply(
    button: Boolean,
    cancel: Boolean | Double,
    destructive: Double,
    index: Double,
    source: OptionDialog
  ): OptionDialogClickEvent = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], destructive = destructive.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionDialogClickEvent]
  }
}

