package typings.winjs.winjsMod.UI

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enables the user to zoom between two different views supplied by two child controls. One child control supplies the zoomed-out view and the other provides the zoomed-in view.
  **/
@JSImport("winjs", "UI.SemanticZoom")
@js.native
//#region Constructors
/**
  * Creates a new SemanticZoom.
  * @constructor
  * @param element The DOM element that hosts the SemanticZoom.
  * @param options An object that contains one or more property/value pairs to apply to the new control. This object can contain these properties: initiallyZoomedOut Boolean, zoomFactor 0.2–0.85.
  **/
class SemanticZoom ()
  extends typings.winjs.WinJS.UI.SemanticZoom {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
}

/* static members */
@JSImport("winjs", "UI.SemanticZoom")
@js.native
object SemanticZoom extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

