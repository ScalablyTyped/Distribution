package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a Date control.
  * @see {@link StandardControl}
  */
@js.native
trait DateControl extends StandardControl {
  
  /**
    * Gets the status of the time-of-day component of the Date control.
    * @returns true if the time is shown, otherwise false.
    */
  def getShowTime(): Boolean = js.native
  
  /**
    * Sets the visibility of the time component of the Date control.
    * @param showTimeValue true to show, false to hide the time value.
    */
  def setShowTime(showTimeValue: Boolean): Unit = js.native
}
