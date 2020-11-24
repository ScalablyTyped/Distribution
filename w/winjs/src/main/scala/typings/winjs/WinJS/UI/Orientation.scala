package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends js.Object
/**
  * Specifies the orientation of a control.
  **/
@JSGlobal("WinJS.UI.Orientation")
@js.native
object Orientation extends js.Object {
  
  /**
    * A horizontal layout.
    **/
  @js.native
  sealed trait horizontal extends Orientation
  
  /**
    * A vertical layout.
    **/
  @js.native
  sealed trait vertical extends Orientation
}
