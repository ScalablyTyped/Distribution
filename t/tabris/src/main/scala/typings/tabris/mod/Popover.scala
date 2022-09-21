package typings.tabris.mod

import typings.tabris.anon.ContentView
import typings.tabris.anon.OmitOmitPopovercontentVieAnchor
import typings.tabris.anon.OmitPopovercontentView
import typings.tabris.tabrisStrings.anchor
import typings.tabris.tabrisStrings.height
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "Popover")
@js.native
/**
  * An `Popover` represents a modal ui container that is shown above the apps content. It provides the
  * root element of a new layout hierarchy in the form of its `contentView` property. User provided
  * widgets can be attached to the `contentView` similarly to the `tabris.contentView`. In order to close
  * the `Popover` the `close()` method can be used.
  * The appearance of the `Popover` depends on the device size: On larger devices (like tablets) the
  * `Popover` is shown as a floating window whereas on smaller devices it is shown as a fullscreen sheet
  * covering the entire app.
  * 
  * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
  * object which may include (in addition to the properties) children, event listeners and layout
  * shorthands.
  */
open class Popover () extends Popup {
  def this(properties: Properties[OmitPopovercontentView, OmitOmitPopovercontentVieAnchor]) = this()
  
  /**
    * An anchor `Widget` the `Popover` should attach to. When the anchor is given the `Popover` is
    * positioned next to the anchor `Widget` and provides a visual indication of its relation. When omitted
    * the `Popover` is positioned centered on the screen.
    */
  var anchor: Widget[Any] = js.native
  
  /**
    * The root widget element containing all children of Popover.
    * @constant
    */
  val contentView: ContentView_[Widget[Any]] = js.native
  
  /**
    * The height of the `Popover` when shown in windowed mode on large screen devices. Will be a platform
    * specific default if set to null.
    */
  var height: Dimension = js.native
  
  /**
    * @constant
    */
  @JSName("jsxAttributes")
  val jsxAttributes_Popover: (JSXAttributes[this.type, Omit[this.type, set | typings.tabris.tabrisStrings.jsxAttributes]]) & ContentView = js.native
  
  /**
    * Fired when the [*anchor*](#anchor) property has changed.
    */
  var onAnchorChanged: ChangeListeners[this.type, anchor] = js.native
  
  /**
    * Fired when the `Popover` was closed.
    */
  var onClose: Listeners[EventObject[this.type]] = js.native
  
  /**
    * Fired when the [*height*](#height) property has changed.
    */
  var onHeightChanged: ChangeListeners[this.type, height] = js.native
  
  /**
    * Fired when the [*width*](#width) property has changed.
    */
  var onWidthChanged: ChangeListeners[this.type, width] = js.native
  
  /**
    * The width of the `Popover` when shown in windowed mode on large screen devices. Will be a platform
    * specific default if set to null.
    */
  var width: Dimension = js.native
}
/* static members */
object Popover {
  
  @JSImport("tabris", "Popover")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Makes the given popover visible. Meant to be used with inline-JSX. In TypeScript it also casts the
    * given JSX element from `any` to an actual Popover.
    * @param popover The popover to open
    */
  inline def open(popover: Popover): Popover = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(popover.asInstanceOf[js.Any]).asInstanceOf[Popover]
}
