package typings.tabris.global.tabris

import typings.tabris.anon.OmitOmitPopovercontentVieCid
import typings.tabris.anon.OmitPopovercontentViewCheckDisposed
import typings.tabris.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.Popover")
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
open class Popover ()
  extends typings.tabris.mod.Popover {
  def this(properties: Properties[OmitPopovercontentViewCheckDisposed, OmitOmitPopovercontentVieCid]) = this()
}
/* static members */
object Popover {
  
  @JSGlobal("tabris.Popover")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Makes the given popover visible. Meant to be used with inline-JSX. In TypeScript it also casts the
    * given JSX element from `any` to an actual Popover.
    * @param popover The popover to open
    */
  inline def open(popover: typings.tabris.mod.Popover): typings.tabris.mod.Popover = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(popover.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.Popover]
}
