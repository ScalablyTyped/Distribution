package typings.vscodeLanguageserver.libCommonServerMod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.InitializeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchDog extends StObject {
  
  def exit(code: Double): Unit
  
  def initialize(params: InitializeParams): Unit
  
  var shutdownReceived: Boolean
}
object WatchDog {
  
  inline def apply(exit: Double => Unit, initialize: InitializeParams => Unit, shutdownReceived: Boolean): WatchDog = {
    val __obj = js.Dynamic.literal(exit = js.Any.fromFunction1(exit), initialize = js.Any.fromFunction1(initialize), shutdownReceived = shutdownReceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchDog]
  }
  
  extension [Self <: WatchDog](x: Self) {
    
    inline def setExit(value: Double => Unit): Self = StObject.set(x, "exit", js.Any.fromFunction1(value))
    
    inline def setInitialize(value: InitializeParams => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setShutdownReceived(value: Boolean): Self = StObject.set(x, "shutdownReceived", value.asInstanceOf[js.Any])
  }
}
