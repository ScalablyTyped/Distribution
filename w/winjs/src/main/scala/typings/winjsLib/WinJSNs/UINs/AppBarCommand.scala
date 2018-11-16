package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a command to be displayed in an app bar.
    **/
@JSGlobal("WinJS.UI.AppBarCommand")
@js.native
class AppBarCommand () extends ICommand {
  //#region Constructors
  /**
           * Creates a new AppBarCommand object.
           * @constructor
           * @param element The DOM element that will host the control.
           * @param options The set of properties and values to apply to the new AppBarCommand.
          **/
  def this(element: stdLib.HTMLElement) = this()
  //#region Constructors
  /**
           * Creates a new AppBarCommand object.
           * @constructor
           * @param element The DOM element that will host the control.
           * @param options The set of properties and values to apply to the new AppBarCommand.
          **/
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
}

/**
     * Represents a command to be displayed in an app bar.
    **/
@JSGlobal("WinJS.UI.AppBarCommand")
@js.native
object AppBarCommand extends js.Object {
  /**
           * Indicates that the object is compatibile with declarative processing.
          **/
  var supportedForProcessing: scala.Boolean = js.native
}

