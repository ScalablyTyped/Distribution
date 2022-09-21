package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCallback extends StObject {
  
  /**
    * Called when DELETE request was received.
    *
    * @param request That is request from server side.
    */
  def ondelete(request: Request): Unit
  
  /**
    * Called when GET request was received.
    *
    * @param request That is request from server side.
    */
  def onget(request: Request): Unit
  
  /**
    * Called when OBSERVE request was received.
    *
    * @param request That is request from server side.
    * @param observeType The observation type of the request.
    * @param observeId The observation id of the request.
    */
  def onobserving(request: Request, observeType: ObserveType, observeId: Double): Unit
  
  /**
    * Called when POST request was received.
    *
    * @param request That is request from server side.
    */
  def onpost(request: Request): Unit
  
  /**
    * Called when PUT request was received.
    *
    * @param request That is request from server side.
    */
  def onput(request: Request): Unit
}
object RequestCallback {
  
  inline def apply(
    ondelete: Request => Unit,
    onget: Request => Unit,
    onobserving: (Request, ObserveType, Double) => Unit,
    onpost: Request => Unit,
    onput: Request => Unit
  ): RequestCallback = {
    val __obj = js.Dynamic.literal(ondelete = js.Any.fromFunction1(ondelete), onget = js.Any.fromFunction1(onget), onobserving = js.Any.fromFunction3(onobserving), onpost = js.Any.fromFunction1(onpost), onput = js.Any.fromFunction1(onput))
    __obj.asInstanceOf[RequestCallback]
  }
  
  extension [Self <: RequestCallback](x: Self) {
    
    inline def setOndelete(value: Request => Unit): Self = StObject.set(x, "ondelete", js.Any.fromFunction1(value))
    
    inline def setOnget(value: Request => Unit): Self = StObject.set(x, "onget", js.Any.fromFunction1(value))
    
    inline def setOnobserving(value: (Request, ObserveType, Double) => Unit): Self = StObject.set(x, "onobserving", js.Any.fromFunction3(value))
    
    inline def setOnpost(value: Request => Unit): Self = StObject.set(x, "onpost", js.Any.fromFunction1(value))
    
    inline def setOnput(value: Request => Unit): Self = StObject.set(x, "onput", js.Any.fromFunction1(value))
  }
}
