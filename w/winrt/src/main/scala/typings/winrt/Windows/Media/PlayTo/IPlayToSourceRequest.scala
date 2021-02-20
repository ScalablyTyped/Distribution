package typings.winrt.Windows.Media.PlayTo

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlayToSourceRequest extends StObject {
  
  var deadline: Date = js.native
  
  def displayErrorString(errorString: String): Unit = js.native
  
  def getDeferral(): PlayToSourceDeferral = js.native
  
  def setSource(value: PlayToSource): Unit = js.native
}
object IPlayToSourceRequest {
  
  @scala.inline
  def apply(
    deadline: Date,
    displayErrorString: String => Unit,
    getDeferral: () => PlayToSourceDeferral,
    setSource: PlayToSource => Unit
  ): IPlayToSourceRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any], displayErrorString = js.Any.fromFunction1(displayErrorString), getDeferral = js.Any.fromFunction0(getDeferral), setSource = js.Any.fromFunction1(setSource))
    __obj.asInstanceOf[IPlayToSourceRequest]
  }
  
  @scala.inline
  implicit class IPlayToSourceRequestMutableBuilder[Self <: IPlayToSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayErrorString(value: String => Unit): Self = StObject.set(x, "displayErrorString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDeferral(value: () => PlayToSourceDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSource(value: PlayToSource => Unit): Self = StObject.set(x, "setSource", js.Any.fromFunction1(value))
  }
}
