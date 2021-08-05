package typings.winrt.Windows.Media.PlayTo

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlayToSourceRequest extends StObject {
  
  var deadline: Date
  
  def displayErrorString(errorString: String): Unit
  
  def getDeferral(): PlayToSourceDeferral
  
  def setSource(value: PlayToSource): Unit
}
object IPlayToSourceRequest {
  
  inline def apply(
    deadline: Date,
    displayErrorString: String => Unit,
    getDeferral: () => PlayToSourceDeferral,
    setSource: PlayToSource => Unit
  ): IPlayToSourceRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], displayErrorString = js.Any.fromFunction1(displayErrorString), getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[IPlayToSourceRequest]
  }
  
  extension [Self <: IPlayToSourceRequest](x: Self) {
    
    inline def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    inline def setDisplayErrorString(value: String => Unit): Self = StObject.set(x, "displayErrorString", js.Any.fromFunction1(value))
    
    inline def setGetDeferral(value: () => PlayToSourceDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    inline def setSetSource(value: PlayToSource => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction1(value))
  }
}
