package typings.winjs.global.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a layout for the ListView in which items are arranged in a grid and items can span multiple grid cells.
  **/
@JSGlobal("WinJS.UI.CellSpanningLayout")
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
object CellSpanningLayout {
  
  @JSGlobal("WinJS.UI.CellSpanningLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSGlobal("WinJS.UI.CellSpanningLayout.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
