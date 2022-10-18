package typings.tabris.mod

import typings.tabris.anon.OmitActionSheetset
import typings.tabris.anon.`1`
import typings.tabris.tabrisStrings.actions
import typings.tabris.tabrisStrings.message
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "ActionSheet")
@js.native
/**
  * A pop up dialog that offers a selection. Is automatically disposed when closed.
  * 
  * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
  * object which may include (in addition to the properties) children, event listeners and layout
  * shorthands.
  */
open class ActionSheet () extends Popup {
  def this(properties: Properties[ActionSheet, OmitActionSheetset]) = this()
  
  /**
    * An array of objects describing the actions to be displayed. The entries may be instances of
    * `ActionSheetItem` *or plain objects* with some or all of the same properties.
    */
  var actions: js.Array[typings.tabris.anon.Image] = js.native
  
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_ActionSheet: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & `1` = js.native
  
  /**
    * A descriptive message for the available actions.
    */
  var message: String = js.native
  
  /**
    * Fired when the [*actions*](#actions) property has changed.
    */
  var onActionsChanged: ChangeListeners[this.type, actions] = js.native
  
  /**
    * Fired when the action sheet was closed.
    */
  var onClose: Listeners[ActionSheetCloseEvent[this.type]] = js.native
  
  /**
    * Fired when the [*message*](#message) property has changed.
    */
  var onMessageChanged: ChangeListeners[this.type, message] = js.native
  
  /**
    * Fired when an action was selected. Note: on iOS, tapping outside of an ActionSheet will also fire a
    * `select` event. Its parameter will be an index of a button with type `cancel`. This happens despite
    * the fact that no button has been pressed.
    */
  var onSelect: Listeners[ActionSheetSelectEvent[this.type]] = js.native
  
  /**
    * Fired when the [*title*](#title) property has changed.
    */
  var onTitleChanged: ChangeListeners[this.type, title] = js.native
  
  /**
    * The title of the action sheet.
    */
  var title: String = js.native
}
/* static members */
object ActionSheet {
  
  @JSImport("tabris", "ActionSheet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Makes the given action sheet visible. Meant to be used with inline-JSX. In TypeScript it also casts
    * the given JSX element from `any` to an actual ActionSheet.
    * @param actionSheet The action sheet to open
    */
  inline def open(actionSheet: ActionSheet): ActionSheet = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(actionSheet.asInstanceOf[js.Any]).asInstanceOf[ActionSheet]
}
