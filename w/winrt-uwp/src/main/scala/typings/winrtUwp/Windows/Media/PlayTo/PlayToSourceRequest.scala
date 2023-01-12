package typings.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a request to connect a media element with a Play To target. */
trait PlayToSourceRequest extends StObject {
  
  /** Gets the time limit to supply the Play To source element. */
  var deadline: js.Date
  
  /**
    * Displays an error message in the Play To UI.
    * @param errorString The error message to display in the Play To UI.
    */
  def displayErrorString(errorString: String): Unit
  
  /**
    * Defers connecting a media source to a Play To target.
    * @return A deferral object that you can use to identify when the deferral is complete.
    */
  def getDeferral(): PlayToSourceDeferral
  
  /**
    * Sets the source element to connect to the Play To target.
    * @param value The source element to connect to the Play To target.
    */
  def setSource(value: PlayToSource): Unit
}
object PlayToSourceRequest {
  
  inline def apply(
    deadline: js.Date,
    displayErrorString: String => Unit,
    getDeferral: () => PlayToSourceDeferral,
    setSource: PlayToSource => Unit
  ): PlayToSourceRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], displayErrorString = js.Any.fromFunction1(displayErrorString), getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[PlayToSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayToSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setDisplayErrorString(value: String => Unit): Self = StObject.set(x, "displayErrorString", js.Any.fromFunction1(value))
    
    inline def setGetDeferral(value: () => PlayToSourceDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    inline def setSetSource(value: PlayToSource => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction1(value))
  }
}
