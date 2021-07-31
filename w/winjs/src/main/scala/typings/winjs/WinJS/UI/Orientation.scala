package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends StObject
/**
  * Specifies the orientation of a control.
  **/
@JSGlobal("WinJS.UI.Orientation")
@js.native
object Orientation extends StObject {
  
  /**
    * A horizontal layout.
    **/
  @js.native
  sealed trait horizontal
    extends StObject
       with Orientation
  
  /**
    * A vertical layout.
    **/
  @js.native
  sealed trait vertical
    extends StObject
       with Orientation
}
