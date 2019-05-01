package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class for all pop-up UI elements. Pop-ups are placed on top of all other UI, but are not
  * widgets. Some pop-ups can be opened only once.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tabrisLib.tabrisMod._PopupProperties because Already inherited */ @JSImport("tabris", "Popup")
@js.native
class Popup protected () extends NativeObject {
  /**
    * The type of this property defines the interface used by `set`, `get`, and
    * the `Properties` interface. It's value is always undefined.
    */
  @JSName("tsProperties")
  val tsProperties_Popup: PopupProperties = js.native
  /**
    * Hides the popup.
    */
  def close(): this.type = js.native
  /**
    * Makes the popup visible.
    */
  def open(): this.type = js.native
}

