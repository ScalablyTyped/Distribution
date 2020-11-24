package typings.winjs.mod.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a grid layout for the ListView in which items are arranged in a horizontal grid.
  **/
@JSImport("winjs", "UI.GridLayout")
@js.native
//#region Constructors
/**
  * Creates a new GridLayout object.
  * @constructor
  * @param options The set of properties and values to apply to the new GridLayout.
  **/
class GridLayout ()
  extends typings.winjs.WinJS.UI.GridLayout {
  def this(options: js.Any) = this()
}
/* static members */
@JSImport("winjs", "UI.GridLayout")
@js.native
object GridLayout extends js.Object {
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}
