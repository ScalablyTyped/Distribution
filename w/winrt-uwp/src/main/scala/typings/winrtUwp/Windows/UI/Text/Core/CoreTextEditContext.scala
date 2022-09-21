package typings.winrtUwp.Windows.UI.Text.Core

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.compositioncompleted
import typings.winrtUwp.winrtUwpStrings.compositionstarted
import typings.winrtUwp.winrtUwpStrings.focusremoved
import typings.winrtUwp.winrtUwpStrings.formatupdating
import typings.winrtUwp.winrtUwpStrings.layoutrequested
import typings.winrtUwp.winrtUwpStrings.notifyfocusleavecompleted
import typings.winrtUwp.winrtUwpStrings.selectionrequested
import typings.winrtUwp.winrtUwpStrings.selectionupdating
import typings.winrtUwp.winrtUwpStrings.textrequested
import typings.winrtUwp.winrtUwpStrings.textupdating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The primary object used by text input controls to communicate with the text input server. */
@js.native
trait CoreTextEditContext extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositioncompleted(
    `type`: compositioncompleted,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextCompositionCompletedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_compositionstarted(
    `type`: compositionstarted,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextCompositionStartedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_focusremoved(`type`: focusremoved, listener: TypedEventHandler[CoreTextEditContext, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_formatupdating(
    `type`: formatupdating,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextFormatUpdatingEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_layoutrequested(
    `type`: layoutrequested,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextLayoutRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_notifyfocusleavecompleted(`type`: notifyfocusleavecompleted, listener: TypedEventHandler[CoreTextEditContext, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionrequested(
    `type`: selectionrequested,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextSelectionRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selectionupdating(
    `type`: selectionupdating,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextSelectionUpdatingEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textrequested(
    `type`: textrequested,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextTextRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textupdating(
    `type`: textupdating,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextTextUpdatingEventArgs]
  ): Unit = js.native
  
  /** Gets or sets a value that indicates whether the input pane should be shown automatically when focus enters your text input control. The default value is Automatic, indicating that the input pane will be shown automatically. A value of Manual indicates that your app will be responsible for showing and hiding the input pane using InputPane.TryShow and TryHide . */
  var inputPaneDisplayPolicy: CoreTextInputPaneDisplayPolicy = js.native
  
  /** Gets or sets a value that indicates the input scope of the text input control. */
  var inputScope: CoreTextInputScope = js.native
  
  /** Gets or sets a value that indicates whether the edit control is editable. */
  var isReadOnly: Boolean = js.native
  
  /** Gets or sets a descriptive name for the text input control. An application framework usually uses properties such as "name" or "id" to identify a control, so it’s recommended that you set this property accordingly on the text input server so that input processors can better preserve the input context, and provide better suggestions. */
  var name: String = js.native
  
  /** Notifies the text input server that focus has entered the text input control. */
  def notifyFocusEnter(): Unit = js.native
  
  /** Notifies the text input server that focus has left the text input control. */
  def notifyFocusLeave(): Unit = js.native
  
  /** Notifies the text input server that the layout of text inside the text input control has changed. */
  def notifyLayoutChanged(): Unit = js.native
  
  /**
    * Notifies the text input server about any change that the text input control needs to make to the selection range. This is important in order to keep the internal state of the control and the internal state of the server synchronized.
    * @param selection The range of selection currently in effect.
    */
  def notifySelectionChanged(selection: CoreTextRange): Unit = js.native
  
  /**
    * Notifies the text input server about any change that the text input control needs to make to the text. This is important in order to keep the internal state of the control and the internal state of the server synchronized. Since a change to the text is also likely to affect the selection range, the method takes the selection range as a parameter.
    * @param modifiedRange The range of text to replace, in terms of the state the text buffer is in prior to this text change.
    * @param newLength The length of the text that should replace modifiedRange.
    * @param newSelection The range of selection in effect after the text change.
    */
  def notifyTextChanged(modifiedRange: CoreTextRange, newLength: Double, newSelection: CoreTextRange): Unit = js.native
  
  /** Occurs when composition has completed. */
  def oncompositioncompleted(ev: CoreTextCompositionCompletedEventArgs & WinRTEvent[CoreTextEditContext]): Unit = js.native
  /** Occurs when composition has completed. */
  @JSName("oncompositioncompleted")
  var oncompositioncompleted_Original: TypedEventHandler[CoreTextEditContext, CoreTextCompositionCompletedEventArgs] = js.native
  
  /** Occurs when composition has started. */
  def oncompositionstarted(ev: CoreTextCompositionStartedEventArgs & WinRTEvent[CoreTextEditContext]): Unit = js.native
  /** Occurs when composition has started. */
  @JSName("oncompositionstarted")
  var oncompositionstarted_Original: TypedEventHandler[CoreTextEditContext, CoreTextCompositionStartedEventArgs] = js.native
  
  /** Occurs when focus was forcibly removed from a text input control. The application should handle this event to remove focus for the text input control accordingly. */
  def onfocusremoved(ev: Any & WinRTEvent[CoreTextEditContext]): Unit = js.native
  /** Occurs when focus was forcibly removed from a text input control. The application should handle this event to remove focus for the text input control accordingly. */
  @JSName("onfocusremoved")
  var onfocusremoved_Original: TypedEventHandler[CoreTextEditContext, Any] = js.native
  
  /** Occurs when the text input server needs to apply a different format to a particular range of text. This usually happens during composition. */
  def onformatupdating(ev: CoreTextFormatUpdatingEventArgs & WinRTEvent[CoreTextEditContext]): Unit = js.native
  /** Occurs when the text input server needs to apply a different format to a particular range of text. This usually happens during composition. */
  @JSName("onformatupdating")
  var onformatupdating_Original: TypedEventHandler[CoreTextEditContext, CoreTextFormatUpdatingEventArgs] = js.native
  
  /** Occurs when the text input server needs to get the bounding box of a range of text and of the text input control itself. The application should handle this event and return the geometry information requested. */
  def onlayoutrequested(ev: CoreTextLayoutRequestedEventArgs & WinRTEvent[CoreTextEditContext]): Unit = js.native
  /** Occurs when the text input server needs to get the bounding box of a range of text and of the text input control itself. The application should handle this event and return the geometry information requested. */
  @JSName("onlayoutrequested")
  var onlayoutrequested_Original: TypedEventHandler[CoreTextEditContext, CoreTextLayoutRequestedEventArgs] = js.native
  
  /** Occurs after focus has left the text input control. */
  def onnotifyfocusleavecompleted(ev: Any & WinRTEvent[CoreTextEditContext]): Unit = js.native
  /** Occurs after focus has left the text input control. */
  @JSName("onnotifyfocusleavecompleted")
  var onnotifyfocusleavecompleted_Original: TypedEventHandler[CoreTextEditContext, Any] = js.native
  
  /** Occurs when the text input server needs to get the text range representing the currently selected text in the text input control. The application should handle this event and return the range requested. */
  def onselectionrequested(ev: CoreTextSelectionRequestedEventArgs & WinRTEvent[CoreTextEditContext]): Unit = js.native
  /** Occurs when the text input server needs to get the text range representing the currently selected text in the text input control. The application should handle this event and return the range requested. */
  @JSName("onselectionrequested")
  var onselectionrequested_Original: TypedEventHandler[CoreTextEditContext, CoreTextSelectionRequestedEventArgs] = js.native
  
  /** Occurs when the text input server needs to modify the range of text currently selected in the text input control. This event could be the result of an input processor needing to select some text, or to move the caret. The text input control should set its selection range accordingly. */
  def onselectionupdating(ev: CoreTextSelectionUpdatingEventArgs & WinRTEvent[CoreTextEditContext]): Unit = js.native
  /** Occurs when the text input server needs to modify the range of text currently selected in the text input control. This event could be the result of an input processor needing to select some text, or to move the caret. The text input control should set its selection range accordingly. */
  @JSName("onselectionupdating")
  var onselectionupdating_Original: TypedEventHandler[CoreTextEditContext, CoreTextSelectionUpdatingEventArgs] = js.native
  
  /** Occurs when the text input server needs to get a range of text from the text input control. The application should handle this event and return the range requested. */
  def ontextrequested(ev: CoreTextTextRequestedEventArgs & WinRTEvent[CoreTextEditContext]): Unit = js.native
  /** Occurs when the text input server needs to get a range of text from the text input control. The application should handle this event and return the range requested. */
  @JSName("ontextrequested")
  var ontextrequested_Original: TypedEventHandler[CoreTextEditContext, CoreTextTextRequestedEventArgs] = js.native
  
  /** Occurs when the text input server needs to modify text inside the text input control. This event could be the result of a key event—such as inserting a single character—or the result of processing done by an input processor, such as auto-correction and prediction. */
  def ontextupdating(ev: CoreTextTextUpdatingEventArgs & WinRTEvent[CoreTextEditContext]): Unit = js.native
  /** Occurs when the text input server needs to modify text inside the text input control. This event could be the result of a key event—such as inserting a single character—or the result of processing done by an input processor, such as auto-correction and prediction. */
  @JSName("ontextupdating")
  var ontextupdating_Original: TypedEventHandler[CoreTextEditContext, CoreTextTextUpdatingEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositioncompleted(
    `type`: compositioncompleted,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextCompositionCompletedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_compositionstarted(
    `type`: compositionstarted,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextCompositionStartedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_focusremoved(`type`: focusremoved, listener: TypedEventHandler[CoreTextEditContext, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_formatupdating(
    `type`: formatupdating,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextFormatUpdatingEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_layoutrequested(
    `type`: layoutrequested,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextLayoutRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_notifyfocusleavecompleted(`type`: notifyfocusleavecompleted, listener: TypedEventHandler[CoreTextEditContext, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionrequested(
    `type`: selectionrequested,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextSelectionRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selectionupdating(
    `type`: selectionupdating,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextSelectionUpdatingEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_textrequested(
    `type`: textrequested,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextTextRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_textupdating(
    `type`: textupdating,
    listener: TypedEventHandler[CoreTextEditContext, CoreTextTextUpdatingEventArgs]
  ): Unit = js.native
}
