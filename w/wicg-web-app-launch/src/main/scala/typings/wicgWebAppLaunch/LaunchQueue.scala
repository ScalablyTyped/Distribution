package typings.wicgWebAppLaunch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchQueue extends StObject {
  
  def setConsumer(consumer: LaunchConsumer): Unit
}
object LaunchQueue {
  
  inline def apply(setConsumer: LaunchConsumer => Unit): LaunchQueue = {
    val __obj = js.Dynamic.literal(setConsumer = js.Any.fromFunction1(setConsumer))
    __obj.asInstanceOf[LaunchQueue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchQueue] (val x: Self) extends AnyVal {
    
    inline def setSetConsumer(value: LaunchConsumer => Unit): Self = StObject.set(x, "setConsumer", js.Any.fromFunction1(value))
  }
}
