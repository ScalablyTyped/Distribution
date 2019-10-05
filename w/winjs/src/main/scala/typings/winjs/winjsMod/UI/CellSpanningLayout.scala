package typings.winjs.winjsMod.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a layout for the ListView in which items are arranged in a grid and items can span multiple grid cells.
  **/
@JSImport("winjs", "UI.CellSpanningLayout")
@js.native
//#region Constructors
/**
  * Creates a new CellSpanningLayout.
  * @constructor
  * @param options An object that contains one or more property/value pairs to apply to the new CellSpanningLayout. Each property of the options object corresponds to one of the object's properties or events. Event names must begin with "on".
  **/
class CellSpanningLayout ()
  extends typings.winjs.WinJS.UI.CellSpanningLayout {
  def this(options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.CellSpanningLayout")
@js.native
object CellSpanningLayout extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

