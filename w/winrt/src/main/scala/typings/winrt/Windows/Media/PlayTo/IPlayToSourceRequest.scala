package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToSourceRequest extends StObject {
  
  var deadline: js.Date
  
  def displayErrorString(errorString: String): Unit
  
  def getDeferral(): PlayToSourceDeferral
  
  def setSource(value: PlayToSource): Unit
}
object IPlayToSourceRequest {
  
  inline def apply(
    deadline: js.Date,
    displayErrorString: String => Unit,
    getDeferral: () => PlayToSourceDeferral,
    setSource: PlayToSource => Unit
  ): IPlayToSourceRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], displayErrorString = js.Any.fromFunction1(displayErrorString), getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[IPlayToSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPlayToSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setDisplayErrorString(value: String => Unit): Self = StObject.set(x, "displayErrorString", js.Any.fromFunction1(value))
    
    inline def setGetDeferral(value: () => PlayToSourceDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    inline def setSetSource(value: PlayToSource => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction1(value))
  }
}
