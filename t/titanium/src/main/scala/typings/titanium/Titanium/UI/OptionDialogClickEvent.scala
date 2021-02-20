package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when an option of this dialog is clicked or, under certain circumstances, when this
  * dialog is dismissed.
  */
@js.native
trait OptionDialogClickEvent extends OptionDialogBaseEvent {
  
  /**
    * Indicates whether the index returned by the `index` property relates to a button rather
    * than an option item.
    */
  var button: Boolean = js.native
  
  /**
    * Boolean type on Android; Number on iOS.
    * On Android, indicates whether the cancel button was clicked, in which
    * case returns `true`.
    * On iOS, the value of the [cancel](Titanium.UI.OptionDialog.cancel)
    * property is returned, if defined, or `-1` otherwise.
    */
  var cancel: Boolean | Double = js.native
  
  /**
    * Index of the destructive option if defined or `-1` otherwise.
    */
  var destructive: Double = js.native
  
  /**
    * Index of the option that was pressed. See description for result of the dialog being
    * dismissed in some other way.
    */
  var index: Double = js.native
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
  
  @scala.inline
  implicit class OptionDialogClickEventMutableBuilder[Self <: OptionDialogClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: Boolean): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: Boolean | Double): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestructive(value: Double): Self = StObject.set(x, "destructive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
