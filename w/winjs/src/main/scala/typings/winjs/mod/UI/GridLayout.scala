package typings.winjs.mod.UI

import org.scalablytyped.runtime.StObject
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
object GridLayout {
  
  @JSImport("winjs", "UI.GridLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.GridLayout.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  @scala.inline
  def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
